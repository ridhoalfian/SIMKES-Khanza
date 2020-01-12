/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridging;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import fungsi.koneksiDB;
import fungsi.sekuel;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.swing.JOptionPane;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author khanzasoft
 */
public class MYLIMSApi {
    private Connection koneksi=koneksiDB.condb();
    private PreparedStatement ps,ps2;
    private ResultSet rs,rs2;
    private String URL="",KEY="",requestJson="",requestJson2="",stringbalik="";
    private HttpHeaders headers;
    private HttpEntity requestEntity;
    private JsonNode root;
    private sekuel Sequel=new sekuel();
    private JsonNode response;
    private ObjectMapper mapper = new ObjectMapper();

    public MYLIMSApi(){
        super();
        try {
            URL = koneksiDB.HOSTWSMYLIMS();
            KEY = koneksiDB.KEYWSMYLIMS();
        } catch (Exception e) {
            System.out.println("Notif : "+e);
        }
    }

    public void kirim(String nopermintaan) {
        try {
             ps=koneksi.prepareStatement(
                    "select permintaan_lab.noorder,permintaan_lab.no_rawat,reg_periksa.no_rkm_medis,pasien.nm_pasien,permintaan_lab.tgl_permintaan,"+
                    "if(permintaan_lab.jam_permintaan='00:00:00','',permintaan_lab.jam_permintaan) as jam_permintaan,pasien.tgl_lahir,pasien.jk,pasien.alamat,"+
                    "if(permintaan_lab.tgl_sampel='0000-00-00','',permintaan_lab.tgl_sampel) as tgl_sampel,if(permintaan_lab.jam_sampel='00:00:00','',permintaan_lab.jam_sampel) as jam_sampel,"+
                    "if(permintaan_lab.tgl_hasil='0000-00-00','',permintaan_lab.tgl_hasil) as tgl_hasil,if(permintaan_lab.jam_hasil='00:00:00','',permintaan_lab.jam_hasil) as jam_hasil,"+
                    "permintaan_lab.dokter_perujuk,dokter.nm_dokter,poliklinik.nm_poli,pasien.no_tlp,penjab.png_jawab,pasien.tgl_lahir,pasien.umur,reg_periksa.umurdaftar,reg_periksa.sttsumur from permintaan_lab "+
                    "inner join reg_periksa inner join pasien inner join dokter inner join poliklinik inner join penjab "+
                    "on permintaan_lab.no_rawat=reg_periksa.no_rawat and reg_periksa.no_rkm_medis=pasien.no_rkm_medis and reg_periksa.kd_pj=penjab.kd_pj "+
                    "and permintaan_lab.dokter_perujuk=dokter.kd_dokter and reg_periksa.kd_poli=poliklinik.kd_poli where permintaan_lab.noorder=?");
             try {
                ps.setString(1,nopermintaan);
                rs=ps.executeQuery();
                while(rs.next()){
                    headers = new HttpHeaders();
                    headers.setContentType(MediaType.APPLICATION_JSON);
                    headers.add("Content-Type","application/json;charset=UTF-8");
                    headers.add("x-api-key",KEY);
                    ps2=koneksi.prepareStatement(
                            "select permintaan_detail_permintaan_lab.id_template,template_laboratorium.Pemeriksaan,"+
                            "template_laboratorium.urut from permintaan_detail_permintaan_lab "+
                            "inner join template_laboratorium on permintaan_detail_permintaan_lab.id_template=template_laboratorium.id_template "+
                            "where permintaan_detail_permintaan_lab.noorder=? order by template_laboratorium.kd_jenis_prw,template_laboratorium.urut desc");
                    try {
                        ps2.setString(1,rs.getString("noorder"));
                        rs2=ps2.executeQuery();
                        requestJson2="";
                        while(rs2.next()){
                            requestJson2=
                                "{" +
                                    "\"id\": \""+rs2.getString("urut")+"\"" +
                                "},"+requestJson2;
                        }
                        if(requestJson2.endsWith(",")){
                            requestJson2 = requestJson2.substring(0,requestJson2.length() - 1);
                        }
                    } catch (Exception e) {
                        System.out.println("Notif 3 : "+e);
                    } finally{
                        if(rs2!=null){
                            rs2.close();
                        }
                        if(ps2!=null){
                            ps2.close();
                        }
                    }

                    requestJson="{" +
                                    "\"pasien\": {" +
                                        "\"recmed\": \""+rs.getString("no_rkm_medis")+"\"," +
                                        "\"nama\": \""+rs.getString("nm_pasien")+"\"," +
                                        "\"sex\": \""+rs.getString("jk")+"\"," +
                                        "\"tgl_lahir\": \""+rs.getString("tgl_lahir")+"\"," +
                                        "\"umur\": \""+rs.getString("umurdaftar")+"\"," +
                                        "\"u_satuan\": \""+rs.getString("sttsumur")+"\"," +
                                        "\"u_lengkap\": \""+rs.getString("umur")+"\"," +
                                        "\"no_transaksi\": \""+rs.getString("noorder")+"\"," +
                                        "\"nm_ruang\": \""+rs.getString("nm_poli")+"\"," +
                                        "\"id_kelas\": \"1\"," +
                                        "\"id_status\": \"1\"," +
                                        "\"dr_pengirim\": \""+rs.getString("nm_dokter")+"\"," +
                                        "\"ket\": \"ket\"," +
                                        "\"catatan_1\": \"cat1\"," +
                                        "\"catatan_2\": \"cat2\"" +
                                    "}," +
                                    "\"detils\": {" +
                                        "\"idlab\": ["+
                                            requestJson2+
                                        "]" +
                                    "}," +
                                "}";
                    System.out.println("JSON : "+requestJson);
                    requestEntity = new HttpEntity(requestJson,headers);
                    stringbalik=getRest().exchange(URL+"/addCekup", HttpMethod.POST, requestEntity, String.class).getBody();
                    JOptionPane.showMessageDialog(null,stringbalik);
                }
             } catch (Exception e) {
                 System.out.println("Notif : "+e);
                 if(e.toString().contains("UnknownHostException")||e.toString().contains("404")){
                    JOptionPane.showMessageDialog(null,"Koneksi ke server MYLIMS terputus...!");
                 }
             } finally{
                 if(rs!=null){
                     rs.close();
                 }
                 if(ps!=null){
                     ps.close();
                 }
             }
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
            if(ex.toString().contains("UnknownHostException")||ex.toString().contains("404")){
                JOptionPane.showMessageDialog(null,"Koneksi ke server MYLIMS terputus...!");
            }
        }
    }

