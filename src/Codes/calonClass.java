/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;
import Codes.Koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class calonClass {

    private int no_urut;
    private String nama_calon, visi_misi;

    public calonClass() {
        no_urut = 0;
        nama_calon = "";
        visi_misi = "";
    }

    public void setNoUrut(int no_urut) {
        this.no_urut = no_urut;
    }

    public void setNamaCalon(String nama_calon) {
        this.nama_calon = nama_calon;
    }

    public void setVisiMisi(String visi_misi) {
        this.visi_misi = visi_misi;
    }

    public int getNoUrurt() {
        return no_urut;
    }

    public String getNamaCalon() {
        return nama_calon;
    }

    public String getVisiMisi() {
        return visi_misi;
    }

    public void updateCalon() {
        Koneksi kon = new Koneksi();
        String query = "UPDATE calon SET nama_calon = ?, visi_misi = ? WHERE no_urut = ?";

        try (PreparedStatement preparedStatement = kon.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, this.nama_calon);
            preparedStatement.setString(2, this.visi_misi);
            preparedStatement.setInt(3, this.no_urut);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data Calon berhasil diperbarui");
            } else {
                JOptionPane.showMessageDialog(null, "Data Calon tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteCalon() {
        Koneksi kon = new Koneksi();
        String s = "delete from calon where no_urut = '" + this.no_urut + "'";
        try {
            kon.query(s);
            JOptionPane.showMessageDialog(null, "Data Pemilih Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
