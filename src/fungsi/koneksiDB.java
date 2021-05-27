/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author khanzasoft
 */
public final class koneksiDB {
    public koneksiDB(){}    
    private static Connection connection=null;
    private static final Properties prop = new Properties();  
    private static final MysqlDataSource dataSource=new MysqlDataSource();
    private static String caricepat="",var="";
    public static Connection condb(){      
        if(connection == null){
            try{
                prop.loadFromXML(new FileInputStream("setting/database.xml"));
                dataSource.setURL("jdbc:mysql://"+prop.getProperty("HOST")+":"+prop.getProperty("PORT")+"/"+prop.getProperty("DATABASE")+"?zeroDateTimeBehavior=convertToNull");
                dataSource.setUser(prop.getProperty("USER"));
                dataSource.setPassword(prop.getProperty("PAS"));
                connection=dataSource.getConnection();       
                System.out.println("   Koneksi Berhasil. Sorry bro loading.... \n\n"+
                        "                                                                           \n" +
                        "                                                                           \n" +
                        "                                                                           \n" +
                        "                                                                           \n" +
                        "    ____  ___  __  __  ____   ____    _  __ _                              \n" +
                        "   / ___||_ _||  \\/  ||  _ \\ / ___|  | |/ /| |__    __ _  _ __   ____ __ _ \n" +
                        "   \\___ \\ | | | |\\/| || |_) |\\___ \\  | ' / | '_ \\  / _` || '_ \\ |_  // _` |\n" +
                        "    ___) || | | |  | ||  _ <  ___) | | . \\ | | | || (_| || | | | / /| (_| |\n" +
                        "   |____/|___||_|  |_||_| \\_\\|____/  |_|\\_\\|_| |_| \\__,_||_| |_|/___|\\__,_|\n" +
                        "                                                                           \n\n"+
                        "                                                                           \n\n"+
//                        "   PROUDLY POWERED BY Instalasi ICT RSUD H. Damanhuri - Barabai                  \n"+
                        "   OPTIMIZE BY RS Aura Syfa - Kediri                                       \n"+
                        "   Version 20210512 [Legacy]                                           \n\n"+
                        "                                                                           ");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Koneksi Putus : "+e);
            }
        }
        return connection;        
    }
    
    public static String cariCepat(){
        try{
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            caricepat=prop.getProperty("CARICEPAT");
        }catch(Exception e){
            caricepat="tidak aktif"; 
        }
        return caricepat;
    }

    public static String HOST(){
        try{
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            var=prop.getProperty("HOSTHYBRIDWEB");
        }catch(Exception e){
            var="localhost"; 
        }
        return var;
    }

    public static String HOSTHYBRIDWEB(){
        try{
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            var=prop.getProperty("HOSTHYBRIDWEB");
        }catch(Exception e){
            var="";
        }
        return var;
    }

    public static String HYBRIDWEB(){
        try{
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            var=prop.getProperty("HYBRIDWEB");
        }catch(Exception e){
            var="";
        }
        return var;
    }

    public static String PORTWEB(){
        try{
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            var=prop.getProperty("PORTWEB");
        }catch(Exception e){
            var="";
        }
        return var;
    }
    
}