    public void ambil(String nopermintaan) {
        try{
            headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("Content-Type","application/json;charset=UTF-8");
            headers.add("x-api-key",KEY);
            requestEntity = new HttpEntity(headers);
            stringbalik=getRest().exchange(URL+"/getCekup/"+nopermintaan, HttpMethod.GET, requestEntity, String.class).getBody();
            System.out.println("JSON : "+stringbalik);
            root = mapper.readTree(stringbalik);
            response = root.path("detil");
            Sequel.queryu("truncate table temporary_permintaan_lab");
            if(response.isArray()){
                for(JsonNode list:response){
                    Sequel.menyimpan("temporary_permintaan_lab","'0','"+response+"','"+
                            list.path("pemeriksaan").asText()+"','"+
                            list.path("hasil").asText()+"','"+
                            list.path("rujukan").asText()+"','"+
                            list.path("satuan").asText()+"','"+
                            list.path("ket").asText()+"','"+
                            list.path("kode").asText()+"','','','','','','','','','','','','','','','','','','','','','','','','','','','','','',''","Periksa Lab");
                }
            }
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
            if(ex.toString().contains("UnknownHostException")||ex.toString().contains("404")){
                JOptionPane.showMessageDialog(null,"Koneksi ke server MYLIMS terputus...!");
            }
        }
    }

    public RestTemplate getRest() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContext.getInstance("SSL");
        javax.net.ssl.TrustManager[] trustManagers= {
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {return null;}
                public void checkServerTrusted(X509Certificate[] arg0, String arg1)throws CertificateException {}
                public void checkClientTrusted(X509Certificate[] arg0, String arg1)throws CertificateException {}
            }
        };
        sslContext.init(null,trustManagers , new SecureRandom());
        SSLSocketFactory sslFactory=new SSLSocketFactory(sslContext,SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        Scheme scheme=new Scheme("https",443,sslFactory);
        HttpComponentsClientHttpRequestFactory factory=new HttpComponentsClientHttpRequestFactory();
        factory.getHttpClient().getConnectionManager().getSchemeRegistry().register(scheme);
        return new RestTemplate(factory);
    }

}
