/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class pemilihClass {
    private String npm, nama_pemilih, password_pemilih;
    private int status;
    
    public pemilihClass(){
        npm = "";
        nama_pemilih = "";
        password_pemilih = "";
        status = 0;
    }
    
    public void setNpm(String npm){
        this.npm = npm;
    }
    public void setNama_pemilih(String nama_pemilih){
        this.nama_pemilih = nama_pemilih;
    }
    public void setPassword_pemilih(String password_pemilih){
        this.password_pemilih = password_pemilih;
    }
    public void setStatus(int status){
        this.status = status;
    }
    
    public String getNpm(){
        return npm;
    }
    public String getNama_pemilih(){
        return nama_pemilih;
    }
    public String getPassword_pemilih(){
        return password_pemilih;
    }
    public int getStatus(){
        return status;
    }
    
    public void insertPemilih(){
        Koneksi kon = new Koneksi();
        String s = "insert into pemilih values ('"+this.npm+"', '"+this.nama_pemilih+"', '"+this.password_pemilih+"', '"+this.status+"')";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Data Pemilih Berhasil Ditambahkan");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void updatePemilih(){
        Koneksi kon = new Koneksi();
        String s = "update pemilih set nama_pemilih = '"+this.nama_pemilih+"' where npm = '"+this.npm+"'";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Data Pemilih Berhasil Diperbarui");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void voted(){
        Koneksi kon = new Koneksi();
        String s = "update pemilih set status = '1' where npm = '"+this.npm+"'";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Data Pemilih Berhasil Diperbarui");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void deletePemilih(){
        Koneksi kon = new Koneksi();
        String s = "delete from pemilih where npm = '"+this.npm+"'";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Data Pemilih Berhasil Dihapus");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ResultSet getPemilih(){
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into pemilih values ('"+this.npm+"', '"+this.nama_pemilih+"', '"+this.password_pemilih+"', '"+this.status+"')";
        kon.query(s);
        return r;
    }
}
