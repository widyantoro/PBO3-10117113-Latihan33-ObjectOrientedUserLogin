/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan33.objectorienteduserlogin;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program untuk user login
 * 
 */
public class User {
    private  String userName;
    private  String password;
    public Boolean statusAkun;
    private boolean cekAkun (String parUsername,String parPassword){
        userName = "RizkiAdam";
        password = "terbaikselalu";
        statusAkun = parPassword.equals(password) && parUsername.equals(userName);
         return statusAkun;
            
     }
     private void hasilLogin (Boolean parStatusAkun,String parUsername ){
      if (parStatusAkun==true) {
            System.out.println("\n******HALLO "+parUsername.toUpperCase()
                    +"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password Anda Salah");
        }   
     }
      public void pengecekkanLogin (String parUsername,String parPassword){
         cekAkun(parUsername,parPassword);
        hasilLogin(statusAkun,parUsername);
     }
}
