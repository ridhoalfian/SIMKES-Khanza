package simrskhanza;

import bridging.AplicareCekReferensiKamar;
import bridging.AplicareKetersediaanKamar;
import bridging.BPJSCekKartu;
import bridging.BPJSCekNIK2;
import bridging.BPJSCekReferensiFaskes;
import bridging.BPJSCekReferensiPenyakit;
import bridging.BPJSCekReferensiPoli;
import bridging.BPJSCekRiwayatRujukanPCare;
import bridging.BPJSCekNoRujukanPCare;
import bridging.BPJSDataSEP;
import bridging.BPJSMonitoringKlaim;
import informasi.InformasiAnalisaKamin;
import setting.DlgUser;
import setting.DlgSetKamarInap;
import setting.DlgSetOtoLokasi;
import setting.DlgSetTarif;
import setting.DlgSetAplikasi;
import setting.DlgSetPenjabLab;
import setting.DlgSetOtoRalan;
import setting.DlgSetRM;
import setting.DlgSetHarga;
import setting.DlgBiayaSekaliMasuk;
import setting.DlgAdmin;
import setting.DlgBiayaHarian;
import inventory.DlgSuplier;
import presensi.DlgBarcode;
import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.var;
import informasi.InformasiJadwal;
import informasi.InformasiKamar;
import informasi.InformasiKamarInap;
import informasi.InformasiTarifLab;
import informasi.InformasiTarifOperasi;
import informasi.InformasiTarifRadiologi;
import informasi.InformasiTarifRalan;
import informasi.InformasiTarifRanap;
import inventory.DlgCariPenjualan;
import inventory.DlgDaruratStok;
import inventory.DlgIndustriFarmasi;
import inventory.DlgInputStok;
import inventory.DlgKonversi;
import inventory.DlgMutasiBarang;
import inventory.DlgPembelian;
import inventory.DlgPemesanan;
import inventory.DlgPenjualan;
import inventory.DlgPiutang;
import inventory.DlgProyeksiBeriObat;
import inventory.DlgProyeksiBeriObat2;
import inventory.DlgProyeksiJual;
import inventory.DlgReturBeli;
import inventory.DlgReturJual;
import inventory.DlgReturObatPasien;
import inventory.DlgReturPiutang;
import inventory.DlgSirkulasiBarang;
import inventory.DlgSirkulasiBarang2;
import inventory.DlgStokPasien;
import inventory.DlgDaftarPermintaanResep;
import ipsrs.DlgBarangIPSRS;
import ipsrs.DlgJenisIPSRS;
import ipsrs.DlgPembelianIPSRS;
import ipsrs.DlgPengeluaranIPSRS;
import ipsrs.DlgRBiayaHarianIPSRS;
import ipsrs.DlgRHPembelianIPSRS;
import ipsrs.DlgRHPengeluaranIPSRS;
import ipsrs.DlgSuplierIPSRS;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import keuangan.DlgAkunBayar;
import keuangan.DlgBayarPemesanan;
import keuangan.DlgBayarPiutang;
import keuangan.DlgBubes;
import keuangan.DlgCashflow;
import keuangan.DlgDetailJMDokter;
import keuangan.DlgDetailPotongan;
import keuangan.DlgDetailTambahan;
import keuangan.DlgFeeBacaanEKG;
import keuangan.DlgFeePeriksaRalan;
import keuangan.DlgFeeRujukanRontgen;
import keuangan.DlgFeeVisitDokter;
import keuangan.DlgJnsPerawatanLab;
import keuangan.DlgJnsPerawatanOperasi;
import keuangan.DlgJnsPerawatanRadiologi;
import keuangan.DlgJurnal;
import keuangan.DlgJurnalHarian;
import keuangan.DlgLabaRugi;
import keuangan.DlgLhtBiaya;
import keuangan.DlgLhtPiutang;
import keuangan.DlgPaymentPoint;
import keuangan.DlgPemasukanLain;
import keuangan.DlgPembayaranRalan;
import keuangan.DlgPembayaranRalanPerHari;
import keuangan.DlgPembayaranRanap;
import keuangan.DlgPembyaranRanapPerhari;
import keuangan.DlgPengaturanRekening;
import keuangan.DlgPengeluaranHarian;
import keuangan.DlgPiutangBelumLunas;
import keuangan.DlgRBJS;
import keuangan.DlgRBJmDokter;
import keuangan.DlgRBJmParamedis;
import keuangan.DlgRBObatBangsal;
import keuangan.DlgRBObatDokterPeresep;
import keuangan.DlgRBObatDokterRalan;
import keuangan.DlgRBObatDokterRanap;
import keuangan.DlgRBObatPercaraBayar;
import keuangan.DlgRBObatPoli;
import keuangan.DlgRBPaketBHP;
import keuangan.DlgRBTindakanDokter;
import keuangan.DlgRBTindakanKamar;
import keuangan.DlgRBTindakanPoli;
import keuangan.DlgRHJS;
import keuangan.DlgRHJmDokter;
import keuangan.DlgRHJmParamedis;
import keuangan.DlgRHPaketBHP;
import keuangan.DlgRekapPerShift;
import keuangan.DlgRekening;
import keuangan.DlgRekeningTahun;
import inventory.DlgRiwayatBarangMedis;
import java.awt.event.KeyListener;
import keuangan.DlgAkunPiutang;
import keuangan.DlgHutangObatBelumLunas;
import keuangan.DlgJnsPerawatanRalan;
import keuangan.DlgRBKSO;
import keuangan.DlgRBMenejemen;
import keuangan.DlgRHKSO;
import keuangan.DlgRHMenejemen;
import keuangan.DlgRincianPiutangPasien;
import laporan.DlgICD9;
import laporan.DlgKunjunganRalan;
import laporan.DlgKunjunganRanap;
import laporan.DlgSensusHarianPoli;
import laporan.DlgBerkasRawat;
import presensi.DlgBelum;
import presensi.DlgBulanan;
import presensi.DlgBulanan2;
import presensi.DlgHarian;
import presensi.DlgJadwalPegawai;
import presensi.DlgJadwalTambahan;
import presensi.DlgJamMasuk;
import presensi.DlgKehadiran;
import presensi.DlgKehadiran2;
import presensi.DlgPulang;
import presensi.DlgSidikJari;
import presensi.DlgTemporaryPresensi;
import setting.DlgClosingKasir;
import setting.DlgSetEmbalase;
import setting.DlgSetHargaKamar;
import setting.DlgSetHargaObatRalan;
import setting.DlgSetHargaObatRanap;
import setting.DlgSetKeterlambatan;
import setting.DlgSetNota;
import permintaan.DlgCariPermintaanLab;
import permintaan.DlgCariPermintaanRadiologi;
import bridging.MobileJKNPembatalanPendaftaran;
import bridging.MobileJKNReferensiPendaftaran;


/**
 *
 * @author perpustakaan
 */
public class frmUtama extends javax.swing.JFrame {
    private final Connection koneksi=koneksiDB.condb();
    private final sekuel Sequel=new sekuel();
    private final validasi Valid=new validasi();
    private final DlgKasirRalan kasirralan=new DlgKasirRalan(this,false);
    private final DlgAbout About=new DlgAbout(this,false);
    private final DlgPenggajian penggajian=new DlgPenggajian(this,false);
    private final DlgRetensi retensi=new DlgRetensi(this,false);
    private final DlgHybrid Hybrid=new DlgHybrid(this,false);
    private final InformasiKamarInap informasikamar=new InformasiKamarInap(this,false);
    private final InformasiAnalisaKamin analisakamin=new InformasiAnalisaKamin(this,false);
    private static frmUtama myInstance;
    private PreparedStatement ps;
    private ResultSet rs;
    private final Properties prop = new Properties();
    private int jmlmenu=0;
    private String coder_nik="",pilihpage="",judulform="";
    /** Creates new form frmUtama */
    private frmUtama() {
        super();
        initComponents();
        setIconImage(new ImageIcon(super.getClass().getResource("/picture/addressbook-edit24.png")).getImage());

        this.setSize(screen.width,screen.height);
        //desktop.setPreferredSize(new Dimension(800,1000));
        //desktop.setAutoscrolls(true);
        edAdmin.setDocument(new batasInput((byte)100).getKata(edAdmin));
        edPwd.setDocument(new batasInput((byte)100).getKata(edPwd));
        PassLama.setDocument(new batasInput((byte)100).getKata(PassLama));
        Passbaru1.setDocument(new batasInput((byte)100).getKata(Passbaru1));
        PassBaru2.setDocument(new batasInput((byte)100).getKata(PassBaru2));

        DlgLogin.setSize(344,201);
        DlgLogin.setVisible(false);
        DlgLogin.setLocationRelativeTo(null);

        WindowInput.setSize(349,180);
        WindowInput.setVisible(false);
        WindowInput.setLocationRelativeTo(null);

        lblTgl.setText(tanggal.getSelectedItem().toString());
        try {
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
        } catch (Exception e) {
            System.out.println("Notif Setting : "+e);
        }

        FlayMenu.setVisible(false);

    }

    public static frmUtama getInstance() {
        if (myInstance == null)
            myInstance = new frmUtama();

        return myInstance;
    }


    //private DlgMenu menu=new DlgMenu(this,false);
    private final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgLogin = new javax.swing.JDialog();
        internalFrame2 = new widget.InternalFrame();
        internalFrame3 = new widget.InternalFrame();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edAdmin = new widget.PasswordBox();
        edPwd = new widget.PasswordBox();
        jLabel6 = new javax.swing.JLabel();
        BtnLogin = new widget.Button();
        BtnCancel = new widget.Button();
        WindowInput = new javax.swing.JDialog();
        internalFrame6 = new widget.InternalFrame();
        PassLama = new widget.TextBox();
        jLabel9 = new widget.Label();
        BtnClosePass = new widget.Button();
        BtnSimpanPass = new widget.Button();
        jLabel10 = new widget.Label();
        Passbaru1 = new widget.TextBox();
        jLabel12 = new widget.Label();
        PassBaru2 = new widget.TextBox();
        DlgHome = new javax.swing.JDialog();
        panelMenu = new widget.InternalFrame();
        panelisi2 = new widget.panelisi();
        label36 = new widget.Label();
        button1 = new widget.Button();
        label35 = new widget.Label();
        cmbMenu = new widget.ComboBox();
        scrollPane2 = new widget.ScrollPane();
        Panelmenu = new widget.panelGlass();
        btnBarcode = new widget.ButtonBig();
        btnICD = new widget.ButtonBig();
        btnObat = new widget.ButtonBig();
        btnObatPenyakit = new widget.ButtonBig();
        btnKamar = new widget.ButtonBig();
        btnTindakanRalan = new widget.ButtonBig();
        btnDokter = new widget.ButtonBig();
        btnPetugas = new widget.ButtonBig();
        btnPasien = new widget.ButtonBig();
        btnRegistrasi = new widget.ButtonBig();
        btnRalan = new widget.ButtonBig();
        btnKamarInap = new widget.ButtonBig();
        btnRanap = new widget.ButtonBig();
        btnResepObat = new widget.ButtonBig();
        btnRujukPasien = new widget.ButtonBig();
        btnBeriObat = new widget.ButtonBig();
        btnPasienMati = new widget.ButtonBig();
        btnAdmin = new widget.ButtonBig();
        btnUser = new widget.ButtonBig();
        btnDisplay = new widget.ButtonBig();
        btnSetupHarga = new widget.ButtonBig();
        btnSuplier = new widget.ButtonBig();
        btnJnsBarang = new widget.ButtonBig();
        btnKonversi = new widget.ButtonBig();
        btnSatuan = new widget.ButtonBig();
        btnCashFlow = new widget.ButtonBig();
        btnBubes = new widget.ButtonBig();
        btnPostingJurnal = new widget.ButtonBig();
        btnRekeningTahun = new widget.ButtonBig();
        btnRekening = new widget.ButtonBig();
        btnPembelian = new widget.ButtonBig();
        btnPenjualan = new widget.ButtonBig();
        btnPiutang = new widget.ButtonBig();
        btnBayarPiutang = new widget.ButtonBig();
        btnOpname = new widget.ButtonBig();
        btnReturBeli = new widget.ButtonBig();
        btnReturJual = new widget.ButtonBig();
        btnSirkulasi = new widget.ButtonBig();
        btnKeuntungan = new widget.ButtonBig();
        btnLabaRugi = new widget.ButtonBig();
        btnReturPiutang = new widget.ButtonBig();
        btnAnalisaKamar = new widget.ButtonBig();
        btnRHDOkter = new widget.ButtonBig();
        btnRBDokter = new widget.ButtonBig();
        btnTagihanMasuk = new widget.ButtonBig();
        btnResume = new widget.ButtonBig();
        btnDiet = new widget.ButtonBig();
        btnRHParamedis = new widget.ButtonBig();
        btnRBParamedis = new widget.ButtonBig();
        btnKasir = new widget.ButtonBig();
        btnLahir = new widget.ButtonBig();
        btnSetBiayaHarian = new widget.ButtonBig();
        btnLihatPiutang = new widget.ButtonBig();
        btnLaboratorium = new widget.ButtonBig();
        btnRalanMasuk = new widget.ButtonBig();
        btnSetupAplikasi = new widget.ButtonBig();
        btnSetOtoRalan = new widget.ButtonBig();
        btnRanapMasuk = new widget.ButtonBig();
        btnSetBiayaMasukSekali = new widget.ButtonBig();
        btnPaketOperasi = new widget.ButtonBig();
        btnTagihanOperasi = new widget.ButtonBig();
        BtnJadwal = new widget.ButtonBig();
        btnSetupOtoLokasi = new widget.ButtonBig();
        btnTagihanPoli = new widget.ButtonBig();
        btnRujukMasuk = new widget.ButtonBig();
        btnTracker = new widget.ButtonBig();
        btnTindakanRanap = new widget.ButtonBig();
        btnSetupJamInap = new widget.ButtonBig();
        btnStokObatPasien = new widget.ButtonBig();
        btnTarifLab = new widget.ButtonBig();
        btnSetPenjab = new widget.ButtonBig();
        btnTagihanObatPoli = new widget.ButtonBig();
        btnTagihanObatBangsal = new widget.ButtonBig();
        btnReturPasien = new widget.ButtonBig();
        btnKeuntunganObatRanap = new widget.ButtonBig();
        btnPenggajian = new widget.ButtonBig();
        btnRekapPresensi = new widget.ButtonBig();
        btnRekapHarian = new widget.ButtonBig();
        btnRekapBulanan = new widget.ButtonBig();
        btnDeposit = new widget.ButtonBig();
        btnSetupRM = new widget.ButtonBig();
        btnResepPulang = new widget.ButtonBig();
        btnSetupTarif = new widget.ButtonBig();
        btnBarangIpsrs = new widget.ButtonBig();
        btnPembelianIpsrs = new widget.ButtonBig();
        btnPengeluaranIpsrs = new widget.ButtonBig();
        btnRHMasukIpsrs = new widget.ButtonBig();
        btnRHKeluarIpsrs = new widget.ButtonBig();
        btnRBiayaIpsrs = new widget.ButtonBig();
        btnTarifRadiologi = new widget.ButtonBig();
        btnPeriksaRadiologi = new widget.ButtonBig();
        btnTagihanRalanPerhari = new widget.ButtonBig();
        btnTagihanRanapPerhari = new widget.ButtonBig();
        btnSetupEmbalase = new widget.ButtonBig();
        btnObatPasienRalan = new widget.ButtonBig();
        btnObatPasienRanap = new widget.ButtonBig();
        btnPemesanan = new widget.ButtonBig();
        btnPengeluaran = new widget.ButtonBig();
        btnTambahanBiaya = new widget.ButtonBig();
        btnPotonganBiaya = new widget.ButtonBig();
        btnJMDetailDokter = new widget.ButtonBig();
        btnIGD = new widget.ButtonBig();
        btnSetObatRalan = new widget.ButtonBig();
        btnSetObatRanap = new widget.ButtonBig();
        btnDiagnosa = new widget.ButtonBig();
        btnKunjunganRalan = new widget.ButtonBig();
        btnTagihanDokter = new widget.ButtonBig();
        btnSidikJari = new widget.ButtonBig();
        btnJamPresensi = new widget.ButtonBig();
        btnJadwalPegawai = new widget.ButtonBig();
        btnSetupNota = new widget.ButtonBig();
        BtnDpjp = new widget.ButtonBig();
        btnMutasiBarang = new widget.ButtonBig();
        btnfee_visit_dokter = new widget.ButtonBig();
        btnfee_bacaan_ekg = new widget.ButtonBig();
        btnfee_rujukan_rontgen = new widget.ButtonBig();
        btnfee_rujukan_ranap = new widget.ButtonBig();
        btnfee_ralan = new widget.ButtonBig();
        btnakun_bayar = new widget.ButtonBig();
        btnbayar_pemesanan = new widget.ButtonBig();
        btnObatPasienPeresep = new widget.ButtonBig();
        btnJenisIpsrs = new widget.ButtonBig();
        btnPemasukanLain = new widget.ButtonBig();
        btnPengaturanRekening = new widget.ButtonBig();
        btnJadwalTambahan = new widget.ButtonBig();
        btnClosingKasir = new widget.ButtonBig();
        btnKeterlambatanPresensi = new widget.ButtonBig();
        btnSetHargaKamar = new widget.ButtonBig();
        btnRekapPershift = new widget.ButtonBig();
        btnCekBPJSNik = new widget.ButtonBig();
        btnCekBPJSKartu = new widget.ButtonBig();
        btnCekBPJSRiwayat = new widget.ButtonBig();
        btnRekapPresensi2 = new widget.ButtonBig();
        btnObatPerCaraBayar = new widget.ButtonBig();
        btnKunjunganRanap = new widget.ButtonBig();
        btnPaymentPoint = new widget.ButtonBig();
        btnCekBPJSNomorRujukanPCare = new widget.ButtonBig();
        btnICD9 = new widget.ButtonBig();
        btnDaruratStok = new widget.ButtonBig();
        btnRetensiRM = new widget.ButtonBig();
        btnTemporaryPresensi = new widget.ButtonBig();
        btnJurnalHarian = new widget.ButtonBig();
        btnSirkulasi2 = new widget.ButtonBig();
        btnCekBPJSDiagnosa = new widget.ButtonBig();
        btnCekBPJSPoli = new widget.ButtonBig();
        btnIndustriFarmasi = new widget.ButtonBig();
        btnRHJasaSarana = new widget.ButtonBig();
        btnRBJasaSarana = new widget.ButtonBig();
        btnRHPaketBHP = new widget.ButtonBig();
        btnRBPaketBHP = new widget.ButtonBig();
        btnPiutangBelumLunas = new widget.ButtonBig();
        btnCekBPJSFaskes = new widget.ButtonBig();
        btnBPJSSEP = new widget.ButtonBig();
        btnSuplierIPSRS = new widget.ButtonBig();
        btnMonitoringKlaim = new widget.ButtonBig();
        btnHarianKamar = new widget.ButtonBig();
        btnRincianPiutangPasien = new widget.ButtonBig();
        btnKeuntunganObat2 = new widget.ButtonBig();
        btnHutangObat = new widget.ButtonBig();
        btnRiwayatBarangMedis = new widget.ButtonBig();
        btnSensusHarianPoli = new widget.ButtonBig();
        btnAplicareReferensiKamar = new widget.ButtonBig();
        btnAplicareKetersediaanKamar = new widget.ButtonBig();
        btnAkunPiutang = new widget.ButtonBig();
        btnRHKSO = new widget.ButtonBig();
        btnRBKSO = new widget.ButtonBig();
        btnRHMenejemen = new widget.ButtonBig();
        btnRBMenejemen = new widget.ButtonBig();
        btnPegawai = new widget.ButtonBig();
        btnDaftarPermintaanResep = new widget.ButtonBig();
        btnPermintaanLab = new widget.ButtonBig();
        btnPermintaanRadiologi = new widget.ButtonBig();
        btnBerkasDigitalPerawatan = new widget.ButtonBig();
        btnReferensiPendaftaranMobileJKN = new widget.ButtonBig();
        btnBatalPendaftaranMobileJKN = new widget.ButtonBig();
        tanggal = new widget.Tanggal();
        btnDataPenjualan = new widget.ButtonBig();
        btnInputPenjualan = new widget.ButtonBig();
        btnResepObatDepan = new widget.ButtonBig();
        internalFrame1 = new widget.InternalFrame();
        BtnMenu = new widget.ButtonBig();
        jSeparator4 = new javax.swing.JSeparator();
        BtnToolReg = new widget.ButtonBig();
        btnToolIGD = new widget.ButtonBig();
        jSeparator5 = new javax.swing.JSeparator();
        btnToolLab = new widget.ButtonBig();
        btnToolRad = new widget.ButtonBig();
        BtnToolJualObat = new widget.ButtonBig();
        jSeparator9 = new javax.swing.JSeparator();
        BtnToolKamnap = new widget.ButtonBig();
        BtnToolKasir = new widget.ButtonBig();
        jSeparator7 = new javax.swing.JSeparator();
        BtnLog = new widget.ButtonBig();
        BtnClose = new widget.ButtonBig();
        internalFrame4 = new widget.InternalFrame();
        lblStts = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTgl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        PanelUtama = new javax.swing.JPanel();
        scrollPane1 = new widget.ScrollPane();
        PanelWall = new usu.widget.glass.PanelGlass();
        panelJudul = new usu.widget.glass.PanelGlass();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FlayMenu = new usu.widget.glass.PanelGlass();
        MenuBar = new widget.MenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        MnLogin = new javax.swing.JMenuItem();
        MnGantiPassword = new javax.swing.JMenuItem();
        MenuKeluar = new javax.swing.JMenuItem();
        jMenuPasien = new javax.swing.JMenu();
        MnPasien = new javax.swing.JMenuItem();
        MnKelahiranBayi = new javax.swing.JMenuItem();
        MnPasienMeninggal = new javax.swing.JMenuItem();
        MnDiagnosaPasien = new javax.swing.JMenuItem();
        MnRiwayatPerawatan = new javax.swing.JMenuItem();
        MnRetBrksRm = new javax.swing.JMenuItem();
        jMenuLayanan = new javax.swing.JMenu();
        MenuRawatJalan = new javax.swing.JMenu();
        MnRegistrasi = new javax.swing.JMenuItem();
        MnTindakanRalan = new javax.swing.JMenuItem();
        MenuRawatInap = new javax.swing.JMenu();
        MnKamarInap = new javax.swing.JMenuItem();
        MnDpjpRanap = new javax.swing.JMenuItem();
        MnTindakanRanap = new javax.swing.JMenuItem();
        MenuRujukan = new javax.swing.JMenu();
        MnRujukMasuk = new javax.swing.JMenuItem();
        MnRujukKeluar = new javax.swing.JMenuItem();
        MnInfoKamar = new javax.swing.JMenuItem();
        MnIgd = new javax.swing.JMenuItem();
        MnJadwalDokter = new javax.swing.JMenuItem();
        MnOperasi = new javax.swing.JMenuItem();
        MenuObat = new javax.swing.JMenu();
        MnPemberianObat = new javax.swing.JMenuItem();
        MnResepObat = new javax.swing.JMenuItem();
        MnResepPulang = new javax.swing.JMenuItem();
        MnDietPasien = new javax.swing.JMenuItem();
        MnPeriksaLab = new javax.swing.JMenuItem();
        MnPeriksaRad = new javax.swing.JMenuItem();
        MenuKasir = new javax.swing.JMenu();
        MnKasirRalan = new javax.swing.JMenuItem();
        MnDepositPasien = new javax.swing.JMenuItem();
        MnPiutangPasien = new javax.swing.JMenuItem();
        jMenuManajemen = new javax.swing.JMenu();
        MnDataDokter = new javax.swing.JMenuItem();
        MnDataPetugas = new javax.swing.JMenuItem();
        MnDataPegawai = new javax.swing.JMenuItem();
        MenuPresensi = new javax.swing.JMenu();
        MnBarcodePresensi = new javax.swing.JMenuItem();
        MnJamPresensi = new javax.swing.JMenuItem();
        MnPresensiHarian = new javax.swing.JMenuItem();
        MnPresensiBulanan = new javax.swing.JMenuItem();
        MnTempPresensi = new javax.swing.JMenuItem();
        MnRekapKehadiran = new javax.swing.JMenuItem();
        MnSidikJari = new javax.swing.JMenuItem();
        MenuJadwal = new javax.swing.JMenu();
        MnJadwalPegawai = new javax.swing.JMenuItem();
        MnJdwlTambahan = new javax.swing.JMenuItem();
        MnPresensiHarian1 = new javax.swing.JMenuItem();
        jMenuFarmasi = new javax.swing.JMenu();
        MenuSuplier = new javax.swing.JMenu();
        MnIndustriFar = new javax.swing.JMenuItem();
        MnSuplier = new javax.swing.JMenuItem();
        MnSatuanBrg = new javax.swing.JMenuItem();
        MnKonvSat = new javax.swing.JMenuItem();
        MenuInvObat = new javax.swing.JMenu();
        MnJnsObt = new javax.swing.JMenuItem();
        MnDataObat = new javax.swing.JMenuItem();
        MnStokOpname = new javax.swing.JMenuItem();
        MnMutasiObat = new javax.swing.JMenuItem();
        MnStokObtPx = new javax.swing.JMenuItem();
        MnPengadaan = new javax.swing.JMenuItem();
        MnPemesanan = new javax.swing.JMenuItem();
        MnPenjualanObt = new javax.swing.JMenuItem();
        MnStokOpname1 = new javax.swing.JMenuItem();
        MenuRetur = new javax.swing.JMenu();
        MnReturKeSup = new javax.swing.JMenuItem();
        MnReturPemb = new javax.swing.JMenuItem();
        MnReturObtRanap = new javax.swing.JMenuItem();
        MnReturPiutangPemb = new javax.swing.JMenuItem();
        MenuKeuntungan = new javax.swing.JMenu();
        MnKeuntunganPenj = new javax.swing.JMenuItem();
        MnKeuntBeriObt = new javax.swing.JMenuItem();
        MnSirkulasiObt = new javax.swing.JMenuItem();
        MnRiwayat = new javax.swing.JMenuItem();
        MnDaruratStok = new javax.swing.JMenuItem();
        jMenuInventory = new javax.swing.JMenu();
        MnSatuanBrgNon = new javax.swing.JMenuItem();
        MnJnsBrgNon = new javax.swing.JMenuItem();
        MnDataBrgNon = new javax.swing.JMenuItem();
        MnSupNon = new javax.swing.JMenuItem();
        MnPengadaanbrg = new javax.swing.JMenuItem();
        MnStokKeluar = new javax.swing.JMenuItem();
        MnBiayaPengadaan = new javax.swing.JMenuItem();
        MenuRekap = new javax.swing.JMenu();
        MnRekapPengadaan = new javax.swing.JMenuItem();
        MnRekapStok = new javax.swing.JMenuItem();
        jMenuBridging = new javax.swing.JMenu();
        MnCekNoBpjs = new javax.swing.JMenuItem();
        MnCekNikBpjs = new javax.swing.JMenuItem();
        MnRiwPesBpjs = new javax.swing.JMenuItem();
        MnCekNoRujPCare = new javax.swing.JMenuItem();
        MnRefDiagBpjs = new javax.swing.JMenuItem();
        MnRefPlBpjs = new javax.swing.JMenuItem();
        MnRefFaskes = new javax.swing.JMenuItem();
        MnBridging = new javax.swing.JMenuItem();
        MnMonitoringKlaim = new javax.swing.JMenuItem();
        MnRefKmrAplicare = new javax.swing.JMenuItem();
        MnKmrAplicare = new javax.swing.JMenuItem();
        MnRefMblJkn = new javax.swing.JMenuItem();
        MnBtlMblJkn = new javax.swing.JMenuItem();
        jMenuLaporan = new javax.swing.JMenu();
        MenuLapObat = new javax.swing.JMenu();
        MnLapObtPoli = new javax.swing.JMenuItem();
        MnObtKmr = new javax.swing.JMenuItem();
        MnObtDokRln = new javax.swing.JMenuItem();
        MnObtDokRnp = new javax.swing.JMenuItem();
        MnObtDokRsp = new javax.swing.JMenuItem();
        MnObtCrByr = new javax.swing.JMenuItem();
        MnDetJMDok = new javax.swing.JMenuItem();
        MenuLapHarian = new javax.swing.JMenu();
        MnHrDokAll = new javax.swing.JMenuItem();
        MnHrDokRalan = new javax.swing.JMenuItem();
        MnHrDok = new javax.swing.JMenuItem();
        MnHrKamar = new javax.swing.JMenuItem();
        MnHrBhp = new javax.swing.JMenuItem();
        MnHrParamedis = new javax.swing.JMenuItem();
        MnHrMnj = new javax.swing.JMenuItem();
        MnHrKso = new javax.swing.JMenuItem();
        MnHrSrn = new javax.swing.JMenuItem();
        MenuLapBulanan = new javax.swing.JMenu();
        MnBulananDok = new javax.swing.JMenuItem();
        MnBlnParamedis = new javax.swing.JMenuItem();
        MnBlnSrn = new javax.swing.JMenuItem();
        MnBlnKso = new javax.swing.JMenuItem();
        MnBlnMnj = new javax.swing.JMenuItem();
        MnBlnBhp = new javax.swing.JMenuItem();
        MenuLapBulanan1 = new javax.swing.JMenu();
        MnFreeVstDok = new javax.swing.JMenuItem();
        MnFreeBcEkg = new javax.swing.JMenuItem();
        MnFreeRujRotg = new javax.swing.JMenuItem();
        MnFreeRujRnp = new javax.swing.JMenuItem();
        MnFreePrkRln = new javax.swing.JMenuItem();
        MenuLapPemb = new javax.swing.JMenu();
        MnLapPembRalan = new javax.swing.JMenuItem();
        MnLapPembRnp = new javax.swing.JMenuItem();
        MnRkpPmbRln = new javax.swing.JMenuItem();
        MnRkpPmbRnp = new javax.swing.JMenuItem();
        MnLapTagMsk = new javax.swing.JMenuItem();
        MnLapTmbBiayaPx = new javax.swing.JMenuItem();
        MnLapPotBiayaPx = new javax.swing.JMenuItem();
        MnLapDepositPx = new javax.swing.JMenuItem();
        MnLapUangShift = new javax.swing.JMenuItem();
        MnLapPaymentPoint = new javax.swing.JMenuItem();
        MenuLapPykt = new javax.swing.JMenu();
        MnLapIcd9 = new javax.swing.JMenuItem();
        MnLapIcd10 = new javax.swing.JMenuItem();
        MnLapObtPenyakit = new javax.swing.JMenuItem();
        MnLapKjgRln = new javax.swing.JMenuItem();
        MnLapKjgRanap = new javax.swing.JMenuItem();
        MnSensusHrPoli = new javax.swing.JMenuItem();
        jMenuKeu = new javax.swing.JMenu();
        MenuTarif = new javax.swing.JMenu();
        MnTarifKamar = new javax.swing.JMenuItem();
        MnTarifRalan = new javax.swing.JMenuItem();
        MnTarifRanap = new javax.swing.JMenuItem();
        MnTarifLab = new javax.swing.JMenuItem();
        MnTarifRadiologi = new javax.swing.JMenuItem();
        MnTarifOperasi = new javax.swing.JMenuItem();
        MenuRekening = new javax.swing.JMenu();
        MnAkunRek = new javax.swing.JMenuItem();
        MnRekThn = new javax.swing.JMenuItem();
        MnPengaturanRek = new javax.swing.JMenuItem();
        MnAkunPiutang = new javax.swing.JMenuItem();
        MnAkunBayar = new javax.swing.JMenuItem();
        MnPengeluaranHr = new javax.swing.JMenuItem();
        MnPemasukanlain = new javax.swing.JMenuItem();
        MenuPiutang = new javax.swing.JMenu();
        MnPiutangPx = new javax.swing.JMenuItem();
        MnRincPiutangPx = new javax.swing.JMenuItem();
        MnPiutangBlmLns = new javax.swing.JMenuItem();
        MnByrPiutang = new javax.swing.JMenuItem();
        MnHtgObt = new javax.swing.JMenuItem();
        MnByrPsnObt = new javax.swing.JMenuItem();
        MnPostingJurnal = new javax.swing.JMenuItem();
        MnJurnalHr = new javax.swing.JMenuItem();
        MnBukuBesar = new javax.swing.JMenuItem();
        MnCashFlow = new javax.swing.JMenuItem();
        MnKeu = new javax.swing.JMenuItem();
        jMenuPengaturan = new javax.swing.JMenu();
        MnSetAplikasi = new javax.swing.JMenuItem();
        MnSetAdmin = new javax.swing.JMenuItem();
        MnPenujang = new javax.swing.JMenuItem();
        MnSetOtoLok = new javax.swing.JMenuItem();
        MnSetKmrInp = new javax.swing.JMenuItem();
        MnSetHargaKamar = new javax.swing.JMenuItem();
        MnSetEmbTus = new javax.swing.JMenuItem();
        MnSetUser = new javax.swing.JMenuItem();
        MnSetTrackerLog = new javax.swing.JMenuItem();
        MnDisplayAntrian = new javax.swing.JMenuItem();
        MnSetHargaObt = new javax.swing.JMenuItem();
        MnSetObtRnp = new javax.swing.JMenuItem();
        MnSetPenggTrf = new javax.swing.JMenuItem();
        MnSetOtoRalan = new javax.swing.JMenuItem();
        MnBiayaHarian = new javax.swing.JMenuItem();
        MnBiayaMskSkl = new javax.swing.JMenuItem();
        MnSetRM = new javax.swing.JMenuItem();
        MnSetBilling = new javax.swing.JMenuItem();
        MnClosingKsr = new javax.swing.JMenuItem();
        MnSetLambtPres = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        MnAnjungan6 = new javax.swing.JMenuItem();
        MnRekapHadir15 = new javax.swing.JMenuItem();
        MnRekapHadir16 = new javax.swing.JMenuItem();

        DlgLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DlgLogin.setName("DlgLogin"); // NOI18N
        DlgLogin.setUndecorated(true);
        DlgLogin.setResizable(false);

        internalFrame2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 120, 40)));
        internalFrame2.setName("internalFrame2"); // NOI18N
        internalFrame2.setWarnaAtas(new java.awt.Color(0, 120, 80));
        internalFrame2.setWarnaBawah(new java.awt.Color(0, 120, 80));
        internalFrame2.setLayout(null);

        internalFrame3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 125, 90), 1, true), ":: Silahkan Anda Login ::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame3.setName("internalFrame3"); // NOI18N
        internalFrame3.setWarnaAtas(new java.awt.Color(195, 215, 170));
        internalFrame3.setWarnaBawah(new java.awt.Color(245, 255, 220));
        internalFrame3.setLayout(null);

        panelGlass1.setBackground(java.awt.Color.lightGray);
        panelGlass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 185, 145)));
        panelGlass1.setOpaqueImage(false);
        panelGlass1.setRound(false);
        panelGlass1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID Admin :");
        jLabel4.setName("jLabel4"); // NOI18N
        panelGlass1.add(jLabel4);
        jLabel4.setBounds(2, 12, 80, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 81, 81));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password :");
        jLabel5.setName("jLabel5"); // NOI18N
        panelGlass1.add(jLabel5);
        jLabel5.setBounds(2, 40, 80, 23);

        edAdmin.setForeground(new java.awt.Color(125, 81, 81));
        edAdmin.setToolTipText("Silahkan masukkan ID Admin");
        edAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edAdmin.setName("edAdmin"); // NOI18N
        edAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edAdminKeyPressed(evt);
            }
        });
        panelGlass1.add(edAdmin);
        edAdmin.setBounds(85, 12, 220, 23);

        edPwd.setForeground(new java.awt.Color(125, 81, 81));
        edPwd.setToolTipText("Silahkan masukkan password");
        edPwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edPwd.setName("edPwd"); // NOI18N
        edPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPwdKeyPressed(evt);
            }
        });
        panelGlass1.add(edPwd);
        edPwd.setBounds(85, 40, 220, 23);

        internalFrame3.add(panelGlass1);
        panelGlass1.setBounds(-1, 30, 342, 76);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/LaST (Cobalt) Lock n Gear.png"))); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        internalFrame3.add(jLabel6);
        jLabel6.setBounds(120, 5, 135, 145);

        BtnLogin.setForeground(new java.awt.Color(185, 86, 86));
        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/lock.png"))); // NOI18N
        BtnLogin.setMnemonic('Z');
        BtnLogin.setText("Log-in");
        BtnLogin.setToolTipText("Alt+Z");
        BtnLogin.setName("BtnLogin"); // NOI18N
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        internalFrame3.add(BtnLogin);
        BtnLogin.setBounds(12, 125, 105, 32);

        BtnCancel.setForeground(new java.awt.Color(185, 86, 86));
        BtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnCancel.setMnemonic('Y');
        BtnCancel.setText("Batal");
        BtnCancel.setToolTipText("Alt+Y");
        BtnCancel.setName("BtnCancel"); // NOI18N
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        internalFrame3.add(BtnCancel);
        BtnCancel.setBounds(222, 125, 105, 32);

        internalFrame2.add(internalFrame3);
        internalFrame3.setBounds(2, 15, 340, 170);

        DlgLogin.getContentPane().add(internalFrame2, java.awt.BorderLayout.CENTER);

        WindowInput.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        WindowInput.setModal(true);
        WindowInput.setName("WindowInput"); // NOI18N
        WindowInput.setUndecorated(true);
        WindowInput.setResizable(false);

        internalFrame6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Ubah Password ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame6.setName("internalFrame6"); // NOI18N
        internalFrame6.setWarnaBawah(new java.awt.Color(235, 245, 225));
        internalFrame6.setLayout(null);

        PassLama.setHighlighter(null);
        PassLama.setName("PassLama"); // NOI18N
        PassLama.setSelectionColor(new java.awt.Color(255, 255, 255));
        internalFrame6.add(PassLama);
        PassLama.setBounds(128, 30, 190, 23);

        jLabel9.setText("Password Lama :");
        jLabel9.setName("jLabel9"); // NOI18N
        internalFrame6.add(jLabel9);
        jLabel9.setBounds(0, 30, 125, 23);

        BtnClosePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnClosePass.setMnemonic('2');
        BtnClosePass.setText("Tutup");
        BtnClosePass.setToolTipText("Alt+2");
        BtnClosePass.setName("BtnClosePass"); // NOI18N
        BtnClosePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClosePassActionPerformed(evt);
            }
        });
        BtnClosePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnClosePassKeyPressed(evt);
            }
        });
        internalFrame6.add(BtnClosePass);
        BtnClosePass.setBounds(230, 130, 100, 30);

        BtnSimpanPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpanPass.setMnemonic('1');
        BtnSimpanPass.setText("Simpan");
        BtnSimpanPass.setToolTipText("Alt+1");
        BtnSimpanPass.setName("BtnSimpanPass"); // NOI18N
        BtnSimpanPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanPassActionPerformed(evt);
            }
        });
        BtnSimpanPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanPassKeyPressed(evt);
            }
        });
        internalFrame6.add(BtnSimpanPass);
        BtnSimpanPass.setBounds(20, 130, 100, 30);

        jLabel10.setText("Password Baru :");
        jLabel10.setName("jLabel10"); // NOI18N
        internalFrame6.add(jLabel10);
        jLabel10.setBounds(0, 60, 125, 23);

        Passbaru1.setHighlighter(null);
        Passbaru1.setName("Passbaru1"); // NOI18N
        Passbaru1.setSelectionColor(new java.awt.Color(255, 255, 255));
        internalFrame6.add(Passbaru1);
        Passbaru1.setBounds(128, 60, 190, 23);

        jLabel12.setText("Password Baru :");
        jLabel12.setName("jLabel12"); // NOI18N
        internalFrame6.add(jLabel12);
        jLabel12.setBounds(0, 90, 125, 23);

        PassBaru2.setHighlighter(null);
        PassBaru2.setName("PassBaru2"); // NOI18N
        PassBaru2.setSelectionColor(new java.awt.Color(255, 255, 255));
        internalFrame6.add(PassBaru2);
        PassBaru2.setBounds(128, 90, 190, 23);

        WindowInput.getContentPane().add(internalFrame6, java.awt.BorderLayout.CENTER);

        DlgHome.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DlgHome.setAlwaysOnTop(true);
        DlgHome.setIconImage(null);
        DlgHome.setName("DlgHome"); // NOI18N
        DlgHome.setUndecorated(true);
        DlgHome.setResizable(false);

        panelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Menu Utama ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(40, 70, 50))); // NOI18N
        panelMenu.setName("panelMenu"); // NOI18N
        panelMenu.setPreferredSize(new java.awt.Dimension(2412, 3653));
        panelMenu.setWarnaAtas(new java.awt.Color(250, 255, 250));
        panelMenu.setWarnaBawah(new java.awt.Color(250, 255, 250));
        panelMenu.setLayout(new java.awt.BorderLayout(1, 1));

        panelisi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)));
        panelisi2.setName("panelisi2"); // NOI18N
        panelisi2.setPreferredSize(new java.awt.Dimension(100, 39));
        panelisi2.setWarnaAtas(new java.awt.Color(250, 255, 250));
        panelisi2.setWarnaBawah(new java.awt.Color(245, 250, 245));
        panelisi2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 7));

        label36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label36.setName("label36"); // NOI18N
        label36.setPreferredSize(new java.awt.Dimension(1, 23));
        panelisi2.add(label36);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        button1.setMinimumSize(new java.awt.Dimension(28, 23));
        button1.setName("button1"); // NOI18N
        button1.setPreferredSize(new java.awt.Dimension(25, 23));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panelisi2.add(button1);

        label35.setForeground(new java.awt.Color(40, 70, 50));
        label35.setText("Tampilkan Menu :");
        label35.setName("label35"); // NOI18N
        label35.setPreferredSize(new java.awt.Dimension(105, 23));
        panelisi2.add(label35);

        cmbMenu.setBackground(new java.awt.Color(247, 252, 247));
        cmbMenu.setForeground(new java.awt.Color(40, 70, 50));
        cmbMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[A] Registrasi, Tagihan Ranap & Ralan, Pelayanan & Billing Pasien", "[B] Presensi, Manajemen & Penggajian Pegawai Rumah Sakit", "[C] Transaksi Inventory Obat, BHP Medis, Alat Kesehatan Pasien", "[D] Transaksi Inventory Barang Non Medis dan Penunjang ( Lab & RO )", "[E] Olah Data Tagihan Rawat Inap & Rawat Jalan", "[F] Olah Data Penyakit, Laporan DKK, Laporal RL & Laporan Internal Rumah Sakit", "[G] Tarif Pelayanan & Keuangan Rumah Sakit", "[H] Bridging BPJS dan Aplicare", "[I] Olah Data Pasien", "[J] Pengaturan Program Aplikasi HMS" }));
        cmbMenu.setName("cmbMenu"); // NOI18N
        cmbMenu.setPreferredSize(new java.awt.Dimension(470, 23));
        cmbMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMenuItemStateChanged(evt);
            }
        });
        cmbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMenuActionPerformed(evt);
            }
        });
        panelisi2.add(cmbMenu);

        panelMenu.add(panelisi2, java.awt.BorderLayout.PAGE_START);

        scrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)));
        scrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setName("scrollPane2"); // NOI18N

        Panelmenu.setBackground(new java.awt.Color(250, 255, 250));
        Panelmenu.setBorder(null);
        Panelmenu.setMinimumSize(new java.awt.Dimension(1975, 2826));
        Panelmenu.setName("Panelmenu"); // NOI18N
        Panelmenu.setLayout(new java.awt.GridLayout(0, 12));

        btnBarcode.setForeground(new java.awt.Color(40, 70, 50));
        btnBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360484263_barcode.png"))); // NOI18N
        btnBarcode.setText("Barcode Presensi");
        btnBarcode.setIconTextGap(0);
        btnBarcode.setName("btnBarcode"); // NOI18N
        btnBarcode.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarcodeActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBarcode);

        btnICD.setForeground(new java.awt.Color(40, 70, 50));
        btnICD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Gnome-X-Office-Address-Book-48.png"))); // NOI18N
        btnICD.setText("ICD 10");
        btnICD.setIconTextGap(0);
        btnICD.setName("btnICD"); // NOI18N
        btnICD.setPreferredSize(new java.awt.Dimension(200, 90));
        btnICD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICDActionPerformed(evt);
            }
        });
        Panelmenu.add(btnICD);

        btnObat.setForeground(new java.awt.Color(40, 70, 50));
        btnObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnObat.setText("Obat, Alkes & BHP");
        btnObat.setIconTextGap(0);
        btnObat.setName("btnObat"); // NOI18N
        btnObat.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObat);

        btnObatPenyakit.setForeground(new java.awt.Color(40, 70, 50));
        btnObatPenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnObatPenyakit.setText("Obat Penyakit");
        btnObatPenyakit.setIconTextGap(0);
        btnObatPenyakit.setName("btnObatPenyakit"); // NOI18N
        btnObatPenyakit.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObatPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatPenyakitActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObatPenyakit);

        btnKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/industry.png"))); // NOI18N
        btnKamar.setText("Kamar");
        btnKamar.setIconTextGap(0);
        btnKamar.setName("btnKamar"); // NOI18N
        btnKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKamar);

        btnTindakanRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnTindakanRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/plaster.png"))); // NOI18N
        btnTindakanRalan.setText("Tarif Ralan");
        btnTindakanRalan.setIconTextGap(0);
        btnTindakanRalan.setName("btnTindakanRalan"); // NOI18N
        btnTindakanRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTindakanRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTindakanRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTindakanRalan);

        btnDokter.setForeground(new java.awt.Color(40, 70, 50));
        btnDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/doctor2.png"))); // NOI18N
        btnDokter.setText("Dokter");
        btnDokter.setIconTextGap(0);
        btnDokter.setName("btnDokter"); // NOI18N
        btnDokter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDokter);

        btnPetugas.setForeground(new java.awt.Color(40, 70, 50));
        btnPetugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/receptionist.png"))); // NOI18N
        btnPetugas.setText("Petugas");
        btnPetugas.setIconTextGap(0);
        btnPetugas.setName("btnPetugas"); // NOI18N
        btnPetugas.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPetugas);

        btnPasien.setForeground(new java.awt.Color(40, 70, 50));
        btnPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/patient.png"))); // NOI18N
        btnPasien.setText("Pasien");
        btnPasien.setIconTextGap(0);
        btnPasien.setName("btnPasien"); // NOI18N
        btnPasien.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPasien);

        btnRegistrasi.setForeground(new java.awt.Color(40, 70, 50));
        btnRegistrasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnRegistrasi.setText("Registrasi");
        btnRegistrasi.setIconTextGap(0);
        btnRegistrasi.setName("btnRegistrasi"); // NOI18N
        btnRegistrasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRegistrasi);

        btnRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/folder.png"))); // NOI18N
        btnRalan.setText("Tindakan Ralan");
        btnRalan.setIconTextGap(0);
        btnRalan.setName("btnRalan"); // NOI18N
        btnRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRalan);

        btnKamarInap.setForeground(new java.awt.Color(40, 70, 50));
        btnKamarInap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Home.png"))); // NOI18N
        btnKamarInap.setText("Kamar Inap");
        btnKamarInap.setIconTextGap(0);
        btnKamarInap.setName("btnKamarInap"); // NOI18N
        btnKamarInap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKamarInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKamarInapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKamarInap);

        btnRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/bedroom.png"))); // NOI18N
        btnRanap.setText("Tindakan Ranap");
        btnRanap.setIconTextGap(0);
        btnRanap.setName("btnRanap"); // NOI18N
        btnRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRanap);

        btnResepObat.setForeground(new java.awt.Color(40, 70, 50));
        btnResepObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/stock_task.png"))); // NOI18N
        btnResepObat.setText("Resep Obat");
        btnResepObat.setIconTextGap(0);
        btnResepObat.setName("btnResepObat"); // NOI18N
        btnResepObat.setPreferredSize(new java.awt.Dimension(200, 90));
        btnResepObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResepObatActionPerformed(evt);
            }
        });
        Panelmenu.add(btnResepObat);

        btnRujukPasien.setForeground(new java.awt.Color(40, 70, 50));
        btnRujukPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1485357758_Doctor.png"))); // NOI18N
        btnRujukPasien.setText("Rujukan Keluar");
        btnRujukPasien.setIconTextGap(0);
        btnRujukPasien.setName("btnRujukPasien"); // NOI18N
        btnRujukPasien.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRujukPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRujukPasienActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRujukPasien);

        btnBeriObat.setForeground(new java.awt.Color(40, 70, 50));
        btnBeriObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/first_aid_kit.png"))); // NOI18N
        btnBeriObat.setText("Beri Obat/BHP");
        btnBeriObat.setIconTextGap(0);
        btnBeriObat.setName("btnBeriObat"); // NOI18N
        btnBeriObat.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBeriObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeriObatActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBeriObat);

        btnPasienMati.setForeground(new java.awt.Color(40, 70, 50));
        btnPasienMati.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Ambulance.png"))); // NOI18N
        btnPasienMati.setText("Pasien Meninggal");
        btnPasienMati.setIconTextGap(0);
        btnPasienMati.setName("btnPasienMati"); // NOI18N
        btnPasienMati.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPasienMati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienMatiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPasienMati);

        btnAdmin.setForeground(new java.awt.Color(40, 70, 50));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/preferences-desktop-cryptography.png"))); // NOI18N
        btnAdmin.setText("Set Admin");
        btnAdmin.setIconTextGap(0);
        btnAdmin.setName("btnAdmin"); // NOI18N
        btnAdmin.setPreferredSize(new java.awt.Dimension(200, 90));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        Panelmenu.add(btnAdmin);

        btnUser.setForeground(new java.awt.Color(40, 70, 50));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Login Manager.png"))); // NOI18N
        btnUser.setText("Set User");
        btnUser.setIconTextGap(0);
        btnUser.setName("btnUser"); // NOI18N
        btnUser.setPreferredSize(new java.awt.Dimension(200, 90));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        Panelmenu.add(btnUser);

        btnDisplay.setForeground(new java.awt.Color(40, 70, 50));
        btnDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/find.png"))); // NOI18N
        btnDisplay.setText("Display Antrian");
        btnDisplay.setIconTextGap(0);
        btnDisplay.setName("btnDisplay"); // NOI18N
        btnDisplay.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDisplay);

        btnSetupHarga.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487093_price.png"))); // NOI18N
        btnSetupHarga.setText("Set Harga Obat");
        btnSetupHarga.setIconTextGap(0);
        btnSetupHarga.setName("btnSetupHarga"); // NOI18N
        btnSetupHarga.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupHargaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupHarga);

        btnSuplier.setForeground(new java.awt.Color(40, 70, 50));
        btnSuplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1485357959_truck.png"))); // NOI18N
        btnSuplier.setText("Suplier Obat/Alkes/BHP");
        btnSuplier.setIconTextGap(0);
        btnSuplier.setName("btnSuplier"); // NOI18N
        btnSuplier.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuplierActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSuplier);

        btnJnsBarang.setForeground(new java.awt.Color(40, 70, 50));
        btnJnsBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Card_file.png"))); // NOI18N
        btnJnsBarang.setText("Jenis Obat, Alkes & BHP");
        btnJnsBarang.setIconTextGap(0);
        btnJnsBarang.setName("btnJnsBarang"); // NOI18N
        btnJnsBarang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJnsBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJnsBarangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJnsBarang);

        btnKonversi.setForeground(new java.awt.Color(40, 70, 50));
        btnKonversi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/ark2.png"))); // NOI18N
        btnKonversi.setText("Konversi Satuan");
        btnKonversi.setIconTextGap(0);
        btnKonversi.setName("btnKonversi"); // NOI18N
        btnKonversi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKonversi);

        btnSatuan.setForeground(new java.awt.Color(40, 70, 50));
        btnSatuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/bag1.png"))); // NOI18N
        btnSatuan.setText("Satuan Barang");
        btnSatuan.setIconTextGap(0);
        btnSatuan.setName("btnSatuan"); // NOI18N
        btnSatuan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSatuan);

        btnCashFlow.setForeground(new java.awt.Color(40, 70, 50));
        btnCashFlow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnCashFlow.setText("Cash Flow");
        btnCashFlow.setIconTextGap(0);
        btnCashFlow.setName("btnCashFlow"); // NOI18N
        btnCashFlow.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCashFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashFlowActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCashFlow);

        btnBubes.setForeground(new java.awt.Color(40, 70, 50));
        btnBubes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/applications-office.png"))); // NOI18N
        btnBubes.setText("Buku Besar");
        btnBubes.setIconTextGap(0);
        btnBubes.setName("btnBubes"); // NOI18N
        btnBubes.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBubesActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBubes);

        btnPostingJurnal.setForeground(new java.awt.Color(40, 70, 50));
        btnPostingJurnal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485642_edit-notes.png"))); // NOI18N
        btnPostingJurnal.setText("Posting Jurnal");
        btnPostingJurnal.setIconTextGap(0);
        btnPostingJurnal.setName("btnPostingJurnal"); // NOI18N
        btnPostingJurnal.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPostingJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostingJurnalActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPostingJurnal);

        btnRekeningTahun.setForeground(new java.awt.Color(40, 70, 50));
        btnRekeningTahun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/money_bag.png"))); // NOI18N
        btnRekeningTahun.setText("Rekening Tahun");
        btnRekeningTahun.setIconTextGap(0);
        btnRekeningTahun.setName("btnRekeningTahun"); // NOI18N
        btnRekeningTahun.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekeningTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekeningTahunActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekeningTahun);

        btnRekening.setForeground(new java.awt.Color(40, 70, 50));
        btnRekening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/kwrite.png"))); // NOI18N
        btnRekening.setText("Akun Rekening");
        btnRekening.setIconTextGap(0);
        btnRekening.setName("btnRekening"); // NOI18N
        btnRekening.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekeningActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekening);

        btnPembelian.setForeground(new java.awt.Color(40, 70, 50));
        btnPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487067_calculator.png"))); // NOI18N
        btnPembelian.setText("Pengadaan Obat & BHP");
        btnPembelian.setIconTextGap(0);
        btnPembelian.setName("btnPembelian"); // NOI18N
        btnPembelian.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembelianActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPembelian);

        btnPenjualan.setForeground(new java.awt.Color(40, 70, 50));
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cashbox.png"))); // NOI18N
        btnPenjualan.setText("Penjualan Obat & BHP");
        btnPenjualan.setIconTextGap(0);
        btnPenjualan.setName("btnPenjualan"); // NOI18N
        btnPenjualan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPenjualan);

        btnPiutang.setForeground(new java.awt.Color(40, 70, 50));
        btnPiutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnPiutang.setText("Piutang Obat & BHP");
        btnPiutang.setIconTextGap(0);
        btnPiutang.setName("btnPiutang"); // NOI18N
        btnPiutang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiutangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPiutang);

        btnBayarPiutang.setForeground(new java.awt.Color(40, 70, 50));
        btnBayarPiutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046811_money.png"))); // NOI18N
        btnBayarPiutang.setText("Bayar Piutang");
        btnBayarPiutang.setIconTextGap(0);
        btnBayarPiutang.setName("btnBayarPiutang"); // NOI18N
        btnBayarPiutang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBayarPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarPiutangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBayarPiutang);

        btnOpname.setForeground(new java.awt.Color(40, 70, 50));
        btnOpname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487078_shipping.png"))); // NOI18N
        btnOpname.setText("Stok Opname Obat & BHP");
        btnOpname.setIconTextGap(0);
        btnOpname.setName("btnOpname"); // NOI18N
        btnOpname.setPreferredSize(new java.awt.Dimension(200, 90));
        btnOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpnameActionPerformed(evt);
            }
        });
        Panelmenu.add(btnOpname);

        btnReturBeli.setForeground(new java.awt.Color(40, 70, 50));
        btnReturBeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360816189_arrow_down.png"))); // NOI18N
        btnReturBeli.setText("Retur Ke Suplier");
        btnReturBeli.setIconTextGap(0);
        btnReturBeli.setName("btnReturBeli"); // NOI18N
        btnReturBeli.setPreferredSize(new java.awt.Dimension(200, 90));
        btnReturBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturBeliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnReturBeli);

        btnReturJual.setForeground(new java.awt.Color(40, 70, 50));
        btnReturJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486142_shopping_cart.png"))); // NOI18N
        btnReturJual.setText("Retur Dari Pembeli");
        btnReturJual.setIconTextGap(0);
        btnReturJual.setName("btnReturJual"); // NOI18N
        btnReturJual.setPreferredSize(new java.awt.Dimension(200, 90));
        btnReturJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturJualActionPerformed(evt);
            }
        });
        Panelmenu.add(btnReturJual);

        btnSirkulasi.setForeground(new java.awt.Color(40, 70, 50));
        btnSirkulasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487125_system-restart-panel.png"))); // NOI18N
        btnSirkulasi.setText("Sirkulasi Obat, Alkes & BHP");
        btnSirkulasi.setIconTextGap(0);
        btnSirkulasi.setName("btnSirkulasi"); // NOI18N
        btnSirkulasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSirkulasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSirkulasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSirkulasi);

        btnKeuntungan.setForeground(new java.awt.Color(40, 70, 50));
        btnKeuntungan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/coins.png"))); // NOI18N
        btnKeuntungan.setText("Keuntungan Penjualan");
        btnKeuntungan.setIconTextGap(0);
        btnKeuntungan.setName("btnKeuntungan"); // NOI18N
        btnKeuntungan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKeuntungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeuntunganActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKeuntungan);

        btnLabaRugi.setForeground(new java.awt.Color(40, 70, 50));
        btnLabaRugi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486822_20.png"))); // NOI18N
        btnLabaRugi.setText("Keuangan");
        btnLabaRugi.setIconTextGap(0);
        btnLabaRugi.setName("btnLabaRugi"); // NOI18N
        btnLabaRugi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnLabaRugi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabaRugiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnLabaRugi);

        btnReturPiutang.setForeground(new java.awt.Color(40, 70, 50));
        btnReturPiutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/custom-reports.png"))); // NOI18N
        btnReturPiutang.setText("Retur Piutang Pembeli");
        btnReturPiutang.setIconTextGap(0);
        btnReturPiutang.setName("btnReturPiutang"); // NOI18N
        btnReturPiutang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnReturPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturPiutangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnReturPiutang);

        btnAnalisaKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnAnalisaKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1485357890_hospital.png"))); // NOI18N
        btnAnalisaKamar.setText("Informasi Kamar");
        btnAnalisaKamar.setIconTextGap(0);
        btnAnalisaKamar.setName("btnAnalisaKamar"); // NOI18N
        btnAnalisaKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnAnalisaKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisaKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnAnalisaKamar);

        btnRHDOkter.setForeground(new java.awt.Color(40, 70, 50));
        btnRHDOkter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRHDOkter.setText("Harian Dokter");
        btnRHDOkter.setIconTextGap(0);
        btnRHDOkter.setName("btnRHDOkter"); // NOI18N
        btnRHDOkter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHDOkter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHDOkterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHDOkter);

        btnRBDokter.setForeground(new java.awt.Color(40, 70, 50));
        btnRBDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRBDokter.setText("Bulanan Dokter");
        btnRBDokter.setIconTextGap(0);
        btnRBDokter.setName("btnRBDokter"); // NOI18N
        btnRBDokter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBDokterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBDokter);

        btnTagihanMasuk.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046800_Cash_register.png"))); // NOI18N
        btnTagihanMasuk.setText("Tagihan Masuk");
        btnTagihanMasuk.setIconTextGap(0);
        btnTagihanMasuk.setName("btnTagihanMasuk"); // NOI18N
        btnTagihanMasuk.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanMasukActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanMasuk);

        btnResume.setForeground(new java.awt.Color(40, 70, 50));
        btnResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360816018_tests.png"))); // NOI18N
        btnResume.setText("Riwayat Perawatan");
        btnResume.setIconTextGap(0);
        btnResume.setName("btnResume"); // NOI18N
        btnResume.setPreferredSize(new java.awt.Dimension(200, 90));
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });
        Panelmenu.add(btnResume);

        btnDiet.setForeground(new java.awt.Color(40, 70, 50));
        btnDiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486936_pie-chart.png"))); // NOI18N
        btnDiet.setText("Diet Pasien");
        btnDiet.setIconTextGap(0);
        btnDiet.setName("btnDiet"); // NOI18N
        btnDiet.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDiet);

        btnRHParamedis.setForeground(new java.awt.Color(40, 70, 50));
        btnRHParamedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485894_add-notes.png"))); // NOI18N
        btnRHParamedis.setText("Harian Paramedis");
        btnRHParamedis.setIconTextGap(0);
        btnRHParamedis.setName("btnRHParamedis"); // NOI18N
        btnRHParamedis.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHParamedisActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHParamedis);

        btnRBParamedis.setForeground(new java.awt.Color(40, 70, 50));
        btnRBParamedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485894_add-notes.png"))); // NOI18N
        btnRBParamedis.setText("Bulanan Paramedis");
        btnRBParamedis.setIconTextGap(0);
        btnRBParamedis.setName("btnRBParamedis"); // NOI18N
        btnRBParamedis.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBParamedisActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBParamedis);

        btnKasir.setForeground(new java.awt.Color(40, 70, 50));
        btnKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cashbox.png"))); // NOI18N
        btnKasir.setText("Kasir Ralan");
        btnKasir.setIconTextGap(0);
        btnKasir.setName("btnKasir"); // NOI18N
        btnKasir.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasirActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKasir);

        btnLahir.setForeground(new java.awt.Color(40, 70, 50));
        btnLahir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/baby-girl.png"))); // NOI18N
        btnLahir.setText("Kelahiran Bayi");
        btnLahir.setIconTextGap(0);
        btnLahir.setName("btnLahir"); // NOI18N
        btnLahir.setPreferredSize(new java.awt.Dimension(200, 90));
        btnLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLahirActionPerformed(evt);
            }
        });
        Panelmenu.add(btnLahir);

        btnSetBiayaHarian.setForeground(new java.awt.Color(40, 70, 50));
        btnSetBiayaHarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnSetBiayaHarian.setText("Biaya Harian");
        btnSetBiayaHarian.setIconTextGap(0);
        btnSetBiayaHarian.setName("btnSetBiayaHarian"); // NOI18N
        btnSetBiayaHarian.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetBiayaHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBiayaHarianActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetBiayaHarian);

        btnLihatPiutang.setForeground(new java.awt.Color(40, 70, 50));
        btnLihatPiutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist_pencil-o.png"))); // NOI18N
        btnLihatPiutang.setText("Piutang Pasien");
        btnLihatPiutang.setIconTextGap(0);
        btnLihatPiutang.setName("btnLihatPiutang"); // NOI18N
        btnLihatPiutang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnLihatPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatPiutangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnLihatPiutang);

        btnLaboratorium.setForeground(new java.awt.Color(40, 70, 50));
        btnLaboratorium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/sign-up.png"))); // NOI18N
        btnLaboratorium.setText("Periksa Lab");
        btnLaboratorium.setIconTextGap(0);
        btnLaboratorium.setName("btnLaboratorium"); // NOI18N
        btnLaboratorium.setPreferredSize(new java.awt.Dimension(200, 90));
        btnLaboratorium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratoriumActionPerformed(evt);
            }
        });
        Panelmenu.add(btnLaboratorium);

        btnRalanMasuk.setForeground(new java.awt.Color(40, 70, 50));
        btnRalanMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047007_02.png"))); // NOI18N
        btnRalanMasuk.setText("Pembayaran Ralan");
        btnRalanMasuk.setIconTextGap(0);
        btnRalanMasuk.setName("btnRalanMasuk"); // NOI18N
        btnRalanMasuk.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRalanMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRalanMasukActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRalanMasuk);

        btnSetupAplikasi.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupAplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/local_network.png"))); // NOI18N
        btnSetupAplikasi.setText("Set Aplikasi");
        btnSetupAplikasi.setIconTextGap(0);
        btnSetupAplikasi.setName("btnSetupAplikasi"); // NOI18N
        btnSetupAplikasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupAplikasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupAplikasi);

        btnSetOtoRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnSetOtoRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/stethoscope (1).png"))); // NOI18N
        btnSetOtoRalan.setText("Set Oto Ralan");
        btnSetOtoRalan.setIconTextGap(0);
        btnSetOtoRalan.setName("btnSetOtoRalan"); // NOI18N
        btnSetOtoRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetOtoRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetOtoRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetOtoRalan);

        btnRanapMasuk.setForeground(new java.awt.Color(40, 70, 50));
        btnRanapMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047007_02.png"))); // NOI18N
        btnRanapMasuk.setText("Pembayaran Ranap");
        btnRanapMasuk.setIconTextGap(0);
        btnRanapMasuk.setName("btnRanapMasuk"); // NOI18N
        btnRanapMasuk.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRanapMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRanapMasukActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRanapMasuk);

        btnSetBiayaMasukSekali.setForeground(new java.awt.Color(40, 70, 50));
        btnSetBiayaMasukSekali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnSetBiayaMasukSekali.setText("Biaya Masuk Sekali");
        btnSetBiayaMasukSekali.setIconTextGap(0);
        btnSetBiayaMasukSekali.setName("btnSetBiayaMasukSekali"); // NOI18N
        btnSetBiayaMasukSekali.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetBiayaMasukSekali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBiayaMasukSekaliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetBiayaMasukSekali);

        btnPaketOperasi.setForeground(new java.awt.Color(40, 70, 50));
        btnPaketOperasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487111_stock_paste.png"))); // NOI18N
        btnPaketOperasi.setText("Tarif Operasi/VK");
        btnPaketOperasi.setIconTextGap(0);
        btnPaketOperasi.setName("btnPaketOperasi"); // NOI18N
        btnPaketOperasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPaketOperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketOperasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPaketOperasi);

        btnTagihanOperasi.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanOperasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/surgeon.png"))); // NOI18N
        btnTagihanOperasi.setText("Operasi/VK");
        btnTagihanOperasi.setIconTextGap(0);
        btnTagihanOperasi.setName("btnTagihanOperasi"); // NOI18N
        btnTagihanOperasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanOperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanOperasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanOperasi);

        BtnJadwal.setForeground(new java.awt.Color(40, 70, 50));
        BtnJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/doctor 3.png"))); // NOI18N
        BtnJadwal.setText("Jadwal Praktek");
        BtnJadwal.setIconTextGap(0);
        BtnJadwal.setName("BtnJadwal"); // NOI18N
        BtnJadwal.setPreferredSize(new java.awt.Dimension(200, 90));
        BtnJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJadwalActionPerformed(evt);
            }
        });
        Panelmenu.add(BtnJadwal);

        btnSetupOtoLokasi.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupOtoLokasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/our_process_2.png"))); // NOI18N
        btnSetupOtoLokasi.setText("Set Oto Lokasi");
        btnSetupOtoLokasi.setIconTextGap(0);
        btnSetupOtoLokasi.setName("btnSetupOtoLokasi"); // NOI18N
        btnSetupOtoLokasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupOtoLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupOtoLokasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupOtoLokasi);

        btnTagihanPoli.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047106_emblem-money.png"))); // NOI18N
        btnTagihanPoli.setText("Harian Dokter Poli");
        btnTagihanPoli.setIconTextGap(0);
        btnTagihanPoli.setName("btnTagihanPoli"); // NOI18N
        btnTagihanPoli.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanPoliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanPoli);

        btnRujukMasuk.setForeground(new java.awt.Color(40, 70, 50));
        btnRujukMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047834_application-vnd.ms-excel.png"))); // NOI18N
        btnRujukMasuk.setText("Rujukan Masuk");
        btnRujukMasuk.setIconTextGap(0);
        btnRujukMasuk.setName("btnRujukMasuk"); // NOI18N
        btnRujukMasuk.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRujukMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRujukMasukActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRujukMasuk);

        btnTracker.setForeground(new java.awt.Color(40, 70, 50));
        btnTracker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/receptionist.png"))); // NOI18N
        btnTracker.setText("Tracker Login");
        btnTracker.setIconTextGap(0);
        btnTracker.setName("btnTracker"); // NOI18N
        btnTracker.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackerActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTracker);

        btnTindakanRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnTindakanRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/doctor (2).png"))); // NOI18N
        btnTindakanRanap.setText("Tarif Ranap");
        btnTindakanRanap.setIconTextGap(0);
        btnTindakanRanap.setName("btnTindakanRanap"); // NOI18N
        btnTindakanRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTindakanRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTindakanRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTindakanRanap);

        btnSetupJamInap.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupJamInap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Time.png"))); // NOI18N
        btnSetupJamInap.setText("Set Kamar Inap");
        btnSetupJamInap.setIconTextGap(0);
        btnSetupJamInap.setName("btnSetupJamInap"); // NOI18N
        btnSetupJamInap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupJamInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupJamInapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupJamInap);

        btnStokObatPasien.setForeground(new java.awt.Color(40, 70, 50));
        btnStokObatPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487078_shipping.png"))); // NOI18N
        btnStokObatPasien.setText("Stok Obat Pasien");
        btnStokObatPasien.setIconTextGap(0);
        btnStokObatPasien.setName("btnStokObatPasien"); // NOI18N
        btnStokObatPasien.setPreferredSize(new java.awt.Dimension(200, 90));
        btnStokObatPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStokObatPasienActionPerformed(evt);
            }
        });
        Panelmenu.add(btnStokObatPasien);

        btnTarifLab.setForeground(new java.awt.Color(40, 70, 50));
        btnTarifLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnTarifLab.setText("Tarif Lab");
        btnTarifLab.setIconTextGap(0);
        btnTarifLab.setName("btnTarifLab"); // NOI18N
        btnTarifLab.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTarifLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifLabActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTarifLab);

        btnSetPenjab.setForeground(new java.awt.Color(40, 70, 50));
        btnSetPenjab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/user3.png"))); // NOI18N
        btnSetPenjab.setText("Set P.J. Unit Penunjang");
        btnSetPenjab.setIconTextGap(0);
        btnSetPenjab.setName("btnSetPenjab"); // NOI18N
        btnSetPenjab.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetPenjab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPenjabActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetPenjab);

        btnTagihanObatPoli.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanObatPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnTagihanObatPoli.setText("Obat Per Poli");
        btnTagihanObatPoli.setIconTextGap(0);
        btnTagihanObatPoli.setName("btnTagihanObatPoli"); // NOI18N
        btnTagihanObatPoli.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanObatPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanObatPoliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanObatPoli);

        btnTagihanObatBangsal.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanObatBangsal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnTagihanObatBangsal.setText("Obat Per Kamar");
        btnTagihanObatBangsal.setIconTextGap(0);
        btnTagihanObatBangsal.setName("btnTagihanObatBangsal"); // NOI18N
        btnTagihanObatBangsal.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanObatBangsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanObatBangsalActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanObatBangsal);

        btnReturPasien.setForeground(new java.awt.Color(40, 70, 50));
        btnReturPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815295_medical_case.png"))); // NOI18N
        btnReturPasien.setText("Retur Obat Ranap");
        btnReturPasien.setIconTextGap(0);
        btnReturPasien.setName("btnReturPasien"); // NOI18N
        btnReturPasien.setPreferredSize(new java.awt.Dimension(200, 90));
        btnReturPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturPasienActionPerformed(evt);
            }
        });
        Panelmenu.add(btnReturPasien);

        btnKeuntunganObatRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnKeuntunganObatRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/coins.png"))); // NOI18N
        btnKeuntunganObatRanap.setText("Keuntungan Beri Obat ");
        btnKeuntunganObatRanap.setIconTextGap(0);
        btnKeuntunganObatRanap.setName("btnKeuntunganObatRanap"); // NOI18N
        btnKeuntunganObatRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKeuntunganObatRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeuntunganObatRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKeuntunganObatRanap);

        btnPenggajian.setForeground(new java.awt.Color(40, 70, 50));
        btnPenggajian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046603_wallet.png"))); // NOI18N
        btnPenggajian.setText("Kepegawaian & Gaji");
        btnPenggajian.setIconTextGap(0);
        btnPenggajian.setName("btnPenggajian"); // NOI18N
        btnPenggajian.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPenggajian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenggajianActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPenggajian);

        btnRekapPresensi.setForeground(new java.awt.Color(40, 70, 50));
        btnRekapPresensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/sign-up.png"))); // NOI18N
        btnRekapPresensi.setText("Rekap Kehadiran");
        btnRekapPresensi.setIconTextGap(0);
        btnRekapPresensi.setName("btnRekapPresensi"); // NOI18N
        btnRekapPresensi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekapPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapPresensiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekapPresensi);

        btnRekapHarian.setForeground(new java.awt.Color(40, 70, 50));
        btnRekapHarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/rekap.png"))); // NOI18N
        btnRekapHarian.setText("Presensi Harian");
        btnRekapHarian.setIconTextGap(0);
        btnRekapHarian.setName("btnRekapHarian"); // NOI18N
        btnRekapHarian.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekapHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapHarianActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekapHarian);

        btnRekapBulanan.setForeground(new java.awt.Color(40, 70, 50));
        btnRekapBulanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486898_project-plan.png"))); // NOI18N
        btnRekapBulanan.setText("Presensi Bulanan");
        btnRekapBulanan.setIconTextGap(0);
        btnRekapBulanan.setName("btnRekapBulanan"); // NOI18N
        btnRekapBulanan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekapBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapBulananActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekapBulanan);

        btnDeposit.setForeground(new java.awt.Color(40, 70, 50));
        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Money.png"))); // NOI18N
        btnDeposit.setText("Deposit Pasien");
        btnDeposit.setIconTextGap(0);
        btnDeposit.setName("btnDeposit"); // NOI18N
        btnDeposit.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDeposit);

        btnSetupRM.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/patient (1).png"))); // NOI18N
        btnSetupRM.setText("Set RM");
        btnSetupRM.setIconTextGap(0);
        btnSetupRM.setName("btnSetupRM"); // NOI18N
        btnSetupRM.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupRMActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupRM);

        btnResepPulang.setForeground(new java.awt.Color(40, 70, 50));
        btnResepPulang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485642_edit-notes.png"))); // NOI18N
        btnResepPulang.setText("Resep Pulang");
        btnResepPulang.setIconTextGap(0);
        btnResepPulang.setName("btnResepPulang"); // NOI18N
        btnResepPulang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnResepPulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResepPulangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnResepPulang);

        btnSetupTarif.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupTarif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/x-office-address-book.png"))); // NOI18N
        btnSetupTarif.setText("Set Penggunaan Tarif");
        btnSetupTarif.setIconTextGap(0);
        btnSetupTarif.setName("btnSetupTarif"); // NOI18N
        btnSetupTarif.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupTarifActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupTarif);

        btnBarangIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnBarangIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487078_shipping.png"))); // NOI18N
        btnBarangIpsrs.setText("Barang");
        btnBarangIpsrs.setIconTextGap(0);
        btnBarangIpsrs.setName("btnBarangIpsrs"); // NOI18N
        btnBarangIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBarangIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBarangIpsrs);

        btnPembelianIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnPembelianIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/inventory-maintenance.png"))); // NOI18N
        btnPembelianIpsrs.setText("Pengadaan Barang");
        btnPembelianIpsrs.setIconTextGap(0);
        btnPembelianIpsrs.setName("btnPembelianIpsrs"); // NOI18N
        btnPembelianIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPembelianIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembelianIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPembelianIpsrs);

        btnPengeluaranIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnPengeluaranIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/shopping-basket-full.png"))); // NOI18N
        btnPengeluaranIpsrs.setText("Stok Keluar");
        btnPengeluaranIpsrs.setIconTextGap(0);
        btnPengeluaranIpsrs.setName("btnPengeluaranIpsrs"); // NOI18N
        btnPengeluaranIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPengeluaranIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengeluaranIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPengeluaranIpsrs);

        btnRHMasukIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnRHMasukIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/shopping_cart.png"))); // NOI18N
        btnRHMasukIpsrs.setText("Rekap Pengadaan");
        btnRHMasukIpsrs.setIconTextGap(0);
        btnRHMasukIpsrs.setName("btnRHMasukIpsrs"); // NOI18N
        btnRHMasukIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHMasukIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHMasukIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHMasukIpsrs);

        btnRHKeluarIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnRHKeluarIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360816018_tests.png"))); // NOI18N
        btnRHKeluarIpsrs.setText("Rekap Stok Keluar");
        btnRHKeluarIpsrs.setIconTextGap(0);
        btnRHKeluarIpsrs.setName("btnRHKeluarIpsrs"); // NOI18N
        btnRHKeluarIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHKeluarIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHKeluarIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHKeluarIpsrs);

        btnRBiayaIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnRBiayaIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnRBiayaIpsrs.setText("Biaya Pengadaan");
        btnRBiayaIpsrs.setIconTextGap(0);
        btnRBiayaIpsrs.setName("btnRBiayaIpsrs"); // NOI18N
        btnRBiayaIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBiayaIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBiayaIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBiayaIpsrs);

        btnTarifRadiologi.setForeground(new java.awt.Color(40, 70, 50));
        btnTarifRadiologi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1410153940_radiology.png"))); // NOI18N
        btnTarifRadiologi.setText("Tarif Radiologi");
        btnTarifRadiologi.setIconTextGap(0);
        btnTarifRadiologi.setName("btnTarifRadiologi"); // NOI18N
        btnTarifRadiologi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTarifRadiologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifRadiologiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTarifRadiologi);

        btnPeriksaRadiologi.setForeground(new java.awt.Color(40, 70, 50));
        btnPeriksaRadiologi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Print.png"))); // NOI18N
        btnPeriksaRadiologi.setText("Periksa Radiologi");
        btnPeriksaRadiologi.setIconTextGap(0);
        btnPeriksaRadiologi.setName("btnPeriksaRadiologi"); // NOI18N
        btnPeriksaRadiologi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPeriksaRadiologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriksaRadiologiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPeriksaRadiologi);

        btnTagihanRalanPerhari.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanRalanPerhari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnTagihanRalanPerhari.setText("Rekap Pembayaran Ralan");
        btnTagihanRalanPerhari.setIconTextGap(0);
        btnTagihanRalanPerhari.setName("btnTagihanRalanPerhari"); // NOI18N
        btnTagihanRalanPerhari.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanRalanPerhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanRalanPerhariActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanRalanPerhari);

        btnTagihanRanapPerhari.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanRanapPerhari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnTagihanRanapPerhari.setText("Rekap Pembayaran Ranap");
        btnTagihanRanapPerhari.setIconTextGap(0);
        btnTagihanRanapPerhari.setName("btnTagihanRanapPerhari"); // NOI18N
        btnTagihanRanapPerhari.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanRanapPerhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanRanapPerhariActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanRanapPerhari);

        btnSetupEmbalase.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupEmbalase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Money.png"))); // NOI18N
        btnSetupEmbalase.setText("Set Embalase & Tuslah");
        btnSetupEmbalase.setIconTextGap(0);
        btnSetupEmbalase.setName("btnSetupEmbalase"); // NOI18N
        btnSetupEmbalase.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupEmbalase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupEmbalaseActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupEmbalase);

        btnObatPasienRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnObatPasienRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnObatPasienRalan.setText("Obat Per Dokter Ralan");
        btnObatPasienRalan.setIconTextGap(0);
        btnObatPasienRalan.setName("btnObatPasienRalan"); // NOI18N
        btnObatPasienRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObatPasienRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatPasienRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObatPasienRalan);

        btnObatPasienRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnObatPasienRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnObatPasienRanap.setText("Obat Per Dokter Ranap");
        btnObatPasienRanap.setIconTextGap(0);
        btnObatPasienRanap.setName("btnObatPasienRanap"); // NOI18N
        btnObatPasienRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObatPasienRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatPasienRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObatPasienRanap);

        btnPemesanan.setForeground(new java.awt.Color(40, 70, 50));
        btnPemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/kwrite.png"))); // NOI18N
        btnPemesanan.setText("Pemesanan Obat & BHP");
        btnPemesanan.setIconTextGap(0);
        btnPemesanan.setName("btnPemesanan"); // NOI18N
        btnPemesanan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemesananActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPemesanan);

        btnPengeluaran.setForeground(new java.awt.Color(40, 70, 50));
        btnPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047106_emblem-money.png"))); // NOI18N
        btnPengeluaran.setText("Pengeluaran Harian");
        btnPengeluaran.setIconTextGap(0);
        btnPengeluaran.setName("btnPengeluaran"); // NOI18N
        btnPengeluaran.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengeluaranActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPengeluaran);

        btnTambahanBiaya.setForeground(new java.awt.Color(40, 70, 50));
        btnTambahanBiaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046786_Money.png"))); // NOI18N
        btnTambahanBiaya.setText("Tambahan Biaya Pasien");
        btnTambahanBiaya.setIconTextGap(0);
        btnTambahanBiaya.setName("btnTambahanBiaya"); // NOI18N
        btnTambahanBiaya.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTambahanBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahanBiayaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTambahanBiaya);

        btnPotonganBiaya.setForeground(new java.awt.Color(40, 70, 50));
        btnPotonganBiaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046786_Money.png"))); // NOI18N
        btnPotonganBiaya.setText("Potongan Biaya Pasien");
        btnPotonganBiaya.setIconTextGap(0);
        btnPotonganBiaya.setName("btnPotonganBiaya"); // NOI18N
        btnPotonganBiaya.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPotonganBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotonganBiayaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPotonganBiaya);

        btnJMDetailDokter.setForeground(new java.awt.Color(40, 70, 50));
        btnJMDetailDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnJMDetailDokter.setText("Detail JM Dokter");
        btnJMDetailDokter.setIconTextGap(0);
        btnJMDetailDokter.setName("btnJMDetailDokter"); // NOI18N
        btnJMDetailDokter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJMDetailDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJMDetailDokterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJMDetailDokter);

        btnIGD.setForeground(new java.awt.Color(40, 70, 50));
        btnIGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnIGD.setText("IGD/UGD");
        btnIGD.setIconTextGap(0);
        btnIGD.setName("btnIGD"); // NOI18N
        btnIGD.setPreferredSize(new java.awt.Dimension(200, 90));
        btnIGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIGDActionPerformed(evt);
            }
        });
        Panelmenu.add(btnIGD);

        btnSetObatRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnSetObatRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487093_price.png"))); // NOI18N
        btnSetObatRalan.setText("Set Obat Ralan");
        btnSetObatRalan.setIconTextGap(0);
        btnSetObatRalan.setName("btnSetObatRalan"); // NOI18N
        btnSetObatRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetObatRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetObatRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetObatRalan);

        btnSetObatRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnSetObatRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487093_price.png"))); // NOI18N
        btnSetObatRanap.setText("Set Obat Ranap");
        btnSetObatRanap.setIconTextGap(0);
        btnSetObatRanap.setName("btnSetObatRanap"); // NOI18N
        btnSetObatRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetObatRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetObatRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetObatRanap);

        btnDiagnosa.setForeground(new java.awt.Color(40, 70, 50));
        btnDiagnosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/health.png"))); // NOI18N
        btnDiagnosa.setText("Diagnosa Pasien");
        btnDiagnosa.setIconTextGap(0);
        btnDiagnosa.setName("btnDiagnosa"); // NOI18N
        btnDiagnosa.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDiagnosa);

        btnKunjunganRalan.setForeground(new java.awt.Color(40, 70, 50));
        btnKunjunganRalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Gnome-X-Office-Address-Book-48.png"))); // NOI18N
        btnKunjunganRalan.setText("Kunjungan Ralan");
        btnKunjunganRalan.setIconTextGap(0);
        btnKunjunganRalan.setName("btnKunjunganRalan"); // NOI18N
        btnKunjunganRalan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKunjunganRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKunjunganRalanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKunjunganRalan);

        btnTagihanDokter.setForeground(new java.awt.Color(40, 70, 50));
        btnTagihanDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047106_emblem-money.png"))); // NOI18N
        btnTagihanDokter.setText("Harian Dokter Ralan");
        btnTagihanDokter.setIconTextGap(0);
        btnTagihanDokter.setName("btnTagihanDokter"); // NOI18N
        btnTagihanDokter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTagihanDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTagihanDokterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTagihanDokter);

        btnSidikJari.setForeground(new java.awt.Color(40, 70, 50));
        btnSidikJari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/finger.png"))); // NOI18N
        btnSidikJari.setText("Sidik Jari");
        btnSidikJari.setIconTextGap(0);
        btnSidikJari.setName("btnSidikJari"); // NOI18N
        btnSidikJari.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSidikJari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSidikJariActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSidikJari);

        btnJamPresensi.setForeground(new java.awt.Color(40, 70, 50));
        btnJamPresensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Time.png"))); // NOI18N
        btnJamPresensi.setText("Jam Presensi");
        btnJamPresensi.setIconTextGap(0);
        btnJamPresensi.setName("btnJamPresensi"); // NOI18N
        btnJamPresensi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJamPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJamPresensiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJamPresensi);

        btnJadwalPegawai.setForeground(new java.awt.Color(40, 70, 50));
        btnJadwalPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnJadwalPegawai.setText("Jadwal Pegawai");
        btnJadwalPegawai.setIconTextGap(0);
        btnJadwalPegawai.setName("btnJadwalPegawai"); // NOI18N
        btnJadwalPegawai.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJadwalPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalPegawaiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJadwalPegawai);

        btnSetupNota.setForeground(new java.awt.Color(40, 70, 50));
        btnSetupNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485642_edit-notes.png"))); // NOI18N
        btnSetupNota.setText("Set Billing");
        btnSetupNota.setIconTextGap(0);
        btnSetupNota.setName("btnSetupNota"); // NOI18N
        btnSetupNota.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetupNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetupNotaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetupNota);

        BtnDpjp.setForeground(new java.awt.Color(40, 70, 50));
        BtnDpjp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/doctor2.png"))); // NOI18N
        BtnDpjp.setText("DPJP Ranap");
        BtnDpjp.setIconTextGap(0);
        BtnDpjp.setName("BtnDpjp"); // NOI18N
        BtnDpjp.setPreferredSize(new java.awt.Dimension(200, 90));
        BtnDpjp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDpjpActionPerformed(evt);
            }
        });
        Panelmenu.add(BtnDpjp);

        btnMutasiBarang.setForeground(new java.awt.Color(40, 70, 50));
        btnMutasiBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485642_edit-notes.png"))); // NOI18N
        btnMutasiBarang.setText("Mutasi Obat & BHP");
        btnMutasiBarang.setIconTextGap(0);
        btnMutasiBarang.setName("btnMutasiBarang"); // NOI18N
        btnMutasiBarang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnMutasiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutasiBarangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnMutasiBarang);

        btnfee_visit_dokter.setForeground(new java.awt.Color(40, 70, 50));
        btnfee_visit_dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnfee_visit_dokter.setText("Fee Visit Dokter");
        btnfee_visit_dokter.setIconTextGap(0);
        btnfee_visit_dokter.setName("btnfee_visit_dokter"); // NOI18N
        btnfee_visit_dokter.setPreferredSize(new java.awt.Dimension(200, 90));
        btnfee_visit_dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfee_visit_dokterActionPerformed(evt);
            }
        });
        Panelmenu.add(btnfee_visit_dokter);

        btnfee_bacaan_ekg.setForeground(new java.awt.Color(40, 70, 50));
        btnfee_bacaan_ekg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnfee_bacaan_ekg.setText("Fee Bacaan EKG");
        btnfee_bacaan_ekg.setIconTextGap(0);
        btnfee_bacaan_ekg.setName("btnfee_bacaan_ekg"); // NOI18N
        btnfee_bacaan_ekg.setPreferredSize(new java.awt.Dimension(200, 90));
        btnfee_bacaan_ekg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfee_bacaan_ekgActionPerformed(evt);
            }
        });
        Panelmenu.add(btnfee_bacaan_ekg);

        btnfee_rujukan_rontgen.setForeground(new java.awt.Color(40, 70, 50));
        btnfee_rujukan_rontgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnfee_rujukan_rontgen.setText("Fee Rujukan Rontgen");
        btnfee_rujukan_rontgen.setIconTextGap(0);
        btnfee_rujukan_rontgen.setName("btnfee_rujukan_rontgen"); // NOI18N
        btnfee_rujukan_rontgen.setPreferredSize(new java.awt.Dimension(200, 90));
        btnfee_rujukan_rontgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfee_rujukan_rontgenActionPerformed(evt);
            }
        });
        Panelmenu.add(btnfee_rujukan_rontgen);

        btnfee_rujukan_ranap.setForeground(new java.awt.Color(40, 70, 50));
        btnfee_rujukan_ranap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnfee_rujukan_ranap.setText("Fee Rujukan Ranap");
        btnfee_rujukan_ranap.setIconTextGap(0);
        btnfee_rujukan_ranap.setName("btnfee_rujukan_ranap"); // NOI18N
        btnfee_rujukan_ranap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnfee_rujukan_ranap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfee_rujukan_ranapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnfee_rujukan_ranap);

        btnfee_ralan.setForeground(new java.awt.Color(40, 70, 50));
        btnfee_ralan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnfee_ralan.setText("Fee Periksa Ralan");
        btnfee_ralan.setIconTextGap(0);
        btnfee_ralan.setName("btnfee_ralan"); // NOI18N
        btnfee_ralan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnfee_ralan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfee_ralanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnfee_ralan);

        btnakun_bayar.setForeground(new java.awt.Color(40, 70, 50));
        btnakun_bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnakun_bayar.setText("Akun Bayar");
        btnakun_bayar.setIconTextGap(0);
        btnakun_bayar.setName("btnakun_bayar"); // NOI18N
        btnakun_bayar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnakun_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnakun_bayarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnakun_bayar);

        btnbayar_pemesanan.setForeground(new java.awt.Color(40, 70, 50));
        btnbayar_pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cashbox.png"))); // NOI18N
        btnbayar_pemesanan.setText("Bayar Pesan Obat/BHP");
        btnbayar_pemesanan.setIconTextGap(0);
        btnbayar_pemesanan.setName("btnbayar_pemesanan"); // NOI18N
        btnbayar_pemesanan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnbayar_pemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayar_pemesananActionPerformed(evt);
            }
        });
        Panelmenu.add(btnbayar_pemesanan);

        btnObatPasienPeresep.setForeground(new java.awt.Color(40, 70, 50));
        btnObatPasienPeresep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnObatPasienPeresep.setText("Obat Per Dokter Peresep");
        btnObatPasienPeresep.setIconTextGap(0);
        btnObatPasienPeresep.setName("btnObatPasienPeresep"); // NOI18N
        btnObatPasienPeresep.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObatPasienPeresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatPasienPeresepActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObatPasienPeresep);

        btnJenisIpsrs.setForeground(new java.awt.Color(40, 70, 50));
        btnJenisIpsrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cabinet.png"))); // NOI18N
        btnJenisIpsrs.setText("Jenis Barang");
        btnJenisIpsrs.setIconTextGap(0);
        btnJenisIpsrs.setName("btnJenisIpsrs"); // NOI18N
        btnJenisIpsrs.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJenisIpsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJenisIpsrsActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJenisIpsrs);

        btnPemasukanLain.setForeground(new java.awt.Color(40, 70, 50));
        btnPemasukanLain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnPemasukanLain.setText("Pemasukan Lain-Lain");
        btnPemasukanLain.setIconTextGap(0);
        btnPemasukanLain.setName("btnPemasukanLain"); // NOI18N
        btnPemasukanLain.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPemasukanLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasukanLainActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPemasukanLain);

        btnPengaturanRekening.setForeground(new java.awt.Color(40, 70, 50));
        btnPengaturanRekening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/gtk-stock-book.png"))); // NOI18N
        btnPengaturanRekening.setText("Pengaturan Rekening");
        btnPengaturanRekening.setIconTextGap(0);
        btnPengaturanRekening.setName("btnPengaturanRekening"); // NOI18N
        btnPengaturanRekening.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPengaturanRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengaturanRekeningActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPengaturanRekening);

        btnJadwalTambahan.setForeground(new java.awt.Color(40, 70, 50));
        btnJadwalTambahan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnJadwalTambahan.setText("Jadwal Tambahan");
        btnJadwalTambahan.setIconTextGap(0);
        btnJadwalTambahan.setName("btnJadwalTambahan"); // NOI18N
        btnJadwalTambahan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJadwalTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalTambahanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJadwalTambahan);

        btnClosingKasir.setForeground(new java.awt.Color(40, 70, 50));
        btnClosingKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnClosingKasir.setText("Closing Kasir");
        btnClosingKasir.setIconTextGap(0);
        btnClosingKasir.setName("btnClosingKasir"); // NOI18N
        btnClosingKasir.setPreferredSize(new java.awt.Dimension(200, 90));
        btnClosingKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosingKasirActionPerformed(evt);
            }
        });
        Panelmenu.add(btnClosingKasir);

        btnKeterlambatanPresensi.setForeground(new java.awt.Color(40, 70, 50));
        btnKeterlambatanPresensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Time.png"))); // NOI18N
        btnKeterlambatanPresensi.setText("Set Keterlambatan Presensi");
        btnKeterlambatanPresensi.setIconTextGap(0);
        btnKeterlambatanPresensi.setName("btnKeterlambatanPresensi"); // NOI18N
        btnKeterlambatanPresensi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKeterlambatanPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeterlambatanPresensiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKeterlambatanPresensi);

        btnSetHargaKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnSetHargaKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/bedroom.png"))); // NOI18N
        btnSetHargaKamar.setText("Set Harga Kamar");
        btnSetHargaKamar.setIconTextGap(0);
        btnSetHargaKamar.setName("btnSetHargaKamar"); // NOI18N
        btnSetHargaKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSetHargaKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetHargaKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSetHargaKamar);

        btnRekapPershift.setForeground(new java.awt.Color(40, 70, 50));
        btnRekapPershift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnRekapPershift.setText("Rekap Uang Pershift");
        btnRekapPershift.setIconTextGap(0);
        btnRekapPershift.setName("btnRekapPershift"); // NOI18N
        btnRekapPershift.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekapPershift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapPershiftActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekapPershift);

        btnCekBPJSNik.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSNik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/family.png"))); // NOI18N
        btnCekBPJSNik.setText("Cek NIK BPJS");
        btnCekBPJSNik.setIconTextGap(0);
        btnCekBPJSNik.setName("btnCekBPJSNik"); // NOI18N
        btnCekBPJSNik.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSNikActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSNik);

        btnCekBPJSKartu.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSKartu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/administrator.png"))); // NOI18N
        btnCekBPJSKartu.setText("Cek No.Kartu BPJS");
        btnCekBPJSKartu.setIconTextGap(0);
        btnCekBPJSKartu.setName("btnCekBPJSKartu"); // NOI18N
        btnCekBPJSKartu.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSKartuActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSKartu);

        btnCekBPJSRiwayat.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSRiwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/doctor 3.png"))); // NOI18N
        btnCekBPJSRiwayat.setText("Riwayat Peserta BPJS");
        btnCekBPJSRiwayat.setIconTextGap(0);
        btnCekBPJSRiwayat.setName("btnCekBPJSRiwayat"); // NOI18N
        btnCekBPJSRiwayat.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSRiwayatActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSRiwayat);

        btnRekapPresensi2.setForeground(new java.awt.Color(40, 70, 50));
        btnRekapPresensi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/sign-up.png"))); // NOI18N
        btnRekapPresensi2.setText("Rekap Kehadiran 2");
        btnRekapPresensi2.setIconTextGap(0);
        btnRekapPresensi2.setName("btnRekapPresensi2"); // NOI18N
        btnRekapPresensi2.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRekapPresensi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapPresensi2ActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRekapPresensi2);

        btnObatPerCaraBayar.setForeground(new java.awt.Color(40, 70, 50));
        btnObatPerCaraBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnObatPerCaraBayar.setText("Obat Per Cara Bayar");
        btnObatPerCaraBayar.setIconTextGap(0);
        btnObatPerCaraBayar.setName("btnObatPerCaraBayar"); // NOI18N
        btnObatPerCaraBayar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnObatPerCaraBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatPerCaraBayarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnObatPerCaraBayar);

        btnKunjunganRanap.setForeground(new java.awt.Color(40, 70, 50));
        btnKunjunganRanap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Gnome-X-Office-Address-Book-48.png"))); // NOI18N
        btnKunjunganRanap.setText("Kunjungan Ranap");
        btnKunjunganRanap.setIconTextGap(0);
        btnKunjunganRanap.setName("btnKunjunganRanap"); // NOI18N
        btnKunjunganRanap.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKunjunganRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKunjunganRanapActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKunjunganRanap);

        btnPaymentPoint.setForeground(new java.awt.Color(40, 70, 50));
        btnPaymentPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/coins.png"))); // NOI18N
        btnPaymentPoint.setText("Payment Point");
        btnPaymentPoint.setIconTextGap(0);
        btnPaymentPoint.setName("btnPaymentPoint"); // NOI18N
        btnPaymentPoint.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPaymentPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentPointActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPaymentPoint);

        btnCekBPJSNomorRujukanPCare.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSNomorRujukanPCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist.png"))); // NOI18N
        btnCekBPJSNomorRujukanPCare.setText("Cek No.Rujukan PCare");
        btnCekBPJSNomorRujukanPCare.setIconTextGap(0);
        btnCekBPJSNomorRujukanPCare.setName("btnCekBPJSNomorRujukanPCare"); // NOI18N
        btnCekBPJSNomorRujukanPCare.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSNomorRujukanPCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSNomorRujukanPCareActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSNomorRujukanPCare);

        btnICD9.setForeground(new java.awt.Color(40, 70, 50));
        btnICD9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Gnome-X-Office-Address-Book-48.png"))); // NOI18N
        btnICD9.setText("ICD 9");
        btnICD9.setIconTextGap(0);
        btnICD9.setName("btnICD9"); // NOI18N
        btnICD9.setPreferredSize(new java.awt.Dimension(200, 90));
        btnICD9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICD9ActionPerformed(evt);
            }
        });
        Panelmenu.add(btnICD9);

        btnDaruratStok.setForeground(new java.awt.Color(40, 70, 50));
        btnDaruratStok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487078_shipping.png"))); // NOI18N
        btnDaruratStok.setText("Darurat Stok");
        btnDaruratStok.setIconTextGap(0);
        btnDaruratStok.setName("btnDaruratStok"); // NOI18N
        btnDaruratStok.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDaruratStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaruratStokActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDaruratStok);

        btnRetensiRM.setForeground(new java.awt.Color(40, 70, 50));
        btnRetensiRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/reportorium.png"))); // NOI18N
        btnRetensiRM.setText("Retensi Berkas R.M.");
        btnRetensiRM.setIconTextGap(0);
        btnRetensiRM.setName("btnRetensiRM"); // NOI18N
        btnRetensiRM.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRetensiRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetensiRMActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRetensiRM);

        btnTemporaryPresensi.setForeground(new java.awt.Color(40, 70, 50));
        btnTemporaryPresensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047834_application-vnd.ms-excel.png"))); // NOI18N
        btnTemporaryPresensi.setText("Temporary Presensi");
        btnTemporaryPresensi.setIconTextGap(0);
        btnTemporaryPresensi.setName("btnTemporaryPresensi"); // NOI18N
        btnTemporaryPresensi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnTemporaryPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemporaryPresensiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnTemporaryPresensi);

        btnJurnalHarian.setForeground(new java.awt.Color(40, 70, 50));
        btnJurnalHarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485865_schedule.png"))); // NOI18N
        btnJurnalHarian.setText("Jurnal Harian");
        btnJurnalHarian.setIconTextGap(0);
        btnJurnalHarian.setName("btnJurnalHarian"); // NOI18N
        btnJurnalHarian.setPreferredSize(new java.awt.Dimension(200, 90));
        btnJurnalHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurnalHarianActionPerformed(evt);
            }
        });
        Panelmenu.add(btnJurnalHarian);

        btnSirkulasi2.setForeground(new java.awt.Color(40, 70, 50));
        btnSirkulasi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360487125_system-restart-panel.png"))); // NOI18N
        btnSirkulasi2.setText("Sirkulasi Obat, Alkes & BHP 2");
        btnSirkulasi2.setIconTextGap(0);
        btnSirkulasi2.setName("btnSirkulasi2"); // NOI18N
        btnSirkulasi2.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSirkulasi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSirkulasi2ActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSirkulasi2);

        btnCekBPJSDiagnosa.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSDiagnosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Gnome-X-Office-Address-Book-48.png"))); // NOI18N
        btnCekBPJSDiagnosa.setText("Referensi Diagnosa BPJS");
        btnCekBPJSDiagnosa.setIconTextGap(0);
        btnCekBPJSDiagnosa.setName("btnCekBPJSDiagnosa"); // NOI18N
        btnCekBPJSDiagnosa.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSDiagnosaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSDiagnosa);

        btnCekBPJSPoli.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/logout.png"))); // NOI18N
        btnCekBPJSPoli.setText("Referensi Poli BPJS");
        btnCekBPJSPoli.setIconTextGap(0);
        btnCekBPJSPoli.setName("btnCekBPJSPoli"); // NOI18N
        btnCekBPJSPoli.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSPoliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSPoli);

        btnIndustriFarmasi.setForeground(new java.awt.Color(40, 70, 50));
        btnIndustriFarmasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486910_company.png"))); // NOI18N
        btnIndustriFarmasi.setText("Industri Farmasi");
        btnIndustriFarmasi.setIconTextGap(0);
        btnIndustriFarmasi.setName("btnIndustriFarmasi"); // NOI18N
        btnIndustriFarmasi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnIndustriFarmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndustriFarmasiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnIndustriFarmasi);

        btnRHJasaSarana.setForeground(new java.awt.Color(40, 70, 50));
        btnRHJasaSarana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRHJasaSarana.setText("Harian Jasa Sarana");
        btnRHJasaSarana.setIconTextGap(0);
        btnRHJasaSarana.setName("btnRHJasaSarana"); // NOI18N
        btnRHJasaSarana.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHJasaSarana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHJasaSaranaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHJasaSarana);

        btnRBJasaSarana.setForeground(new java.awt.Color(40, 70, 50));
        btnRBJasaSarana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRBJasaSarana.setText("Bulanan Jasa Sarana");
        btnRBJasaSarana.setIconTextGap(0);
        btnRBJasaSarana.setName("btnRBJasaSarana"); // NOI18N
        btnRBJasaSarana.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBJasaSarana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBJasaSaranaActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBJasaSarana);

        btnRHPaketBHP.setForeground(new java.awt.Color(40, 70, 50));
        btnRHPaketBHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnRHPaketBHP.setText("Harian BHP Medis/Paket Obat");
        btnRHPaketBHP.setIconTextGap(0);
        btnRHPaketBHP.setName("btnRHPaketBHP"); // NOI18N
        btnRHPaketBHP.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHPaketBHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHPaketBHPActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHPaketBHP);

        btnRBPaketBHP.setForeground(new java.awt.Color(40, 70, 50));
        btnRBPaketBHP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360815855_laboratory.png"))); // NOI18N
        btnRBPaketBHP.setText("Bulanan BHP Medis/Paket Obat");
        btnRBPaketBHP.setIconTextGap(0);
        btnRBPaketBHP.setName("btnRBPaketBHP"); // NOI18N
        btnRBPaketBHP.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBPaketBHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBPaketBHPActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBPaketBHP);

        btnPiutangBelumLunas.setForeground(new java.awt.Color(40, 70, 50));
        btnPiutangBelumLunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist_pencil-o.png"))); // NOI18N
        btnPiutangBelumLunas.setText("Piutang Belum Lunas");
        btnPiutangBelumLunas.setIconTextGap(0);
        btnPiutangBelumLunas.setName("btnPiutangBelumLunas"); // NOI18N
        btnPiutangBelumLunas.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPiutangBelumLunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiutangBelumLunasActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPiutangBelumLunas);

        btnCekBPJSFaskes.setForeground(new java.awt.Color(40, 70, 50));
        btnCekBPJSFaskes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/industry.png"))); // NOI18N
        btnCekBPJSFaskes.setText("Referensi Faskes BPJS");
        btnCekBPJSFaskes.setIconTextGap(0);
        btnCekBPJSFaskes.setName("btnCekBPJSFaskes"); // NOI18N
        btnCekBPJSFaskes.setPreferredSize(new java.awt.Dimension(200, 90));
        btnCekBPJSFaskes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBPJSFaskesActionPerformed(evt);
            }
        });
        Panelmenu.add(btnCekBPJSFaskes);

        btnBPJSSEP.setForeground(new java.awt.Color(40, 70, 50));
        btnBPJSSEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1481038237_Adobe_Bridge_CS.png"))); // NOI18N
        btnBPJSSEP.setText("Data Bridging SEP BPJS");
        btnBPJSSEP.setIconTextGap(0);
        btnBPJSSEP.setName("btnBPJSSEP"); // NOI18N
        btnBPJSSEP.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBPJSSEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBPJSSEPActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBPJSSEP);

        btnSuplierIPSRS.setForeground(new java.awt.Color(40, 70, 50));
        btnSuplierIPSRS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1481002123_wheelchair.png"))); // NOI18N
        btnSuplierIPSRS.setText("Suplier Non Medis");
        btnSuplierIPSRS.setIconTextGap(0);
        btnSuplierIPSRS.setName("btnSuplierIPSRS"); // NOI18N
        btnSuplierIPSRS.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSuplierIPSRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuplierIPSRSActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSuplierIPSRS);

        btnMonitoringKlaim.setForeground(new java.awt.Color(40, 70, 50));
        btnMonitoringKlaim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360486845_23.png"))); // NOI18N
        btnMonitoringKlaim.setText("Monitoring Verifikasi Klaim BPJS");
        btnMonitoringKlaim.setIconTextGap(0);
        btnMonitoringKlaim.setName("btnMonitoringKlaim"); // NOI18N
        btnMonitoringKlaim.setPreferredSize(new java.awt.Dimension(200, 90));
        btnMonitoringKlaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitoringKlaimActionPerformed(evt);
            }
        });
        Panelmenu.add(btnMonitoringKlaim);

        btnHarianKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnHarianKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404047106_emblem-money.png"))); // NOI18N
        btnHarianKamar.setText("Harian Kamar");
        btnHarianKamar.setIconTextGap(0);
        btnHarianKamar.setName("btnHarianKamar"); // NOI18N
        btnHarianKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnHarianKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarianKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnHarianKamar);

        btnRincianPiutangPasien.setForeground(new java.awt.Color(40, 70, 50));
        btnRincianPiutangPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/checklist_pencil-o.png"))); // NOI18N
        btnRincianPiutangPasien.setText("Rincian Piutang Pasien");
        btnRincianPiutangPasien.setIconTextGap(0);
        btnRincianPiutangPasien.setName("btnRincianPiutangPasien"); // NOI18N
        btnRincianPiutangPasien.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRincianPiutangPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRincianPiutangPasienActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRincianPiutangPasien);

        btnKeuntunganObat2.setForeground(new java.awt.Color(40, 70, 50));
        btnKeuntunganObat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/coins.png"))); // NOI18N
        btnKeuntunganObat2.setText("Keuntungan Beri Obat 2");
        btnKeuntunganObat2.setIconTextGap(0);
        btnKeuntunganObat2.setName("btnKeuntunganObat2"); // NOI18N
        btnKeuntunganObat2.setPreferredSize(new java.awt.Dimension(200, 90));
        btnKeuntunganObat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeuntunganObat2ActionPerformed(evt);
            }
        });
        Panelmenu.add(btnKeuntunganObat2);

        btnHutangObat.setForeground(new java.awt.Color(40, 70, 50));
        btnHutangObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cashbox.png"))); // NOI18N
        btnHutangObat.setText("Hutang Obat & BHP");
        btnHutangObat.setIconTextGap(0);
        btnHutangObat.setName("btnHutangObat"); // NOI18N
        btnHutangObat.setPreferredSize(new java.awt.Dimension(200, 90));
        btnHutangObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHutangObatActionPerformed(evt);
            }
        });
        Panelmenu.add(btnHutangObat);

        btnRiwayatBarangMedis.setForeground(new java.awt.Color(40, 70, 50));
        btnRiwayatBarangMedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/gnome-searchtool.png"))); // NOI18N
        btnRiwayatBarangMedis.setText("Riwayat Obat, Alkes & BHP");
        btnRiwayatBarangMedis.setIconTextGap(0);
        btnRiwayatBarangMedis.setName("btnRiwayatBarangMedis"); // NOI18N
        btnRiwayatBarangMedis.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRiwayatBarangMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatBarangMedisActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRiwayatBarangMedis);

        btnSensusHarianPoli.setForeground(new java.awt.Color(40, 70, 50));
        btnSensusHarianPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/custom-reports.png"))); // NOI18N
        btnSensusHarianPoli.setText("Sensus Harian Poli");
        btnSensusHarianPoli.setIconTextGap(0);
        btnSensusHarianPoli.setName("btnSensusHarianPoli"); // NOI18N
        btnSensusHarianPoli.setPreferredSize(new java.awt.Dimension(200, 90));
        btnSensusHarianPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensusHarianPoliActionPerformed(evt);
            }
        });
        Panelmenu.add(btnSensusHarianPoli);

        btnAplicareReferensiKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnAplicareReferensiKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/bedroom.png"))); // NOI18N
        btnAplicareReferensiKamar.setText("Referensi Kamar Aplicare");
        btnAplicareReferensiKamar.setIconTextGap(0);
        btnAplicareReferensiKamar.setName("btnAplicareReferensiKamar"); // NOI18N
        btnAplicareReferensiKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnAplicareReferensiKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicareReferensiKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnAplicareReferensiKamar);

        btnAplicareKetersediaanKamar.setForeground(new java.awt.Color(40, 70, 50));
        btnAplicareKetersediaanKamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1485357524_Company.png"))); // NOI18N
        btnAplicareKetersediaanKamar.setText("Ketersediaan Kamar Aplicare");
        btnAplicareKetersediaanKamar.setIconTextGap(0);
        btnAplicareKetersediaanKamar.setName("btnAplicareKetersediaanKamar"); // NOI18N
        btnAplicareKetersediaanKamar.setPreferredSize(new java.awt.Dimension(200, 90));
        btnAplicareKetersediaanKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicareKetersediaanKamarActionPerformed(evt);
            }
        });
        Panelmenu.add(btnAplicareKetersediaanKamar);

        btnAkunPiutang.setForeground(new java.awt.Color(40, 70, 50));
        btnAkunPiutang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1404046603_wallet.png"))); // NOI18N
        btnAkunPiutang.setText("Akun Piutang");
        btnAkunPiutang.setIconTextGap(0);
        btnAkunPiutang.setName("btnAkunPiutang"); // NOI18N
        btnAkunPiutang.setPreferredSize(new java.awt.Dimension(200, 90));
        btnAkunPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkunPiutangActionPerformed(evt);
            }
        });
        Panelmenu.add(btnAkunPiutang);

        btnRHKSO.setForeground(new java.awt.Color(40, 70, 50));
        btnRHKSO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRHKSO.setText("Harian KSO");
        btnRHKSO.setIconTextGap(0);
        btnRHKSO.setName("btnRHKSO"); // NOI18N
        btnRHKSO.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHKSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHKSOActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHKSO);

        btnRBKSO.setForeground(new java.awt.Color(40, 70, 50));
        btnRBKSO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRBKSO.setText("Bulanan KSO");
        btnRBKSO.setIconTextGap(0);
        btnRBKSO.setName("btnRBKSO"); // NOI18N
        btnRBKSO.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBKSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBKSOActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBKSO);

        btnRHMenejemen.setForeground(new java.awt.Color(40, 70, 50));
        btnRHMenejemen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRHMenejemen.setText("Harian Menejemen");
        btnRHMenejemen.setIconTextGap(0);
        btnRHMenejemen.setName("btnRHMenejemen"); // NOI18N
        btnRHMenejemen.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRHMenejemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRHMenejemenActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRHMenejemen);

        btnRBMenejemen.setForeground(new java.awt.Color(40, 70, 50));
        btnRBMenejemen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/address-book.png"))); // NOI18N
        btnRBMenejemen.setText("Bulanan Menejemen");
        btnRBMenejemen.setIconTextGap(0);
        btnRBMenejemen.setName("btnRBMenejemen"); // NOI18N
        btnRBMenejemen.setPreferredSize(new java.awt.Dimension(200, 90));
        btnRBMenejemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBMenejemenActionPerformed(evt);
            }
        });
        Panelmenu.add(btnRBMenejemen);

        btnPegawai.setForeground(new java.awt.Color(40, 70, 50));
        btnPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/receptionist.png"))); // NOI18N
        btnPegawai.setText("Pegawai");
        btnPegawai.setIconTextGap(0);
        btnPegawai.setName("btnPegawai"); // NOI18N
        btnPegawai.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPegawai);

        btnDaftarPermintaanResep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1360485894_add-notes.png"))); // NOI18N
        btnDaftarPermintaanResep.setText("Daftar Resep Dokter");
        btnDaftarPermintaanResep.setIconTextGap(0);
        btnDaftarPermintaanResep.setName("btnDaftarPermintaanResep"); // NOI18N
        btnDaftarPermintaanResep.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDaftarPermintaanResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarPermintaanResepActionPerformed(evt);
            }
        });
        Panelmenu.add(btnDaftarPermintaanResep);

        btnPermintaanLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/laboratory.png"))); // NOI18N
        btnPermintaanLab.setText("Permintaan Lab");
        btnPermintaanLab.setIconTextGap(0);
        btnPermintaanLab.setName("btnPermintaanLab"); // NOI18N
        btnPermintaanLab.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPermintaanLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermintaanLabActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPermintaanLab);

        btnPermintaanRadiologi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/surgeon.png"))); // NOI18N
        btnPermintaanRadiologi.setText("Permintaan Radiologi");
        btnPermintaanRadiologi.setIconTextGap(0);
        btnPermintaanRadiologi.setName("btnPermintaanRadiologi"); // NOI18N
        btnPermintaanRadiologi.setPreferredSize(new java.awt.Dimension(200, 90));
        btnPermintaanRadiologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermintaanRadiologiActionPerformed(evt);
            }
        });
        Panelmenu.add(btnPermintaanRadiologi);

        btnBerkasDigitalPerawatan.setText("Berkas Digital Perawatan");
        btnBerkasDigitalPerawatan.setIconTextGap(0);
        btnBerkasDigitalPerawatan.setName("btnBerkasDigitalPerawatan"); // NOI18N
        btnBerkasDigitalPerawatan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBerkasDigitalPerawatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerkasDigitalPerawatanActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBerkasDigitalPerawatan);

        btnReferensiPendaftaranMobileJKN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/iconfinder_Analysis-Case-Document-Virus-History_5958953.png"))); // NOI18N
        btnReferensiPendaftaranMobileJKN.setText("Referensi Pendaftaran Mobile JKN");
        btnReferensiPendaftaranMobileJKN.setIconTextGap(0);
        btnReferensiPendaftaranMobileJKN.setName("btnReferensiPendaftaranMobileJKN"); // NOI18N
        btnReferensiPendaftaranMobileJKN.setPreferredSize(new java.awt.Dimension(200, 90));
        btnReferensiPendaftaranMobileJKN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferensiPendaftaranMobileJKNActionPerformed(evt);
            }
        });
        Panelmenu.add(btnReferensiPendaftaranMobileJKN);

        btnBatalPendaftaranMobileJKN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/iconfinder_Analysis-Case-Document-Virus-History_5958953.png"))); // NOI18N
        btnBatalPendaftaranMobileJKN.setText("Batal Pendaftaran Mobile JKN");
        btnBatalPendaftaranMobileJKN.setIconTextGap(0);
        btnBatalPendaftaranMobileJKN.setName("btnBatalPendaftaranMobileJKN"); // NOI18N
        btnBatalPendaftaranMobileJKN.setPreferredSize(new java.awt.Dimension(200, 90));
        btnBatalPendaftaranMobileJKN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalPendaftaranMobileJKNActionPerformed(evt);
            }
        });
        Panelmenu.add(btnBatalPendaftaranMobileJKN);

        scrollPane2.setViewportView(Panelmenu);

        panelMenu.add(scrollPane2, java.awt.BorderLayout.CENTER);

        DlgHome.getContentPane().add(panelMenu, java.awt.BorderLayout.CENTER);

        tanggal.setEditable(false);
        tanggal.setForeground(new java.awt.Color(50, 70, 50));
        tanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "02/06/2021" }));
        tanggal.setDisplayFormat("dd/MM/yyyy");
        tanggal.setName("tanggal"); // NOI18N
        tanggal.setOpaque(false);

        btnDataPenjualan.setForeground(new java.awt.Color(40, 70, 50));
        btnDataPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/1485357971_desktop_computer.png"))); // NOI18N
        btnDataPenjualan.setText("Data Penjualan Obat & BHP");
        btnDataPenjualan.setIconTextGap(0);
        btnDataPenjualan.setName("btnDataPenjualan"); // NOI18N
        btnDataPenjualan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnDataPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPenjualanActionPerformed(evt);
            }
        });

        btnInputPenjualan.setForeground(new java.awt.Color(40, 70, 50));
        btnInputPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/cashbox.png"))); // NOI18N
        btnInputPenjualan.setText("Input Penjualan Obat & BHP");
        btnInputPenjualan.setIconTextGap(0);
        btnInputPenjualan.setName("btnInputPenjualan"); // NOI18N
        btnInputPenjualan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnInputPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputPenjualanActionPerformed(evt);
            }
        });

        btnResepObatDepan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/stock_task.png"))); // NOI18N
        btnResepObatDepan.setText("No. Resep");
        btnResepObatDepan.setIconTextGap(0);
        btnResepObatDepan.setName("btnResepObatDepan"); // NOI18N
        btnResepObatDepan.setPreferredSize(new java.awt.Dimension(200, 90));
        btnResepObatDepan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResepObatDepanActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::[ Khanza Hospital Management System 2017 ]::");
        setIconImages(null);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 225, 195)));
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setPreferredSize(new java.awt.Dimension(40, 44));
        internalFrame1.setVerifyInputWhenFocusTarget(false);
        internalFrame1.setWarnaAtas(new java.awt.Color(235, 245, 215));
        internalFrame1.setWarnaBawah(new java.awt.Color(215, 225, 195));
        internalFrame1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 1));

        BtnMenu.setForeground(new java.awt.Color(80, 100, 80));
        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/menu.png"))); // NOI18N
        BtnMenu.setMnemonic('M');
        BtnMenu.setText("Menu");
        BtnMenu.setToolTipText("Alt+M");
        BtnMenu.setEnabled(false);
        BtnMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnMenu.setIconTextGap(3);
        BtnMenu.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnMenu.setName("BtnMenu"); // NOI18N
        BtnMenu.setPreferredSize(new java.awt.Dimension(68, 40));
        BtnMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnMenu.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnMenu);

        jSeparator4.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator4.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 80)));
        jSeparator4.setName("jSeparator4"); // NOI18N
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(1, 38));
        internalFrame1.add(jSeparator4);

        BtnToolReg.setForeground(new java.awt.Color(80, 100, 80));
        BtnToolReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/PatientFile.png"))); // NOI18N
        BtnToolReg.setMnemonic('R');
        BtnToolReg.setText("Registrasi");
        BtnToolReg.setToolTipText("Alt+R");
        BtnToolReg.setEnabled(false);
        BtnToolReg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnToolReg.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnToolReg.setIconTextGap(3);
        BtnToolReg.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnToolReg.setName("BtnToolReg"); // NOI18N
        BtnToolReg.setPreferredSize(new java.awt.Dimension(90, 40));
        BtnToolReg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnToolReg.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnToolReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToolRegActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnToolReg);

        btnToolIGD.setForeground(new java.awt.Color(80, 100, 80));
        btnToolIGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Doctor.png"))); // NOI18N
        btnToolIGD.setMnemonic('D');
        btnToolIGD.setText("IGD/UGD");
        btnToolIGD.setToolTipText("Alt+D");
        btnToolIGD.setEnabled(false);
        btnToolIGD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnToolIGD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnToolIGD.setIconTextGap(3);
        btnToolIGD.setMargin(new java.awt.Insets(1, 2, 1, 0));
        btnToolIGD.setName("btnToolIGD"); // NOI18N
        btnToolIGD.setPreferredSize(new java.awt.Dimension(84, 40));
        btnToolIGD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnToolIGD.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnToolIGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToolIGDActionPerformed(evt);
            }
        });
        internalFrame1.add(btnToolIGD);

        jSeparator5.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator5.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 80)));
        jSeparator5.setName("jSeparator5"); // NOI18N
        jSeparator5.setOpaque(true);
        jSeparator5.setPreferredSize(new java.awt.Dimension(1, 38));
        internalFrame1.add(jSeparator5);

        btnToolLab.setForeground(new java.awt.Color(80, 100, 80));
        btnToolLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/addressbook-search24.png"))); // NOI18N
        btnToolLab.setMnemonic('O');
        btnToolLab.setText("Laboratorium");
        btnToolLab.setToolTipText("Alt+O");
        btnToolLab.setEnabled(false);
        btnToolLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnToolLab.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnToolLab.setIconTextGap(3);
        btnToolLab.setMargin(new java.awt.Insets(1, 2, 1, 0));
        btnToolLab.setName("btnToolLab"); // NOI18N
        btnToolLab.setPreferredSize(new java.awt.Dimension(110, 40));
        btnToolLab.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnToolLab.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnToolLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToolLabActionPerformed(evt);
            }
        });
        internalFrame1.add(btnToolLab);

        btnToolRad.setForeground(new java.awt.Color(80, 100, 80));
        btnToolRad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Surgeon.png"))); // NOI18N
        btnToolRad.setMnemonic('A');
        btnToolRad.setText("Radiologi");
        btnToolRad.setToolTipText("Alt+A");
        btnToolRad.setEnabled(false);
        btnToolRad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnToolRad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnToolRad.setIconTextGap(3);
        btnToolRad.setMargin(new java.awt.Insets(1, 2, 1, 0));
        btnToolRad.setName("btnToolRad"); // NOI18N
        btnToolRad.setPreferredSize(new java.awt.Dimension(90, 40));
        btnToolRad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnToolRad.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnToolRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToolRadActionPerformed(evt);
            }
        });
        internalFrame1.add(btnToolRad);

        BtnToolJualObat.setForeground(new java.awt.Color(80, 100, 80));
        BtnToolJualObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping-cart-insert24.png"))); // NOI18N
        BtnToolJualObat.setMnemonic('j');
        BtnToolJualObat.setText("Penjualan");
        BtnToolJualObat.setToolTipText("Alt+J");
        BtnToolJualObat.setEnabled(false);
        BtnToolJualObat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnToolJualObat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnToolJualObat.setIconTextGap(3);
        BtnToolJualObat.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnToolJualObat.setName("BtnToolJualObat"); // NOI18N
        BtnToolJualObat.setPreferredSize(new java.awt.Dimension(90, 40));
        BtnToolJualObat.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnToolJualObat.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnToolJualObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToolJualObatActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnToolJualObat);

        jSeparator9.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator9.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 80)));
        jSeparator9.setName("jSeparator9"); // NOI18N
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(1, 38));
        internalFrame1.add(jSeparator9);

        BtnToolKamnap.setForeground(new java.awt.Color(80, 100, 80));
        BtnToolKamnap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/home24.png"))); // NOI18N
        BtnToolKamnap.setMnemonic('K');
        BtnToolKamnap.setText("Rawat Inap");
        BtnToolKamnap.setToolTipText("Alt+K");
        BtnToolKamnap.setEnabled(false);
        BtnToolKamnap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnToolKamnap.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnToolKamnap.setIconTextGap(3);
        BtnToolKamnap.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnToolKamnap.setName("BtnToolKamnap"); // NOI18N
        BtnToolKamnap.setPreferredSize(new java.awt.Dimension(100, 40));
        BtnToolKamnap.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnToolKamnap.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnToolKamnap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToolKamnapActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnToolKamnap);

        BtnToolKasir.setForeground(new java.awt.Color(80, 100, 80));
        BtnToolKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/addressbook-edit24.png"))); // NOI18N
        BtnToolKasir.setMnemonic('S');
        BtnToolKasir.setText("Rawat Jalan");
        BtnToolKasir.setToolTipText("Alt+S");
        BtnToolKasir.setEnabled(false);
        BtnToolKasir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnToolKasir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnToolKasir.setIconTextGap(3);
        BtnToolKasir.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnToolKasir.setName("BtnToolKasir"); // NOI18N
        BtnToolKasir.setPreferredSize(new java.awt.Dimension(105, 40));
        BtnToolKasir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnToolKasir.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnToolKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToolKasirActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnToolKasir);

        jSeparator7.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator7.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 80)));
        jSeparator7.setName("jSeparator7"); // NOI18N
        jSeparator7.setOpaque(true);
        jSeparator7.setPreferredSize(new java.awt.Dimension(1, 38));
        internalFrame1.add(jSeparator7);

        BtnLog.setForeground(new java.awt.Color(80, 100, 80));
        BtnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/login2.png"))); // NOI18N
        BtnLog.setMnemonic('L');
        BtnLog.setText("Log In");
        BtnLog.setToolTipText("Alt+L");
        BtnLog.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnLog.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnLog.setIconTextGap(3);
        BtnLog.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnLog.setName("BtnLog"); // NOI18N
        BtnLog.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnLog.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnLog.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnLog);

        BtnClose.setForeground(new java.awt.Color(80, 100, 80));
        BtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Delete.png"))); // NOI18N
        BtnClose.setMnemonic('U');
        BtnClose.setText("Keluar");
        BtnClose.setToolTipText("Alt+U");
        BtnClose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnClose.setIconTextGap(3);
        BtnClose.setMargin(new java.awt.Insets(1, 2, 1, 0));
        BtnClose.setName("BtnClose"); // NOI18N
        BtnClose.setPreferredSize(new java.awt.Dimension(80, 40));
        BtnClose.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnClose.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });
        internalFrame1.add(BtnClose);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.PAGE_START);

        internalFrame4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 225, 195)));
        internalFrame4.setName("internalFrame4"); // NOI18N
        internalFrame4.setPreferredSize(new java.awt.Dimension(330, 25));
        internalFrame4.setWarnaAtas(new java.awt.Color(215, 225, 195));
        internalFrame4.setWarnaBawah(new java.awt.Color(235, 245, 215));
        internalFrame4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lblStts.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblStts.setForeground(new java.awt.Color(80, 100, 80));
        lblStts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStts.setText("Status Admin :");
        lblStts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblStts.setName("lblStts"); // NOI18N
        lblStts.setPreferredSize(new java.awt.Dimension(100, 23));
        internalFrame4.add(lblStts);

        jSeparator1.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator1.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setName("jSeparator1"); // NOI18N
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(1, 20));
        internalFrame4.add(jSeparator1);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblUser.setForeground(new java.awt.Color(80, 100, 80));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Log Out");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUser.setName("lblUser"); // NOI18N
        lblUser.setPreferredSize(new java.awt.Dimension(170, 23));
        internalFrame4.add(lblUser);

        jSeparator2.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator2.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setName("jSeparator2"); // NOI18N
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 20));
        internalFrame4.add(jSeparator2);

        lblTgl.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblTgl.setForeground(new java.awt.Color(80, 100, 80));
        lblTgl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTgl.setText("Tanggal");
        lblTgl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTgl.setName("lblTgl"); // NOI18N
        lblTgl.setPreferredSize(new java.awt.Dimension(150, 23));
        internalFrame4.add(lblTgl);

        jSeparator3.setBackground(new java.awt.Color(175, 195, 150));
        jSeparator3.setForeground(new java.awt.Color(175, 195, 150));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setName("jSeparator3"); // NOI18N
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(1, 20));
        internalFrame4.add(jSeparator3);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 100, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/file-edit-16x16.png"))); // NOI18N
        jLabel7.setText("Didesain & dibuat oleh Khanza.Soft Media.");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIconTextGap(3);
        jLabel7.setName("jLabel7"); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(347, 23));
        internalFrame4.add(jLabel7);

        getContentPane().add(internalFrame4, java.awt.BorderLayout.PAGE_END);

        PanelUtama.setName("PanelUtama"); // NOI18N
        PanelUtama.setOpaque(false);
        PanelUtama.setLayout(new java.awt.BorderLayout());

        scrollPane1.setBorder(null);
        scrollPane1.setName("scrollPane1"); // NOI18N

        PanelWall.setBackground(new java.awt.Color(29, 29, 29));
        PanelWall.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/picture/wallpaper.jpg"))); // NOI18N
        PanelWall.setBackgroundImageType(usu.widget.constan.BackgroundConstan.BACKGROUND_IMAGE_STRECT);
        PanelWall.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 0, 0));
        PanelWall.setPreferredSize(new java.awt.Dimension(200, 200));
        PanelWall.setRound(false);
        PanelWall.setWarna(new java.awt.Color(110, 110, 110));
        PanelWall.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelWallMouseMoved(evt);
            }
        });
        PanelWall.setLayout(new java.awt.BorderLayout());

        panelJudul.setBackground(new java.awt.Color(255, 255, 255));
        panelJudul.setOpaqueImage(false);
        panelJudul.setPreferredSize(new java.awt.Dimension(200, 170));
        panelJudul.setRound(false);
        panelJudul.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Rumas Sakit Kok Gitu");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setName("jLabel11"); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(430, 30));
        panelJudul.add(jLabel11);
        jLabel11.setBounds(145, 90, 680, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/yaski_icon.png"))); // NOI18N
        jLabel8.setText("RS Masa Kini");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel8.setName("jLabel8"); // NOI18N
        panelJudul.add(jLabel8);
        jLabel8.setBounds(40, 0, 820, 150);

        PanelWall.add(panelJudul, java.awt.BorderLayout.PAGE_END);

        FlayMenu.setBackground(new java.awt.Color(255, 255, 255));
        FlayMenu.setOpaqueImage(false);
        FlayMenu.setPreferredSize(new java.awt.Dimension(200, 110));
        FlayMenu.setRound(false);
        FlayMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        PanelWall.add(FlayMenu, java.awt.BorderLayout.PAGE_START);

        scrollPane1.setViewportView(PanelWall);

        PanelUtama.add(scrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelUtama, java.awt.BorderLayout.CENTER);

        MenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MenuBar.setForeground(new java.awt.Color(255, 255, 255));
        MenuBar.setName("MenuBar"); // NOI18N
        MenuBar.setPreferredSize(new java.awt.Dimension(227, 32));

        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setMnemonic('A');
        jMenu1.setText("  SIMRSKhanza");
        jMenu1.setToolTipText("Alt+A");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(103, 30));

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("Tentang SIMRS Khanza");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.setPreferredSize(new java.awt.Dimension(105, 20));
        jMenu1.add(jMenuItem2);

        jSeparator8.setBackground(new java.awt.Color(155, 175, 130));
        jSeparator8.setForeground(new java.awt.Color(155, 175, 130));
        jSeparator8.setName("jSeparator8"); // NOI18N
        jMenu1.add(jSeparator8);

        MnLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLogin.setText("Log In");
        MnLogin.setMargin(new java.awt.Insets(10, 0, 0, 0));
        MnLogin.setName("MnLogin"); // NOI18N
        MnLogin.setPreferredSize(new java.awt.Dimension(200, 20));
        MnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogActionPerformed(evt);
            }
        });
        jMenu1.add(MnLogin);

        MnGantiPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnGantiPassword.setText("Ubah Password");
        MnGantiPassword.setEnabled(false);
        MnGantiPassword.setName("MnGantiPassword"); // NOI18N
        MnGantiPassword.setPreferredSize(new java.awt.Dimension(200, 20));
        MnGantiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnGantiPasswordBtnLogActionPerformed(evt);
            }
        });
        jMenu1.add(MnGantiPassword);

        MenuKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuKeluar.setText("Keluar");
        MenuKeluar.setName("MenuKeluar"); // NOI18N
        MenuKeluar.setPreferredSize(new java.awt.Dimension(200, 20));
        MenuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuKeluarBtnKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuKeluar);

        MenuBar.add(jMenu1);

        jMenuPasien.setBorder(null);
        jMenuPasien.setForeground(new java.awt.Color(255, 255, 255));
        jMenuPasien.setMnemonic('N');
        jMenuPasien.setText("  Pasien");
        jMenuPasien.setToolTipText("Alt+N");
        jMenuPasien.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuPasien.setName("jMenuPasien"); // NOI18N
        jMenuPasien.setPreferredSize(new java.awt.Dimension(68, 30));

        MnPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPasien.setForeground(new java.awt.Color(51, 51, 51));
        MnPasien.setText("Pasien");
        MnPasien.setEnabled(false);
        MnPasien.setName("MnPasien"); // NOI18N
        MnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPasienActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnPasien);

        MnKelahiranBayi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKelahiranBayi.setForeground(new java.awt.Color(51, 51, 51));
        MnKelahiranBayi.setText("Kelahiran Bayi");
        MnKelahiranBayi.setEnabled(false);
        MnKelahiranBayi.setName("MnKelahiranBayi"); // NOI18N
        MnKelahiranBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKelahiranBayiActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnKelahiranBayi);

        MnPasienMeninggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPasienMeninggal.setForeground(new java.awt.Color(51, 51, 51));
        MnPasienMeninggal.setText("Pasien Meninggal");
        MnPasienMeninggal.setEnabled(false);
        MnPasienMeninggal.setName("MnPasienMeninggal"); // NOI18N
        MnPasienMeninggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPasienMeninggalActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnPasienMeninggal);

        MnDiagnosaPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDiagnosaPasien.setForeground(new java.awt.Color(51, 51, 51));
        MnDiagnosaPasien.setText("Diagnosa Pasien");
        MnDiagnosaPasien.setEnabled(false);
        MnDiagnosaPasien.setName("MnDiagnosaPasien"); // NOI18N
        MnDiagnosaPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDiagnosaPasienActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnDiagnosaPasien);

        MnRiwayatPerawatan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRiwayatPerawatan.setForeground(new java.awt.Color(51, 51, 51));
        MnRiwayatPerawatan.setText("Riwayat Perawatan");
        MnRiwayatPerawatan.setEnabled(false);
        MnRiwayatPerawatan.setName("MnRiwayatPerawatan"); // NOI18N
        MnRiwayatPerawatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRiwayatPerawatanActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnRiwayatPerawatan);

        MnRetBrksRm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRetBrksRm.setForeground(new java.awt.Color(51, 51, 51));
        MnRetBrksRm.setText("Retensi Berkas Rekam Medik");
        MnRetBrksRm.setEnabled(false);
        MnRetBrksRm.setName("MnRetBrksRm"); // NOI18N
        MnRetBrksRm.setPreferredSize(new java.awt.Dimension(250, 24));
        MnRetBrksRm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRetBrksRmActionPerformed(evt);
            }
        });
        jMenuPasien.add(MnRetBrksRm);

        MenuBar.add(jMenuPasien);

        jMenuLayanan.setBorder(null);
        jMenuLayanan.setForeground(new java.awt.Color(255, 255, 255));
        jMenuLayanan.setMnemonic('I');
        jMenuLayanan.setText("  Layanan");
        jMenuLayanan.setToolTipText("Alt+I");
        jMenuLayanan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuLayanan.setName("jMenuLayanan"); // NOI18N

        MenuRawatJalan.setBorder(null);
        MenuRawatJalan.setForeground(new java.awt.Color(51, 51, 51));
        MenuRawatJalan.setMnemonic('P');
        MenuRawatJalan.setText("Rawat Jalan");
        MenuRawatJalan.setToolTipText("Alt+P");
        MenuRawatJalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRawatJalan.setName("MenuRawatJalan"); // NOI18N
        MenuRawatJalan.setPreferredSize(new java.awt.Dimension(175, 20));

        MnRegistrasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRegistrasi.setForeground(new java.awt.Color(51, 51, 51));
        MnRegistrasi.setText("Registrasi");
        MnRegistrasi.setName("MnRegistrasi"); // NOI18N
        MnRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRegistrasiActionPerformed(evt);
            }
        });
        MenuRawatJalan.add(MnRegistrasi);

        MnTindakanRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTindakanRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnTindakanRalan.setText("Tindakan Rawat Jalan");
        MnTindakanRalan.setEnabled(false);
        MnTindakanRalan.setName("MnTindakanRalan"); // NOI18N
        MnTindakanRalan.setPreferredSize(null);
        MnTindakanRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTindakanRalanActionPerformed(evt);
            }
        });
        MenuRawatJalan.add(MnTindakanRalan);

        jMenuLayanan.add(MenuRawatJalan);

        MenuRawatInap.setBorder(null);
        MenuRawatInap.setForeground(new java.awt.Color(51, 51, 51));
        MenuRawatInap.setMnemonic('P');
        MenuRawatInap.setText("Rawat Inap");
        MenuRawatInap.setToolTipText("Alt+P");
        MenuRawatInap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRawatInap.setName("MenuRawatInap"); // NOI18N
        MenuRawatInap.setPreferredSize(new java.awt.Dimension(175, 20));

        MnKamarInap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKamarInap.setForeground(new java.awt.Color(51, 51, 51));
        MnKamarInap.setText("Kamar Inap");
        MnKamarInap.setEnabled(false);
        MnKamarInap.setName("MnKamarInap"); // NOI18N
        MnKamarInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKamarInapActionPerformed(evt);
            }
        });
        MenuRawatInap.add(MnKamarInap);

        MnDpjpRanap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDpjpRanap.setForeground(new java.awt.Color(51, 51, 51));
        MnDpjpRanap.setText("DPJP Ranap");
        MnDpjpRanap.setEnabled(false);
        MnDpjpRanap.setName("MnDpjpRanap"); // NOI18N
        MnDpjpRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDpjpRanapActionPerformed(evt);
            }
        });
        MenuRawatInap.add(MnDpjpRanap);

        MnTindakanRanap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTindakanRanap.setForeground(new java.awt.Color(51, 51, 51));
        MnTindakanRanap.setText("Tindakan Ranap");
        MnTindakanRanap.setEnabled(false);
        MnTindakanRanap.setName("MnTindakanRanap"); // NOI18N
        MnTindakanRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTindakanRanapActionPerformed(evt);
            }
        });
        MenuRawatInap.add(MnTindakanRanap);

        jMenuLayanan.add(MenuRawatInap);

        MenuRujukan.setBorder(null);
        MenuRujukan.setForeground(new java.awt.Color(51, 51, 51));
        MenuRujukan.setMnemonic('P');
        MenuRujukan.setText("Rujukan");
        MenuRujukan.setToolTipText("Alt+P");
        MenuRujukan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRujukan.setName("MenuRujukan"); // NOI18N
        MenuRujukan.setPreferredSize(new java.awt.Dimension(175, 20));

        MnRujukMasuk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRujukMasuk.setForeground(new java.awt.Color(51, 51, 51));
        MnRujukMasuk.setText("Rujukan Masuk");
        MnRujukMasuk.setEnabled(false);
        MnRujukMasuk.setName("MnRujukMasuk"); // NOI18N
        MnRujukMasuk.setPreferredSize(null);
        MnRujukMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRujukMasukActionPerformed(evt);
            }
        });
        MenuRujukan.add(MnRujukMasuk);

        MnRujukKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRujukKeluar.setForeground(new java.awt.Color(51, 51, 51));
        MnRujukKeluar.setText("Rujukan Keluar");
        MnRujukKeluar.setEnabled(false);
        MnRujukKeluar.setName("MnRujukKeluar"); // NOI18N
        MnRujukKeluar.setPreferredSize(null);
        MnRujukKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRujukKeluarActionPerformed(evt);
            }
        });
        MenuRujukan.add(MnRujukKeluar);

        jMenuLayanan.add(MenuRujukan);

        MnInfoKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnInfoKamar.setForeground(new java.awt.Color(51, 51, 51));
        MnInfoKamar.setText("Informasi Kamar");
        MnInfoKamar.setEnabled(false);
        MnInfoKamar.setName("MnInfoKamar"); // NOI18N
        MnInfoKamar.setPreferredSize(new java.awt.Dimension(175, 20));
        MnInfoKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnInfoKamarActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnInfoKamar);

        MnIgd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnIgd.setForeground(new java.awt.Color(51, 51, 51));
        MnIgd.setText("IGD / UGD");
        MnIgd.setEnabled(false);
        MnIgd.setName("MnIgd"); // NOI18N
        MnIgd.setPreferredSize(new java.awt.Dimension(175, 20));
        MnIgd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIgdActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnIgd);

        MnJadwalDokter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJadwalDokter.setForeground(new java.awt.Color(51, 51, 51));
        MnJadwalDokter.setText("Jadwal Praktek Dokter");
        MnJadwalDokter.setEnabled(false);
        MnJadwalDokter.setName("MnJadwalDokter"); // NOI18N
        MnJadwalDokter.setPreferredSize(null);
        MnJadwalDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJadwalDokterActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnJadwalDokter);

        MnOperasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnOperasi.setForeground(new java.awt.Color(51, 51, 51));
        MnOperasi.setText("Operasi / VK");
        MnOperasi.setEnabled(false);
        MnOperasi.setName("MnOperasi"); // NOI18N
        MnOperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnOperasiActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnOperasi);

        MenuObat.setBorder(null);
        MenuObat.setForeground(new java.awt.Color(51, 51, 51));
        MenuObat.setMnemonic('P');
        MenuObat.setText("Obat");
        MenuObat.setToolTipText("Alt+P");
        MenuObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuObat.setName("MenuObat"); // NOI18N
        MenuObat.setPreferredSize(new java.awt.Dimension(175, 20));

        MnPemberianObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPemberianObat.setForeground(new java.awt.Color(51, 51, 51));
        MnPemberianObat.setText("Pemberian Obat");
        MnPemberianObat.setEnabled(false);
        MnPemberianObat.setName("MnPemberianObat"); // NOI18N
        MnPemberianObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPemberianObatActionPerformed(evt);
            }
        });
        MenuObat.add(MnPemberianObat);

        MnResepObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnResepObat.setForeground(new java.awt.Color(51, 51, 51));
        MnResepObat.setText("Resep Obat");
        MnResepObat.setEnabled(false);
        MnResepObat.setName("MnResepObat"); // NOI18N
        MnResepObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnResepObatActionPerformed(evt);
            }
        });
        MenuObat.add(MnResepObat);

        MnResepPulang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnResepPulang.setForeground(new java.awt.Color(51, 51, 51));
        MnResepPulang.setText("Resep Pulang");
        MnResepPulang.setEnabled(false);
        MnResepPulang.setName("MnResepPulang"); // NOI18N
        MnResepPulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnResepPulangActionPerformed(evt);
            }
        });
        MenuObat.add(MnResepPulang);

        jMenuLayanan.add(MenuObat);

        MnDietPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDietPasien.setForeground(new java.awt.Color(51, 51, 51));
        MnDietPasien.setText("Diet Pasien");
        MnDietPasien.setEnabled(false);
        MnDietPasien.setName("MnDietPasien"); // NOI18N
        MnDietPasien.setPreferredSize(new java.awt.Dimension(250, 24));
        MnDietPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDietPasienActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnDietPasien);

        MnPeriksaLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPeriksaLab.setForeground(new java.awt.Color(51, 51, 51));
        MnPeriksaLab.setText("Periksa Laboratorium");
        MnPeriksaLab.setEnabled(false);
        MnPeriksaLab.setName("MnPeriksaLab"); // NOI18N
        MnPeriksaLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPeriksaLabActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnPeriksaLab);

        MnPeriksaRad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPeriksaRad.setForeground(new java.awt.Color(51, 51, 51));
        MnPeriksaRad.setText("Periksa Radiologi");
        MnPeriksaRad.setEnabled(false);
        MnPeriksaRad.setName("MnPeriksaRad"); // NOI18N
        MnPeriksaRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPeriksaRadActionPerformed(evt);
            }
        });
        jMenuLayanan.add(MnPeriksaRad);

        MenuKasir.setBorder(null);
        MenuKasir.setForeground(new java.awt.Color(51, 51, 51));
        MenuKasir.setMnemonic('P');
        MenuKasir.setText("Kasir");
        MenuKasir.setToolTipText("Alt+P");
        MenuKasir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuKasir.setName("MenuKasir"); // NOI18N
        MenuKasir.setPreferredSize(new java.awt.Dimension(175, 20));

        MnKasirRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKasirRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnKasirRalan.setText("Kasir Rawat Jalan");
        MnKasirRalan.setEnabled(false);
        MnKasirRalan.setName("MnKasirRalan"); // NOI18N
        MnKasirRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKasirRalanActionPerformed(evt);
            }
        });
        MenuKasir.add(MnKasirRalan);

        MnDepositPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDepositPasien.setForeground(new java.awt.Color(51, 51, 51));
        MnDepositPasien.setText("Deposit Pasien");
        MnDepositPasien.setEnabled(false);
        MnDepositPasien.setName("MnDepositPasien"); // NOI18N
        MnDepositPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDepositPasienActionPerformed(evt);
            }
        });
        MenuKasir.add(MnDepositPasien);

        MnPiutangPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPiutangPasien.setForeground(new java.awt.Color(51, 51, 51));
        MnPiutangPasien.setText("Piutang Pasien");
        MnPiutangPasien.setEnabled(false);
        MnPiutangPasien.setName("MnPiutangPasien"); // NOI18N
        MnPiutangPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPiutangPasienActionPerformed(evt);
            }
        });
        MenuKasir.add(MnPiutangPasien);

        jMenuLayanan.add(MenuKasir);

        MenuBar.add(jMenuLayanan);

        jMenuManajemen.setBorder(null);
        jMenuManajemen.setForeground(new java.awt.Color(255, 255, 255));
        jMenuManajemen.setMnemonic('N');
        jMenuManajemen.setText("  Manajemen");
        jMenuManajemen.setToolTipText("Alt+N");
        jMenuManajemen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuManajemen.setName("jMenuManajemen"); // NOI18N
        jMenuManajemen.setPreferredSize(new java.awt.Dimension(88, 30));

        MnDataDokter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDataDokter.setForeground(new java.awt.Color(51, 51, 51));
        MnDataDokter.setText("Data Dokter");
        MnDataDokter.setEnabled(false);
        MnDataDokter.setName("MnDataDokter"); // NOI18N
        MnDataDokter.setPreferredSize(new java.awt.Dimension(250, 24));
        MnDataDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDataDokterActionPerformed(evt);
            }
        });
        jMenuManajemen.add(MnDataDokter);

        MnDataPetugas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDataPetugas.setForeground(new java.awt.Color(51, 51, 51));
        MnDataPetugas.setText("Data Petugas");
        MnDataPetugas.setEnabled(false);
        MnDataPetugas.setName("MnDataPetugas"); // NOI18N
        MnDataPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDataPetugasActionPerformed(evt);
            }
        });
        jMenuManajemen.add(MnDataPetugas);

        MnDataPegawai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDataPegawai.setForeground(new java.awt.Color(51, 51, 51));
        MnDataPegawai.setText("Data Pegawai");
        MnDataPegawai.setEnabled(false);
        MnDataPegawai.setName("MnDataPegawai"); // NOI18N
        MnDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDataPegawaiActionPerformed(evt);
            }
        });
        jMenuManajemen.add(MnDataPegawai);

        MenuPresensi.setBorder(null);
        MenuPresensi.setForeground(new java.awt.Color(51, 51, 51));
        MenuPresensi.setMnemonic('P');
        MenuPresensi.setText("Presensi");
        MenuPresensi.setToolTipText("Alt+P");
        MenuPresensi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuPresensi.setName("MenuPresensi"); // NOI18N
        MenuPresensi.setPreferredSize(new java.awt.Dimension(175, 20));

        MnBarcodePresensi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBarcodePresensi.setForeground(new java.awt.Color(51, 51, 51));
        MnBarcodePresensi.setText("Barcode Presensi");
        MnBarcodePresensi.setEnabled(false);
        MnBarcodePresensi.setName("MnBarcodePresensi"); // NOI18N
        MnBarcodePresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBarcodePresensiActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnBarcodePresensi);

        MnJamPresensi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJamPresensi.setForeground(new java.awt.Color(51, 51, 51));
        MnJamPresensi.setText("Jam Presensi");
        MnJamPresensi.setEnabled(false);
        MnJamPresensi.setName("MnJamPresensi"); // NOI18N
        MnJamPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJamPresensiActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnJamPresensi);

        MnPresensiHarian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPresensiHarian.setForeground(new java.awt.Color(51, 51, 51));
        MnPresensiHarian.setText("Presensi Harian");
        MnPresensiHarian.setEnabled(false);
        MnPresensiHarian.setName("MnPresensiHarian"); // NOI18N
        MnPresensiHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPresensiHarianActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnPresensiHarian);

        MnPresensiBulanan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPresensiBulanan.setForeground(new java.awt.Color(51, 51, 51));
        MnPresensiBulanan.setText("Presensi Bulanan");
        MnPresensiBulanan.setEnabled(false);
        MnPresensiBulanan.setName("MnPresensiBulanan"); // NOI18N
        MnPresensiBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPresensiBulananActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnPresensiBulanan);

        MnTempPresensi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTempPresensi.setForeground(new java.awt.Color(51, 51, 51));
        MnTempPresensi.setText("Temporary Presensi");
        MnTempPresensi.setEnabled(false);
        MnTempPresensi.setName("MnTempPresensi"); // NOI18N
        MnTempPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTempPresensiActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnTempPresensi);

        MnRekapKehadiran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRekapKehadiran.setForeground(new java.awt.Color(51, 51, 51));
        MnRekapKehadiran.setText("Rekap Kehadiran");
        MnRekapKehadiran.setEnabled(false);
        MnRekapKehadiran.setName("MnRekapKehadiran"); // NOI18N
        MnRekapKehadiran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekapKehadiranActionPerformed(evt);
            }
        });
        MenuPresensi.add(MnRekapKehadiran);

        jMenuManajemen.add(MenuPresensi);

        MnSidikJari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSidikJari.setForeground(new java.awt.Color(51, 51, 51));
        MnSidikJari.setText("Sidik Jari");
        MnSidikJari.setEnabled(false);
        MnSidikJari.setName("MnSidikJari"); // NOI18N
        MnSidikJari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSidikJariActionPerformed(evt);
            }
        });
        jMenuManajemen.add(MnSidikJari);

        MenuJadwal.setBorder(null);
        MenuJadwal.setForeground(new java.awt.Color(51, 51, 51));
        MenuJadwal.setMnemonic('P');
        MenuJadwal.setText("Jadwal");
        MenuJadwal.setToolTipText("Alt+P");
        MenuJadwal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuJadwal.setName("MenuJadwal"); // NOI18N
        MenuJadwal.setPreferredSize(new java.awt.Dimension(175, 20));

        MnJadwalPegawai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJadwalPegawai.setForeground(new java.awt.Color(51, 51, 51));
        MnJadwalPegawai.setText("Jadwal Pegawai");
        MnJadwalPegawai.setEnabled(false);
        MnJadwalPegawai.setName("MnJadwalPegawai"); // NOI18N
        MnJadwalPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJadwalPegawaiActionPerformed(evt);
            }
        });
        MenuJadwal.add(MnJadwalPegawai);

        MnJdwlTambahan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJdwlTambahan.setForeground(new java.awt.Color(51, 51, 51));
        MnJdwlTambahan.setText("Jadwal Tambahan");
        MnJdwlTambahan.setEnabled(false);
        MnJdwlTambahan.setName("MnJdwlTambahan"); // NOI18N
        MnJdwlTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJdwlTambahanActionPerformed(evt);
            }
        });
        MenuJadwal.add(MnJdwlTambahan);

        jMenuManajemen.add(MenuJadwal);

        MnPresensiHarian1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPresensiHarian1.setForeground(new java.awt.Color(51, 51, 51));
        MnPresensiHarian1.setText("Kepegawaian & Gaji");
        MnPresensiHarian1.setEnabled(false);
        MnPresensiHarian1.setName("MnPresensiHarian1"); // NOI18N
        MnPresensiHarian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPresensiHarian1ActionPerformed(evt);
            }
        });
        jMenuManajemen.add(MnPresensiHarian1);

        MenuBar.add(jMenuManajemen);

        jMenuFarmasi.setBorder(null);
        jMenuFarmasi.setForeground(new java.awt.Color(255, 255, 255));
        jMenuFarmasi.setMnemonic('N');
        jMenuFarmasi.setText("  Farmasi");
        jMenuFarmasi.setToolTipText("Alt+N");
        jMenuFarmasi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuFarmasi.setName("jMenuFarmasi"); // NOI18N
        jMenuFarmasi.setPreferredSize(new java.awt.Dimension(78, 30));

        MenuSuplier.setBorder(null);
        MenuSuplier.setForeground(new java.awt.Color(51, 51, 51));
        MenuSuplier.setMnemonic('P');
        MenuSuplier.setText("Suplier");
        MenuSuplier.setToolTipText("Alt+P");
        MenuSuplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuSuplier.setName("MenuSuplier"); // NOI18N
        MenuSuplier.setPreferredSize(new java.awt.Dimension(175, 20));

        MnIndustriFar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnIndustriFar.setForeground(new java.awt.Color(51, 51, 51));
        MnIndustriFar.setText("Industri Farmasi");
        MnIndustriFar.setEnabled(false);
        MnIndustriFar.setName("MnIndustriFar"); // NOI18N
        MnIndustriFar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIndustriFarActionPerformed(evt);
            }
        });
        MenuSuplier.add(MnIndustriFar);

        MnSuplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSuplier.setForeground(new java.awt.Color(51, 51, 51));
        MnSuplier.setText("Suplier Obat/Alkes/BHP");
        MnSuplier.setEnabled(false);
        MnSuplier.setName("MnSuplier"); // NOI18N
        MnSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSuplierActionPerformed(evt);
            }
        });
        MenuSuplier.add(MnSuplier);

        jMenuFarmasi.add(MenuSuplier);

        MnSatuanBrg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSatuanBrg.setForeground(new java.awt.Color(51, 51, 51));
        MnSatuanBrg.setText("Satuan Barang");
        MnSatuanBrg.setEnabled(false);
        MnSatuanBrg.setName("MnSatuanBrg"); // NOI18N
        MnSatuanBrg.setPreferredSize(new java.awt.Dimension(250, 24));
        MnSatuanBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSatuanBrgActionPerformed(evt);
            }
        });
        jMenuFarmasi.add(MnSatuanBrg);

        MnKonvSat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKonvSat.setForeground(new java.awt.Color(51, 51, 51));
        MnKonvSat.setText("Konversi Satuan");
        MnKonvSat.setEnabled(false);
        MnKonvSat.setName("MnKonvSat"); // NOI18N
        MnKonvSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKonvSatActionPerformed(evt);
            }
        });
        jMenuFarmasi.add(MnKonvSat);

        MenuInvObat.setBorder(null);
        MenuInvObat.setForeground(new java.awt.Color(51, 51, 51));
        MenuInvObat.setMnemonic('P');
        MenuInvObat.setText("Inventory Obat");
        MenuInvObat.setToolTipText("Alt+P");
        MenuInvObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuInvObat.setName("MenuInvObat"); // NOI18N
        MenuInvObat.setPreferredSize(new java.awt.Dimension(175, 20));

        MnJnsObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJnsObt.setForeground(new java.awt.Color(51, 51, 51));
        MnJnsObt.setText("Jenis Obat/Alkes/BHP");
        MnJnsObt.setEnabled(false);
        MnJnsObt.setName("MnJnsObt"); // NOI18N
        MnJnsObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJnsObtActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnJnsObt);

        MnDataObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDataObat.setForeground(new java.awt.Color(51, 51, 51));
        MnDataObat.setText("Data Obat/Alkes/BHP");
        MnDataObat.setEnabled(false);
        MnDataObat.setName("MnDataObat"); // NOI18N
        MnDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDataObatActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnDataObat);

        MnStokOpname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnStokOpname.setForeground(new java.awt.Color(51, 51, 51));
        MnStokOpname.setText("Stok Opname Obat & BHP");
        MnStokOpname.setEnabled(false);
        MnStokOpname.setName("MnStokOpname"); // NOI18N
        MnStokOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnStokOpnameActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnStokOpname);

        MnMutasiObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnMutasiObat.setForeground(new java.awt.Color(51, 51, 51));
        MnMutasiObat.setText("Mutasi Obat & BHP");
        MnMutasiObat.setEnabled(false);
        MnMutasiObat.setName("MnMutasiObat"); // NOI18N
        MnMutasiObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnMutasiObatActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnMutasiObat);

        MnStokObtPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnStokObtPx.setForeground(new java.awt.Color(51, 51, 51));
        MnStokObtPx.setText("Stok Obat Pasien");
        MnStokObtPx.setEnabled(false);
        MnStokObtPx.setName("MnStokObtPx"); // NOI18N
        MnStokObtPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnStokObtPxActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnStokObtPx);

        MnPengadaan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPengadaan.setForeground(new java.awt.Color(51, 51, 51));
        MnPengadaan.setText("Pengadaan Obat & BHP");
        MnPengadaan.setEnabled(false);
        MnPengadaan.setName("MnPengadaan"); // NOI18N
        MnPengadaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPengadaanActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnPengadaan);

        MnPemesanan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPemesanan.setForeground(new java.awt.Color(51, 51, 51));
        MnPemesanan.setText("Pemesanan Obat & BHP");
        MnPemesanan.setEnabled(false);
        MnPemesanan.setName("MnPemesanan"); // NOI18N
        MnPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPemesananActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnPemesanan);

        MnPenjualanObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPenjualanObt.setForeground(new java.awt.Color(51, 51, 51));
        MnPenjualanObt.setText("Penjualan Obat & BHP");
        MnPenjualanObt.setEnabled(false);
        MnPenjualanObt.setName("MnPenjualanObt"); // NOI18N
        MnPenjualanObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPenjualanObtActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnPenjualanObt);

        MnStokOpname1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnStokOpname1.setForeground(new java.awt.Color(51, 51, 51));
        MnStokOpname1.setText("Piutang Obat & BHP");
        MnStokOpname1.setEnabled(false);
        MnStokOpname1.setName("MnStokOpname1"); // NOI18N
        MnStokOpname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnStokOpname1ActionPerformed(evt);
            }
        });
        MenuInvObat.add(MnStokOpname1);

        jMenuFarmasi.add(MenuInvObat);

        MenuRetur.setBorder(null);
        MenuRetur.setForeground(new java.awt.Color(51, 51, 51));
        MenuRetur.setMnemonic('P');
        MenuRetur.setText("Retur");
        MenuRetur.setToolTipText("Alt+P");
        MenuRetur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRetur.setName("MenuRetur"); // NOI18N
        MenuRetur.setPreferredSize(new java.awt.Dimension(175, 20));

        MnReturKeSup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnReturKeSup.setForeground(new java.awt.Color(51, 51, 51));
        MnReturKeSup.setText("Retur Ke Suplier");
        MnReturKeSup.setEnabled(false);
        MnReturKeSup.setName("MnReturKeSup"); // NOI18N
        MnReturKeSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnReturKeSupActionPerformed(evt);
            }
        });
        MenuRetur.add(MnReturKeSup);

        MnReturPemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnReturPemb.setForeground(new java.awt.Color(51, 51, 51));
        MnReturPemb.setText("Retur Dari Pembeli");
        MnReturPemb.setEnabled(false);
        MnReturPemb.setName("MnReturPemb"); // NOI18N
        MnReturPemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnReturPembActionPerformed(evt);
            }
        });
        MenuRetur.add(MnReturPemb);

        MnReturObtRanap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnReturObtRanap.setForeground(new java.awt.Color(51, 51, 51));
        MnReturObtRanap.setText("Retur Obat Ranap");
        MnReturObtRanap.setEnabled(false);
        MnReturObtRanap.setName("MnReturObtRanap"); // NOI18N
        MnReturObtRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnReturObtRanapActionPerformed(evt);
            }
        });
        MenuRetur.add(MnReturObtRanap);

        MnReturPiutangPemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnReturPiutangPemb.setForeground(new java.awt.Color(51, 51, 51));
        MnReturPiutangPemb.setText("Retur Piutang Pembeli");
        MnReturPiutangPemb.setEnabled(false);
        MnReturPiutangPemb.setName("MnReturPiutangPemb"); // NOI18N
        MnReturPiutangPemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnReturPiutangPembActionPerformed(evt);
            }
        });
        MenuRetur.add(MnReturPiutangPemb);

        jMenuFarmasi.add(MenuRetur);

        MenuKeuntungan.setBorder(null);
        MenuKeuntungan.setForeground(new java.awt.Color(51, 51, 51));
        MenuKeuntungan.setMnemonic('P');
        MenuKeuntungan.setText("Keuntungan");
        MenuKeuntungan.setToolTipText("Alt+P");
        MenuKeuntungan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuKeuntungan.setName("MenuKeuntungan"); // NOI18N
        MenuKeuntungan.setPreferredSize(new java.awt.Dimension(175, 20));

        MnKeuntunganPenj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKeuntunganPenj.setForeground(new java.awt.Color(51, 51, 51));
        MnKeuntunganPenj.setText("Keuntungan Penjualan");
        MnKeuntunganPenj.setEnabled(false);
        MnKeuntunganPenj.setName("MnKeuntunganPenj"); // NOI18N
        MnKeuntunganPenj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKeuntunganPenjActionPerformed(evt);
            }
        });
        MenuKeuntungan.add(MnKeuntunganPenj);

        MnKeuntBeriObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKeuntBeriObt.setForeground(new java.awt.Color(51, 51, 51));
        MnKeuntBeriObt.setText("Keuntungan Beri Obat");
        MnKeuntBeriObt.setEnabled(false);
        MnKeuntBeriObt.setName("MnKeuntBeriObt"); // NOI18N
        MnKeuntBeriObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKeuntBeriObtActionPerformed(evt);
            }
        });
        MenuKeuntungan.add(MnKeuntBeriObt);

        jMenuFarmasi.add(MenuKeuntungan);

        MnSirkulasiObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSirkulasiObt.setForeground(new java.awt.Color(51, 51, 51));
        MnSirkulasiObt.setText("Sirkulasi Obat, Alkes & BHP");
        MnSirkulasiObt.setEnabled(false);
        MnSirkulasiObt.setName("MnSirkulasiObt"); // NOI18N
        MnSirkulasiObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSirkulasiObtActionPerformed(evt);
            }
        });
        jMenuFarmasi.add(MnSirkulasiObt);

        MnRiwayat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRiwayat.setForeground(new java.awt.Color(51, 51, 51));
        MnRiwayat.setText("Riwayat Obat, Alkes & BHP");
        MnRiwayat.setEnabled(false);
        MnRiwayat.setName("MnRiwayat"); // NOI18N
        MnRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRiwayatActionPerformed(evt);
            }
        });
        jMenuFarmasi.add(MnRiwayat);

        MnDaruratStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDaruratStok.setForeground(new java.awt.Color(51, 51, 51));
        MnDaruratStok.setText("Darurat Stok");
        MnDaruratStok.setEnabled(false);
        MnDaruratStok.setName("MnDaruratStok"); // NOI18N
        MnDaruratStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDaruratStokActionPerformed(evt);
            }
        });
        jMenuFarmasi.add(MnDaruratStok);

        MenuBar.add(jMenuFarmasi);

        jMenuInventory.setBorder(null);
        jMenuInventory.setForeground(new java.awt.Color(255, 255, 255));
        jMenuInventory.setMnemonic('N');
        jMenuInventory.setText("  Inventory");
        jMenuInventory.setToolTipText("Alt+N");
        jMenuInventory.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuInventory.setName("jMenuInventory"); // NOI18N
        jMenuInventory.setPreferredSize(new java.awt.Dimension(74, 30));

        MnSatuanBrgNon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSatuanBrgNon.setForeground(new java.awt.Color(51, 51, 51));
        MnSatuanBrgNon.setText("Satuan Barang");
        MnSatuanBrgNon.setEnabled(false);
        MnSatuanBrgNon.setName("MnSatuanBrgNon"); // NOI18N
        MnSatuanBrgNon.setPreferredSize(new java.awt.Dimension(250, 24));
        MnSatuanBrgNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSatuanBrgNonActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnSatuanBrgNon);

        MnJnsBrgNon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJnsBrgNon.setForeground(new java.awt.Color(51, 51, 51));
        MnJnsBrgNon.setText("Jenis Barang");
        MnJnsBrgNon.setEnabled(false);
        MnJnsBrgNon.setName("MnJnsBrgNon"); // NOI18N
        MnJnsBrgNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJnsBrgNonActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnJnsBrgNon);

        MnDataBrgNon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDataBrgNon.setForeground(new java.awt.Color(51, 51, 51));
        MnDataBrgNon.setText("Data Barang");
        MnDataBrgNon.setEnabled(false);
        MnDataBrgNon.setName("MnDataBrgNon"); // NOI18N
        MnDataBrgNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDataBrgNonActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnDataBrgNon);

        MnSupNon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSupNon.setForeground(new java.awt.Color(51, 51, 51));
        MnSupNon.setText("Suplier Non Medis");
        MnSupNon.setEnabled(false);
        MnSupNon.setName("MnSupNon"); // NOI18N
        MnSupNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSupNonActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnSupNon);

        MnPengadaanbrg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPengadaanbrg.setForeground(new java.awt.Color(51, 51, 51));
        MnPengadaanbrg.setText("Pengadaan Barang");
        MnPengadaanbrg.setEnabled(false);
        MnPengadaanbrg.setName("MnPengadaanbrg"); // NOI18N
        MnPengadaanbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPengadaanbrgActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnPengadaanbrg);

        MnStokKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnStokKeluar.setForeground(new java.awt.Color(51, 51, 51));
        MnStokKeluar.setText("Stok Keluar");
        MnStokKeluar.setEnabled(false);
        MnStokKeluar.setName("MnStokKeluar"); // NOI18N
        MnStokKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnStokKeluarActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnStokKeluar);

        MnBiayaPengadaan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBiayaPengadaan.setForeground(new java.awt.Color(51, 51, 51));
        MnBiayaPengadaan.setText("Biaya Pengadaan");
        MnBiayaPengadaan.setEnabled(false);
        MnBiayaPengadaan.setName("MnBiayaPengadaan"); // NOI18N
        MnBiayaPengadaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBiayaPengadaanActionPerformed(evt);
            }
        });
        jMenuInventory.add(MnBiayaPengadaan);

        MenuRekap.setBorder(null);
        MenuRekap.setForeground(new java.awt.Color(51, 51, 51));
        MenuRekap.setMnemonic('P');
        MenuRekap.setText("Rekap");
        MenuRekap.setToolTipText("Alt+P");
        MenuRekap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRekap.setName("MenuRekap"); // NOI18N
        MenuRekap.setPreferredSize(new java.awt.Dimension(175, 20));

        MnRekapPengadaan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRekapPengadaan.setForeground(new java.awt.Color(51, 51, 51));
        MnRekapPengadaan.setText("Rekap Pengadaan");
        MnRekapPengadaan.setEnabled(false);
        MnRekapPengadaan.setName("MnRekapPengadaan"); // NOI18N
        MnRekapPengadaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekapPengadaanActionPerformed(evt);
            }
        });
        MenuRekap.add(MnRekapPengadaan);

        MnRekapStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRekapStok.setForeground(new java.awt.Color(51, 51, 51));
        MnRekapStok.setText("Rekap Stok Keluar");
        MnRekapStok.setEnabled(false);
        MnRekapStok.setName("MnRekapStok"); // NOI18N
        MnRekapStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekapStokActionPerformed(evt);
            }
        });
        MenuRekap.add(MnRekapStok);

        jMenuInventory.add(MenuRekap);

        MenuBar.add(jMenuInventory);

        jMenuBridging.setBorder(null);
        jMenuBridging.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBridging.setMnemonic('N');
        jMenuBridging.setText("  Bridging");
        jMenuBridging.setToolTipText("Alt+N");
        jMenuBridging.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBridging.setName("jMenuBridging"); // NOI18N
        jMenuBridging.setPreferredSize(new java.awt.Dimension(68, 30));

        MnCekNoBpjs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnCekNoBpjs.setForeground(new java.awt.Color(51, 51, 51));
        MnCekNoBpjs.setText("Cek No. Kartu BPJS");
        MnCekNoBpjs.setEnabled(false);
        MnCekNoBpjs.setName("MnCekNoBpjs"); // NOI18N
        MnCekNoBpjs.setPreferredSize(new java.awt.Dimension(250, 24));
        MnCekNoBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCekNoBpjsActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnCekNoBpjs);

        MnCekNikBpjs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnCekNikBpjs.setForeground(new java.awt.Color(51, 51, 51));
        MnCekNikBpjs.setText("Cek NIK BPJS");
        MnCekNikBpjs.setEnabled(false);
        MnCekNikBpjs.setName("MnCekNikBpjs"); // NOI18N
        MnCekNikBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCekNikBpjsActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnCekNikBpjs);

        MnRiwPesBpjs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRiwPesBpjs.setForeground(new java.awt.Color(51, 51, 51));
        MnRiwPesBpjs.setText("Riwayat Peserta BPJS");
        MnRiwPesBpjs.setEnabled(false);
        MnRiwPesBpjs.setName("MnRiwPesBpjs"); // NOI18N
        MnRiwPesBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRiwPesBpjsActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRiwPesBpjs);

        MnCekNoRujPCare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnCekNoRujPCare.setForeground(new java.awt.Color(51, 51, 51));
        MnCekNoRujPCare.setText("Cek No. Rujukan PCare");
        MnCekNoRujPCare.setEnabled(false);
        MnCekNoRujPCare.setName("MnCekNoRujPCare"); // NOI18N
        MnCekNoRujPCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCekNoRujPCareActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnCekNoRujPCare);

        MnRefDiagBpjs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRefDiagBpjs.setForeground(new java.awt.Color(51, 51, 51));
        MnRefDiagBpjs.setText("Referensi Diagnosa BPJS");
        MnRefDiagBpjs.setEnabled(false);
        MnRefDiagBpjs.setName("MnRefDiagBpjs"); // NOI18N
        MnRefDiagBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRefDiagBpjsActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRefDiagBpjs);

        MnRefPlBpjs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRefPlBpjs.setForeground(new java.awt.Color(51, 51, 51));
        MnRefPlBpjs.setText("Referensi Poli Bpjs");
        MnRefPlBpjs.setEnabled(false);
        MnRefPlBpjs.setName("MnRefPlBpjs"); // NOI18N
        MnRefPlBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRefPlBpjsActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRefPlBpjs);

        MnRefFaskes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRefFaskes.setForeground(new java.awt.Color(51, 51, 51));
        MnRefFaskes.setText("Referensi Faskes BPJS");
        MnRefFaskes.setEnabled(false);
        MnRefFaskes.setName("MnRefFaskes"); // NOI18N
        MnRefFaskes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRefFaskesActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRefFaskes);

        MnBridging.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBridging.setForeground(new java.awt.Color(51, 51, 51));
        MnBridging.setText("Data Bridging BPJS");
        MnBridging.setEnabled(false);
        MnBridging.setName("MnBridging"); // NOI18N
        MnBridging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBridgingActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnBridging);

        MnMonitoringKlaim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnMonitoringKlaim.setForeground(new java.awt.Color(51, 51, 51));
        MnMonitoringKlaim.setText("Monitoring Verifikasi Klaim BPJS");
        MnMonitoringKlaim.setEnabled(false);
        MnMonitoringKlaim.setName("MnMonitoringKlaim"); // NOI18N
        MnMonitoringKlaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnMonitoringKlaimActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnMonitoringKlaim);

        MnRefKmrAplicare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRefKmrAplicare.setForeground(new java.awt.Color(51, 51, 51));
        MnRefKmrAplicare.setText("Referensi Kamar Aplicare");
        MnRefKmrAplicare.setEnabled(false);
        MnRefKmrAplicare.setName("MnRefKmrAplicare"); // NOI18N
        MnRefKmrAplicare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRefKmrAplicareActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRefKmrAplicare);

        MnKmrAplicare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKmrAplicare.setForeground(new java.awt.Color(51, 51, 51));
        MnKmrAplicare.setText("Ketersediaan Kamar Aplicare");
        MnKmrAplicare.setEnabled(false);
        MnKmrAplicare.setName("MnKmrAplicare"); // NOI18N
        MnKmrAplicare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKmrAplicareActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnKmrAplicare);

        MnRefMblJkn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRefMblJkn.setForeground(new java.awt.Color(51, 51, 51));
        MnRefMblJkn.setText("Referensi Pendaftaran Mobile JKN");
        MnRefMblJkn.setEnabled(false);
        MnRefMblJkn.setName("MnRefMblJkn"); // NOI18N
        MnRefMblJkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRefMblJknActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnRefMblJkn);

        MnBtlMblJkn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBtlMblJkn.setForeground(new java.awt.Color(51, 51, 51));
        MnBtlMblJkn.setText("Batal Pendaftaran Mobile JKN");
        MnBtlMblJkn.setEnabled(false);
        MnBtlMblJkn.setName("MnBtlMblJkn"); // NOI18N
        MnBtlMblJkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBtlMblJknActionPerformed(evt);
            }
        });
        jMenuBridging.add(MnBtlMblJkn);

        MenuBar.add(jMenuBridging);

        jMenuLaporan.setBorder(null);
        jMenuLaporan.setForeground(new java.awt.Color(255, 255, 255));
        jMenuLaporan.setMnemonic('N');
        jMenuLaporan.setText("  Laporan");
        jMenuLaporan.setToolTipText("Alt+N");
        jMenuLaporan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuLaporan.setName("jMenuLaporan"); // NOI18N
        jMenuLaporan.setPreferredSize(new java.awt.Dimension(67, 30));

        MenuLapObat.setBorder(null);
        MenuLapObat.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapObat.setMnemonic('P');
        MenuLapObat.setText("Obat");
        MenuLapObat.setToolTipText("Alt+P");
        MenuLapObat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapObat.setName("MenuLapObat"); // NOI18N
        MenuLapObat.setPreferredSize(new java.awt.Dimension(175, 20));

        MnLapObtPoli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapObtPoli.setForeground(new java.awt.Color(51, 51, 51));
        MnLapObtPoli.setText("Obat Per Poli");
        MnLapObtPoli.setEnabled(false);
        MnLapObtPoli.setName("MnLapObtPoli"); // NOI18N
        MnLapObtPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapObtPoliActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnLapObtPoli);

        MnObtKmr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnObtKmr.setForeground(new java.awt.Color(51, 51, 51));
        MnObtKmr.setText("Obat Per Kamar");
        MnObtKmr.setEnabled(false);
        MnObtKmr.setName("MnObtKmr"); // NOI18N
        MnObtKmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObtKmrActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnObtKmr);

        MnObtDokRln.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnObtDokRln.setForeground(new java.awt.Color(51, 51, 51));
        MnObtDokRln.setText("Obar Per Dokter Ralan");
        MnObtDokRln.setEnabled(false);
        MnObtDokRln.setName("MnObtDokRln"); // NOI18N
        MnObtDokRln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObtDokRlnActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnObtDokRln);

        MnObtDokRnp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnObtDokRnp.setForeground(new java.awt.Color(51, 51, 51));
        MnObtDokRnp.setText("Obat Per Dokter Ranap");
        MnObtDokRnp.setEnabled(false);
        MnObtDokRnp.setName("MnObtDokRnp"); // NOI18N
        MnObtDokRnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObtDokRnpActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnObtDokRnp);

        MnObtDokRsp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnObtDokRsp.setForeground(new java.awt.Color(51, 51, 51));
        MnObtDokRsp.setText("Obat Per Dokter Peresep");
        MnObtDokRsp.setEnabled(false);
        MnObtDokRsp.setName("MnObtDokRsp"); // NOI18N
        MnObtDokRsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObtDokRspActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnObtDokRsp);

        MnObtCrByr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnObtCrByr.setForeground(new java.awt.Color(51, 51, 51));
        MnObtCrByr.setText("Obar Per Cara Bayar");
        MnObtCrByr.setEnabled(false);
        MnObtCrByr.setName("MnObtCrByr"); // NOI18N
        MnObtCrByr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObtCrByrActionPerformed(evt);
            }
        });
        MenuLapObat.add(MnObtCrByr);

        jMenuLaporan.add(MenuLapObat);

        MnDetJMDok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDetJMDok.setForeground(new java.awt.Color(51, 51, 51));
        MnDetJMDok.setText("Detail JM Dokter");
        MnDetJMDok.setEnabled(false);
        MnDetJMDok.setName("MnDetJMDok"); // NOI18N
        MnDetJMDok.setPreferredSize(new java.awt.Dimension(250, 24));
        MnDetJMDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDetJMDokActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnDetJMDok);

        MenuLapHarian.setBorder(null);
        MenuLapHarian.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapHarian.setMnemonic('P');
        MenuLapHarian.setText("Harian");
        MenuLapHarian.setToolTipText("Alt+P");
        MenuLapHarian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapHarian.setName("MenuLapHarian"); // NOI18N
        MenuLapHarian.setPreferredSize(new java.awt.Dimension(175, 20));

        MnHrDokAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrDokAll.setForeground(new java.awt.Color(51, 51, 51));
        MnHrDokAll.setText("Harian Dokter");
        MnHrDokAll.setEnabled(false);
        MnHrDokAll.setName("MnHrDokAll"); // NOI18N
        MnHrDokAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrDokAllActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrDokAll);

        MnHrDokRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrDokRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnHrDokRalan.setText("Harian Dokter Ralan");
        MnHrDokRalan.setEnabled(false);
        MnHrDokRalan.setName("MnHrDokRalan"); // NOI18N
        MnHrDokRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrDokRalanActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrDokRalan);

        MnHrDok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrDok.setForeground(new java.awt.Color(51, 51, 51));
        MnHrDok.setText("Harian Dokter/Poli");
        MnHrDok.setEnabled(false);
        MnHrDok.setName("MnHrDok"); // NOI18N
        MnHrDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrDokActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrDok);

        MnHrKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrKamar.setForeground(new java.awt.Color(51, 51, 51));
        MnHrKamar.setText("Harian Kamar");
        MnHrKamar.setEnabled(false);
        MnHrKamar.setName("MnHrKamar"); // NOI18N
        MnHrKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrKamarActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrKamar);

        MnHrBhp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrBhp.setForeground(new java.awt.Color(51, 51, 51));
        MnHrBhp.setText("Harian BHP Medis/Paket Obat");
        MnHrBhp.setEnabled(false);
        MnHrBhp.setName("MnHrBhp"); // NOI18N
        MnHrBhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrBhpActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrBhp);

        MnHrParamedis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrParamedis.setForeground(new java.awt.Color(51, 51, 51));
        MnHrParamedis.setText("Harian Paramedis");
        MnHrParamedis.setEnabled(false);
        MnHrParamedis.setName("MnHrParamedis"); // NOI18N
        MnHrParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrParamedisActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrParamedis);

        MnHrMnj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrMnj.setForeground(new java.awt.Color(51, 51, 51));
        MnHrMnj.setText("Harian Manajemen");
        MnHrMnj.setEnabled(false);
        MnHrMnj.setName("MnHrMnj"); // NOI18N
        MnHrMnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrMnjActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrMnj);

        MnHrKso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrKso.setForeground(new java.awt.Color(51, 51, 51));
        MnHrKso.setText("Harian KSO");
        MnHrKso.setEnabled(false);
        MnHrKso.setName("MnHrKso"); // NOI18N
        MnHrKso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrKsoActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrKso);

        MnHrSrn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHrSrn.setForeground(new java.awt.Color(51, 51, 51));
        MnHrSrn.setText("Harian Jasa Sarana");
        MnHrSrn.setEnabled(false);
        MnHrSrn.setName("MnHrSrn"); // NOI18N
        MnHrSrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHrSrnActionPerformed(evt);
            }
        });
        MenuLapHarian.add(MnHrSrn);

        jMenuLaporan.add(MenuLapHarian);

        MenuLapBulanan.setBorder(null);
        MenuLapBulanan.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapBulanan.setMnemonic('P');
        MenuLapBulanan.setText("Bulanan");
        MenuLapBulanan.setToolTipText("Alt+P");
        MenuLapBulanan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapBulanan.setName("MenuLapBulanan"); // NOI18N
        MenuLapBulanan.setPreferredSize(new java.awt.Dimension(175, 20));

        MnBulananDok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBulananDok.setForeground(new java.awt.Color(51, 51, 51));
        MnBulananDok.setText("Bulanan Dokter");
        MnBulananDok.setEnabled(false);
        MnBulananDok.setName("MnBulananDok"); // NOI18N
        MnBulananDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBulananDokActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBulananDok);

        MnBlnParamedis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBlnParamedis.setForeground(new java.awt.Color(51, 51, 51));
        MnBlnParamedis.setText("Bulanan Paramedis");
        MnBlnParamedis.setEnabled(false);
        MnBlnParamedis.setName("MnBlnParamedis"); // NOI18N
        MnBlnParamedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBlnParamedisActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBlnParamedis);

        MnBlnSrn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBlnSrn.setForeground(new java.awt.Color(51, 51, 51));
        MnBlnSrn.setText("Bulanan Jasa Sarana");
        MnBlnSrn.setEnabled(false);
        MnBlnSrn.setName("MnBlnSrn"); // NOI18N
        MnBlnSrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBlnSrnActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBlnSrn);

        MnBlnKso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBlnKso.setForeground(new java.awt.Color(51, 51, 51));
        MnBlnKso.setText("Bulanan KSO");
        MnBlnKso.setEnabled(false);
        MnBlnKso.setName("MnBlnKso"); // NOI18N
        MnBlnKso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBlnKsoActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBlnKso);

        MnBlnMnj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBlnMnj.setForeground(new java.awt.Color(51, 51, 51));
        MnBlnMnj.setText("Bulanan Manajemen");
        MnBlnMnj.setEnabled(false);
        MnBlnMnj.setName("MnBlnMnj"); // NOI18N
        MnBlnMnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBlnMnjActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBlnMnj);

        MnBlnBhp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBlnBhp.setForeground(new java.awt.Color(51, 51, 51));
        MnBlnBhp.setText("Bulanan BHP Medis/Paket Obat");
        MnBlnBhp.setEnabled(false);
        MnBlnBhp.setName("MnBlnBhp"); // NOI18N
        MnBlnBhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBlnBhpActionPerformed(evt);
            }
        });
        MenuLapBulanan.add(MnBlnBhp);

        jMenuLaporan.add(MenuLapBulanan);

        MenuLapBulanan1.setBorder(null);
        MenuLapBulanan1.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapBulanan1.setMnemonic('P');
        MenuLapBulanan1.setText("Free");
        MenuLapBulanan1.setToolTipText("Alt+P");
        MenuLapBulanan1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapBulanan1.setName("MenuLapBulanan1"); // NOI18N
        MenuLapBulanan1.setPreferredSize(new java.awt.Dimension(175, 20));

        MnFreeVstDok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnFreeVstDok.setForeground(new java.awt.Color(51, 51, 51));
        MnFreeVstDok.setText("Free Visit Dokter");
        MnFreeVstDok.setEnabled(false);
        MnFreeVstDok.setName("MnFreeVstDok"); // NOI18N
        MnFreeVstDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFreeVstDokActionPerformed(evt);
            }
        });
        MenuLapBulanan1.add(MnFreeVstDok);

        MnFreeBcEkg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnFreeBcEkg.setForeground(new java.awt.Color(51, 51, 51));
        MnFreeBcEkg.setText("Free Bacaan EKG");
        MnFreeBcEkg.setEnabled(false);
        MnFreeBcEkg.setName("MnFreeBcEkg"); // NOI18N
        MnFreeBcEkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFreeBcEkgActionPerformed(evt);
            }
        });
        MenuLapBulanan1.add(MnFreeBcEkg);

        MnFreeRujRotg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnFreeRujRotg.setForeground(new java.awt.Color(51, 51, 51));
        MnFreeRujRotg.setText("Free Rujukan Rontgen");
        MnFreeRujRotg.setEnabled(false);
        MnFreeRujRotg.setName("MnFreeRujRotg"); // NOI18N
        MnFreeRujRotg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFreeRujRotgActionPerformed(evt);
            }
        });
        MenuLapBulanan1.add(MnFreeRujRotg);

        MnFreeRujRnp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnFreeRujRnp.setForeground(new java.awt.Color(51, 51, 51));
        MnFreeRujRnp.setText("Free Rujukan Ranap");
        MnFreeRujRnp.setEnabled(false);
        MnFreeRujRnp.setName("MnFreeRujRnp"); // NOI18N
        MnFreeRujRnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFreeRujRnpActionPerformed(evt);
            }
        });
        MenuLapBulanan1.add(MnFreeRujRnp);

        MnFreePrkRln.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnFreePrkRln.setForeground(new java.awt.Color(51, 51, 51));
        MnFreePrkRln.setText("Free Periksa Ralan");
        MnFreePrkRln.setEnabled(false);
        MnFreePrkRln.setName("MnFreePrkRln"); // NOI18N
        MnFreePrkRln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFreePrkRlnActionPerformed(evt);
            }
        });
        MenuLapBulanan1.add(MnFreePrkRln);

        jMenuLaporan.add(MenuLapBulanan1);

        MenuLapPemb.setBorder(null);
        MenuLapPemb.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapPemb.setMnemonic('P');
        MenuLapPemb.setText("Pembayaran");
        MenuLapPemb.setToolTipText("Alt+P");
        MenuLapPemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapPemb.setName("MenuLapPemb"); // NOI18N
        MenuLapPemb.setPreferredSize(new java.awt.Dimension(175, 20));

        MnLapPembRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapPembRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnLapPembRalan.setText("Pembayaran Ralan");
        MnLapPembRalan.setEnabled(false);
        MnLapPembRalan.setName("MnLapPembRalan"); // NOI18N
        MnLapPembRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapPembRalanActionPerformed(evt);
            }
        });
        MenuLapPemb.add(MnLapPembRalan);

        MnLapPembRnp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapPembRnp.setForeground(new java.awt.Color(51, 51, 51));
        MnLapPembRnp.setText("Pembayaran Ranap");
        MnLapPembRnp.setEnabled(false);
        MnLapPembRnp.setName("MnLapPembRnp"); // NOI18N
        MnLapPembRnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapPembRnpActionPerformed(evt);
            }
        });
        MenuLapPemb.add(MnLapPembRnp);

        MnRkpPmbRln.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRkpPmbRln.setForeground(new java.awt.Color(51, 51, 51));
        MnRkpPmbRln.setText("Rekap Pembayaran Ralan");
        MnRkpPmbRln.setEnabled(false);
        MnRkpPmbRln.setName("MnRkpPmbRln"); // NOI18N
        MnRkpPmbRln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRkpPmbRlnActionPerformed(evt);
            }
        });
        MenuLapPemb.add(MnRkpPmbRln);

        MnRkpPmbRnp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRkpPmbRnp.setForeground(new java.awt.Color(51, 51, 51));
        MnRkpPmbRnp.setText("Rekap Pembayaran Ranap");
        MnRkpPmbRnp.setEnabled(false);
        MnRkpPmbRnp.setName("MnRkpPmbRnp"); // NOI18N
        MnRkpPmbRnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRkpPmbRnpActionPerformed(evt);
            }
        });
        MenuLapPemb.add(MnRkpPmbRnp);

        jMenuLaporan.add(MenuLapPemb);

        MnLapTagMsk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapTagMsk.setForeground(new java.awt.Color(51, 51, 51));
        MnLapTagMsk.setText("Tagihan Masuk");
        MnLapTagMsk.setEnabled(false);
        MnLapTagMsk.setName("MnLapTagMsk"); // NOI18N
        MnLapTagMsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapTagMskActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapTagMsk);

        MnLapTmbBiayaPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapTmbBiayaPx.setForeground(new java.awt.Color(51, 51, 51));
        MnLapTmbBiayaPx.setText("Tambahan Biaya Pasien");
        MnLapTmbBiayaPx.setEnabled(false);
        MnLapTmbBiayaPx.setName("MnLapTmbBiayaPx"); // NOI18N
        MnLapTmbBiayaPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapTmbBiayaPxActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapTmbBiayaPx);

        MnLapPotBiayaPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapPotBiayaPx.setForeground(new java.awt.Color(51, 51, 51));
        MnLapPotBiayaPx.setText("Potongan Biaya Pasien");
        MnLapPotBiayaPx.setEnabled(false);
        MnLapPotBiayaPx.setName("MnLapPotBiayaPx"); // NOI18N
        MnLapPotBiayaPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapPotBiayaPxActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapPotBiayaPx);

        MnLapDepositPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapDepositPx.setForeground(new java.awt.Color(51, 51, 51));
        MnLapDepositPx.setText("Deposit Pasien");
        MnLapDepositPx.setEnabled(false);
        MnLapDepositPx.setName("MnLapDepositPx"); // NOI18N
        MnLapDepositPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapDepositPxActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapDepositPx);

        MnLapUangShift.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapUangShift.setForeground(new java.awt.Color(51, 51, 51));
        MnLapUangShift.setText("Rekap Uang Pershift");
        MnLapUangShift.setEnabled(false);
        MnLapUangShift.setName("MnLapUangShift"); // NOI18N
        MnLapUangShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapUangShiftActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapUangShift);

        MnLapPaymentPoint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapPaymentPoint.setForeground(new java.awt.Color(51, 51, 51));
        MnLapPaymentPoint.setText("Payment Point");
        MnLapPaymentPoint.setEnabled(false);
        MnLapPaymentPoint.setName("MnLapPaymentPoint"); // NOI18N
        MnLapPaymentPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapPaymentPointActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapPaymentPoint);

        MenuLapPykt.setBorder(null);
        MenuLapPykt.setForeground(new java.awt.Color(51, 51, 51));
        MenuLapPykt.setMnemonic('P');
        MenuLapPykt.setText("Penyakit");
        MenuLapPykt.setToolTipText("Alt+P");
        MenuLapPykt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuLapPykt.setName("MenuLapPykt"); // NOI18N
        MenuLapPykt.setPreferredSize(new java.awt.Dimension(175, 20));

        MnLapIcd9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapIcd9.setForeground(new java.awt.Color(51, 51, 51));
        MnLapIcd9.setText("ICD 9");
        MnLapIcd9.setEnabled(false);
        MnLapIcd9.setName("MnLapIcd9"); // NOI18N
        MnLapIcd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapIcd9ActionPerformed(evt);
            }
        });
        MenuLapPykt.add(MnLapIcd9);

        MnLapIcd10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapIcd10.setForeground(new java.awt.Color(51, 51, 51));
        MnLapIcd10.setText("ICD 10");
        MnLapIcd10.setEnabled(false);
        MnLapIcd10.setName("MnLapIcd10"); // NOI18N
        MnLapIcd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapIcd10ActionPerformed(evt);
            }
        });
        MenuLapPykt.add(MnLapIcd10);

        MnLapObtPenyakit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapObtPenyakit.setForeground(new java.awt.Color(51, 51, 51));
        MnLapObtPenyakit.setText("Obat Penyakit");
        MnLapObtPenyakit.setEnabled(false);
        MnLapObtPenyakit.setName("MnLapObtPenyakit"); // NOI18N
        MnLapObtPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapObtPenyakitActionPerformed(evt);
            }
        });
        MenuLapPykt.add(MnLapObtPenyakit);

        jMenuLaporan.add(MenuLapPykt);

        MnLapKjgRln.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapKjgRln.setForeground(new java.awt.Color(51, 51, 51));
        MnLapKjgRln.setText("Kunjungan Ralan");
        MnLapKjgRln.setEnabled(false);
        MnLapKjgRln.setName("MnLapKjgRln"); // NOI18N
        MnLapKjgRln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapKjgRlnActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapKjgRln);

        MnLapKjgRanap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnLapKjgRanap.setForeground(new java.awt.Color(51, 51, 51));
        MnLapKjgRanap.setText("Kunjungan Ranap");
        MnLapKjgRanap.setEnabled(false);
        MnLapKjgRanap.setName("MnLapKjgRanap"); // NOI18N
        MnLapKjgRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnLapKjgRanapActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnLapKjgRanap);

        MnSensusHrPoli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSensusHrPoli.setForeground(new java.awt.Color(51, 51, 51));
        MnSensusHrPoli.setText("Sensus Harian Poli");
        MnSensusHrPoli.setEnabled(false);
        MnSensusHrPoli.setName("MnSensusHrPoli"); // NOI18N
        MnSensusHrPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSensusHrPoliActionPerformed(evt);
            }
        });
        jMenuLaporan.add(MnSensusHrPoli);

        MenuBar.add(jMenuLaporan);

        jMenuKeu.setBorder(null);
        jMenuKeu.setForeground(new java.awt.Color(255, 255, 255));
        jMenuKeu.setMnemonic('N');
        jMenuKeu.setText("Keuangan");
        jMenuKeu.setToolTipText("Alt+N");
        jMenuKeu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuKeu.setName("jMenuKeu"); // NOI18N
        jMenuKeu.setPreferredSize(new java.awt.Dimension(68, 30));

        MenuTarif.setBorder(null);
        MenuTarif.setForeground(new java.awt.Color(51, 51, 51));
        MenuTarif.setMnemonic('P');
        MenuTarif.setText("Tarif Pelayanan");
        MenuTarif.setToolTipText("Alt+P");
        MenuTarif.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuTarif.setName("MenuTarif"); // NOI18N
        MenuTarif.setPreferredSize(new java.awt.Dimension(175, 20));

        MnTarifKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifKamar.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifKamar.setText("Kamar");
        MnTarifKamar.setEnabled(false);
        MnTarifKamar.setName("MnTarifKamar"); // NOI18N
        MnTarifKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifKamarActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifKamar);

        MnTarifRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifRalan.setText("Tarif Ralan");
        MnTarifRalan.setEnabled(false);
        MnTarifRalan.setName("MnTarifRalan"); // NOI18N
        MnTarifRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifRalanActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifRalan);

        MnTarifRanap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifRanap.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifRanap.setText("Tarif Ranap");
        MnTarifRanap.setEnabled(false);
        MnTarifRanap.setName("MnTarifRanap"); // NOI18N
        MnTarifRanap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifRanapActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifRanap);

        MnTarifLab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifLab.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifLab.setText("Tarif Lab");
        MnTarifLab.setEnabled(false);
        MnTarifLab.setName("MnTarifLab"); // NOI18N
        MnTarifLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifLabActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifLab);

        MnTarifRadiologi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifRadiologi.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifRadiologi.setText("Tarif Radiologi");
        MnTarifRadiologi.setEnabled(false);
        MnTarifRadiologi.setName("MnTarifRadiologi"); // NOI18N
        MnTarifRadiologi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifRadiologiActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifRadiologi);

        MnTarifOperasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnTarifOperasi.setForeground(new java.awt.Color(51, 51, 51));
        MnTarifOperasi.setText("Tarif Operasi/VK");
        MnTarifOperasi.setEnabled(false);
        MnTarifOperasi.setName("MnTarifOperasi"); // NOI18N
        MnTarifOperasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnTarifOperasiActionPerformed(evt);
            }
        });
        MenuTarif.add(MnTarifOperasi);

        jMenuKeu.add(MenuTarif);

        MenuRekening.setBorder(null);
        MenuRekening.setForeground(new java.awt.Color(51, 51, 51));
        MenuRekening.setMnemonic('P');
        MenuRekening.setText("Rekening");
        MenuRekening.setToolTipText("Alt+P");
        MenuRekening.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuRekening.setName("MenuRekening"); // NOI18N
        MenuRekening.setPreferredSize(new java.awt.Dimension(175, 20));

        MnAkunRek.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnAkunRek.setForeground(new java.awt.Color(51, 51, 51));
        MnAkunRek.setText("Akun Rekening");
        MnAkunRek.setEnabled(false);
        MnAkunRek.setName("MnAkunRek"); // NOI18N
        MnAkunRek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAkunRekActionPerformed(evt);
            }
        });
        MenuRekening.add(MnAkunRek);

        MnRekThn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRekThn.setForeground(new java.awt.Color(51, 51, 51));
        MnRekThn.setText("Rekening Tahun");
        MnRekThn.setEnabled(false);
        MnRekThn.setName("MnRekThn"); // NOI18N
        MnRekThn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekThnActionPerformed(evt);
            }
        });
        MenuRekening.add(MnRekThn);

        MnPengaturanRek.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPengaturanRek.setForeground(new java.awt.Color(51, 51, 51));
        MnPengaturanRek.setText("Pengaturan Rekening");
        MnPengaturanRek.setEnabled(false);
        MnPengaturanRek.setName("MnPengaturanRek"); // NOI18N
        MnPengaturanRek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPengaturanRekActionPerformed(evt);
            }
        });
        MenuRekening.add(MnPengaturanRek);

        jMenuKeu.add(MenuRekening);

        MnAkunPiutang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnAkunPiutang.setForeground(new java.awt.Color(51, 51, 51));
        MnAkunPiutang.setText("Akun Piutang");
        MnAkunPiutang.setEnabled(false);
        MnAkunPiutang.setName("MnAkunPiutang"); // NOI18N
        MnAkunPiutang.setPreferredSize(new java.awt.Dimension(250, 24));
        MnAkunPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAkunPiutangActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnAkunPiutang);

        MnAkunBayar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnAkunBayar.setForeground(new java.awt.Color(51, 51, 51));
        MnAkunBayar.setText("Akun Bayar");
        MnAkunBayar.setEnabled(false);
        MnAkunBayar.setName("MnAkunBayar"); // NOI18N
        MnAkunBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAkunBayarActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnAkunBayar);

        MnPengeluaranHr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPengeluaranHr.setForeground(new java.awt.Color(51, 51, 51));
        MnPengeluaranHr.setText("Pengeluaran Harian");
        MnPengeluaranHr.setEnabled(false);
        MnPengeluaranHr.setName("MnPengeluaranHr"); // NOI18N
        MnPengeluaranHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPengeluaranHrActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnPengeluaranHr);

        MnPemasukanlain.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPemasukanlain.setForeground(new java.awt.Color(51, 51, 51));
        MnPemasukanlain.setText("Pemasukan lain - lain");
        MnPemasukanlain.setEnabled(false);
        MnPemasukanlain.setName("MnPemasukanlain"); // NOI18N
        MnPemasukanlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPemasukanlainActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnPemasukanlain);

        MenuPiutang.setBorder(null);
        MenuPiutang.setForeground(new java.awt.Color(51, 51, 51));
        MenuPiutang.setMnemonic('P');
        MenuPiutang.setText("Piutang");
        MenuPiutang.setToolTipText("Alt+P");
        MenuPiutang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MenuPiutang.setName("MenuPiutang"); // NOI18N
        MenuPiutang.setPreferredSize(new java.awt.Dimension(175, 20));

        MnPiutangPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPiutangPx.setForeground(new java.awt.Color(51, 51, 51));
        MnPiutangPx.setText("Piutang Pasien");
        MnPiutangPx.setEnabled(false);
        MnPiutangPx.setName("MnPiutangPx"); // NOI18N
        MnPiutangPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPiutangPxActionPerformed(evt);
            }
        });
        MenuPiutang.add(MnPiutangPx);

        MnRincPiutangPx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnRincPiutangPx.setForeground(new java.awt.Color(51, 51, 51));
        MnRincPiutangPx.setText("Rincian Piutang Pasien");
        MnRincPiutangPx.setEnabled(false);
        MnRincPiutangPx.setName("MnRincPiutangPx"); // NOI18N
        MnRincPiutangPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRincPiutangPxActionPerformed(evt);
            }
        });
        MenuPiutang.add(MnRincPiutangPx);

        MnPiutangBlmLns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPiutangBlmLns.setForeground(new java.awt.Color(51, 51, 51));
        MnPiutangBlmLns.setText("Piutang Belum Lunas");
        MnPiutangBlmLns.setEnabled(false);
        MnPiutangBlmLns.setName("MnPiutangBlmLns"); // NOI18N
        MnPiutangBlmLns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPiutangBlmLnsActionPerformed(evt);
            }
        });
        MenuPiutang.add(MnPiutangBlmLns);

        MnByrPiutang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnByrPiutang.setForeground(new java.awt.Color(51, 51, 51));
        MnByrPiutang.setText("Bayar Piutang");
        MnByrPiutang.setEnabled(false);
        MnByrPiutang.setName("MnByrPiutang"); // NOI18N
        MnByrPiutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnByrPiutangActionPerformed(evt);
            }
        });
        MenuPiutang.add(MnByrPiutang);

        jMenuKeu.add(MenuPiutang);

        MnHtgObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnHtgObt.setForeground(new java.awt.Color(51, 51, 51));
        MnHtgObt.setText("Hutang Obat & BHP");
        MnHtgObt.setEnabled(false);
        MnHtgObt.setName("MnHtgObt"); // NOI18N
        MnHtgObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnHtgObtActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnHtgObt);

        MnByrPsnObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnByrPsnObt.setForeground(new java.awt.Color(51, 51, 51));
        MnByrPsnObt.setText("Bayar Pesan Obat & BHP");
        MnByrPsnObt.setEnabled(false);
        MnByrPsnObt.setName("MnByrPsnObt"); // NOI18N
        MnByrPsnObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnByrPsnObtActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnByrPsnObt);

        MnPostingJurnal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPostingJurnal.setForeground(new java.awt.Color(51, 51, 51));
        MnPostingJurnal.setText("Posting Jurnal");
        MnPostingJurnal.setEnabled(false);
        MnPostingJurnal.setName("MnPostingJurnal"); // NOI18N
        MnPostingJurnal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPostingJurnalActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnPostingJurnal);

        MnJurnalHr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnJurnalHr.setForeground(new java.awt.Color(51, 51, 51));
        MnJurnalHr.setText("Jurnal Harian");
        MnJurnalHr.setEnabled(false);
        MnJurnalHr.setName("MnJurnalHr"); // NOI18N
        MnJurnalHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnJurnalHrActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnJurnalHr);

        MnBukuBesar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBukuBesar.setForeground(new java.awt.Color(51, 51, 51));
        MnBukuBesar.setText("Buku Besar");
        MnBukuBesar.setEnabled(false);
        MnBukuBesar.setName("MnBukuBesar"); // NOI18N
        MnBukuBesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBukuBesarActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnBukuBesar);

        MnCashFlow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnCashFlow.setForeground(new java.awt.Color(51, 51, 51));
        MnCashFlow.setText("Cash Flow");
        MnCashFlow.setEnabled(false);
        MnCashFlow.setName("MnCashFlow"); // NOI18N
        MnCashFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCashFlowActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnCashFlow);

        MnKeu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnKeu.setForeground(new java.awt.Color(51, 51, 51));
        MnKeu.setText("Keuangan");
        MnKeu.setEnabled(false);
        MnKeu.setName("MnKeu"); // NOI18N
        MnKeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnKeuActionPerformed(evt);
            }
        });
        jMenuKeu.add(MnKeu);

        MenuBar.add(jMenuKeu);

        jMenuPengaturan.setBorder(null);
        jMenuPengaturan.setForeground(new java.awt.Color(255, 255, 255));
        jMenuPengaturan.setMnemonic('N');
        jMenuPengaturan.setText("Pengaturan");
        jMenuPengaturan.setToolTipText("Alt+N");
        jMenuPengaturan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuPengaturan.setName("jMenuPengaturan"); // NOI18N
        jMenuPengaturan.setPreferredSize(new java.awt.Dimension(75, 30));

        MnSetAplikasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetAplikasi.setForeground(new java.awt.Color(51, 51, 51));
        MnSetAplikasi.setText("Set Aplikasi");
        MnSetAplikasi.setEnabled(false);
        MnSetAplikasi.setName("MnSetAplikasi"); // NOI18N
        MnSetAplikasi.setPreferredSize(new java.awt.Dimension(250, 24));
        MnSetAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetAplikasiActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetAplikasi);

        MnSetAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetAdmin.setForeground(new java.awt.Color(51, 51, 51));
        MnSetAdmin.setText("Set Admin");
        MnSetAdmin.setEnabled(false);
        MnSetAdmin.setName("MnSetAdmin"); // NOI18N
        MnSetAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetAdminActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetAdmin);

        MnPenujang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnPenujang.setForeground(new java.awt.Color(51, 51, 51));
        MnPenujang.setText("Set PJ Penunjang");
        MnPenujang.setEnabled(false);
        MnPenujang.setName("MnPenujang"); // NOI18N
        MnPenujang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPenujangActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnPenujang);

        MnSetOtoLok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetOtoLok.setForeground(new java.awt.Color(51, 51, 51));
        MnSetOtoLok.setText("Set Oto Lokasi");
        MnSetOtoLok.setEnabled(false);
        MnSetOtoLok.setName("MnSetOtoLok"); // NOI18N
        MnSetOtoLok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetOtoLokActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetOtoLok);

        MnSetKmrInp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetKmrInp.setForeground(new java.awt.Color(51, 51, 51));
        MnSetKmrInp.setText("Set Kamar Inap");
        MnSetKmrInp.setEnabled(false);
        MnSetKmrInp.setName("MnSetKmrInp"); // NOI18N
        MnSetKmrInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetKmrInpActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetKmrInp);

        MnSetHargaKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetHargaKamar.setForeground(new java.awt.Color(51, 51, 51));
        MnSetHargaKamar.setText("Set Harga Kamar");
        MnSetHargaKamar.setEnabled(false);
        MnSetHargaKamar.setName("MnSetHargaKamar"); // NOI18N
        MnSetHargaKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetHargaKamarActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetHargaKamar);

        MnSetEmbTus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetEmbTus.setForeground(new java.awt.Color(51, 51, 51));
        MnSetEmbTus.setText("Set Embalase & Tuslah");
        MnSetEmbTus.setEnabled(false);
        MnSetEmbTus.setName("MnSetEmbTus"); // NOI18N
        MnSetEmbTus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetEmbTusActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetEmbTus);

        MnSetUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetUser.setForeground(new java.awt.Color(51, 51, 51));
        MnSetUser.setText("Set User");
        MnSetUser.setEnabled(false);
        MnSetUser.setName("MnSetUser"); // NOI18N
        MnSetUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetUserActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetUser);

        MnSetTrackerLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetTrackerLog.setForeground(new java.awt.Color(51, 51, 51));
        MnSetTrackerLog.setText("Tracker Login");
        MnSetTrackerLog.setEnabled(false);
        MnSetTrackerLog.setName("MnSetTrackerLog"); // NOI18N
        MnSetTrackerLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetTrackerLogActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetTrackerLog);

        MnDisplayAntrian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnDisplayAntrian.setForeground(new java.awt.Color(51, 51, 51));
        MnDisplayAntrian.setText("Display Antrian");
        MnDisplayAntrian.setEnabled(false);
        MnDisplayAntrian.setName("MnDisplayAntrian"); // NOI18N
        MnDisplayAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDisplayAntrianActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnDisplayAntrian);

        MnSetHargaObt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetHargaObt.setForeground(new java.awt.Color(51, 51, 51));
        MnSetHargaObt.setText("Set Harga Obat");
        MnSetHargaObt.setEnabled(false);
        MnSetHargaObt.setName("MnSetHargaObt"); // NOI18N
        MnSetHargaObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetHargaObtActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetHargaObt);

        MnSetObtRnp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetObtRnp.setForeground(new java.awt.Color(51, 51, 51));
        MnSetObtRnp.setText("Set Obat Ranap");
        MnSetObtRnp.setEnabled(false);
        MnSetObtRnp.setName("MnSetObtRnp"); // NOI18N
        MnSetObtRnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetObtRnpActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetObtRnp);

        MnSetPenggTrf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetPenggTrf.setForeground(new java.awt.Color(51, 51, 51));
        MnSetPenggTrf.setText("Set Penggunaan Tarif");
        MnSetPenggTrf.setEnabled(false);
        MnSetPenggTrf.setName("MnSetPenggTrf"); // NOI18N
        MnSetPenggTrf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetPenggTrfActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetPenggTrf);

        MnSetOtoRalan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetOtoRalan.setForeground(new java.awt.Color(51, 51, 51));
        MnSetOtoRalan.setText("Set Oto Ralan");
        MnSetOtoRalan.setEnabled(false);
        MnSetOtoRalan.setName("MnSetOtoRalan"); // NOI18N
        MnSetOtoRalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetOtoRalanActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetOtoRalan);

        MnBiayaHarian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBiayaHarian.setForeground(new java.awt.Color(51, 51, 51));
        MnBiayaHarian.setText("Biaya Harian");
        MnBiayaHarian.setEnabled(false);
        MnBiayaHarian.setName("MnBiayaHarian"); // NOI18N
        MnBiayaHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBiayaHarianActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnBiayaHarian);

        MnBiayaMskSkl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnBiayaMskSkl.setForeground(new java.awt.Color(51, 51, 51));
        MnBiayaMskSkl.setText("Biaya Masuk Sekali");
        MnBiayaMskSkl.setEnabled(false);
        MnBiayaMskSkl.setName("MnBiayaMskSkl"); // NOI18N
        MnBiayaMskSkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBiayaMskSklActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnBiayaMskSkl);

        MnSetRM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetRM.setForeground(new java.awt.Color(51, 51, 51));
        MnSetRM.setText("Set RM");
        MnSetRM.setEnabled(false);
        MnSetRM.setName("MnSetRM"); // NOI18N
        MnSetRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetRMActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetRM);

        MnSetBilling.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetBilling.setForeground(new java.awt.Color(51, 51, 51));
        MnSetBilling.setText("Set Billing");
        MnSetBilling.setEnabled(false);
        MnSetBilling.setName("MnSetBilling"); // NOI18N
        MnSetBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetBillingActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetBilling);

        MnClosingKsr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnClosingKsr.setForeground(new java.awt.Color(51, 51, 51));
        MnClosingKsr.setText("Closing Kasir");
        MnClosingKsr.setEnabled(false);
        MnClosingKsr.setName("MnClosingKsr"); // NOI18N
        MnClosingKsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnClosingKsrActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnClosingKsr);

        MnSetLambtPres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MnSetLambtPres.setForeground(new java.awt.Color(51, 51, 51));
        MnSetLambtPres.setText("Set Keterlambatan Presensi");
        MnSetLambtPres.setEnabled(false);
        MnSetLambtPres.setName("MnSetLambtPres"); // NOI18N
        MnSetLambtPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSetLambtPresActionPerformed(evt);
            }
        });
        jMenuPengaturan.add(MnSetLambtPres);

        MenuBar.add(jMenuPengaturan);

        jMenu13.setBorder(null);
        jMenu13.setForeground(new java.awt.Color(255, 255, 255));
        jMenu13.setMnemonic('N');
        jMenu13.setText("  Bantuan");
        jMenu13.setToolTipText("Alt+N");
        jMenu13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu13.setName("jMenu13"); // NOI18N
        jMenu13.setPreferredSize(new java.awt.Dimension(68, 30));

        MnAnjungan6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        MnAnjungan6.setForeground(new java.awt.Color(153, 0, 51));
        MnAnjungan6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/family24.png"))); // NOI18N
        MnAnjungan6.setText("Anjungan Registrasi Mandiri");
        MnAnjungan6.setName("MnAnjungan6"); // NOI18N
        MnAnjungan6.setPreferredSize(new java.awt.Dimension(200, 40));
        MnAnjungan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAnjungan6ActionPerformed(evt);
            }
        });
        jMenu13.add(MnAnjungan6);

        MnRekapHadir15.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        MnRekapHadir15.setForeground(new java.awt.Color(153, 0, 51));
        MnRekapHadir15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Create-Ticket24.png"))); // NOI18N
        MnRekapHadir15.setText("Antrian Loket");
        MnRekapHadir15.setName("MnRekapHadir15"); // NOI18N
        MnRekapHadir15.setPreferredSize(new java.awt.Dimension(200, 40));
        MnRekapHadir15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekapHadir15ActionPerformed(evt);
            }
        });
        jMenu13.add(MnRekapHadir15);

        MnRekapHadir16.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        MnRekapHadir16.setForeground(new java.awt.Color(153, 0, 51));
        MnRekapHadir16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Create-Ticket24.png"))); // NOI18N
        MnRekapHadir16.setText("Antrian Unit/Poliklinik");
        MnRekapHadir16.setName("MnRekapHadir16"); // NOI18N
        MnRekapHadir16.setPreferredSize(new java.awt.Dimension(200, 40));
        MnRekapHadir16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnRekapHadir16ActionPerformed(evt);
            }
        });
        jMenu13.add(MnRekapHadir16);

        MenuBar.add(jMenu13);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        DlgHome.dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        isTutup();
        DlgHome.dispose();
        int jawab=JOptionPane.showConfirmDialog(null, "Yakin anda mau keluar dari program ini ????","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(jawab==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_BtnCloseActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        edAdmin.setText("");
        edPwd.setText("");
        DlgLogin.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogActionPerformed
        try{
            //com.sun.awt.AWTUtilities.setWindowOpacity(DlgLogin,0.7f);
        }catch(Exception e){
        }
        FlayMenu.setVisible(false);
        var.setpenjualan_obatfalse();
        var.setpenjualan_obatfalse();

        switch (BtnLog.getText().trim()) {
            case "Log Out":
                BtnToolReg.setEnabled(false);
                BtnToolKamnap.setEnabled(false);
                BtnToolKasir.setEnabled(false);
                btnToolLab.setEnabled(false);
                btnToolRad.setEnabled(false);
                BtnToolJualObat.setEnabled(false);
                btnToolIGD.setEnabled(false);
                MnGantiPassword.setEnabled(false);
                
                //Jong Source First
                    MnPasien.setEnabled(false);
                    MnKelahiranBayi.setEnabled(false);
                    MnPasienMeninggal.setEnabled(false);
                    MnDiagnosaPasien.setEnabled(false);
                    MnRiwayatPerawatan.setEnabled(false);
                    MnRetBrksRm.setEnabled(false);
                    MnRegistrasi.setEnabled(false);
                    MnTindakanRalan.setEnabled(false);
                    MnKamarInap.setEnabled(false);
                    MnDpjpRanap.setEnabled(false);
                    MnTindakanRanap.setEnabled(false);
                    MnRujukMasuk.setEnabled(false);
                    MnRujukKeluar.setEnabled(false);
                    MnInfoKamar.setEnabled(false);
                    MnIgd.setEnabled(false);
                    MnJadwalDokter.setEnabled(false);
                    MnOperasi.setEnabled(false);
                    MnPemberianObat.setEnabled(false);
                    MnResepObat.setEnabled(false);
                    MnResepPulang.setEnabled(false);
                    MnDietPasien.setEnabled(false);
                    MnPeriksaLab.setEnabled(false);
                    MnPeriksaRad.setEnabled(false);
                    MnKasirRalan.setEnabled(false);
                    MnDepositPasien.setEnabled(false);
                    MnPiutangPasien.setEnabled(false);
                    MnDataDokter.setEnabled(false);
                    MnDataPetugas.setEnabled(false);
                    MnDataPegawai.setEnabled(false);
                    MnBarcodePresensi.setEnabled(false);
                    MnJamPresensi.setEnabled(false);
                    MnPresensiHarian.setEnabled(false);
                    MnPresensiBulanan.setEnabled(false);
                    MnTempPresensi.setEnabled(false);
                    MnRekapKehadiran.setEnabled(false);
                    MnSidikJari.setEnabled(false);
                    MnJadwalPegawai.setEnabled(false);
                    MnJdwlTambahan.setEnabled(false);
                    MnPresensiHarian1.setEnabled(false);
                    MnIndustriFar.setEnabled(false);
                    MnSuplier.setEnabled(false);
                    MnSatuanBrg.setEnabled(false);
                    MnKonvSat.setEnabled(false);
                    MnJnsObt.setEnabled(false);
                    MnDataObat.setEnabled(false);
                    MnStokOpname.setEnabled(false);
                    MnMutasiObat.setEnabled(false);
                    MnStokObtPx.setEnabled(false);
                    MnPengadaan.setEnabled(false);
                    MnPemesanan.setEnabled(false);
                    MnPenjualanObt.setEnabled(false);
                    MnStokOpname1.setEnabled(false);
                    MnReturKeSup.setEnabled(false);
                    MnReturPemb.setEnabled(false);
                    MnReturObtRanap.setEnabled(false);
                    MnReturPiutangPemb.setEnabled(false);
                    MnKeuntunganPenj.setEnabled(false);
                    MnKeuntBeriObt.setEnabled(false);
                    MnSirkulasiObt.setEnabled(false);
                    MnRiwayat.setEnabled(false);
                    MnDaruratStok.setEnabled(false);
                    MnSatuanBrgNon.setEnabled(false);
                    MnJnsBrgNon.setEnabled(false);
                    MnDataBrgNon.setEnabled(false);
                    MnSupNon.setEnabled(false);
                    MnPengadaanbrg.setEnabled(false);
                    MnStokKeluar.setEnabled(false);
                    MnBiayaPengadaan.setEnabled(false);
                    MnRekapPengadaan.setEnabled(false);
                    MnRekapStok.setEnabled(false);
                    MnCekNoBpjs.setEnabled(false);
                    MnCekNikBpjs.setEnabled(false);
                    MnRiwPesBpjs.setEnabled(false);
                    MnCekNoRujPCare.setEnabled(false);
                    MnRefDiagBpjs.setEnabled(false);
                    MnRefPlBpjs.setEnabled(false);
                    MnRefFaskes.setEnabled(false);
                    MnBridging.setEnabled(false);
                    MnMonitoringKlaim.setEnabled(false);
                    MnRefKmrAplicare.setEnabled(false);
                    MnKmrAplicare.setEnabled(false);
                    MnRefMblJkn.setEnabled(false);
                    MnBtlMblJkn.setEnabled(false);
                    MnLapObtPoli.setEnabled(false);
                    MnObtKmr.setEnabled(false);
                    MnObtDokRln.setEnabled(false);
                    MnObtDokRnp.setEnabled(false);
                    MnObtDokRsp.setEnabled(false);
                    MnObtCrByr.setEnabled(false);
                    MnDetJMDok.setEnabled(false);
                    MnHrDokAll.setEnabled(false);
                    MnHrDokRalan.setEnabled(false);
                    MnHrDok.setEnabled(false);
                    MnHrKamar.setEnabled(false);
                    MnHrBhp.setEnabled(false);
                    MnHrParamedis.setEnabled(false);
                    MnHrMnj.setEnabled(false);
                    MnHrKso.setEnabled(false);
                    MnHrSrn.setEnabled(false);
                    MnBulananDok.setEnabled(false);
                    MnBlnParamedis.setEnabled(false);
                    MnBlnSrn.setEnabled(false);
                    MnBlnKso.setEnabled(false);
                    MnBlnMnj.setEnabled(false);
                    MnBlnBhp.setEnabled(false);
                    MnFreeVstDok.setEnabled(false);
                    MnFreeBcEkg.setEnabled(false);
                    MnFreeRujRotg.setEnabled(false);
                    MnFreeRujRnp.setEnabled(false);
                    MnFreePrkRln.setEnabled(false);
                    MnLapPembRalan.setEnabled(false);
                    MnLapPembRnp.setEnabled(false);
                    MnRkpPmbRln.setEnabled(false);
                    MnRkpPmbRnp.setEnabled(false);
                    MnLapTagMsk.setEnabled(false);
                    MnLapTmbBiayaPx.setEnabled(false);
                    MnLapPotBiayaPx.setEnabled(false);
                    MnLapDepositPx.setEnabled(false);
                    MnLapUangShift.setEnabled(false);
                    MnLapPaymentPoint.setEnabled(false);
                    MnLapIcd9.setEnabled(false);
                    MnLapIcd10.setEnabled(false);
                    MnLapObtPenyakit.setEnabled(false);
                    MnLapKjgRln.setEnabled(false);
                    MnLapKjgRanap.setEnabled(false);
                    MnSensusHrPoli.setEnabled(false);
                    MnTarifKamar.setEnabled(false);
                    MnTarifRalan.setEnabled(false);
                    MnTarifRanap.setEnabled(false);
                    MnTarifLab.setEnabled(false);
                    MnTarifRadiologi.setEnabled(false);
                    MnTarifOperasi.setEnabled(false);
                    MnAkunRek.setEnabled(false);
                    MnRekThn.setEnabled(false);
                    MnPengaturanRek.setEnabled(false);
                    MnAkunPiutang.setEnabled(false);
                    MnAkunBayar.setEnabled(false);
                    MnPengeluaranHr.setEnabled(false);
                    MnPemasukanlain.setEnabled(false);
                    MnPiutangPx.setEnabled(false);
                    MnRincPiutangPx.setEnabled(false);
                    MnPiutangBlmLns.setEnabled(false);
                    MnByrPiutang.setEnabled(false);
                    MnHtgObt.setEnabled(false);
                    MnByrPsnObt.setEnabled(false);
                    MnPostingJurnal.setEnabled(false);
                    MnJurnalHr.setEnabled(false);
                    MnBukuBesar.setEnabled(false);
                    MnCashFlow.setEnabled(false);
                    MnKeu.setEnabled(false);
                    MnSetAplikasi.setEnabled(false);
                    MnSetAdmin.setEnabled(false);
                    MnPenujang.setEnabled(false);
                    MnSetOtoLok.setEnabled(false);
                    MnSetKmrInp.setEnabled(false);
                    MnSetHargaKamar.setEnabled(false);
                    MnSetEmbTus.setEnabled(false);
                    MnSetUser.setEnabled(false);
                    MnSetTrackerLog.setEnabled(false);
                    MnDisplayAntrian.setEnabled(false);
                    MnSetHargaObt.setEnabled(false);
                    MnSetObtRnp.setEnabled(false);
                    MnSetPenggTrf.setEnabled(false);
                    MnSetOtoRalan.setEnabled(false);
                    MnBiayaHarian.setEnabled(false);
                    MnBiayaMskSkl.setEnabled(false);
                    MnSetRM.setEnabled(false);
                    MnSetBilling.setEnabled(false);
                    MnClosingKsr.setEnabled(false);
                    MnSetLambtPres.setEnabled(false);
                    //Jong Source end
                    
                
                edAdmin.setText("");
                edPwd.setText("");
                BtnLog.setText("Log In");
                MnLogin.setText("Log In");
                lblStts.setText("Status Admin : ");
                lblUser.setText("Log Out");
                BtnMenu.setEnabled(false);
                isTutup();
                break;
            case "Log In":
                DlgLogin.setVisible(true);
                edAdmin.requestFocus();
                break;
        }
    }//GEN-LAST:event_BtnLogActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        if(edAdmin.getText().trim().equals("")){
            Valid.textKosong(edAdmin,"ID User");
        }else if(edPwd.getText().trim().equals("")){
            Valid.textKosong(edPwd,"Password");
        }else {
            try {
                var.setData(edAdmin.getText(),edPwd.getText());
                /*if(edAdmin.getText().equals("admin") && edPwd.getText().equals("akusayangsamakamu122456")){
                    BtnMenu.setEnabled(true);
                    BtnToolReg.setEnabled(true);
                    BtnToolKamnap.setEnabled(true);
                    BtnToolKasir.setEnabled(true);
                    btnToolLab.setEnabled(true);
                    btnToolIGD.setEnabled(true);
                    btnToolRad.setEnabled(true);
                    btnToolBcdRalan.setEnabled(true);
                    btnToolBcdRanap.setEnabled(true);
                    MnGantiPassword.setEnabled(false);

                    DlgLogin.dispose();
                    BtnLog.setText("Log Out");
                    MnLogin.setText("Log Out");
                    lblStts.setText("Admin : ");
                    lblUser.setText("Admin Utama");
                }else */
                if(var.getjml1()>=1){
                    BtnMenu.setEnabled(true);
                    BtnToolReg.setEnabled(true);
                    BtnToolKamnap.setEnabled(true);
                    BtnToolKasir.setEnabled(true);
                    btnToolLab.setEnabled(true);
                    btnToolIGD.setEnabled(true);
                    btnToolRad.setEnabled(true);
                    BtnToolJualObat.setEnabled(true);
                    MnGantiPassword.setEnabled(false);
                    

                    //Jong Source first
                    MnPasien.setEnabled(true);
                    MnKelahiranBayi.setEnabled(true);
                    MnPasienMeninggal.setEnabled(true);
                    MnDiagnosaPasien.setEnabled(true);
                    MnRiwayatPerawatan.setEnabled(true);
                    MnRetBrksRm.setEnabled(true);
                    MnRegistrasi.setEnabled(true);
                    MnTindakanRalan.setEnabled(true);
                    MnKamarInap.setEnabled(true);
                    MnDpjpRanap.setEnabled(true);
                    MnTindakanRanap.setEnabled(true);
                    MnRujukMasuk.setEnabled(true);
                    MnRujukKeluar.setEnabled(true);
                    MnInfoKamar.setEnabled(true);
                    MnIgd.setEnabled(true);
                    MnJadwalDokter.setEnabled(true);
                    MnOperasi.setEnabled(true);
                    MnPemberianObat.setEnabled(true);
                    MnResepObat.setEnabled(true);
                    MnResepPulang.setEnabled(true);
                    MnDietPasien.setEnabled(true);
                    MnPeriksaLab.setEnabled(true);
                    MnPeriksaRad.setEnabled(true);
                    MnKasirRalan.setEnabled(true);
                    MnDepositPasien.setEnabled(true);
                    MnPiutangPasien.setEnabled(true);
                    MnDataDokter.setEnabled(true);
                    MnDataPetugas.setEnabled(true);
                    MnDataPegawai.setEnabled(true);
                    MnBarcodePresensi.setEnabled(true);
                    MnJamPresensi.setEnabled(true);
                    MnPresensiHarian.setEnabled(true);
                    MnPresensiBulanan.setEnabled(true);
                    MnTempPresensi.setEnabled(true);
                    MnRekapKehadiran.setEnabled(true);
                    MnSidikJari.setEnabled(true);
                    MnJadwalPegawai.setEnabled(true);
                    MnJdwlTambahan.setEnabled(true);
                    MnPresensiHarian1.setEnabled(true);
                    MnIndustriFar.setEnabled(true);
                    MnSuplier.setEnabled(true);
                    MnSatuanBrg.setEnabled(true);
                    MnKonvSat.setEnabled(true);
                    MnJnsObt.setEnabled(true);
                    MnDataObat.setEnabled(true);
                    MnStokOpname.setEnabled(true);
                    MnMutasiObat.setEnabled(true);
                    MnStokObtPx.setEnabled(true);
                    MnPengadaan.setEnabled(true);
                    MnPemesanan.setEnabled(true);
                    MnPenjualanObt.setEnabled(true);
                    MnStokOpname1.setEnabled(true);
                    MnReturKeSup.setEnabled(true);
                    MnReturPemb.setEnabled(true);
                    MnReturObtRanap.setEnabled(true);
                    MnReturPiutangPemb.setEnabled(true);
                    MnKeuntunganPenj.setEnabled(true);
                    MnKeuntBeriObt.setEnabled(true);
                    MnSirkulasiObt.setEnabled(true);
                    MnRiwayat.setEnabled(true);
                    MnDaruratStok.setEnabled(true);
                    MnSatuanBrgNon.setEnabled(true);
                    MnJnsBrgNon.setEnabled(true);
                    MnDataBrgNon.setEnabled(true);
                    MnSupNon.setEnabled(true);
                    MnPengadaanbrg.setEnabled(true);
                    MnStokKeluar.setEnabled(true);
                    MnBiayaPengadaan.setEnabled(true);
                    MnRekapPengadaan.setEnabled(true);
                    MnRekapStok.setEnabled(true);
                    MnCekNoBpjs.setEnabled(true);
                    MnCekNikBpjs.setEnabled(true);
                    MnRiwPesBpjs.setEnabled(true);
                    MnCekNoRujPCare.setEnabled(true);
                    MnRefDiagBpjs.setEnabled(true);
                    MnRefPlBpjs.setEnabled(true);
                    MnRefFaskes.setEnabled(true);
                    MnBridging.setEnabled(true);
                    MnMonitoringKlaim.setEnabled(true);
                    MnRefKmrAplicare.setEnabled(true);
                    MnKmrAplicare.setEnabled(true);
                    MnRefMblJkn.setEnabled(true);
                    MnBtlMblJkn.setEnabled(true);
                    MnLapObtPoli.setEnabled(true);
                    MnObtKmr.setEnabled(true);
                    MnObtDokRln.setEnabled(true);
                    MnObtDokRnp.setEnabled(true);
                    MnObtDokRsp.setEnabled(true);
                    MnObtCrByr.setEnabled(true);
                    MnDetJMDok.setEnabled(true);
                    MnHrDokAll.setEnabled(true);
                    MnHrDokRalan.setEnabled(true);
                    MnHrDok.setEnabled(true);
                    MnHrKamar.setEnabled(true);
                    MnHrBhp.setEnabled(true);
                    MnHrParamedis.setEnabled(true);
                    MnHrMnj.setEnabled(true);
                    MnHrKso.setEnabled(true);
                    MnHrSrn.setEnabled(true);
                    MnBulananDok.setEnabled(true);
                    MnBlnParamedis.setEnabled(true);
                    MnBlnSrn.setEnabled(true);
                    MnBlnKso.setEnabled(true);
                    MnBlnMnj.setEnabled(true);
                    MnBlnBhp.setEnabled(true);
                    MnFreeVstDok.setEnabled(true);
                    MnFreeBcEkg.setEnabled(true);
                    MnFreeRujRotg.setEnabled(true);
                    MnFreeRujRnp.setEnabled(true);
                    MnFreePrkRln.setEnabled(true);
                    MnLapPembRalan.setEnabled(true);
                    MnLapPembRnp.setEnabled(true);
                    MnRkpPmbRln.setEnabled(true);
                    MnRkpPmbRnp.setEnabled(true);
                    MnLapTagMsk.setEnabled(true);
                    MnLapTmbBiayaPx.setEnabled(true);
                    MnLapPotBiayaPx.setEnabled(true);
                    MnLapDepositPx.setEnabled(true);
                    MnLapUangShift.setEnabled(true);
                    MnLapPaymentPoint.setEnabled(true);
                    MnLapIcd9.setEnabled(true);
                    MnLapIcd10.setEnabled(true);
                    MnLapObtPenyakit.setEnabled(true);
                    MnLapKjgRln.setEnabled(true);
                    MnLapKjgRanap.setEnabled(true);
                    MnSensusHrPoli.setEnabled(true);
                    MnTarifKamar.setEnabled(true);
                    MnTarifRalan.setEnabled(true);
                    MnTarifRanap.setEnabled(true);
                    MnTarifLab.setEnabled(true);
                    MnTarifRadiologi.setEnabled(true);
                    MnTarifOperasi.setEnabled(true);
                    MnAkunRek.setEnabled(true);
                    MnRekThn.setEnabled(true);
                    MnPengaturanRek.setEnabled(true);
                    MnAkunPiutang.setEnabled(true);
                    MnAkunBayar.setEnabled(true);
                    MnPengeluaranHr.setEnabled(true);
                    MnPemasukanlain.setEnabled(true);
                    MnPiutangPx.setEnabled(true);
                    MnRincPiutangPx.setEnabled(true);
                    MnPiutangBlmLns.setEnabled(true);
                    MnByrPiutang.setEnabled(true);
                    MnHtgObt.setEnabled(true);
                    MnByrPsnObt.setEnabled(true);
                    MnPostingJurnal.setEnabled(true);
                    MnJurnalHr.setEnabled(true);
                    MnBukuBesar.setEnabled(true);
                    MnCashFlow.setEnabled(true);
                    MnKeu.setEnabled(true);
                    MnSetAplikasi.setEnabled(true);
                    MnSetAdmin.setEnabled(true);
                    MnPenujang.setEnabled(true);
                    MnSetOtoLok.setEnabled(true);
                    MnSetKmrInp.setEnabled(true);
                    MnSetHargaKamar.setEnabled(true);
                    MnSetEmbTus.setEnabled(true);
                    MnSetUser.setEnabled(true);
                    MnSetTrackerLog.setEnabled(true);
                    MnDisplayAntrian.setEnabled(true);
                    MnSetHargaObt.setEnabled(true);
                    MnSetObtRnp.setEnabled(true);
                    MnSetPenggTrf.setEnabled(true);
                    MnSetOtoRalan.setEnabled(true);
                    MnBiayaHarian.setEnabled(true);
                    MnBiayaMskSkl.setEnabled(true);
                    MnSetRM.setEnabled(true);
                    MnSetBilling.setEnabled(true);
                    MnClosingKsr.setEnabled(true);
                    MnSetLambtPres.setEnabled(true);
                    //Jong Source end
                    
                    DlgLogin.dispose();
                    BtnLog.setText("Log Out");
                    MnLogin.setText("Log Out");
                    lblStts.setText("Admin : ");
                    lblUser.setText("Admin Utama");
                }else if(var.getjml2()>=1){
                    
                   
                    jMenuLayanan.setEnabled(true);
                    jMenuManajemen.setEnabled(true);
                    jMenuFarmasi.setEnabled(true);
                    jMenuInventory.setEnabled(true);
                    jMenuLaporan.setEnabled(true);
                    
                    BtnMenu.setEnabled(true);
                    DlgLogin.dispose();
                    BtnLog.setText("Log Out");
                    MnLogin.setText("Log Out");
                    lblStts.setText("Admin : ");
                    lblUser.setText(var.getkode());
                    MnGantiPassword.setEnabled(true);
                    BtnToolReg.setEnabled(var.getregistrasi());
                    BtnToolKamnap.setEnabled(var.getkamar_inap());
                    BtnToolKasir.setEnabled(var.getkasir_ralan());
                    btnToolLab.setEnabled(var.getperiksa_lab());
                    btnToolRad.setEnabled(var.getperiksa_radiologi());
                    BtnToolJualObat.setEnabled(true);
                    
                    //Jong Source first
                    MnPasien.setEnabled(var.getpasien());
                    MnKelahiranBayi.setEnabled(var.getkelahiran_bayi());
                    MnPasienMeninggal.setEnabled(var.getpasien_meninggal());
                    MnDiagnosaPasien.setEnabled(var.getdiagnosa_pasien());
                    MnRiwayatPerawatan.setEnabled(var.getresume_pasien());
                    MnRetBrksRm.setEnabled(true);
                    MnRegistrasi.setEnabled(var.getregistrasi());
                    MnTindakanRalan.setEnabled(var.gettindakan_ralan());
                    MnKamarInap.setEnabled(var.getkamar_inap());
                    MnDpjpRanap.setEnabled(var.getdpjp_ranap());
                    MnTindakanRanap.setEnabled(var.gettindakan_ranap());
                    MnRujukMasuk.setEnabled(var.getrujukan_masuk());
                    MnRujukKeluar.setEnabled(var.getrujukan_keluar());
                    MnInfoKamar.setEnabled(var.getinformasi_kamar());
                    MnIgd.setEnabled(var.getigd());
                    MnJadwalDokter.setEnabled(var.getjadwal_praktek());
                    MnOperasi.setEnabled(var.getoperasi());
                    MnPemberianObat.setEnabled(var.getobat());
                    MnResepObat.setEnabled(var.getresep_obat());
                    MnResepPulang.setEnabled(var.getresep_pulang());
                    MnDietPasien.setEnabled(var.getdiet_pasien());
                    MnPeriksaLab.setEnabled(var.getperiksa_lab());
                    MnPeriksaRad.setEnabled(var.getperiksa_radiologi());
                    MnKasirRalan.setEnabled(var.getkasir_ralan());
                    MnDepositPasien.setEnabled(var.getdeposit_pasien());
                    MnPiutangPasien.setEnabled(var.getpiutang_pasien());
                    MnDataDokter.setEnabled(var.getdokter());
                    MnDataPetugas.setEnabled(var.getpetugas());
                    MnDataPegawai.setEnabled(var.getpegawai_user());
                    MnBarcodePresensi.setEnabled(var.getbarcode());
                    MnJamPresensi.setEnabled(var.getjam_masuk());
                    MnPresensiHarian.setEnabled(var.getpresensi_harian());
                    MnPresensiBulanan.setEnabled(var.getpresensi_bulanan());
                    MnTempPresensi.setEnabled(var.gettemporary_presensi());
                    MnRekapKehadiran.setEnabled(var.getrekap_per_shift());
                    MnSidikJari.setEnabled(var.getsidikjari());
                    MnJadwalPegawai.setEnabled(var.getjadwal_pegawai());
                    MnJdwlTambahan.setEnabled(var.getjadwal_praktek());
                    MnPresensiHarian1.setEnabled(var.getpresensi_harian());
                    MnIndustriFar.setEnabled(var.getindustrifarmasi());
                    MnSuplier.setEnabled(var.getsuplier());
                    MnSatuanBrg.setEnabled(var.getsatuan_barang());
                    MnKonvSat.setEnabled(var.getkonversi_satuan());
                    MnJnsObt.setEnabled(true); //belum
                    MnDataObat.setEnabled(var.getobat()); // ada sama bingung yang mana
                    MnStokOpname.setEnabled(var.getstok_opname_obat());
                    MnMutasiObat.setEnabled(var.getmutasi_barang());
                    MnStokObtPx.setEnabled(var.getstok_obat_pasien());
                    MnPengadaan.setEnabled(var.getpengadaan_obat());
                    MnPemesanan.setEnabled(var.getpemesanan_obat());
                    MnPenjualanObt.setEnabled(var.getpenjualan_obat());
                    MnReturKeSup.setEnabled(var.getretur_dari_pembeli());
                    MnReturPemb.setEnabled(var.getretur_dari_pembeli());
                    MnReturObtRanap.setEnabled(var.getretur_obat_ranap());
                    MnReturPiutangPemb.setEnabled(var.getretur_piutang_pasien());
                    MnKeuntunganPenj.setEnabled(var.getkeuntungan_penjualan());
                    MnKeuntBeriObt.setEnabled(var.getkeuntungan_beri_obat());
                    MnSirkulasiObt.setEnabled(var.getsirkulasi_obat());
                    MnRiwayat.setEnabled(var.getriwayat_obat_alkes_bhp());
                    MnDaruratStok.setEnabled(var.getdarurat_stok());
                    MnSatuanBrgNon.setEnabled(var.getsatuan_barang());
                    MnJnsBrgNon.setEnabled(var.getjenis_barang());
                    MnDataBrgNon.setEnabled(var.getipsrs_barang());
                    MnSupNon.setEnabled(var.getsuplier_penunjang());
                    MnPengadaanbrg.setEnabled(var.getipsrs_pengadaan_barang());
                    MnStokKeluar.setEnabled(var.getipsrs_stok_keluar());
                    MnBiayaPengadaan.setEnabled(true);//belum
                    MnRekapPengadaan.setEnabled(var.getipsrs_rekap_pengadaan());
                    MnRekapStok.setEnabled(var.getipsrs_rekap_stok_keluar());
                    MnCekNoBpjs.setEnabled(var.getbpjs_cek_kartu());
                    MnCekNikBpjs.setEnabled(var.getbpjs_cek_nik());
                    MnRiwPesBpjs.setEnabled(var.getbpjs_cek_riwayat());
                    MnCekNoRujPCare.setEnabled(var.getbpjs_cek_nomor_rujukan());
                    MnRefDiagBpjs.setEnabled(var.getbpjs_referensi_diagnosa());
                    MnRefPlBpjs.setEnabled(var.getbpjs_referensi_poli());
                    MnRefFaskes.setEnabled(var.getbpjs_referensi_faskes());
                    MnBridging.setEnabled(var.getbpjs_sep());
                    MnMonitoringKlaim.setEnabled(var.getbpjs_monitoring_klaim());
                    MnRefKmrAplicare.setEnabled(var.getaplicare_referensi_kamar()); // Belum
                    MnKmrAplicare.setEnabled(var.getaplicare_ketersediaan_kamar()); 
                    MnRefMblJkn.setEnabled(var.getreferensi_mobilejkn_bpjs());
                    MnBtlMblJkn.setEnabled(var.getbatal_pendaftaran_mobilejkn_bpjs());
                    MnLapObtPoli.setEnabled(var.getobat_per_poli());
                    MnObtKmr.setEnabled(var.getobat_per_kamar());
                    MnObtDokRln.setEnabled(var.getobat_per_dokter_ralan());
                    MnObtDokRnp.setEnabled(var.getobat_per_dokter_ranap());
                    MnObtDokRsp.setEnabled(var.getobat_per_dokter_peresep());
                    MnObtCrByr.setEnabled(var.getobat_per_cara_bayar());
                    MnDetJMDok.setEnabled(var.getjm_ranap_dokter());
                    MnHrDokAll.setEnabled(var.getharian_dokter());
                    MnHrDokRalan.setEnabled(var.getharian_tindakan_poli());
                    MnHrDok.setEnabled(var.getharian_tindakan_dokter());
                    MnHrKamar.setEnabled(var.getharian_kamar());
                    MnHrBhp.setEnabled(var.getharian_paket_bhp());
                    MnHrParamedis.setEnabled(var.getharian_paramedis());
                    MnHrMnj.setEnabled(var.getharian_menejemen());
                    MnHrKso.setEnabled(var.getharian_kso());
                    MnHrSrn.setEnabled(var.getharian_js());
                    MnBulananDok.setEnabled(var.getbulanan_dokter());
                    MnBlnParamedis.setEnabled(var.getbulanan_paramedis());
                    MnBlnSrn.setEnabled(var.getbulanan_js());
                    MnBlnKso.setEnabled(var.getbulanan_kso());
                    MnBlnMnj.setEnabled(var.getbulanan_menejemen());
                    MnBlnBhp.setEnabled(var.getbulanan_paket_bhp());
                    MnFreeVstDok.setEnabled(var.getfee_visit_dokter());
                    MnFreeBcEkg.setEnabled(var.getfee_bacaan_ekg());
                    MnFreeRujRotg.setEnabled(var.getfee_rujukan_rontgen());
                    MnFreeRujRnp.setEnabled(var.getfee_rujukan_ranap());
                    MnFreePrkRln.setEnabled(var.getfee_ralan());
                    MnLapPembRalan.setEnabled(var.getpembayaran_ralan());
                    MnLapPembRnp.setEnabled(var.getpembayaran_ranap());
                    MnRkpPmbRln.setEnabled(var.getrekap_pembayaran_ralan());
                    MnRkpPmbRnp.setEnabled(var.getrekap_pembayaran_ranap());
                    MnLapTagMsk.setEnabled(var.gettagihan_masuk());
                    MnLapTmbBiayaPx.setEnabled(var.gettambahan_biaya());
                    MnLapPotBiayaPx.setEnabled(var.getpotongan_biaya());
                    MnLapDepositPx.setEnabled(var.getdeposit_pasien());
                    MnLapUangShift.setEnabled(var.getrekap_per_shift());
                    MnLapPaymentPoint.setEnabled(var.getpayment_point());
                    MnLapIcd9.setEnabled(var.geticd9());
                    MnLapIcd10.setEnabled(true);
                    MnLapObtPenyakit.setEnabled(var.getobat_penyakit());
                    MnLapKjgRln.setEnabled(var.getkunjungan_ralan());
                    MnLapKjgRanap.setEnabled(var.getkunjungan_ranap());
                    MnSensusHrPoli.setEnabled(var.getsensus_harian_poli());
                    MnTarifKamar.setEnabled(var.getkamar());
                    MnTarifRalan.setEnabled(var.gettarif_ralan());
                    MnTarifRanap.setEnabled(var.gettarif_ranap());
                    MnTarifLab.setEnabled(var.gettarif_lab());
                    MnTarifRadiologi.setEnabled(var.gettarif_radiologi());
                    MnTarifOperasi.setEnabled(var.gettarif_operasi());
                    MnAkunRek.setEnabled(var.getakun_rekening());
                    MnRekThn.setEnabled(var.getrekening_tahun());
                    MnPengaturanRek.setEnabled(var.getpengaturan_rekening());
                    MnAkunPiutang.setEnabled(var.getakun_piutang());
                    MnAkunBayar.setEnabled(var.getakun_bayar());
                    MnPengeluaranHr.setEnabled(var.getpengeluaran());
                    MnPemasukanlain.setEnabled(var.getpemasukan_lain());
                    MnPiutangPx.setEnabled(var.getpiutang_pasien());
                    MnRincPiutangPx.setEnabled(var.getrincian_piutang_pasien());
                    MnPiutangBlmLns.setEnabled(var.getpiutang_pasien2());
                    MnByrPiutang.setEnabled(var.getbayar_piutang());
                    MnHtgObt.setEnabled(var.gethutang_obat());
                    MnByrPsnObt.setEnabled(var.getbayar_pemesanan_obat());
                    MnPostingJurnal.setEnabled(var.getposting_jurnal());
                    MnJurnalHr.setEnabled(var.getjurnal_harian());
                    MnBukuBesar.setEnabled(var.getbuku_besar());
                    MnCashFlow.setEnabled(var.getcashflow());
                    MnKeu.setEnabled(var.getkeuangan());
                    MnSetAplikasi.setEnabled(var.getaplikasi());
                    MnSetAdmin.setEnabled(var.getadmin());
                    MnPenujang.setEnabled(var.getsuplier_penunjang());
                    MnSetOtoLok.setEnabled(var.getsetup_otolokasi());
                    MnSetKmrInp.setEnabled(var.getkamar_inap());
                    MnSetHargaKamar.setEnabled(var.getset_harga_kamar());
                    MnSetEmbTus.setEnabled(var.getsetup_embalase());
                    MnSetUser.setEnabled(var.getuser());
                    MnSetTrackerLog.setEnabled(var.gettracer_login());
                    MnDisplayAntrian.setEnabled(var.getdisplay());
                    MnSetHargaObt.setEnabled(var.getset_harga_obat());
                    MnSetObtRnp.setEnabled(var.getset_harga_obat_ranap());
                    MnSetPenggTrf.setEnabled(var.getset_penggunaan_tarif());
                    MnSetOtoRalan.setEnabled(var.getset_oto_ralan());
                    MnBiayaHarian.setEnabled(var.getbiaya_harian());
                    MnBiayaMskSkl.setEnabled(var.getbiaya_masuk_sekali());
                    MnSetRM.setEnabled(var.getset_no_rm());
                    MnSetBilling.setEnabled(var.getbilling_ralan());
                    MnClosingKsr.setEnabled(var.getbilling_ranap());
                    MnSetLambtPres.setEnabled(var.getketerlambatan_presensi());
                    //Jong Source end
                 
                   
                    
                    btnToolIGD.setEnabled(var.getigd());
                    Sequel.menyimpan("tracker","'"+edAdmin.getText()+"',current_date(),current_time()","Login");
                }else if((var.getjml1()==0)&&(var.getjml2()==0)){
                    JOptionPane.showMessageDialog(null,"Maaf, Gagal login. ID User atau password ada yang salah ...!");
                    BtnToolReg.setEnabled(false);
                    BtnToolKamnap.setEnabled(false);
                    BtnToolKasir.setEnabled(false);
                    MnGantiPassword.setEnabled(false);
                    btnToolLab.setEnabled(false);
                    btnToolIGD.setEnabled(false);
                    btnToolRad.setEnabled(false);
                    BtnToolJualObat.setEnabled(false);
                    edAdmin.setText("");
                    edPwd.setText("");

                    BtnMenu.setEnabled(false);

                    edAdmin.requestFocus();
                    BtnLog.setText("Log In");
                    MnLogin.setText("Log In");
                    lblStts.setText("Status Admin : ");
                    lblUser.setText("Log Out");
                }
            } catch (Exception e) {
                System.out.println("Notifikasi : "+e);
            }
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnToolKamnapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToolKamnapActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.isCek();
        kasirralan.kamarinap.emptTeks();
        //kasirralan.kamarinap.tampil();
        kasirralan.kamarinap.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_BtnToolKamnapActionPerformed

private void edAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edAdminKeyPressed
        Valid.pindah(evt,BtnCancel, edPwd);
}//GEN-LAST:event_edAdminKeyPressed

private void edPwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPwdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BtnLoginActionPerformed(null);
        }else if(evt.getKeyCode()==KeyEvent.VK_PAGE_DOWN){
            edAdmin.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_PAGE_UP){
            BtnLogin.requestFocus();
        }
}//GEN-LAST:event_edPwdKeyPressed

private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if(penggajian.isActive()==true){
            penggajian.CloseScane();
        }
        if(retensi.isActive()==true){
            retensi.CloseScane();
        }
        isTutup();
        try{
            if(prop.getProperty("MENUTRANSPARAN").equals("yes")){
                //com.sun.awt.AWTUtilities.setWindowOpacity(DlgHome,0.6f);
            }
        }catch(Exception e){

        }

        DlgHome.setSize(PanelUtama.getWidth()-45, PanelUtama.getHeight()-45);
        isTampil();
        DlgHome.setLocationRelativeTo(PanelUtama);
        DlgHome.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
}//GEN-LAST:event_BtnMenuActionPerformed

private void BtnToolKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToolKasirActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        kasirralan.isCek();
        //kasirralan.tampilkasir();
        kasirralan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.setLocationRelativeTo(PanelUtama);
        kasirralan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
}//GEN-LAST:event_BtnToolKasirActionPerformed

private void BtnToolRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToolRegActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        //kasirralan.kamarinap.reg.tampil();
        kasirralan.kamarinap.reg.emptTeks();
        kasirralan.kamarinap.reg.isCek();
        kasirralan.kamarinap.reg.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.reg.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.reg.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
}//GEN-LAST:event_BtnToolRegActionPerformed

private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
    if(this.getState()==1){
        isTutup();
    }
}//GEN-LAST:event_formWindowStateChanged

private void BtnClosePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClosePassActionPerformed
        WindowInput.dispose();
}//GEN-LAST:event_BtnClosePassActionPerformed

private void BtnClosePassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnClosePassKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            WindowInput.dispose();
        }else if(evt.getKeyCode()==KeyEvent.VK_PAGE_DOWN){
            PassBaru2.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_PAGE_UP){
            PassLama.requestFocus();
        }
}//GEN-LAST:event_BtnClosePassKeyPressed

private void BtnSimpanPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanPassActionPerformed
        if(PassLama.getText().trim().equals("")){
            Valid.textKosong(PassLama,"Password Lama");
        }else if(Passbaru1.getText().trim().equals("")){
            Valid.textKosong(Passbaru1,"Password Baru");
        }else if(PassBaru2.getText().trim().equals("")){
            Valid.textKosong(PassBaru2,"Password Baru");
        }else if(!edPwd.getText().trim().equals(PassLama.getText())){
            JOptionPane.showMessageDialog(null,"Maaf, Password lama salah...!!!");
            PassLama.requestFocus();
        }else if(!Passbaru1.getText().trim().equals(PassBaru2.getText())){
            JOptionPane.showMessageDialog(null,"Maaf, Password Baru 1 dan Password Baru 2 tidak sesuai...!!!");
            PassBaru2.requestFocus();
        }else{
            Sequel.queryu("update user set password=AES_ENCRYPT('"+PassBaru2.getText()+"','windi')  where id_user=AES_ENCRYPT('"+lblUser.getText()+"','nur')");
            WindowInput.setVisible(false);
        }
}//GEN-LAST:event_BtnSimpanPassActionPerformed

private void BtnSimpanPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanPassKeyPressed
        Valid.pindah(evt,PassLama,PassBaru2);
}//GEN-LAST:event_BtnSimpanPassKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        DlgHome.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void cmbMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMenuItemStateChanged
        isTampil();
    }//GEN-LAST:event_cmbMenuItemStateChanged

    private void btnBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarcodeActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgBarcode barcode=new DlgBarcode(this,false);
        barcode.tampil();
        barcode.isCek();
        barcode.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        barcode.setLocationRelativeTo(PanelUtama);
        barcode.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBarcodeActionPerformed

    private void btnICDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICDActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        kasirralan.kamarinap.billing.beriobat.dlgobtpny.penyakit.penyakit.isCek();
        kasirralan.kamarinap.billing.beriobat.dlgobtpny.penyakit.penyakit.emptTeks();
        kasirralan.kamarinap.billing.beriobat.dlgobtpny.penyakit.penyakit.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.billing.beriobat.dlgobtpny.penyakit.penyakit.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.billing.beriobat.dlgobtpny.penyakit.penyakit.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnICDActionPerformed

    private void btnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        kasirralan.billing.dlgobt.barang.emptTeks();
        kasirralan.billing.dlgobt.barang.isCek();
        kasirralan.billing.dlgobt.barang.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.billing.dlgobt.barang.setLocationRelativeTo(PanelUtama);
        kasirralan.billing.dlgobt.barang.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatActionPerformed

    private void btnObatPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatPenyakitActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgObatPenyakit obatpenyakit=new DlgObatPenyakit(this,false);
        obatpenyakit.isCek();
        obatpenyakit.emptTeks();
        obatpenyakit.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        obatpenyakit.setLocationRelativeTo(PanelUtama);
        obatpenyakit.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatPenyakitActionPerformed

    private void btnKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKamarActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        kasirralan.kamarinap.kamar.emptTeks();
        kasirralan.kamarinap.kamar.isCek();
        kasirralan.kamarinap.kamar.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.kamar.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.kamar.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKamarActionPerformed

    private void btnTindakanRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTindakanRalanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJnsPerawatanRalan form=new DlgJnsPerawatanRalan(null,false);
        form.emptTeks();
        form.isCek();
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTindakanRalanActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.reg.dokter.dokter.emptTeks();
        kasirralan.kamarinap.reg.dokter.dokter.isCek();
        kasirralan.kamarinap.reg.dokter.dokter.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.reg.dokter.dokter.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.reg.dokter.dokter.setAlwaysOnTop(false);
        kasirralan.kamarinap.reg.dokter.dokter.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.billing.dlgrwjl.petugas.petugas.emptTeks();
        kasirralan.billing.dlgrwjl.petugas.petugas.isCek();
        kasirralan.billing.dlgrwjl.petugas.petugas.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.billing.dlgrwjl.petugas.petugas.setLocationRelativeTo(PanelUtama);
        kasirralan.billing.dlgrwjl.petugas.petugas.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPetugasActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //kasirralan.kamarinap.reg.pasien.tampil();
        kasirralan.kamarinap.reg.pasien.emptTeks();
        kasirralan.kamarinap.reg.pasien.isCek();
        kasirralan.kamarinap.reg.pasien.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.reg.pasien.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.reg.pasien.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrasiActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //kasirralan.kamarinap.reg.tampil();
        kasirralan.kamarinap.reg.emptTeks();
        kasirralan.kamarinap.reg.isCek();
        kasirralan.kamarinap.reg.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.reg.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.reg.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRegistrasiActionPerformed

    private void btnRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRalanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //kasirralan.billing.dlgrwjl.tampilDr();
        kasirralan.billing.dlgrwjl.isCek();
        kasirralan.billing.dlgrwjl.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.billing.dlgrwjl.setLocationRelativeTo(PanelUtama);
        kasirralan.billing.dlgrwjl.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRalanActionPerformed

    private void btnKamarInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKamarInapActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.isCek();
        kasirralan.kamarinap.emptTeks();
        //kasirralan.kamarinap.tampil();
        kasirralan.kamarinap.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKamarInapActionPerformed

    private void btnRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRanapActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.billing.rawatinap.tampilDr();
        kasirralan.kamarinap.billing.rawatinap.isCek();
        kasirralan.kamarinap.billing.rawatinap.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.billing.rawatinap.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.billing.rawatinap.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRanapActionPerformed

    private void btnResepObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResepObatActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgResepObat resep=new DlgResepObat(this,false);
        resep.tampil();
        resep.emptTeks();
        resep.isCek();
        resep.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        resep.setLocationRelativeTo(PanelUtama);
        resep.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnResepObatActionPerformed

    private void btnRujukPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRujukPasienActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRujuk rujuk=new DlgRujuk(this,false);
        rujuk.tampil();
        rujuk.emptTeks();
        rujuk.isCek();
        rujuk.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rujuk.setLocationRelativeTo(PanelUtama);
        rujuk.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRujukPasienActionPerformed

    private void btnBeriObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeriObatActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.billing.beriobat.tampilPO();
        kasirralan.kamarinap.billing.beriobat.isCek();
        kasirralan.kamarinap.billing.beriobat.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.billing.beriobat.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.billing.beriobat.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBeriObatActionPerformed

    private void btnPasienMatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienMatiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPasienMati pasienmati=new DlgPasienMati(this,false);
        pasienmati.emptTeks();
        pasienmati.isCek();
        pasienmati.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pasienmati.setLocationRelativeTo(PanelUtama);
        pasienmati.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPasienMatiActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgAdmin admin=new DlgAdmin(this,false);
        admin.tampil();
        admin.emptTeks();
        admin.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        admin.setLocationRelativeTo(PanelUtama);
        admin.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgUser user=new DlgUser(this,false);
        user.emptTeks();
        user.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        user.setLocationRelativeTo(PanelUtama);
        user.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRunTeks runteks=new DlgRunTeks(this,false);
        runteks.emptTeks();
        runteks.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        runteks.setLocationRelativeTo(PanelUtama);
        runteks.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnSetupHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupHargaActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetHarga setharga=new DlgSetHarga(this,false);
        setharga.emptTeks();
        setharga.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        setharga.setLocationRelativeTo(PanelUtama);
        setharga.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupHargaActionPerformed

    private void btnSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuplierActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSuplier suplier=new DlgSuplier(this,false);
        suplier.isCek();
        suplier.emptTeks();
        suplier.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        suplier.setLocationRelativeTo(PanelUtama);
        suplier.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSuplierActionPerformed

    private void btnJnsBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJnsBarangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.billing.dlgobt.barang.jenis.jenis.isCek();
        kasirralan.billing.dlgobt.barang.jenis.jenis.emptTeks();
        kasirralan.billing.dlgobt.barang.jenis.jenis.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.billing.dlgobt.barang.jenis.jenis.setLocationRelativeTo(PanelUtama);
        kasirralan.billing.dlgobt.barang.jenis.jenis.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJnsBarangActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgKonversi konversi=new DlgKonversi(this,false);
        konversi.isCek();
        konversi.emptTeks();
        konversi.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        konversi.setLocationRelativeTo(PanelUtama);
        konversi.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuanActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.billing.dlgobt.barang.satuan.satuan.isCek();
        kasirralan.billing.dlgobt.barang.satuan.satuan.emptTeks();
        kasirralan.billing.dlgobt.barang.satuan.satuan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.billing.dlgobt.barang.satuan.satuan.setLocationRelativeTo(PanelUtama);
        kasirralan.billing.dlgobt.barang.satuan.satuan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSatuanActionPerformed

    private void btnCashFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashFlowActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgCashflow bubes=new DlgCashflow(this,false);
        bubes.isCek();
        bubes.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        bubes.setLocationRelativeTo(PanelUtama);
        bubes.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCashFlowActionPerformed

    private void btnBubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBubesActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBubes bubes=new DlgBubes(this,false);
        bubes.isCek();
        bubes.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        bubes.setLocationRelativeTo(PanelUtama);
        bubes.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBubesActionPerformed

    private void btnPostingJurnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostingJurnalActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJurnal jurnal=new DlgJurnal(this,false);
        jurnal.tampil();
        jurnal.isCek();
        jurnal.emptTeks();
        jurnal.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jurnal.setLocationRelativeTo(PanelUtama);
        jurnal.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPostingJurnalActionPerformed

    private void btnRekeningTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekeningTahunActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRekeningTahun rekeningtahun=new DlgRekeningTahun(this,false);
        rekeningtahun.tampil();
        rekeningtahun.isCek();
        rekeningtahun.emptTeks();
        rekeningtahun.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rekeningtahun.setLocationRelativeTo(PanelUtama);
        rekeningtahun.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekeningTahunActionPerformed

    private void btnRekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekeningActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRekening rekening=new DlgRekening(this,false);
        rekening.tampil();
        rekening.isCek();
        rekening.emptTeks();
        rekening.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rekening.setLocationRelativeTo(PanelUtama);
        rekening.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekeningActionPerformed

    private void btnPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembelianActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembelian pembelian=new DlgPembelian(this,false);
        pembelian.isCek();
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPembelianActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPenjualan penjualan=new DlgPenjualan(this,false);
        penjualan.isCek();
        penjualan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        penjualan.setLocationRelativeTo(PanelUtama);
        penjualan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiutangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPiutang piutang=new DlgPiutang(this,false);
        piutang.emptTeks();
        piutang.isCek();
        piutang.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        piutang.setLocationRelativeTo(PanelUtama);
        piutang.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPiutangActionPerformed

    private void btnBayarPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarPiutangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBayarPiutang bayarpiutang=new DlgBayarPiutang(this,false);
        bayarpiutang.tampil();
        bayarpiutang.emptTeks();
        bayarpiutang.isCek();
        bayarpiutang.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        bayarpiutang.setLocationRelativeTo(PanelUtama);
        bayarpiutang.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBayarPiutangActionPerformed

    private void btnOpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpnameActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgInputStok opname=new DlgInputStok(this,false);
        opname.tampil();
        opname.isCek();
        opname.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        opname.setLocationRelativeTo(PanelUtama);
        opname.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnOpnameActionPerformed

    private void btnReturBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturBeliActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgReturBeli returbeli=new DlgReturBeli(this,false);
        returbeli.isCek();
        returbeli.emptTeks();
        returbeli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        returbeli.setLocationRelativeTo(PanelUtama);
        returbeli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnReturBeliActionPerformed

    private void btnReturJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturJualActionPerformed
        var.setform("DlgReturJual");
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgReturJual returjual=new DlgReturJual(this,false);
        returjual.emptTeks();
        returjual.isCek();
        returjual.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        returjual.setLocationRelativeTo(PanelUtama);
        returjual.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnReturJualActionPerformed

    private void btnSirkulasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSirkulasiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSirkulasiBarang sirkulasi=new DlgSirkulasiBarang(this,false);
        sirkulasi.isCek();
        sirkulasi.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        sirkulasi.setLocationRelativeTo(PanelUtama);
        sirkulasi.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSirkulasiActionPerformed

    private void btnKeuntunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeuntunganActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgProyeksiJual projul=new DlgProyeksiJual(this,false);
        projul.isCek();
        projul.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        projul.setLocationRelativeTo(PanelUtama);
        projul.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKeuntunganActionPerformed

    private void btnLabaRugiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabaRugiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgLabaRugi labrug=new DlgLabaRugi(this,false);
        labrug.isCek();
        labrug.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        labrug.setLocationRelativeTo(PanelUtama);
        labrug.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLabaRugiActionPerformed

    private void btnReturPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturPiutangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgReturPiutang returpiutang=new DlgReturPiutang(this,false);
        returpiutang.isCek();
        returpiutang.emptTeks();
        returpiutang.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        returpiutang.setLocationRelativeTo(PanelUtama);
        returpiutang.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnReturPiutangActionPerformed

    private void btnAnalisaKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisaKamarActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        InformasiAnalisaKamin analisakamin=new InformasiAnalisaKamin(this,false);
        analisakamin.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        analisakamin.setLocationRelativeTo(PanelUtama);
        analisakamin.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAnalisaKamarActionPerformed

    private void btnRHDOkterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHDOkterActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHJmDokter rhtindakandokter=new DlgRHJmDokter(this,false);
        rhtindakandokter.isCek();
        rhtindakandokter.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhtindakandokter.setLocationRelativeTo(PanelUtama);
        rhtindakandokter.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHDOkterActionPerformed

    private void btnRBDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBDokterActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBJmDokter rbtindakandokter=new DlgRBJmDokter(this,false);
        rbtindakandokter.isCek();
        rbtindakandokter.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbtindakandokter.setLocationRelativeTo(PanelUtama);
        rbtindakandokter.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBDokterActionPerformed

    private void btnTagihanMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanMasukActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgLhtBiaya billing=new DlgLhtBiaya(this,false);
        billing.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        billing.setLocationRelativeTo(PanelUtama);
        billing.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanMasukActionPerformed

    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgResumePerawatan resume=new DlgResumePerawatan(this,false);
        resume.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        resume.setLocationRelativeTo(PanelUtama);
        resume.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnResumeActionPerformed

    private void btnDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPemberianDiet diet=new DlgPemberianDiet(this,false);
        diet.tampil();
        diet.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        diet.setLocationRelativeTo(PanelUtama);
        diet.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDietActionPerformed

    private void btnRHParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHParamedisActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHJmParamedis rhtindakanparamedis=new DlgRHJmParamedis(this,false);
        rhtindakanparamedis.isCek();
        rhtindakanparamedis.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhtindakanparamedis.setLocationRelativeTo(PanelUtama);
        rhtindakanparamedis.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHParamedisActionPerformed

    private void btnRBParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBParamedisActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBJmParamedis rbtindakanparamedis=new DlgRBJmParamedis(this,false);
        rbtindakanparamedis.isCek();
        rbtindakanparamedis.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbtindakanparamedis.setLocationRelativeTo(PanelUtama);
        rbtindakanparamedis.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBParamedisActionPerformed

    private void btnKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKasirActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.isCek();
        //kasirralan.tampilkasir();
        kasirralan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.setLocationRelativeTo(PanelUtama);
        kasirralan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKasirActionPerformed

    private void btnLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLahirActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgIKBBayi lahir=new DlgIKBBayi(this,false);
        lahir.tampil();
        lahir.isCek();
        lahir.emptTeks();
        lahir.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        lahir.setLocationRelativeTo(PanelUtama);
        lahir.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLahirActionPerformed

    private void btnSetBiayaHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBiayaHarianActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBiayaHarian biayaharian=new DlgBiayaHarian(this,false);
        biayaharian.emptTeks();
        biayaharian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        biayaharian.setLocationRelativeTo(PanelUtama);
        biayaharian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetBiayaHarianActionPerformed

    private void btnLihatPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatPiutangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgLhtPiutang billing=new DlgLhtPiutang(this,false);
        billing.tampil();
        billing.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        billing.setLocationRelativeTo(PanelUtama);
        billing.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLihatPiutangActionPerformed

    private void btnLaboratoriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratoriumActionPerformed

        isTutup();
        DlgCariPeriksaLab produsen=new DlgCariPeriksaLab(this,false);
        //produsen.emptTeks();
        produsen.isCek();
        produsen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        produsen.setLocationRelativeTo(PanelUtama);
        produsen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnLaboratoriumActionPerformed

    private void btnRalanMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRalanMasukActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembayaranRalan billing=new DlgPembayaranRalan(this,false);
        billing.tampil();
        billing.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        billing.setLocationRelativeTo(PanelUtama);
        billing.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRalanMasukActionPerformed

    private void btnSetupAplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupAplikasiActionPerformed

        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetAplikasi aplikasi=new DlgSetAplikasi(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);

        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupAplikasiActionPerformed

    private void btnSetOtoRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetOtoRalanActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetOtoRalan aplikasi=new DlgSetOtoRalan(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetOtoRalanActionPerformed

    private void btnRanapMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRanapMasukActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembayaranRanap billing=new DlgPembayaranRanap(this,false);
        billing.tampil();
        billing.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        billing.setLocationRelativeTo(PanelUtama);
        billing.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRanapMasukActionPerformed

    private void btnSetBiayaMasukSekaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBiayaMasukSekaliActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBiayaSekaliMasuk biayaharian=new DlgBiayaSekaliMasuk(this,false);
        biayaharian.emptTeks();
        biayaharian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        biayaharian.setLocationRelativeTo(PanelUtama);
        biayaharian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetBiayaMasukSekaliActionPerformed

    private void btnPaketOperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketOperasiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJnsPerawatanOperasi produsen=new DlgJnsPerawatanOperasi(this,false);
        produsen.emptTeks();
        produsen.isCek();
        produsen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        produsen.setLocationRelativeTo(PanelUtama);
        produsen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPaketOperasiActionPerformed

    private void btnTagihanOperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanOperasiActionPerformed

        isTutup();
        DlgCariTagihanOperasi produsen=new DlgCariTagihanOperasi(this,false);
        //produsen.emptTeks();
        produsen.isCek();
        produsen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        produsen.setLocationRelativeTo(PanelUtama);
        produsen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanOperasiActionPerformed

    private void BtnJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJadwalActionPerformed

        isTutup();
        DlgJadwal jadwal=new DlgJadwal(this,false);
        jadwal.emptTeks();
        jadwal.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jadwal.setLocationRelativeTo(PanelUtama);
        jadwal.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_BtnJadwalActionPerformed

    private void btnSetupOtoLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupOtoLokasiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetOtoLokasi ktginventaris=new DlgSetOtoLokasi(this,false);
        ktginventaris.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        ktginventaris.setLocationRelativeTo(PanelUtama);
        ktginventaris.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupOtoLokasiActionPerformed

    private void btnTagihanPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanPoliActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBTindakanPoli rbpoli=new DlgRBTindakanPoli(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanPoliActionPerformed

    private void btnRujukMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRujukMasukActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRujukMasuk rujukmasuk=new DlgRujukMasuk(null,false);
        rujukmasuk.tampil();
        rujukmasuk.emptTeks();
        rujukmasuk.isCek();
        rujukmasuk.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rujukmasuk.setLocationRelativeTo(PanelUtama);
        rujukmasuk.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRujukMasukActionPerformed

    private void btnTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackerActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPenelusuranLogin rbpoli=new DlgPenelusuranLogin(this,false);
        rbpoli.isCek();
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTrackerActionPerformed

    private void btnTindakanRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTindakanRanapActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        kasirralan.kamarinap.billing.rawatinap.perawatan.perawatan.emptTeks();
        kasirralan.kamarinap.billing.rawatinap.perawatan.perawatan.isCek();
        kasirralan.kamarinap.billing.rawatinap.perawatan.perawatan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        kasirralan.kamarinap.billing.rawatinap.perawatan.perawatan.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.billing.rawatinap.perawatan.perawatan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTindakanRanapActionPerformed

    private void btnSetupJamInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupJamInapActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetKamarInap form=new DlgSetKamarInap(this,false);
        form.tampil();
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupJamInapActionPerformed

    private void btnStokObatPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStokObatPasienActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgStokPasien opname=new DlgStokPasien(this,false);
        opname.isCek();
        opname.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        opname.setLocationRelativeTo(PanelUtama);
        opname.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnStokObatPasienActionPerformed

    private void btnTarifLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifLabActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJnsPerawatanLab tariflab=new DlgJnsPerawatanLab(this,false);
        tariflab.emptTeks();
        tariflab.isCek();
        tariflab.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        tariflab.setLocationRelativeTo(PanelUtama);
        tariflab.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTarifLabActionPerformed

    private void btnSetPenjabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPenjabActionPerformed

        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetPenjabLab aplikasi=new DlgSetPenjabLab(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetPenjabActionPerformed

    private void btnTagihanObatPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanObatPoliActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatPoli rbpoli=new DlgRBObatPoli(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanObatPoliActionPerformed

    private void btnTagihanObatBangsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanObatBangsalActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatBangsal rbobatbangsal=new DlgRBObatBangsal(this,false);
        rbobatbangsal.isCek();
        rbobatbangsal.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbobatbangsal.setLocationRelativeTo(PanelUtama);
        rbobatbangsal.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanObatBangsalActionPerformed

    private void btnReturPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturPasienActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgReturObatPasien returpasien=new DlgReturObatPasien(this,false);
        returpasien.isCek();
        returpasien.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        returpasien.setLocationRelativeTo(PanelUtama);
        returpasien.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnReturPasienActionPerformed

    private void btnKeuntunganObatRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeuntunganObatRanapActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgProyeksiBeriObat projul=new DlgProyeksiBeriObat(this,false);
        projul.isCek();
        projul.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        projul.setLocationRelativeTo(PanelUtama);
        projul.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKeuntunganObatRanapActionPerformed

    private void btnPenggajianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenggajianActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if(var.getpegawai_admin()==true){
                penggajian.loadURL("http://" +prop.getProperty("HOST")+"/"+prop.getProperty("HYBRIDWEB")+"/"+"penggajian/login.php?act=login&usere=admin&passwordte=akusayangsamakamu");
            }else if(var.getpegawai_user()==true){
                penggajian.loadURL("http://" +prop.getProperty("HOST")+"/"+prop.getProperty("HYBRIDWEB")+"/"+"penggajian/login.php?act=login&usere=paijo&passwordte=mumet");
            }
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }

        penggajian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        penggajian.setLocationRelativeTo(PanelUtama);
        penggajian.setVisible(true);


        /*try {
            if(var.getpegawai_admin()==true){
                Valid.panggilUrl("penggajian/login.php?act=login&usere=admin&passwordte=akusayangsamakamu");
            }else if(var.getpegawai_user()==true){
                Valid.panggilUrl("penggajian/login.php?act=login&usere=paijo&passwordte=mumet");
            }
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }  */


        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPenggajianActionPerformed

    private void btnRekapPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapPresensiActionPerformed
        
    }//GEN-LAST:event_btnRekapPresensiActionPerformed

    private void btnRekapHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapHarianActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        isTutup();
        DlgHarian harian=new DlgHarian(this,false);
        harian.tampil();
        harian.isCek();
        harian.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        harian.setLocationRelativeTo(PanelUtama);
        harian.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekapHarianActionPerformed

    private void btnRekapBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapBulananActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        isTutup();
        DlgBulanan bulanan=new DlgBulanan(this,false);
        bulanan.isCek();
        bulanan.tampil();
        bulanan.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        bulanan.setLocationRelativeTo(PanelUtama);
        bulanan.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekapBulananActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDeposit deposit=new DlgDeposit(this,false);
        deposit.tampil();
        deposit.isCek();
        deposit.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        deposit.setLocationRelativeTo(PanelUtama);
        deposit.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnSetupRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupRMActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetRM aplikasi=new DlgSetRM(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupRMActionPerformed

    private void btnResepPulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResepPulangActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgResepPulang reseppulang=new DlgResepPulang(this,false);
        reseppulang.tampil();
        reseppulang.isCek();
        reseppulang.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        reseppulang.setLocationRelativeTo(PanelUtama);
        reseppulang.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnResepPulangActionPerformed

    private void btnSetupTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupTarifActionPerformed

        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetTarif aplikasi=new DlgSetTarif(this,false);
        aplikasi.emptTeks();
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupTarifActionPerformed

    private void btnToolLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToolLabActionPerformed
        isTutup();
        FlayMenu.removeAll();        
        FlayMenu.add(btnPermintaanLab);
        FlayMenu.add(btnLaboratorium);
        //if((var.getpermintaan_lab()==true)||(var.getperiksa_lab()==true)){
            btnPermintaanLab.setEnabled(true);
        //}else{
        //    btnPermintaanLab.setEnabled(var.getpermintaan_lab());
        //}
        btnLaboratorium.setEnabled(var.getperiksa_lab());
        FlayMenu.setVisible(true); 
    }//GEN-LAST:event_btnToolLabActionPerformed

    private void btnBarangIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangIpsrsActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBarangIPSRS ipsrs=new DlgBarangIPSRS(this,false);
        ipsrs.emptTeks();
        ipsrs.onCari();
        ipsrs.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        ipsrs.setLocationRelativeTo(PanelUtama);
        ipsrs.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBarangIpsrsActionPerformed

    private void btnPembelianIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembelianIpsrsActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembelianIPSRS pembelian=new DlgPembelianIPSRS(this,false);
        pembelian.isCek();
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPembelianIpsrsActionPerformed

    private void btnPengeluaranIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengeluaranIpsrsActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPengeluaranIPSRS pengeluaran=new DlgPengeluaranIPSRS(this,false);
        pengeluaran.isCek();
        pengeluaran.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pengeluaran.setLocationRelativeTo(PanelUtama);
        pengeluaran.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPengeluaranIpsrsActionPerformed

    private void btnRHMasukIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHMasukIpsrsActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHPembelianIPSRS rhipsrs=new DlgRHPembelianIPSRS(this,false);
        rhipsrs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhipsrs.setLocationRelativeTo(PanelUtama);
        rhipsrs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHMasukIpsrsActionPerformed

    private void btnRHKeluarIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHKeluarIpsrsActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHPengeluaranIPSRS rhkeluaripsrs=new DlgRHPengeluaranIPSRS(this,false);
        rhkeluaripsrs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhkeluaripsrs.setLocationRelativeTo(PanelUtama);
        rhkeluaripsrs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHKeluarIpsrsActionPerformed

    private void btnRBiayaIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBiayaIpsrsActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBiayaHarianIPSRS rhkeluaripsrs=new DlgRBiayaHarianIPSRS(this,false);
        rhkeluaripsrs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhkeluaripsrs.setLocationRelativeTo(PanelUtama);
        rhkeluaripsrs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBiayaIpsrsActionPerformed

    private void btnTarifRadiologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifRadiologiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJnsPerawatanRadiologi tarifrad=new DlgJnsPerawatanRadiologi(this,false);
        tarifrad.emptTeks();
        tarifrad.isCek();
        tarifrad.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        tarifrad.setLocationRelativeTo(PanelUtama);
        tarifrad.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTarifRadiologiActionPerformed

    private void btnPeriksaRadiologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriksaRadiologiActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgCariPeriksaRadiologi produsen=new DlgCariPeriksaRadiologi(this,false);
        //produsen.emptTeks();
        produsen.isCek();
        produsen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        produsen.setLocationRelativeTo(PanelUtama);
        produsen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPeriksaRadiologiActionPerformed

    private void btnToolIGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToolIGDActionPerformed
        btnIGDActionPerformed(evt);
    }//GEN-LAST:event_btnToolIGDActionPerformed

    private void btnTagihanRalanPerhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanRalanPerhariActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembayaranRalanPerHari rhkeluaripsrs=new DlgPembayaranRalanPerHari(this,false);
        rhkeluaripsrs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhkeluaripsrs.setLocationRelativeTo(PanelUtama);
        rhkeluaripsrs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanRalanPerhariActionPerformed

    private void btnTagihanRanapPerhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanRanapPerhariActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPembyaranRanapPerhari rhkeluaripsrs=new DlgPembyaranRanapPerhari(this,false);
        rhkeluaripsrs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhkeluaripsrs.setLocationRelativeTo(PanelUtama);
        rhkeluaripsrs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanRanapPerhariActionPerformed

    private void btnSetupEmbalaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupEmbalaseActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetEmbalase ktginventaris=new DlgSetEmbalase(this,false);
        ktginventaris.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        ktginventaris.setLocationRelativeTo(PanelUtama);
        ktginventaris.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupEmbalaseActionPerformed

    private void btnObatPasienRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatPasienRalanActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatDokterRalan rbpoli=new DlgRBObatDokterRalan(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatPasienRalanActionPerformed

    private void btnObatPasienRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatPasienRanapActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatDokterRanap rbpoli=new DlgRBObatDokterRanap(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatPasienRanapActionPerformed

    private void btnPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemesananActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPemesanan pembelian=new DlgPemesanan(this,false);
        pembelian.isCek();
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPemesananActionPerformed

    private void btnPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengeluaranActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPengeluaranHarian pembelian=new DlgPengeluaranHarian(this,false);
        pembelian.emptTeks();
        pembelian.isCek();
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPengeluaranActionPerformed

    private void btnTambahanBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahanBiayaActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDetailTambahan pembelian=new DlgDetailTambahan(this,false);
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTambahanBiayaActionPerformed

    private void btnPotonganBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotonganBiayaActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDetailPotongan pembelian=new DlgDetailPotongan(this,false);
        pembelian.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pembelian.setLocationRelativeTo(PanelUtama);
        pembelian.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPotonganBiayaActionPerformed

    private void btnJMDetailDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJMDetailDokterActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDetailJMDokter rhtindakandokter=new DlgDetailJMDokter(this,false);
        rhtindakandokter.isCek();
        rhtindakandokter.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhtindakandokter.setLocationRelativeTo(PanelUtama);
        rhtindakandokter.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJMDetailDokterActionPerformed

    private void btnIGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIGDActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgIGD igd=new DlgIGD(this,false);
        //igd.tampil();
        igd.emptTeks();
        igd.isCek();
        igd.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        igd.setLocationRelativeTo(PanelUtama);
        igd.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnIGDActionPerformed

    private void btnToolRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToolRadActionPerformed
        //btnPeriksaRadiologiActionPerformed(evt);
        isTutup();
        FlayMenu.removeAll();        
        FlayMenu.add(btnPermintaanRadiologi);
        FlayMenu.add(btnPeriksaRadiologi);
        //if((var.getpermintaan_radiologi()==true)||(var.getperiksa_radiologi()==true)){
            btnPermintaanRadiologi.setEnabled(true);
        //}else{
        //    btnPermintaanRadiologi.setEnabled(var.getpermintaan_radiologi());
        //}
        btnPeriksaRadiologi.setEnabled(var.getperiksa_radiologi());
        FlayMenu.setVisible(true); 
        
    }//GEN-LAST:event_btnToolRadActionPerformed

    private void btnSetObatRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetObatRalanActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetHargaObatRalan aplikasi=new DlgSetHargaObatRalan(this,false);
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetObatRalanActionPerformed

    private void btnSetObatRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetObatRanapActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetHargaObatRanap aplikasi=new DlgSetHargaObatRanap(this,false);
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetObatRanapActionPerformed

    private void btnDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosaActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //kasirralan.kamarinap.diagnosa.tampil();
        kasirralan.kamarinap.diagnosa.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        kasirralan.kamarinap.diagnosa.setLocationRelativeTo(PanelUtama);
        kasirralan.kamarinap.diagnosa.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDiagnosaActionPerformed

    private void btnKunjunganRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKunjunganRalanActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgKunjunganRalan aplikasi=new DlgKunjunganRalan(this,false);
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKunjunganRalanActionPerformed

    private void btnTagihanDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTagihanDokterActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBTindakanDokter rbpoli=new DlgRBTindakanDokter(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTagihanDokterActionPerformed

    private void btnSidikJariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSidikJariActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgSidikJari sidikjari=new DlgSidikJari(this,false);
        sidikjari.tampil();
        sidikjari.isCek();
        sidikjari.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        sidikjari.setLocationRelativeTo(PanelUtama);
        sidikjari.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSidikJariActionPerformed

    private void btnJamPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJamPresensiActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgJamMasuk jammasuk=new DlgJamMasuk(this,false);
        jammasuk.isCek();
        jammasuk.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jammasuk.setLocationRelativeTo(PanelUtama);
        jammasuk.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJamPresensiActionPerformed

    private void btnJadwalPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalPegawaiActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgJadwalPegawai jadwal=new DlgJadwalPegawai(this,false);
        jadwal.isCek();
        jadwal.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jadwal.setLocationRelativeTo(PanelUtama);
        jadwal.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJadwalPegawaiActionPerformed

    private void btnSetupNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetupNotaActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetNota aplikasi=new DlgSetNota(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetupNotaActionPerformed

    private void BtnDpjpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDpjpActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDpjp aplikasi=new DlgDpjp(this,false);
        aplikasi.isCek();
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_BtnDpjpActionPerformed

    private void btnMutasiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutasiBarangActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgMutasiBarang aplikasi=new DlgMutasiBarang(this,false);
        aplikasi.isCek();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnMutasiBarangActionPerformed

    private void MnInfoKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnInfoKamarActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgHome.dispose();
        analisakamin.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        analisakamin.setLocationRelativeTo(PanelUtama);
        analisakamin.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_MnInfoKamarActionPerformed

    private void btnfee_visit_dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfee_visit_dokterActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgFeeVisitDokter feevisitdokter=new DlgFeeVisitDokter(this,false);
        feevisitdokter.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        feevisitdokter.setLocationRelativeTo(PanelUtama);
        feevisitdokter.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnfee_visit_dokterActionPerformed

    private void btnfee_bacaan_ekgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfee_bacaan_ekgActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgFeeBacaanEKG feebacaanekg=new DlgFeeBacaanEKG(this,false);
        feebacaanekg.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        feebacaanekg.setLocationRelativeTo(PanelUtama);
        feebacaanekg.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnfee_bacaan_ekgActionPerformed

    private void btnfee_rujukan_rontgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfee_rujukan_rontgenActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgFeeRujukanRontgen feerujukanrontgen=new DlgFeeRujukanRontgen(this,false);
        feerujukanrontgen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        feerujukanrontgen.setLocationRelativeTo(PanelUtama);
        feerujukanrontgen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnfee_rujukan_rontgenActionPerformed

    private void btnfee_rujukan_ranapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfee_rujukan_ranapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfee_rujukan_ranapActionPerformed

    private void btnfee_ralanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfee_ralanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgFeePeriksaRalan feeperiksaralan=new DlgFeePeriksaRalan(this,false);
        feeperiksaralan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        feeperiksaralan.setLocationRelativeTo(PanelUtama);
        feeperiksaralan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnfee_ralanActionPerformed

    private void btnakun_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnakun_bayarActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgAkunBayar feeperiksaralan=new DlgAkunBayar(this,false);
        feeperiksaralan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        feeperiksaralan.setLocationRelativeTo(PanelUtama);
        feeperiksaralan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnakun_bayarActionPerformed

    private void btnbayar_pemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayar_pemesananActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBayarPemesanan bayarpesan=new DlgBayarPemesanan(this,false);
        bayarpesan.tampil();
        bayarpesan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        bayarpesan.setLocationRelativeTo(PanelUtama);
        bayarpesan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnbayar_pemesananActionPerformed

    private void btnObatPasienPeresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatPasienPeresepActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatDokterPeresep rbpoli=new DlgRBObatDokterPeresep(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatPasienPeresepActionPerformed

    private void btnJenisIpsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJenisIpsrsActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJenisIPSRS aplikasi=new DlgJenisIPSRS(this,false);
        aplikasi.isCek();
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJenisIpsrsActionPerformed

    private void btnPemasukanLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasukanLainActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPemasukanLain aplikasi=new DlgPemasukanLain(this,false);
        aplikasi.isCek();
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPemasukanLainActionPerformed

    private void btnPengaturanRekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengaturanRekeningActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPengaturanRekening aplikasi=new DlgPengaturanRekening(this,false);
        aplikasi.isCek();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPengaturanRekeningActionPerformed

    private void btnJadwalTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalTambahanActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgJadwalTambahan jadwal=new DlgJadwalTambahan(this,false);
        jadwal.isCek();
        jadwal.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jadwal.setLocationRelativeTo(PanelUtama);
        jadwal.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJadwalTambahanActionPerformed

    private void btnClosingKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosingKasirActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgClosingKasir ckas=new DlgClosingKasir(this,false);
        ckas.isCek();
        ckas.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        ckas.setLocationRelativeTo(PanelUtama);
        ckas.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnClosingKasirActionPerformed

    private void btnKeterlambatanPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeterlambatanPresensiActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetKeterlambatan keterlambatan=new DlgSetKeterlambatan(this,false);
        keterlambatan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        keterlambatan.setLocationRelativeTo(PanelUtama);
        keterlambatan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKeterlambatanPresensiActionPerformed

    private void btnSetHargaKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetHargaKamarActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSetHargaKamar hargakamar=new DlgSetHargaKamar(this,false);
        hargakamar.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        hargakamar.setLocationRelativeTo(PanelUtama);
        hargakamar.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSetHargaKamarActionPerformed

    private void btnRekapPershiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapPershiftActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRekapPerShift aplikasi=new DlgRekapPerShift(this,false);
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekapPershiftActionPerformed

    private void btnCekBPJSNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSNikActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekNIK2 form=new BPJSCekNIK2(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSNikActionPerformed

    private void btnCekBPJSKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSKartuActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekKartu form=new BPJSCekKartu(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSKartuActionPerformed

    private void btnCekBPJSRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSRiwayatActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekRiwayatRujukanPCare form=new BPJSCekRiwayatRujukanPCare(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSRiwayatActionPerformed

    private void btnRekapPresensi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapPresensi2ActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        isTutup();
        DlgKehadiran2 hadir=new DlgKehadiran2(this,false);
        hadir.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        hadir.setLocationRelativeTo(PanelUtama);
        hadir.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRekapPresensi2ActionPerformed

    private void btnObatPerCaraBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatPerCaraBayarActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBObatPercaraBayar rbpoli=new DlgRBObatPercaraBayar(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnObatPerCaraBayarActionPerformed

    private void btnKunjunganRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKunjunganRanapActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgKunjunganRanap aplikasi=new DlgKunjunganRanap(this,false);
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKunjunganRanapActionPerformed

    private void btnPaymentPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentPointActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPaymentPoint aplikasi=new DlgPaymentPoint(this,false);
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPaymentPointActionPerformed

    private void btnCekBPJSNomorRujukanPCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSNomorRujukanPCareActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekNoRujukanPCare form=new BPJSCekNoRujukanPCare(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSNomorRujukanPCareActionPerformed

    private void btnICD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICD9ActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgICD9 aplikasi=new DlgICD9(this,false);
        aplikasi.emptTeks();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnICD9ActionPerformed

    private void btnDaruratStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaruratStokActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDaruratStok aplikasi=new DlgDaruratStok(this,false);
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDaruratStokActionPerformed

    private void btnRetensiRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetensiRMActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            retensi.loadURL("http://" +prop.getProperty("HOST")+"/"+prop.getProperty("HYBRIDWEB")+"/"+"medrec/login.php?act=login&usere=admin&passwordte=akusayangsamakamu");
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }

        retensi.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        retensi.setLocationRelativeTo(PanelUtama);
        retensi.setVisible(true);


        /*try {
            Valid.panggilUrl("medrec/login.php?act=login&usere=admin&passwordte=akusayangsamakamu");
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }  */

        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRetensiRMActionPerformed

    private void btnTemporaryPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemporaryPresensiActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgTemporaryPresensi temporary=new DlgTemporaryPresensi(this,false);
        temporary.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        temporary.setLocationRelativeTo(PanelUtama);
        temporary.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTemporaryPresensiActionPerformed

    private void btnJurnalHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurnalHarianActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgJurnalHarian jh=new DlgJurnalHarian(this,false);
        jh.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        jh.setLocationRelativeTo(PanelUtama);
        jh.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnJurnalHarianActionPerformed

    private void btnSirkulasi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSirkulasi2ActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSirkulasiBarang2 sirkulasi=new DlgSirkulasiBarang2(this,false);
        sirkulasi.isCek();
        sirkulasi.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        sirkulasi.setLocationRelativeTo(PanelUtama);
        sirkulasi.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSirkulasi2ActionPerformed

    private void btnCekBPJSDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSDiagnosaActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekReferensiPenyakit form=new BPJSCekReferensiPenyakit(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSDiagnosaActionPerformed

    private void btnCekBPJSPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSPoliActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekReferensiPoli form=new BPJSCekReferensiPoli(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSPoliActionPerformed

    private void btnIndustriFarmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndustriFarmasiActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgIndustriFarmasi suplier=new DlgIndustriFarmasi(this,false);
        suplier.isCek();
        suplier.emptTeks();
        suplier.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        suplier.setLocationRelativeTo(PanelUtama);
        suplier.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnIndustriFarmasiActionPerformed

    private void btnRHJasaSaranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHJasaSaranaActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHJS rhjs=new DlgRHJS(this,false);
        rhjs.isCek();
        rhjs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhjs.setLocationRelativeTo(PanelUtama);
        rhjs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHJasaSaranaActionPerformed

    private void btnRBJasaSaranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBJasaSaranaActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBJS rbjs=new DlgRBJS(this,false);
        rbjs.isCek();
        rbjs.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbjs.setLocationRelativeTo(PanelUtama);
        rbjs.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBJasaSaranaActionPerformed

    private void btnRHPaketBHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHPaketBHPActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHPaketBHP rhpaketbhp=new DlgRHPaketBHP(this,false);
        rhpaketbhp.isCek();
        rhpaketbhp.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhpaketbhp.setLocationRelativeTo(PanelUtama);
        rhpaketbhp.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHPaketBHPActionPerformed

    private void btnRBPaketBHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBPaketBHPActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBPaketBHP rbpaketbhp=new DlgRBPaketBHP(this,false);
        rbpaketbhp.isCek();
        rbpaketbhp.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpaketbhp.setLocationRelativeTo(PanelUtama);
        rbpaketbhp.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBPaketBHPActionPerformed

    private void btnPiutangBelumLunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiutangBelumLunasActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPiutangBelumLunas rbpaketbhp=new DlgPiutangBelumLunas(this,false);
        rbpaketbhp.tampil();
        rbpaketbhp.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpaketbhp.setLocationRelativeTo(PanelUtama);
        rbpaketbhp.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPiutangBelumLunasActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        Window[] wins = Window.getWindows();
        for (Window win : wins) {
            if (win instanceof JDialog) {
                DlgHome.setSize(PanelUtama.getWidth()-45, PanelUtama.getHeight()-45);
                Panelmenu.repaint();
                DlgHome.setLocationRelativeTo(PanelUtama);
            }
        }
    }//GEN-LAST:event_formComponentResized

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        Window[] wins = Window.getWindows();
        for (Window win : wins) {
            if (win instanceof JDialog) {
                win.setLocationRelativeTo(PanelUtama);
                win.toFront();
            }
        }

        setToolbar();
    }//GEN-LAST:event_formComponentMoved

    private void BtnToolJualObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToolJualObatActionPerformed
        isTutup();
        FlayMenu.removeAll();
        FlayMenu.add(btnInputPenjualan);
        FlayMenu.add(btnDataPenjualan);
        FlayMenu.add(btnDaftarPermintaanResep);
        FlayMenu.add(btnResepObatDepan);        
        btnInputPenjualan.setEnabled(var.getpenjualan_obat());
        btnDataPenjualan.setEnabled(var.getpenjualan_obat());
        FlayMenu.setVisible(true);
    }//GEN-LAST:event_BtnToolJualObatActionPerformed

    private void PanelWallMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelWallMouseMoved
        setToolbar();
        Window[] wins = Window.getWindows();
        for (Window win : wins) {
            if (win instanceof JDialog) {
                win.setLocationRelativeTo(PanelUtama);
                win.toFront();
            }
        }

    }//GEN-LAST:event_PanelWallMouseMoved

    private void btnCekBPJSFaskesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBPJSFaskesActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSCekReferensiFaskes form=new BPJSCekReferensiFaskes(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnCekBPJSFaskesActionPerformed

    private void btnBPJSSEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBPJSSEPActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSDataSEP form=new BPJSDataSEP(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBPJSSEPActionPerformed

    private void btnSuplierIPSRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuplierIPSRSActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSuplierIPSRS suplier=new DlgSuplierIPSRS(this,false);
        suplier.isCek();
        suplier.emptTeks();
        suplier.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        suplier.setLocationRelativeTo(PanelUtama);
        suplier.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSuplierIPSRSActionPerformed

    private void btnMonitoringKlaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitoringKlaimActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        BPJSMonitoringKlaim form=new BPJSMonitoringKlaim(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnMonitoringKlaimActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setToolbar();
    }//GEN-LAST:event_formWindowOpened

    private void btnHarianKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarianKamarActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBTindakanKamar rbpoli=new DlgRBTindakanKamar(this,false);
        rbpoli.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbpoli.setLocationRelativeTo(PanelUtama);
        rbpoli.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnHarianKamarActionPerformed

    private void btnRincianPiutangPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRincianPiutangPasienActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRincianPiutangPasien billing=new DlgRincianPiutangPasien(this,false);
        billing.tampil();
        billing.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        billing.setLocationRelativeTo(PanelUtama);
        billing.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRincianPiutangPasienActionPerformed

    private void btnKeuntunganObat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeuntunganObat2ActionPerformed

        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgProyeksiBeriObat2 projul=new DlgProyeksiBeriObat2(this,false);
        projul.isCek();
        projul.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        projul.setLocationRelativeTo(PanelUtama);
        projul.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnKeuntunganObat2ActionPerformed

    private void btnHutangObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHutangObatActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgHutangObatBelumLunas form=new DlgHutangObatBelumLunas(this,false);
        form.tampil();
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnHutangObatActionPerformed

    private void btnRiwayatBarangMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatBarangMedisActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRiwayatBarangMedis sirkulasi=new DlgRiwayatBarangMedis(this,false);
        sirkulasi.isCek();
        sirkulasi.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        sirkulasi.setLocationRelativeTo(PanelUtama);
        sirkulasi.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRiwayatBarangMedisActionPerformed

    private void btnInputPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputPenjualanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPenjualan penjualan=new DlgPenjualan(this,false);
        penjualan.isCek();
        penjualan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        penjualan.setLocationRelativeTo(PanelUtama);
        penjualan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnInputPenjualanActionPerformed

    private void btnDataPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPenjualanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgCariPenjualan penjualan=new DlgCariPenjualan(this,false);
        penjualan.emptTeks();
        penjualan.isCek();
        penjualan.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        penjualan.setLocationRelativeTo(PanelUtama);
        penjualan.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDataPenjualanActionPerformed

    private void btnSensusHarianPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensusHarianPoliActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgSensusHarianPoli aplikasi=new DlgSensusHarianPoli(this,false);
        aplikasi.tampil();
        aplikasi.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        aplikasi.setLocationRelativeTo(PanelUtama);
        aplikasi.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnSensusHarianPoliActionPerformed

    private void btnAplicareReferensiKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicareReferensiKamarActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        AplicareCekReferensiKamar form=new AplicareCekReferensiKamar(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAplicareReferensiKamarActionPerformed

    private void btnAplicareKetersediaanKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicareKetersediaanKamarActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        AplicareKetersediaanKamar form=new AplicareKetersediaanKamar(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAplicareKetersediaanKamarActionPerformed

    private void btnAkunPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkunPiutangActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgAkunPiutang form=new DlgAkunPiutang(this,false);
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnAkunPiutangActionPerformed

    private void btnRHKSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHKSOActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHKSO rhkso=new DlgRHKSO(this,false);
        rhkso.isCek();
        rhkso.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhkso.setLocationRelativeTo(PanelUtama);
        rhkso.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHKSOActionPerformed

    private void btnRBKSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBKSOActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBKSO rbkso=new DlgRBKSO(this,false);
        rbkso.isCek();
        rbkso.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbkso.setLocationRelativeTo(PanelUtama);
        rbkso.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBKSOActionPerformed

    private void btnRHMenejemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRHMenejemenActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRHMenejemen rhmenejemen=new DlgRHMenejemen(this,false);
        rhmenejemen.isCek();
        rhmenejemen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rhmenejemen.setLocationRelativeTo(PanelUtama);
        rhmenejemen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRHMenejemenActionPerformed

    private void btnRBMenejemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBMenejemenActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgRBMenejemen rbmenejemen=new DlgRBMenejemen(this,false);
        rbmenejemen.isCek();
        rbmenejemen.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        rbmenejemen.setLocationRelativeTo(PanelUtama);
        rbmenejemen.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnRBMenejemenActionPerformed

    private void cmbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMenuActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgPegawai pegawai=new DlgPegawai(this,false);
        //pegawai.isCek();
        pegawai.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        pegawai.setLocationRelativeTo(PanelUtama);
        pegawai.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnResepObatDepanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResepObatDepanActionPerformed
        btnResepObatActionPerformed(evt);
    }//GEN-LAST:event_btnResepObatDepanActionPerformed

    private void btnDaftarPermintaanResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarPermintaanResepActionPerformed
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgDaftarPermintaanResep daftar=new DlgDaftarPermintaanResep(null,false);
        daftar.emptTeks();
        daftar.isCek();
        daftar.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        daftar.setLocationRelativeTo(PanelUtama);
        daftar.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnDaftarPermintaanResepActionPerformed

    private void btnPermintaanLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermintaanLabActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgCariPermintaanLab form=new DlgCariPermintaanLab(this,false);
        form.isCek();
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPermintaanLabActionPerformed

    private void btnPermintaanRadiologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermintaanRadiologiActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgCariPermintaanRadiologi form=new DlgCariPermintaanRadiologi(this,false);
        form.isCek();
        form.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnPermintaanRadiologiActionPerformed

    private void btnBerkasDigitalPerawatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerkasDigitalPerawatanActionPerformed
        isTutup();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DlgBerkasRawat berkas=new DlgBerkasRawat(this,false);
        berkas.setJudul("::[ Berkas Digital Perawatan ]::","berkasrawat/pages");
        try {
            berkas.loadURL("http://"+koneksiDB.HOST()+":"+prop.getProperty("PORTWEB")+"/"+prop.getProperty("HYBRIDWEB")+"/"+"berkasrawat/login.php?act=login&usere=admin&passwordte=akusayangsamakamu");
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }

        berkas.setSize(PanelUtama.getWidth(),PanelUtama.getHeight());
        berkas.setLocationRelativeTo(PanelUtama);
        berkas.setVisible(true);
        DlgHome.dispose();
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBerkasDigitalPerawatanActionPerformed

    private void btnReferensiPendaftaranMobileJKNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferensiPendaftaranMobileJKNActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        MobileJKNReferensiPendaftaran form=new MobileJKNReferensiPendaftaran(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnReferensiPendaftaranMobileJKNActionPerformed

    private void btnBatalPendaftaranMobileJKNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalPendaftaranMobileJKNActionPerformed
        isTutup();
        DlgHome.dispose();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        MobileJKNPembatalanPendaftaran form=new MobileJKNPembatalanPendaftaran(this,false);
        form.setSize(PanelUtama.getWidth(), PanelUtama.getHeight());
        form.setLocationRelativeTo(PanelUtama);
        form.setVisible(true);
        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnBatalPendaftaranMobileJKNActionPerformed

    private void MenuKeluarBtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuKeluarBtnKeluarActionPerformed
        int jawab=JOptionPane.showConfirmDialog(null, "Yakin anda mau keluar dari aplikasi ini ????","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(jawab==JOptionPane.YES_OPTION){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_MenuKeluarBtnKeluarActionPerformed

    private void MnGantiPasswordBtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnGantiPasswordBtnLogActionPerformed
        PassLama.setText("");
        Passbaru1.setText("");
        PassBaru2.setText("");
        WindowInput.setVisible(true);
    }//GEN-LAST:event_MnGantiPasswordBtnLogActionPerformed

    private void MnRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRegistrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRegistrasiActionPerformed

    private void MnIgdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIgdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnIgdActionPerformed

    private void MnJadwalDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJadwalDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJadwalDokterActionPerformed

    private void MnRujukMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRujukMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRujukMasukActionPerformed

    private void MnRujukKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRujukKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRujukKeluarActionPerformed

    private void MnTindakanRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTindakanRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTindakanRalanActionPerformed

    private void MnKamarInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKamarInapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKamarInapActionPerformed

    private void MnDpjpRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDpjpRanapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDpjpRanapActionPerformed

    private void MnTindakanRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTindakanRanapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTindakanRanapActionPerformed

    private void MnOperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnOperasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnOperasiActionPerformed

    private void MnPemberianObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPemberianObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPemberianObatActionPerformed

    private void MnResepPulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnResepPulangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnResepPulangActionPerformed

    private void MnResepObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnResepObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnResepObatActionPerformed

    private void MnDietPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDietPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDietPasienActionPerformed

    private void MnPeriksaLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPeriksaLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPeriksaLabActionPerformed

    private void MnPeriksaRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPeriksaRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPeriksaRadActionPerformed

    private void MnKasirRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKasirRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKasirRalanActionPerformed

    private void MnDepositPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDepositPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDepositPasienActionPerformed

    private void MnPiutangPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPiutangPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPiutangPasienActionPerformed

    private void MnDataDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDataDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDataDokterActionPerformed

    private void MnDataPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDataPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDataPetugasActionPerformed

    private void MnDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDataPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDataPegawaiActionPerformed

    private void MnBarcodePresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBarcodePresensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBarcodePresensiActionPerformed

    private void MnJamPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJamPresensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJamPresensiActionPerformed

    private void MnPresensiHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPresensiHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPresensiHarianActionPerformed

    private void MnSidikJariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSidikJariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSidikJariActionPerformed

    private void MnJadwalPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJadwalPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJadwalPegawaiActionPerformed

    private void MnJdwlTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJdwlTambahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJdwlTambahanActionPerformed

    private void MnPresensiBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPresensiBulananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPresensiBulananActionPerformed

    private void MnTempPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTempPresensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTempPresensiActionPerformed

    private void MnRekapKehadiranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekapKehadiranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekapKehadiranActionPerformed

    private void MnPresensiHarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPresensiHarian1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPresensiHarian1ActionPerformed

    private void MnIndustriFarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIndustriFarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnIndustriFarActionPerformed

    private void MnSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSuplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSuplierActionPerformed

    private void MnSatuanBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSatuanBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSatuanBrgActionPerformed

    private void MnKonvSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKonvSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKonvSatActionPerformed

    private void MnJnsObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJnsObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJnsObtActionPerformed

    private void MnDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDataObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDataObatActionPerformed

    private void MnStokOpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnStokOpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnStokOpnameActionPerformed

    private void MnMutasiObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnMutasiObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnMutasiObatActionPerformed

    private void MnStokObtPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnStokObtPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnStokObtPxActionPerformed

    private void MnPengadaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPengadaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPengadaanActionPerformed

    private void MnPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPemesananActionPerformed

    private void MnPenjualanObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPenjualanObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPenjualanObtActionPerformed

    private void MnStokOpname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnStokOpname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnStokOpname1ActionPerformed

    private void MnReturKeSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnReturKeSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnReturKeSupActionPerformed

    private void MnReturPembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnReturPembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnReturPembActionPerformed

    private void MnReturObtRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnReturObtRanapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnReturObtRanapActionPerformed

    private void MnReturPiutangPembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnReturPiutangPembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnReturPiutangPembActionPerformed

    private void MnKeuntunganPenjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKeuntunganPenjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKeuntunganPenjActionPerformed

    private void MnKeuntBeriObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKeuntBeriObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKeuntBeriObtActionPerformed

    private void MnSirkulasiObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSirkulasiObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSirkulasiObtActionPerformed

    private void MnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRiwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRiwayatActionPerformed

    private void MnDaruratStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDaruratStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDaruratStokActionPerformed

    private void MnSatuanBrgNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSatuanBrgNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSatuanBrgNonActionPerformed

    private void MnJnsBrgNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJnsBrgNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJnsBrgNonActionPerformed

    private void MnDataBrgNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDataBrgNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDataBrgNonActionPerformed

    private void MnSupNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSupNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSupNonActionPerformed

    private void MnPengadaanbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPengadaanbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPengadaanbrgActionPerformed

    private void MnStokKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnStokKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnStokKeluarActionPerformed

    private void MnBiayaPengadaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBiayaPengadaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBiayaPengadaanActionPerformed

    private void MnRekapPengadaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekapPengadaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekapPengadaanActionPerformed

    private void MnRekapStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekapStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekapStokActionPerformed

    private void MnHrDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrDokActionPerformed

    private void MnHrKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrKamarActionPerformed

    private void MnHrDokRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrDokRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrDokRalanActionPerformed

    private void MnLapObtPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapObtPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapObtPoliActionPerformed

    private void MnObtKmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObtKmrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnObtKmrActionPerformed

    private void MnObtDokRlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObtDokRlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnObtDokRlnActionPerformed

    private void MnObtDokRnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObtDokRnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnObtDokRnpActionPerformed

    private void MnObtDokRspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObtDokRspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnObtDokRspActionPerformed

    private void MnObtCrByrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObtCrByrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnObtCrByrActionPerformed

    private void MnDetJMDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDetJMDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDetJMDokActionPerformed

    private void MnHrDokAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrDokAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrDokAllActionPerformed

    private void MnBulananDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBulananDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBulananDokActionPerformed

    private void MnHrParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrParamedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrParamedisActionPerformed

    private void MnBlnParamedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBlnParamedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBlnParamedisActionPerformed

    private void MnHrSrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrSrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrSrnActionPerformed

    private void MnBlnSrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBlnSrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBlnSrnActionPerformed

    private void MnHrKsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrKsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrKsoActionPerformed

    private void MnBlnKsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBlnKsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBlnKsoActionPerformed

    private void MnHrMnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrMnjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrMnjActionPerformed

    private void MnBlnMnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBlnMnjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBlnMnjActionPerformed

    private void MnHrBhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHrBhpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHrBhpActionPerformed

    private void MnBlnBhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBlnBhpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBlnBhpActionPerformed

    private void MnFreeVstDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFreeVstDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnFreeVstDokActionPerformed

    private void MnFreeBcEkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFreeBcEkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnFreeBcEkgActionPerformed

    private void MnFreeRujRotgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFreeRujRotgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnFreeRujRotgActionPerformed

    private void MnFreeRujRnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFreeRujRnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnFreeRujRnpActionPerformed

    private void MnFreePrkRlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFreePrkRlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnFreePrkRlnActionPerformed

    private void MnLapPembRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapPembRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapPembRalanActionPerformed

    private void MnLapPembRnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapPembRnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapPembRnpActionPerformed

    private void MnRkpPmbRlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRkpPmbRlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRkpPmbRlnActionPerformed

    private void MnRkpPmbRnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRkpPmbRnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRkpPmbRnpActionPerformed

    private void MnLapTagMskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapTagMskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapTagMskActionPerformed

    private void MnLapTmbBiayaPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapTmbBiayaPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapTmbBiayaPxActionPerformed

    private void MnLapPotBiayaPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapPotBiayaPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapPotBiayaPxActionPerformed

    private void MnLapDepositPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapDepositPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapDepositPxActionPerformed

    private void MnLapUangShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapUangShiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapUangShiftActionPerformed

    private void MnLapPaymentPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapPaymentPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapPaymentPointActionPerformed

    private void MnLapIcd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapIcd9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapIcd9ActionPerformed

    private void MnLapIcd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapIcd10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapIcd10ActionPerformed

    private void MnLapObtPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapObtPenyakitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapObtPenyakitActionPerformed

    private void MnLapKjgRlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapKjgRlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapKjgRlnActionPerformed

    private void MnLapKjgRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnLapKjgRanapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnLapKjgRanapActionPerformed

    private void MnSensusHrPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSensusHrPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSensusHrPoliActionPerformed

    private void MnAnjungan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAnjungan6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnAnjungan6ActionPerformed

    private void MnRekapHadir15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekapHadir15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekapHadir15ActionPerformed

    private void MnRekapHadir16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekapHadir16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekapHadir16ActionPerformed

    private void MnTarifKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifKamarActionPerformed

    private void MnTarifRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifRalanActionPerformed

    private void MnTarifRanapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifRanapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifRanapActionPerformed

    private void MnTarifLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifLabActionPerformed

    private void MnTarifRadiologiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifRadiologiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifRadiologiActionPerformed

    private void MnTarifOperasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnTarifOperasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnTarifOperasiActionPerformed

    private void MnAkunRekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAkunRekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnAkunRekActionPerformed

    private void MnRekThnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRekThnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRekThnActionPerformed

    private void MnAkunPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAkunPiutangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnAkunPiutangActionPerformed

    private void MnAkunBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAkunBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnAkunBayarActionPerformed

    private void MnPengaturanRekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPengaturanRekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPengaturanRekActionPerformed

    private void MnPengeluaranHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPengeluaranHrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPengeluaranHrActionPerformed

    private void MnPemasukanlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPemasukanlainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPemasukanlainActionPerformed

    private void MnPiutangPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPiutangPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPiutangPxActionPerformed

    private void MnRincPiutangPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRincPiutangPxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRincPiutangPxActionPerformed

    private void MnPiutangBlmLnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPiutangBlmLnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPiutangBlmLnsActionPerformed

    private void MnByrPiutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnByrPiutangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnByrPiutangActionPerformed

    private void MnHtgObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnHtgObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnHtgObtActionPerformed

    private void MnByrPsnObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnByrPsnObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnByrPsnObtActionPerformed

    private void MnPostingJurnalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPostingJurnalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPostingJurnalActionPerformed

    private void MnJurnalHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnJurnalHrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnJurnalHrActionPerformed

    private void MnBukuBesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBukuBesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBukuBesarActionPerformed

    private void MnCashFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCashFlowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnCashFlowActionPerformed

    private void MnKeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKeuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKeuActionPerformed

    private void MnCekNoBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCekNoBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnCekNoBpjsActionPerformed

    private void MnCekNikBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCekNikBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnCekNikBpjsActionPerformed

    private void MnRiwPesBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRiwPesBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRiwPesBpjsActionPerformed

    private void MnCekNoRujPCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCekNoRujPCareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnCekNoRujPCareActionPerformed

    private void MnRefDiagBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRefDiagBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRefDiagBpjsActionPerformed

    private void MnRefPlBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRefPlBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRefPlBpjsActionPerformed

    private void MnRefFaskesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRefFaskesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRefFaskesActionPerformed

    private void MnBridgingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBridgingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBridgingActionPerformed

    private void MnMonitoringKlaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnMonitoringKlaimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnMonitoringKlaimActionPerformed

    private void MnRefKmrAplicareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRefKmrAplicareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRefKmrAplicareActionPerformed

    private void MnKmrAplicareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKmrAplicareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKmrAplicareActionPerformed

    private void MnRefMblJknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRefMblJknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRefMblJknActionPerformed

    private void MnBtlMblJknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBtlMblJknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBtlMblJknActionPerformed

    private void MnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPasienActionPerformed

    private void MnKelahiranBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnKelahiranBayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnKelahiranBayiActionPerformed

    private void MnPasienMeninggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPasienMeninggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPasienMeninggalActionPerformed

    private void MnDiagnosaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDiagnosaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDiagnosaPasienActionPerformed

    private void MnRiwayatPerawatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRiwayatPerawatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRiwayatPerawatanActionPerformed

    private void MnRetBrksRmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnRetBrksRmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnRetBrksRmActionPerformed

    private void MnSetAplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetAplikasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetAplikasiActionPerformed

    private void MnSetAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetAdminActionPerformed

    private void MnPenujangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPenujangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnPenujangActionPerformed

    private void MnSetOtoLokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetOtoLokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetOtoLokActionPerformed

    private void MnSetKmrInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetKmrInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetKmrInpActionPerformed

    private void MnSetHargaKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetHargaKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetHargaKamarActionPerformed

    private void MnSetEmbTusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetEmbTusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetEmbTusActionPerformed

    private void MnSetUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetUserActionPerformed

    private void MnSetTrackerLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetTrackerLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetTrackerLogActionPerformed

    private void MnDisplayAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDisplayAntrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnDisplayAntrianActionPerformed

    private void MnSetHargaObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetHargaObtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetHargaObtActionPerformed

    private void MnSetObtRnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetObtRnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetObtRnpActionPerformed

    private void MnSetPenggTrfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetPenggTrfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetPenggTrfActionPerformed

    private void MnSetOtoRalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetOtoRalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetOtoRalanActionPerformed

    private void MnBiayaHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBiayaHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBiayaHarianActionPerformed

    private void MnBiayaMskSklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBiayaMskSklActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnBiayaMskSklActionPerformed

    private void MnSetRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetRMActionPerformed

    private void MnSetBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetBillingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetBillingActionPerformed

    private void MnClosingKsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnClosingKsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnClosingKsrActionPerformed

    private void MnSetLambtPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSetLambtPresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnSetLambtPresActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnCancel;
    private widget.ButtonBig BtnClose;
    private widget.Button BtnClosePass;
    private widget.ButtonBig BtnDpjp;
    private widget.ButtonBig BtnJadwal;
    private widget.ButtonBig BtnLog;
    private widget.Button BtnLogin;
    private widget.ButtonBig BtnMenu;
    private widget.Button BtnSimpanPass;
    private widget.ButtonBig BtnToolJualObat;
    private widget.ButtonBig BtnToolKamnap;
    private widget.ButtonBig BtnToolKasir;
    private widget.ButtonBig BtnToolReg;
    private javax.swing.JDialog DlgHome;
    private javax.swing.JDialog DlgLogin;
    private usu.widget.glass.PanelGlass FlayMenu;
    private widget.MenuBar MenuBar;
    private javax.swing.JMenu MenuInvObat;
    private javax.swing.JMenu MenuJadwal;
    private javax.swing.JMenu MenuKasir;
    private javax.swing.JMenuItem MenuKeluar;
    private javax.swing.JMenu MenuKeuntungan;
    private javax.swing.JMenu MenuLapBulanan;
    private javax.swing.JMenu MenuLapBulanan1;
    private javax.swing.JMenu MenuLapHarian;
    private javax.swing.JMenu MenuLapObat;
    private javax.swing.JMenu MenuLapPemb;
    private javax.swing.JMenu MenuLapPykt;
    private javax.swing.JMenu MenuObat;
    private javax.swing.JMenu MenuPiutang;
    private javax.swing.JMenu MenuPresensi;
    private javax.swing.JMenu MenuRawatInap;
    private javax.swing.JMenu MenuRawatJalan;
    private javax.swing.JMenu MenuRekap;
    private javax.swing.JMenu MenuRekening;
    private javax.swing.JMenu MenuRetur;
    private javax.swing.JMenu MenuRujukan;
    private javax.swing.JMenu MenuSuplier;
    private javax.swing.JMenu MenuTarif;
    private javax.swing.JMenuItem MnAkunBayar;
    private javax.swing.JMenuItem MnAkunPiutang;
    private javax.swing.JMenuItem MnAkunRek;
    private javax.swing.JMenuItem MnAnjungan6;
    private javax.swing.JMenuItem MnBarcodePresensi;
    private javax.swing.JMenuItem MnBiayaHarian;
    private javax.swing.JMenuItem MnBiayaMskSkl;
    private javax.swing.JMenuItem MnBiayaPengadaan;
    private javax.swing.JMenuItem MnBlnBhp;
    private javax.swing.JMenuItem MnBlnKso;
    private javax.swing.JMenuItem MnBlnMnj;
    private javax.swing.JMenuItem MnBlnParamedis;
    private javax.swing.JMenuItem MnBlnSrn;
    private javax.swing.JMenuItem MnBridging;
    private javax.swing.JMenuItem MnBtlMblJkn;
    private javax.swing.JMenuItem MnBukuBesar;
    private javax.swing.JMenuItem MnBulananDok;
    private javax.swing.JMenuItem MnByrPiutang;
    private javax.swing.JMenuItem MnByrPsnObt;
    private javax.swing.JMenuItem MnCashFlow;
    private javax.swing.JMenuItem MnCekNikBpjs;
    private javax.swing.JMenuItem MnCekNoBpjs;
    private javax.swing.JMenuItem MnCekNoRujPCare;
    private javax.swing.JMenuItem MnClosingKsr;
    private javax.swing.JMenuItem MnDaruratStok;
    private javax.swing.JMenuItem MnDataBrgNon;
    private javax.swing.JMenuItem MnDataDokter;
    private javax.swing.JMenuItem MnDataObat;
    private javax.swing.JMenuItem MnDataPegawai;
    private javax.swing.JMenuItem MnDataPetugas;
    private javax.swing.JMenuItem MnDepositPasien;
    private javax.swing.JMenuItem MnDetJMDok;
    private javax.swing.JMenuItem MnDiagnosaPasien;
    private javax.swing.JMenuItem MnDietPasien;
    private javax.swing.JMenuItem MnDisplayAntrian;
    private javax.swing.JMenuItem MnDpjpRanap;
    private javax.swing.JMenuItem MnFreeBcEkg;
    private javax.swing.JMenuItem MnFreePrkRln;
    private javax.swing.JMenuItem MnFreeRujRnp;
    private javax.swing.JMenuItem MnFreeRujRotg;
    private javax.swing.JMenuItem MnFreeVstDok;
    private javax.swing.JMenuItem MnGantiPassword;
    private javax.swing.JMenuItem MnHrBhp;
    private javax.swing.JMenuItem MnHrDok;
    private javax.swing.JMenuItem MnHrDokAll;
    private javax.swing.JMenuItem MnHrDokRalan;
    private javax.swing.JMenuItem MnHrKamar;
    private javax.swing.JMenuItem MnHrKso;
    private javax.swing.JMenuItem MnHrMnj;
    private javax.swing.JMenuItem MnHrParamedis;
    private javax.swing.JMenuItem MnHrSrn;
    private javax.swing.JMenuItem MnHtgObt;
    private javax.swing.JMenuItem MnIgd;
    private javax.swing.JMenuItem MnIndustriFar;
    private javax.swing.JMenuItem MnInfoKamar;
    private javax.swing.JMenuItem MnJadwalDokter;
    private javax.swing.JMenuItem MnJadwalPegawai;
    private javax.swing.JMenuItem MnJamPresensi;
    private javax.swing.JMenuItem MnJdwlTambahan;
    private javax.swing.JMenuItem MnJnsBrgNon;
    private javax.swing.JMenuItem MnJnsObt;
    private javax.swing.JMenuItem MnJurnalHr;
    private javax.swing.JMenuItem MnKamarInap;
    private javax.swing.JMenuItem MnKasirRalan;
    private javax.swing.JMenuItem MnKelahiranBayi;
    private javax.swing.JMenuItem MnKeu;
    private javax.swing.JMenuItem MnKeuntBeriObt;
    private javax.swing.JMenuItem MnKeuntunganPenj;
    private javax.swing.JMenuItem MnKmrAplicare;
    private javax.swing.JMenuItem MnKonvSat;
    private javax.swing.JMenuItem MnLapDepositPx;
    private javax.swing.JMenuItem MnLapIcd10;
    private javax.swing.JMenuItem MnLapIcd9;
    private javax.swing.JMenuItem MnLapKjgRanap;
    private javax.swing.JMenuItem MnLapKjgRln;
    private javax.swing.JMenuItem MnLapObtPenyakit;
    private javax.swing.JMenuItem MnLapObtPoli;
    private javax.swing.JMenuItem MnLapPaymentPoint;
    private javax.swing.JMenuItem MnLapPembRalan;
    private javax.swing.JMenuItem MnLapPembRnp;
    private javax.swing.JMenuItem MnLapPotBiayaPx;
    private javax.swing.JMenuItem MnLapTagMsk;
    private javax.swing.JMenuItem MnLapTmbBiayaPx;
    private javax.swing.JMenuItem MnLapUangShift;
    private javax.swing.JMenuItem MnLogin;
    private javax.swing.JMenuItem MnMonitoringKlaim;
    private javax.swing.JMenuItem MnMutasiObat;
    private javax.swing.JMenuItem MnObtCrByr;
    private javax.swing.JMenuItem MnObtDokRln;
    private javax.swing.JMenuItem MnObtDokRnp;
    private javax.swing.JMenuItem MnObtDokRsp;
    private javax.swing.JMenuItem MnObtKmr;
    private javax.swing.JMenuItem MnOperasi;
    private javax.swing.JMenuItem MnPasien;
    private javax.swing.JMenuItem MnPasienMeninggal;
    private javax.swing.JMenuItem MnPemasukanlain;
    private javax.swing.JMenuItem MnPemberianObat;
    private javax.swing.JMenuItem MnPemesanan;
    private javax.swing.JMenuItem MnPengadaan;
    private javax.swing.JMenuItem MnPengadaanbrg;
    private javax.swing.JMenuItem MnPengaturanRek;
    private javax.swing.JMenuItem MnPengeluaranHr;
    private javax.swing.JMenuItem MnPenjualanObt;
    private javax.swing.JMenuItem MnPenujang;
    private javax.swing.JMenuItem MnPeriksaLab;
    private javax.swing.JMenuItem MnPeriksaRad;
    private javax.swing.JMenuItem MnPiutangBlmLns;
    private javax.swing.JMenuItem MnPiutangPasien;
    private javax.swing.JMenuItem MnPiutangPx;
    private javax.swing.JMenuItem MnPostingJurnal;
    private javax.swing.JMenuItem MnPresensiBulanan;
    private javax.swing.JMenuItem MnPresensiHarian;
    private javax.swing.JMenuItem MnPresensiHarian1;
    private javax.swing.JMenuItem MnRefDiagBpjs;
    private javax.swing.JMenuItem MnRefFaskes;
    private javax.swing.JMenuItem MnRefKmrAplicare;
    private javax.swing.JMenuItem MnRefMblJkn;
    private javax.swing.JMenuItem MnRefPlBpjs;
    private javax.swing.JMenuItem MnRegistrasi;
    private javax.swing.JMenuItem MnRekThn;
    private javax.swing.JMenuItem MnRekapHadir15;
    private javax.swing.JMenuItem MnRekapHadir16;
    private javax.swing.JMenuItem MnRekapKehadiran;
    private javax.swing.JMenuItem MnRekapPengadaan;
    private javax.swing.JMenuItem MnRekapStok;
    private javax.swing.JMenuItem MnResepObat;
    private javax.swing.JMenuItem MnResepPulang;
    private javax.swing.JMenuItem MnRetBrksRm;
    private javax.swing.JMenuItem MnReturKeSup;
    private javax.swing.JMenuItem MnReturObtRanap;
    private javax.swing.JMenuItem MnReturPemb;
    private javax.swing.JMenuItem MnReturPiutangPemb;
    private javax.swing.JMenuItem MnRincPiutangPx;
    private javax.swing.JMenuItem MnRiwPesBpjs;
    private javax.swing.JMenuItem MnRiwayat;
    private javax.swing.JMenuItem MnRiwayatPerawatan;
    private javax.swing.JMenuItem MnRkpPmbRln;
    private javax.swing.JMenuItem MnRkpPmbRnp;
    private javax.swing.JMenuItem MnRujukKeluar;
    private javax.swing.JMenuItem MnRujukMasuk;
    private javax.swing.JMenuItem MnSatuanBrg;
    private javax.swing.JMenuItem MnSatuanBrgNon;
    private javax.swing.JMenuItem MnSensusHrPoli;
    private javax.swing.JMenuItem MnSetAdmin;
    private javax.swing.JMenuItem MnSetAplikasi;
    private javax.swing.JMenuItem MnSetBilling;
    private javax.swing.JMenuItem MnSetEmbTus;
    private javax.swing.JMenuItem MnSetHargaKamar;
    private javax.swing.JMenuItem MnSetHargaObt;
    private javax.swing.JMenuItem MnSetKmrInp;
    private javax.swing.JMenuItem MnSetLambtPres;
    private javax.swing.JMenuItem MnSetObtRnp;
    private javax.swing.JMenuItem MnSetOtoLok;
    private javax.swing.JMenuItem MnSetOtoRalan;
    private javax.swing.JMenuItem MnSetPenggTrf;
    private javax.swing.JMenuItem MnSetRM;
    private javax.swing.JMenuItem MnSetTrackerLog;
    private javax.swing.JMenuItem MnSetUser;
    private javax.swing.JMenuItem MnSidikJari;
    private javax.swing.JMenuItem MnSirkulasiObt;
    private javax.swing.JMenuItem MnStokKeluar;
    private javax.swing.JMenuItem MnStokObtPx;
    private javax.swing.JMenuItem MnStokOpname;
    private javax.swing.JMenuItem MnStokOpname1;
    private javax.swing.JMenuItem MnSupNon;
    private javax.swing.JMenuItem MnSuplier;
    private javax.swing.JMenuItem MnTarifKamar;
    private javax.swing.JMenuItem MnTarifLab;
    private javax.swing.JMenuItem MnTarifOperasi;
    private javax.swing.JMenuItem MnTarifRadiologi;
    private javax.swing.JMenuItem MnTarifRalan;
    private javax.swing.JMenuItem MnTarifRanap;
    private javax.swing.JMenuItem MnTempPresensi;
    private javax.swing.JMenuItem MnTindakanRalan;
    private javax.swing.JMenuItem MnTindakanRanap;
    private javax.swing.JPanel PanelUtama;
    private usu.widget.glass.PanelGlass PanelWall;
    private widget.panelGlass Panelmenu;
    private widget.TextBox PassBaru2;
    private widget.TextBox PassLama;
    private widget.TextBox Passbaru1;
    private javax.swing.JDialog WindowInput;
    private widget.ButtonBig btnAdmin;
    private widget.ButtonBig btnAkunPiutang;
    private widget.ButtonBig btnAnalisaKamar;
    private widget.ButtonBig btnAplicareKetersediaanKamar;
    private widget.ButtonBig btnAplicareReferensiKamar;
    private widget.ButtonBig btnBPJSSEP;
    private widget.ButtonBig btnBarangIpsrs;
    private widget.ButtonBig btnBarcode;
    private widget.ButtonBig btnBatalPendaftaranMobileJKN;
    private widget.ButtonBig btnBayarPiutang;
    private widget.ButtonBig btnBeriObat;
    private widget.ButtonBig btnBerkasDigitalPerawatan;
    private widget.ButtonBig btnBubes;
    private widget.ButtonBig btnCashFlow;
    private widget.ButtonBig btnCekBPJSDiagnosa;
    private widget.ButtonBig btnCekBPJSFaskes;
    private widget.ButtonBig btnCekBPJSKartu;
    private widget.ButtonBig btnCekBPJSNik;
    private widget.ButtonBig btnCekBPJSNomorRujukanPCare;
    private widget.ButtonBig btnCekBPJSPoli;
    private widget.ButtonBig btnCekBPJSRiwayat;
    private widget.ButtonBig btnClosingKasir;
    private widget.ButtonBig btnDaftarPermintaanResep;
    private widget.ButtonBig btnDaruratStok;
    private widget.ButtonBig btnDataPenjualan;
    private widget.ButtonBig btnDeposit;
    private widget.ButtonBig btnDiagnosa;
    private widget.ButtonBig btnDiet;
    private widget.ButtonBig btnDisplay;
    private widget.ButtonBig btnDokter;
    private widget.ButtonBig btnHarianKamar;
    private widget.ButtonBig btnHutangObat;
    private widget.ButtonBig btnICD;
    private widget.ButtonBig btnICD9;
    private widget.ButtonBig btnIGD;
    private widget.ButtonBig btnIndustriFarmasi;
    private widget.ButtonBig btnInputPenjualan;
    private widget.ButtonBig btnJMDetailDokter;
    private widget.ButtonBig btnJadwalPegawai;
    private widget.ButtonBig btnJadwalTambahan;
    private widget.ButtonBig btnJamPresensi;
    private widget.ButtonBig btnJenisIpsrs;
    private widget.ButtonBig btnJnsBarang;
    private widget.ButtonBig btnJurnalHarian;
    private widget.ButtonBig btnKamar;
    private widget.ButtonBig btnKamarInap;
    private widget.ButtonBig btnKasir;
    private widget.ButtonBig btnKeterlambatanPresensi;
    private widget.ButtonBig btnKeuntungan;
    private widget.ButtonBig btnKeuntunganObat2;
    private widget.ButtonBig btnKeuntunganObatRanap;
    private widget.ButtonBig btnKonversi;
    private widget.ButtonBig btnKunjunganRalan;
    private widget.ButtonBig btnKunjunganRanap;
    private widget.ButtonBig btnLabaRugi;
    private widget.ButtonBig btnLaboratorium;
    private widget.ButtonBig btnLahir;
    private widget.ButtonBig btnLihatPiutang;
    private widget.ButtonBig btnMonitoringKlaim;
    private widget.ButtonBig btnMutasiBarang;
    private widget.ButtonBig btnObat;
    private widget.ButtonBig btnObatPasienPeresep;
    private widget.ButtonBig btnObatPasienRalan;
    private widget.ButtonBig btnObatPasienRanap;
    private widget.ButtonBig btnObatPenyakit;
    private widget.ButtonBig btnObatPerCaraBayar;
    private widget.ButtonBig btnOpname;
    private widget.ButtonBig btnPaketOperasi;
    private widget.ButtonBig btnPasien;
    private widget.ButtonBig btnPasienMati;
    private widget.ButtonBig btnPaymentPoint;
    private widget.ButtonBig btnPegawai;
    private widget.ButtonBig btnPemasukanLain;
    private widget.ButtonBig btnPembelian;
    private widget.ButtonBig btnPembelianIpsrs;
    private widget.ButtonBig btnPemesanan;
    private widget.ButtonBig btnPengaturanRekening;
    private widget.ButtonBig btnPengeluaran;
    private widget.ButtonBig btnPengeluaranIpsrs;
    private widget.ButtonBig btnPenggajian;
    private widget.ButtonBig btnPenjualan;
    private widget.ButtonBig btnPeriksaRadiologi;
    private widget.ButtonBig btnPermintaanLab;
    private widget.ButtonBig btnPermintaanRadiologi;
    private widget.ButtonBig btnPetugas;
    private widget.ButtonBig btnPiutang;
    private widget.ButtonBig btnPiutangBelumLunas;
    private widget.ButtonBig btnPostingJurnal;
    private widget.ButtonBig btnPotonganBiaya;
    private widget.ButtonBig btnRBDokter;
    private widget.ButtonBig btnRBJasaSarana;
    private widget.ButtonBig btnRBKSO;
    private widget.ButtonBig btnRBMenejemen;
    private widget.ButtonBig btnRBPaketBHP;
    private widget.ButtonBig btnRBParamedis;
    private widget.ButtonBig btnRBiayaIpsrs;
    private widget.ButtonBig btnRHDOkter;
    private widget.ButtonBig btnRHJasaSarana;
    private widget.ButtonBig btnRHKSO;
    private widget.ButtonBig btnRHKeluarIpsrs;
    private widget.ButtonBig btnRHMasukIpsrs;
    private widget.ButtonBig btnRHMenejemen;
    private widget.ButtonBig btnRHPaketBHP;
    private widget.ButtonBig btnRHParamedis;
    private widget.ButtonBig btnRalan;
    private widget.ButtonBig btnRalanMasuk;
    private widget.ButtonBig btnRanap;
    private widget.ButtonBig btnRanapMasuk;
    private widget.ButtonBig btnReferensiPendaftaranMobileJKN;
    private widget.ButtonBig btnRegistrasi;
    private widget.ButtonBig btnRekapBulanan;
    private widget.ButtonBig btnRekapHarian;
    private widget.ButtonBig btnRekapPershift;
    private widget.ButtonBig btnRekapPresensi;
    private widget.ButtonBig btnRekapPresensi2;
    private widget.ButtonBig btnRekening;
    private widget.ButtonBig btnRekeningTahun;
    private widget.ButtonBig btnResepObat;
    private widget.ButtonBig btnResepObatDepan;
    private widget.ButtonBig btnResepPulang;
    private widget.ButtonBig btnResume;
    private widget.ButtonBig btnRetensiRM;
    private widget.ButtonBig btnReturBeli;
    private widget.ButtonBig btnReturJual;
    private widget.ButtonBig btnReturPasien;
    private widget.ButtonBig btnReturPiutang;
    private widget.ButtonBig btnRincianPiutangPasien;
    private widget.ButtonBig btnRiwayatBarangMedis;
    private widget.ButtonBig btnRujukMasuk;
    private widget.ButtonBig btnRujukPasien;
    private widget.ButtonBig btnSatuan;
    private widget.ButtonBig btnSensusHarianPoli;
    private widget.ButtonBig btnSetBiayaHarian;
    private widget.ButtonBig btnSetBiayaMasukSekali;
    private widget.ButtonBig btnSetHargaKamar;
    private widget.ButtonBig btnSetObatRalan;
    private widget.ButtonBig btnSetObatRanap;
    private widget.ButtonBig btnSetOtoRalan;
    private widget.ButtonBig btnSetPenjab;
    private widget.ButtonBig btnSetupAplikasi;
    private widget.ButtonBig btnSetupEmbalase;
    private widget.ButtonBig btnSetupHarga;
    private widget.ButtonBig btnSetupJamInap;
    private widget.ButtonBig btnSetupNota;
    private widget.ButtonBig btnSetupOtoLokasi;
    private widget.ButtonBig btnSetupRM;
    private widget.ButtonBig btnSetupTarif;
    private widget.ButtonBig btnSidikJari;
    private widget.ButtonBig btnSirkulasi;
    private widget.ButtonBig btnSirkulasi2;
    private widget.ButtonBig btnStokObatPasien;
    private widget.ButtonBig btnSuplier;
    private widget.ButtonBig btnSuplierIPSRS;
    private widget.ButtonBig btnTagihanDokter;
    private widget.ButtonBig btnTagihanMasuk;
    private widget.ButtonBig btnTagihanObatBangsal;
    private widget.ButtonBig btnTagihanObatPoli;
    private widget.ButtonBig btnTagihanOperasi;
    private widget.ButtonBig btnTagihanPoli;
    private widget.ButtonBig btnTagihanRalanPerhari;
    private widget.ButtonBig btnTagihanRanapPerhari;
    private widget.ButtonBig btnTambahanBiaya;
    private widget.ButtonBig btnTarifLab;
    private widget.ButtonBig btnTarifRadiologi;
    private widget.ButtonBig btnTemporaryPresensi;
    private widget.ButtonBig btnTindakanRalan;
    private widget.ButtonBig btnTindakanRanap;
    private widget.ButtonBig btnToolIGD;
    private widget.ButtonBig btnToolLab;
    private widget.ButtonBig btnToolRad;
    private widget.ButtonBig btnTracker;
    private widget.ButtonBig btnUser;
    private widget.ButtonBig btnakun_bayar;
    private widget.ButtonBig btnbayar_pemesanan;
    private widget.ButtonBig btnfee_bacaan_ekg;
    private widget.ButtonBig btnfee_ralan;
    private widget.ButtonBig btnfee_rujukan_ranap;
    private widget.ButtonBig btnfee_rujukan_rontgen;
    private widget.ButtonBig btnfee_visit_dokter;
    private widget.Button button1;
    private widget.ComboBox cmbMenu;
    private widget.PasswordBox edAdmin;
    private widget.PasswordBox edPwd;
    private widget.InternalFrame internalFrame1;
    private widget.InternalFrame internalFrame2;
    private widget.InternalFrame internalFrame3;
    private widget.InternalFrame internalFrame4;
    private widget.InternalFrame internalFrame6;
    private widget.Label jLabel10;
    private javax.swing.JLabel jLabel11;
    private widget.Label jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private widget.Label jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenuBridging;
    private javax.swing.JMenu jMenuFarmasi;
    private javax.swing.JMenu jMenuInventory;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuKeu;
    private javax.swing.JMenu jMenuLaporan;
    private javax.swing.JMenu jMenuLayanan;
    private javax.swing.JMenu jMenuManajemen;
    private javax.swing.JMenu jMenuPasien;
    private javax.swing.JMenu jMenuPengaturan;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private widget.Label label35;
    private widget.Label label36;
    private javax.swing.JLabel lblStts;
    private javax.swing.JLabel lblTgl;
    private javax.swing.JLabel lblUser;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelJudul;
    private widget.InternalFrame panelMenu;
    private widget.panelisi panelisi2;
    private widget.ScrollPane scrollPane1;
    private widget.ScrollPane scrollPane2;
    private widget.Tanggal tanggal;
    // End of variables declaration//GEN-END:variables

    public void isTampil(){
        Panelmenu.removeAll();
        if(cmbMenu.getSelectedIndex()==0){
            jmlmenu=0;
            if(var.getinformasi_kamar()==true){
                Panelmenu.add(btnAnalisaKamar);
                jmlmenu++;
            }

            if(var.getjadwal_praktek()==true){
                Panelmenu.add(BtnJadwal);
                jmlmenu++;
            }

            if(var.getregistrasi()==true){
                Panelmenu.add(btnRegistrasi);
                jmlmenu++;
            }

            if(var.getigd()==true){
                Panelmenu.add(btnIGD);
                jmlmenu++;
            }

            if(var.gettindakan_ralan()==true){
                Panelmenu.add(btnRalan);
                jmlmenu++;
            }

            if(var.getkamar_inap()==true){
                Panelmenu.add(btnKamarInap);
                jmlmenu++;
            }

            if(var.getdpjp_ranap()==true){
                Panelmenu.add(BtnDpjp);
                jmlmenu++;
            }

            if(var.gettindakan_ranap()==true){
                Panelmenu.add(btnRanap);
                jmlmenu++;
            }

            if(var.getoperasi()==true){
                Panelmenu.add(btnTagihanOperasi);
                jmlmenu++;
            }

            if(var.getrujukan_keluar()==true){
                Panelmenu.add(btnRujukPasien);
                jmlmenu++;
            }

            if(var.getrujukan_masuk()==true){
                Panelmenu.add(btnRujukMasuk);
                jmlmenu++;
            }

            if(var.getberi_obat()==true){
                Panelmenu.add(btnBeriObat);
                jmlmenu++;
            }

            if(var.getresep_pulang()==true){
                Panelmenu.add(btnResepPulang);
                jmlmenu++;
            }

            if(var.getresep_obat()==true){
                Panelmenu.add(btnResepObat);
                jmlmenu++;
            }

            if(var.getdiet_pasien()==true){
                Panelmenu.add(btnDiet);
                jmlmenu++;
            }

            if(var.getperiksa_lab()==true){
                Panelmenu.add(btnLaboratorium);
                jmlmenu++;
            }

            if(var.getperiksa_radiologi()==true){
                Panelmenu.add(btnPeriksaRadiologi);
                jmlmenu++;
            }

            if(var.getkasir_ralan()==true){
                Panelmenu.add(btnKasir);
                jmlmenu++;
            }

            if(var.getdeposit_pasien()==true){
                Panelmenu.add(btnDeposit);
                jmlmenu++;
            }

            if(var.getpiutang_pasien()==true){
               Panelmenu.add(btnLihatPiutang);
               jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==1){
            jmlmenu=0;
            if(var.getpetugas()==true){
                Panelmenu.add(btnPetugas);
                jmlmenu++;
            }

            if(var.getdokter()==true){
                Panelmenu.add(btnDokter);
                jmlmenu++;
            }

            if(var.getpetugas()==true){
                Panelmenu.add(btnPegawai);
                jmlmenu++;
            }
            
            if(var.getbarcode()==true){
                Panelmenu.add(btnBarcode);
                jmlmenu++;
            }

            if(var.getsidikjari()==true){
                Panelmenu.add(btnSidikJari);
                jmlmenu++;
            }

            if(var.getjam_masuk()==true){
                Panelmenu.add(btnJamPresensi);
                jmlmenu++;
            }

            if(var.getjadwal_pegawai()==true){
                Panelmenu.add(btnJadwalPegawai);
                jmlmenu++;
                Panelmenu.add(btnJadwalTambahan);
                jmlmenu++;
            }

            if(var.getpresensi_harian()==true){
                Panelmenu.add(btnRekapHarian);
                jmlmenu++;
            }

            if(var.getpresensi_bulanan()==true){
                Panelmenu.add(btnRekapBulanan);
                jmlmenu++;
            }

            if(var.gettemporary_presensi()==true){
                Panelmenu.add(btnTemporaryPresensi);
                jmlmenu++;
            }

            Panelmenu.add(btnRekapPresensi);
            Panelmenu.add(btnRekapPresensi2);
            jmlmenu++;
            jmlmenu++;

            if((var.getpegawai_admin()==true)||(var.getpegawai_user()==true)){
                Panelmenu.add(btnPenggajian);
                jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==2){
            jmlmenu=0;
            if(var.getindustrifarmasi()==true){
                Panelmenu.add(btnIndustriFarmasi);
                jmlmenu++;
            }

            if(var.getsuplier()==true){
                Panelmenu.add(btnSuplier);
                jmlmenu++;
            }

            if(var.getsatuan_barang()==true){
                Panelmenu.add(btnSatuan);
                jmlmenu++;
            }

            if(var.getkonversi_satuan()==true){
                Panelmenu.add(btnKonversi);
                jmlmenu++;
            }

            if(var.getjenis_barang()==true){
                Panelmenu.add(btnJnsBarang);
                jmlmenu++;
            }

            if(var.getobat()==true){
                Panelmenu.add(btnObat);
                jmlmenu++;
            }

            if(var.getstok_opname_obat()==true){
                Panelmenu.add(btnOpname);
                jmlmenu++;
            }

            if(var.getmutasi_barang()==true){
                Panelmenu.add(btnMutasiBarang);
                jmlmenu++;
            }

            if(var.getstok_obat_pasien()==true){
                Panelmenu.add(btnStokObatPasien);
                jmlmenu++;
            }

            if(var.getpengadaan_obat()==true){
                Panelmenu.add(btnPembelian);
                jmlmenu++;
            }

            if(var.getpemesanan_obat()==true){
                Panelmenu.add(btnPemesanan);
                jmlmenu++;
            }

            if(var.getpenjualan_obat()==true){
                Panelmenu.add(btnPenjualan);
                jmlmenu++;
            }

            if(var.getpiutang_obat()==true){
                 Panelmenu.add(btnPiutang);
                 jmlmenu++;
            }

            if(var.getretur_ke_suplier()==true){
                Panelmenu.add(btnReturBeli);
                jmlmenu++;
            }

            if(var.getretur_dari_pembeli()==true){
                Panelmenu.add(btnReturJual);
                jmlmenu++;
            }

            if(var.getretur_obat_ranap()==true){
                Panelmenu.add(btnReturPasien);
                jmlmenu++;
            }

            if(var.getretur_piutang_pasien()==true){
                Panelmenu.add(btnReturPiutang);
                jmlmenu++;
            }

            if(var.getkeuntungan_penjualan()==true){
                Panelmenu.add(btnKeuntungan);
                jmlmenu++;
            }

            if(var.getkeuntungan_beri_obat()==true){
                Panelmenu.add(btnKeuntunganObatRanap);
                jmlmenu++;
            }

            if(var.getkeuntungan_beri_obat_nonpiutang()==true){
                Panelmenu.add(btnKeuntunganObat2);
                jmlmenu++;
            }

            if(var.getsirkulasi_obat()==true){
                Panelmenu.add(btnSirkulasi);
                jmlmenu++;
            }

            if(var.getsirkulasi_obat2()==true){
                Panelmenu.add(btnSirkulasi2);
                jmlmenu++;
            }

            if(var.getriwayat_obat_alkes_bhp()==true){
                Panelmenu.add(btnRiwayatBarangMedis);
                jmlmenu++;
            }

            if(var.getdarurat_stok()==true){
                Panelmenu.add(btnDaruratStok);
                jmlmenu++;
            }
        }else if(cmbMenu.getSelectedIndex()==3){
            jmlmenu=0;
            if(var.getsatuan_barang()==true){
                Panelmenu.add(btnSatuan);
                jmlmenu++;
            }

            if(var.getipsrs_jenis_barang()==true){
                Panelmenu.add(btnJenisIpsrs);
                jmlmenu++;
            }

            if(var.getipsrs_barang()==true){
                Panelmenu.add(btnBarangIpsrs);
                jmlmenu++;
            }

            if(var.getsuplier_penunjang()==true){
                Panelmenu.add(btnSuplierIPSRS);
                jmlmenu++;
            }

            if(var.getipsrs_pengadaan_barang()==true){
                Panelmenu.add(btnPembelianIpsrs);
                jmlmenu++;
            }

            if(var.getipsrs_stok_keluar()==true){
                Panelmenu.add(btnPengeluaranIpsrs);
                jmlmenu++;
            }

            if(var.getipsrs_pengeluaran_harian()==true){
                Panelmenu.add(btnRBiayaIpsrs);
                jmlmenu++;
            }

            if(var.getipsrs_rekap_pengadaan()==true){
                Panelmenu.add(btnRHMasukIpsrs);
                jmlmenu++;
            }

            if(var.getipsrs_rekap_stok_keluar()==true){
                Panelmenu.add(btnRHKeluarIpsrs);
                jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==4){
            jmlmenu=0;
            if(var.getharian_tindakan_poli()==true){
                Panelmenu.add(btnTagihanPoli);
                jmlmenu++;
            }

            if(var.getharian_kamar()==true){
                Panelmenu.add(btnHarianKamar);
                jmlmenu++;
            }

            if(var.getharian_tindakan_dokter()==true){
                Panelmenu.add(btnTagihanDokter);
                jmlmenu++;
            }

            if(var.getobat_per_poli()==true){
                Panelmenu.add(btnTagihanObatPoli);
                jmlmenu++;
            }

            if(var.getobat_per_kamar()==true){
                Panelmenu.add(btnTagihanObatBangsal);
                jmlmenu++;
            }

            if(var.getobat_per_dokter_ralan()==true){
                Panelmenu.add(btnObatPasienRalan);
                jmlmenu++;
            }

            if(var.getobat_per_dokter_ranap()==true){
                Panelmenu.add(btnObatPasienRanap);
                jmlmenu++;
            }

            if(var.getobat_per_dokter_peresep()==true){
                Panelmenu.add(btnObatPasienPeresep);
                jmlmenu++;
            }

            if(var.getobat_per_cara_bayar()==true){
                Panelmenu.add(btnObatPerCaraBayar);
                jmlmenu++;
            }

            if(var.getjm_ranap_dokter()==true){
                Panelmenu.add(btnJMDetailDokter);
                jmlmenu++;
            }

            if(var.getharian_dokter()==true){
                Panelmenu.add(btnRHDOkter);
                jmlmenu++;
            }

            if(var.getbulanan_dokter()==true){
                Panelmenu.add(btnRBDokter);
                jmlmenu++;
            }

            if(var.getharian_paramedis()==true){
                Panelmenu.add(btnRHParamedis);
                jmlmenu++;
            }

            if(var.getbulanan_paramedis()==true){
                Panelmenu.add(btnRBParamedis);
                jmlmenu++;
            }

            if(var.getharian_js()==true){
                Panelmenu.add(btnRHJasaSarana);
                jmlmenu++;
            }

            if(var.getbulanan_js()==true){
                Panelmenu.add(btnRBJasaSarana);
                jmlmenu++;
            }

            if(var.getharian_kso()==true){
                Panelmenu.add(btnRHKSO);
                jmlmenu++;
            }

            if(var.getbulanan_kso()==true){
                Panelmenu.add(btnRBKSO);
                jmlmenu++;
            }

            if(var.getharian_menejemen()==true){
                Panelmenu.add(btnRHMenejemen);
                jmlmenu++;
            }

            if(var.getbulanan_menejemen()==true){
                Panelmenu.add(btnRBMenejemen);
                jmlmenu++;
            }

            if(var.getharian_paket_bhp()==true){
                Panelmenu.add(btnRHPaketBHP);
                jmlmenu++;
            }

            if(var.getbulanan_paket_bhp()==true){
                Panelmenu.add(btnRBPaketBHP);
                jmlmenu++;
            }

            if(var.getfee_visit_dokter()==true){
                Panelmenu.add(btnfee_visit_dokter);
                jmlmenu++;
            }

            if(var.getfee_bacaan_ekg()==true){
                Panelmenu.add(btnfee_bacaan_ekg);
                jmlmenu++;
            }

            if(var.getfee_rujukan_rontgen()==true){
                Panelmenu.add(btnfee_rujukan_rontgen);
                jmlmenu++;
            }

            if(var.getfee_rujukan_ranap()==true){
                Panelmenu.add(btnfee_rujukan_ranap);
                jmlmenu++;
            }

            if(var.getfee_ralan()==true){
                Panelmenu.add(btnfee_ralan);
                jmlmenu++;
            }

            if(var.getpembayaran_ralan()==true){
                Panelmenu.add(btnRalanMasuk);
                jmlmenu++;
            }

            if(var.getpembayaran_ranap()==true){
                Panelmenu.add(btnRanapMasuk);
                jmlmenu++;
            }

            if(var.getrekap_pembayaran_ralan()==true){
                Panelmenu.add(btnTagihanRalanPerhari);
                jmlmenu++;
            }

            if(var.getrekap_pembayaran_ranap()==true){
                Panelmenu.add(btnTagihanRanapPerhari);
                jmlmenu++;
            }

            if(var.gettagihan_masuk()==true){
                Panelmenu.add(btnTagihanMasuk);
                jmlmenu++;
            }

            if(var.gettambahan_biaya()==true){
                Panelmenu.add(btnTambahanBiaya);
                jmlmenu++;
            }

            if(var.getpotongan_biaya()==true){
                Panelmenu.add(btnPotonganBiaya);
                jmlmenu++;
            }

            if(var.getdeposit_pasien()==true){
                Panelmenu.add(btnDeposit);
                jmlmenu++;
            }

            if(var.getrekap_per_shift()==true){
                Panelmenu.add(btnRekapPershift);
                jmlmenu++;
            }

            if(var.getpayment_point()==true){
                Panelmenu.add(btnPaymentPoint);
                jmlmenu++;
            }
        }else if(cmbMenu.getSelectedIndex()==5){
            jmlmenu=0;
            if(var.geticd9()==true){
                Panelmenu.add(btnICD9);
                jmlmenu++;
            }

            if(var.getpenyakit()==true){
                Panelmenu.add(btnICD);
                jmlmenu++;
            }

            if(var.getobat_penyakit()==true){
                Panelmenu.add(btnObatPenyakit);
                jmlmenu++;
            }

            if(var.getkunjungan_ralan()==true){
                Panelmenu.add(btnKunjunganRalan);
                jmlmenu++;
            }

            if(var.getkunjungan_ranap()==true){
                Panelmenu.add(btnKunjunganRanap);
                jmlmenu++;
            }

            if(var.getsensus_harian_poli()==true){
                Panelmenu.add(btnSensusHarianPoli);
                jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==6){
            jmlmenu=0;
            if(var.getkamar()==true){
                Panelmenu.add(btnKamar);
                jmlmenu++;
            }

            if(var.gettarif_ralan()==true){
                Panelmenu.add(btnTindakanRalan);
                jmlmenu++;
            }

            if(var.gettarif_ranap()==true){
                Panelmenu.add(btnTindakanRanap);
                jmlmenu++;
            }

            if(var.gettarif_lab()==true){
                Panelmenu.add(btnTarifLab);
                jmlmenu++;
            }

            if(var.gettarif_radiologi()==true){
                Panelmenu.add(btnTarifRadiologi);
                jmlmenu++;
            }

            if(var.gettarif_operasi()==true){
                Panelmenu.add(btnPaketOperasi);
                jmlmenu++;
            }

            if(var.getakun_rekening()==true){
                Panelmenu.add(btnRekening);
                jmlmenu++;
            }

            if(var.getrekening_tahun()==true){
                Panelmenu.add(btnRekeningTahun);
                jmlmenu++;
            }

            if(var.getakun_bayar()==true){
                Panelmenu.add(btnakun_bayar);
                jmlmenu++;
            }

            if(var.getakun_piutang()==true){
                Panelmenu.add(btnAkunPiutang);
                jmlmenu++;
            }

            if(var.getpengaturan_rekening()==true){
                Panelmenu.add(btnPengaturanRekening);
                jmlmenu++;
            }

            if(var.getpengeluaran()==true){
                Panelmenu.add(btnPengeluaran);
                jmlmenu++;
            }

            if(var.getpemasukan_lain()==true){
                Panelmenu.add(btnPemasukanLain);
                jmlmenu++;
            }

            if(var.getdeposit_pasien()==true){
                Panelmenu.add(btnDeposit);
                jmlmenu++;
            }

            if(var.getpiutang_pasien()==true){
               Panelmenu.add(btnLihatPiutang);
               jmlmenu++;
            }

            if(var.getrincian_piutang_pasien()==true){
               Panelmenu.add(btnRincianPiutangPasien);
               jmlmenu++;
            }

            if(var.getpiutang_pasien2()==true){
               Panelmenu.add(btnPiutangBelumLunas);
               jmlmenu++;
            }

            if(var.getbayar_piutang()==true){
               Panelmenu.add(btnBayarPiutang);
               jmlmenu++;
            }

            if(var.gethutang_obat()==true){
                Panelmenu.add(btnHutangObat);
                jmlmenu++;
            }

            if(var.getbayar_pemesanan_obat()==true){
                Panelmenu.add(btnbayar_pemesanan);
                jmlmenu++;
            }

            if(var.getposting_jurnal()==true){
                Panelmenu.add(btnPostingJurnal);
                jmlmenu++;
            }

            if(var.getjurnal_harian()==true){
                Panelmenu.add(btnJurnalHarian);
                jmlmenu++;
            }

            if(var.getbuku_besar()==true){
                Panelmenu.add(btnBubes);
                jmlmenu++;
            }

            if(var.getcashflow()==true){
                Panelmenu.add(btnCashFlow);
                jmlmenu++;
            }

            if(var.getkeuangan()==true){
                Panelmenu.add(btnLabaRugi);
                jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==7){
            jmlmenu=0;
            if(var.getbpjs_cek_kartu()==true){
                Panelmenu.add(btnCekBPJSKartu);
                jmlmenu++;
            }

            if(var.getbpjs_cek_nik()==true){
                Panelmenu.add(btnCekBPJSNik);
                jmlmenu++;
            }

            if(var.getbpjs_cek_riwayat()==true){
                Panelmenu.add(btnCekBPJSRiwayat);
                jmlmenu++;
            }

            if(var.getbpjs_cek_nomor_rujukan()==true){
                Panelmenu.add(btnCekBPJSNomorRujukanPCare);
                jmlmenu++;
            }

            if(var.getbpjs_referensi_diagnosa()==true){
                Panelmenu.add(btnCekBPJSDiagnosa);
                jmlmenu++;
            }

            if(var.getbpjs_referensi_poli()==true){
                Panelmenu.add(btnCekBPJSPoli);
                jmlmenu++;
            }

            if(var.getbpjs_referensi_faskes()==true){
                Panelmenu.add(btnCekBPJSFaskes);
                jmlmenu++;
            }

            if(var.getbpjs_sep()==true){
                Panelmenu.add(btnBPJSSEP);
                jmlmenu++;
            }

            if(var.getbpjs_monitoring_klaim()==true){
                Panelmenu.add(btnMonitoringKlaim);
                jmlmenu++;
            }

            if(var.getaplicare_referensi_kamar()==true){
                Panelmenu.add(btnAplicareReferensiKamar);
                jmlmenu++;
            }

            if(var.getaplicare_ketersediaan_kamar()==true){
                Panelmenu.add(btnAplicareKetersediaanKamar);
                jmlmenu++;
            }

            if(var.getaplicare_ketersediaan_kamar()==true){
                Panelmenu.add(btnReferensiPendaftaranMobileJKN);
                jmlmenu++;
            }
            
            if(var.getaplicare_ketersediaan_kamar()==true){
                Panelmenu.add(btnBatalPendaftaranMobileJKN);
                jmlmenu++;
            }
            
        }else if(cmbMenu.getSelectedIndex()==8){
            jmlmenu=0;
            if(var.getpasien()==true){
                Panelmenu.add(btnPasien);
                jmlmenu++;
            }

            if(var.getkelahiran_bayi()==true){
                Panelmenu.add(btnLahir);
                jmlmenu++;
            }

            if(var.getpasien_meninggal()==true){
                Panelmenu.add(btnPasienMati);
                jmlmenu++;
            }

            if(var.getdiagnosa_pasien()==true){
                Panelmenu.add(btnDiagnosa);
                jmlmenu++;
            }

            if(var.getresume_pasien()==true){
                Panelmenu.add(btnResume);
                jmlmenu++;
            }

            if(var.getretensi_rm()==true){
                Panelmenu.add(btnRetensiRM);
                jmlmenu++;
            }

        }else if(cmbMenu.getSelectedIndex()==9){
            jmlmenu=0;
            if(var.getaplikasi()==true){
                Panelmenu.add(btnSetupAplikasi);
                jmlmenu++;
            }

            if(var.getadmin()==true){
                Panelmenu.add(btnAdmin);
                jmlmenu++;
            }

            if(var.getsetup_pjlab()==true){
                Panelmenu.add(btnSetPenjab);
                jmlmenu++;
            }

            if(var.getsetup_otolokasi()==true){
                Panelmenu.add(btnSetupOtoLokasi);
                jmlmenu++;
            }

            if(var.getsetup_jam_kamin()==true){
                Panelmenu.add(btnSetupJamInap);
                jmlmenu++;
            }

            if(var.getset_harga_kamar()==true){
                Panelmenu.add(btnSetHargaKamar);
                jmlmenu++;
            }

            if(var.getsetup_embalase()==true){
                Panelmenu.add(btnSetupEmbalase);
                jmlmenu++;
            }

            if(var.getuser()==true){
                Panelmenu.add(btnUser);
                jmlmenu++;
            }

            if(var.gettracer_login()==true){
                Panelmenu.add(btnTracker);
                jmlmenu++;
            }

            if(var.getdisplay()==true){
               Panelmenu.add(btnDisplay);
               jmlmenu++;
            }

            if(var.getset_harga_obat()==true){
                Panelmenu.add(btnSetupHarga);
                jmlmenu++;
            }

            if(var.getset_harga_obat_ralan()==true){
                Panelmenu.add(btnSetObatRalan);
                jmlmenu++;
            }

            if(var.getset_harga_obat_ranap()==true){
                Panelmenu.add(btnSetObatRanap);
                jmlmenu++;
            }

            if(var.getset_penggunaan_tarif()==true){
                Panelmenu.add(btnSetupTarif);
                jmlmenu++;
            }

            if(var.getset_oto_ralan()==true){
                Panelmenu.add(btnSetOtoRalan);
                jmlmenu++;
            }

            if(var.getbiaya_harian()==true){
                Panelmenu.add(btnSetBiayaHarian);
                jmlmenu++;
            }

            if(var.getbiaya_masuk_sekali()==true){
                Panelmenu.add(btnSetBiayaMasukSekali);
                jmlmenu++;
            }

            if(var.getset_no_rm()==true){
                Panelmenu.add(btnSetupRM);
                jmlmenu++;
            }

            if(var.getset_nota()==true){
                Panelmenu.add(btnSetupNota);
                jmlmenu++;
            }

            if(var.getclosing_kasir()==true){
                Panelmenu.add(btnClosingKasir);
                jmlmenu++;
            }

            if(var.getketerlambatan_presensi()==true){
                Panelmenu.add(btnKeterlambatanPresensi);
                jmlmenu++;
            }
        }
        if(jmlmenu<=1){
            Panelmenu.setLayout(new GridLayout(0,1));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()-5));
        }else if(jmlmenu<=4){
            Panelmenu.setLayout(new GridLayout(0,2));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()-5));
        }else if(jmlmenu<=9){
            Panelmenu.setLayout(new GridLayout(0,3));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()-5));
        }else if(jmlmenu<=16){
            Panelmenu.setLayout(new GridLayout(0,4));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()-5));
        }else if(jmlmenu<=20){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()-5));
        }else if(jmlmenu<=25){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+(scrollPane2.getHeight()/4)));
        }else if(jmlmenu<=30){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+((scrollPane2.getHeight()/4)*2)));
        }else if(jmlmenu<=35){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+((scrollPane2.getHeight()/4)*3)));
        }else if(jmlmenu<=40){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+((scrollPane2.getHeight()/4)*4)));
        }else if(jmlmenu<=45){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+((scrollPane2.getHeight()/4)*5)));
        }else if(jmlmenu<=50){
            Panelmenu.setLayout(new GridLayout(0,5));
            Panelmenu.setPreferredSize(new Dimension(scrollPane2.getWidth()-10,scrollPane2.getHeight()+((scrollPane2.getHeight()/4)*6)));
        }
        Panelmenu.repaint();
        DlgHome.setVisible(true);
    }

    public void isWall(){
        try{
            ps=koneksi.prepareStatement("select nama_instansi, alamat_instansi, kabupaten, propinsi, aktifkan, wallpaper,kontak,email,logo from setting");
            try {
                rs=ps.executeQuery();
                while(rs.next()){
                    jLabel8.setText(rs.getString(1));
                    this.setTitle("SIM "+rs.getString("nama_instansi"));
                    jLabel11.setText(rs.getString(2) +", "+rs.getString(3) +", "+rs.getString(4) +" ");
                    var.setnamars(rs.getString("nama_instansi"));
                    var.setalamatrs(rs.getString("alamat_instansi"));
                    var.setkabupatenrs(rs.getString("kabupaten"));
                    var.setpropinsirs(rs.getString("propinsi"));
                    var.setkontakrs(rs.getString("kontak"));
                    var.setemailrs(rs.getString("email"));

                    if(rs.getString(5).equals("Yes")){
                        Blob blob = rs.getBlob(6);
                        PanelWall.setBackgroundImage(new javax.swing.ImageIcon(blob.getBytes(1, (int) (blob.length()))));
                        repaint();
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }
        }catch(Exception e){
            System.out.println("Notifikasi : Silahkan Set Aplikasi "+e);
        }
    }

    private void isTutup() {
        FlayMenu.setVisible(false);
        var.setform("frmUtama");
        Window[] wins = Window.getWindows();
        for (Window win : wins) {
            if (win instanceof JDialog) {
                win.dispose();
            }
        }
    }

    private void setToolbar(){
        if(internalFrame1.getWidth()<(BtnMenu.getWidth()+BtnToolReg.getWidth()+btnToolIGD.getWidth()+
                btnToolRad.getWidth()+BtnToolJualObat.getWidth()+BtnToolKamnap.getWidth()+
                BtnToolKasir.getWidth()+BtnLog.getWidth()+BtnClose.getWidth()+8)){
            internalFrame1.setSize(new Dimension(PanelUtama.getWidth(),90));
        }else{
            internalFrame1.setSize(new Dimension(PanelUtama.getWidth(),44));
        }
    }


}
