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
    
    public Double getnilai(String nilai){
        
        Double konvert = Double.valueOf(nilai);
        
        return konvert;
    }
    
    public Double reamur(Double c){
         Double reamur = c*4/5;
        
        return reamur;
    }
    
    public Double fahrenheit(Double c){
        Double fah = (c*9/5)+32;
        
        return fah;
    }
    
    public Double kelvin(Double c ){
        
        Double kel = c+273.15;
        
        return kel;
    }
}
