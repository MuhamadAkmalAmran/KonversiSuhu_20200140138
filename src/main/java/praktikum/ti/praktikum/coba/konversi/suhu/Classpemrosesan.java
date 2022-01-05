/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.ti.praktikum.coba.konversi.suhu;

/**
 *
 * @author USER_64
 */
public class Classpemrosesan {
    
    public String getSuhu(){
        String konversi = "";
        double celcius = 55.4;        double fahrenheit = 150.7;
        double kelvin = 200;
        
        double suhu;
        
        String pilih = "c"; //pilihan unutuk konversi
        
        if(pilih =="c"){
            suhu = fahrenheit-32*5/9;
            konversi = "suhu Celcius :" +suhu;
            
        }else if(pilih =="f"){
            suhu = 9/5*celcius+32;
            konversi = "Suhu Fahrenheit : "+ suhu;
        }else{
            konversi = "tidak di temukan";
        }
        
        return konversi;
    }
}
