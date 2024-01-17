/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class suaraClass {
    private int suara_id;
    private String npm;
    private int no_urut;
    private String waktu;
    
    public suaraClass(){
        suara_id = 0;
        npm = "";
        no_urut = 0;
        waktu = "";
    }
    
    public void setSuaraId(int suara_id){
        this.suara_id = suara_id;
    }
    public void setNpm(String npm){
        this.npm = npm;
    }
    public void setNoUrut(int no_urut){
        this.no_urut = no_urut;
    }
    public void setWaktu(String waktu){
        this.waktu = waktu;
    }
    
    public int getSuaraId(){
        return suara_id;
    }
    public String getNpm(){
        return npm;
    }
    public int getNoUrut(){
        return no_urut;
    }
    public String getWaktu(){
        return waktu;
    }
    
    public void insertSuara(){
        Koneksi kon = new Koneksi();
        String s = "INSERT INTO suara (npm, no_urut, waktu) VALUES ('" + this.npm + "', '" + this.no_urut + "', CURRENT_TIMESTAMP())";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Selamat pemilihan calon Ketua Himpunan telah berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
