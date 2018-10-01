/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan26_waktusaatini;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan waktu saat 
* ini sesuai dengan lokasi kita berada
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




public class PBO3_10117082_Latihan26_WaktuSaatIni {
    public static void main (String[] args) {
    Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamis","Jumat"};

     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+", "
             +formatIndo.format(date));
      
   
}

    
}
