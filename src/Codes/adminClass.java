/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

/**
 *
 * @author Lenovo
 */
public class adminClass {
    private int admin_id;
    private String username_admin, password_admin;
    
    public adminClass(){
        admin_id = 0;
        username_admin = "";
        password_admin = "";
    }
    
    public void setAdmin_id(int admin_id){
        this.admin_id = admin_id;
    }
    public void setUsername_admin(String username_admin){
        this.username_admin = username_admin;
    }
    public void setPassword_admin(String password_admin){
        this.password_admin = password_admin;
    }
    
    public int getAdmin_id(){
        return admin_id;
    }
    public String getUsername_admin(){
        return username_admin;
    }
    public String getPassword_admin(){
        return password_admin;
    }
}
