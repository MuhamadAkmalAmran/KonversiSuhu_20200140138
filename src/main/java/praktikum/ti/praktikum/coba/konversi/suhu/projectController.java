/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.ti.praktikum.coba.konversi.suhu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 *
 * @author USER_64
 */
public class projectController {
    
    @RequestMapping("/convert")
    public String suhu(HttpServletRequest vert, Model ubah){
        Classpemrosesan proses = new Classpemrosesan();
        
       String input = vert.getParameter("var_input");
       
       Double change = proses.getnilai(input);
       Double kreamur = proses.reamur(change);
       Double kfar = proses.fahrenheit(change);
       Double kkel = proses.kelvin(change);
       
    
        ubah.addAttribute("nilai",change);
        ubah.addAttribute("reamur",kreamur);
        ubah.addAttribute("fahrenheit",kfar);
        ubah.addAttribute("kelvin",kkel);
                
        return "konversi";
    }
}
