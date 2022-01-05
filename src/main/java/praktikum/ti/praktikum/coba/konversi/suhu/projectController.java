/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.ti.praktikum.coba.konversi.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import praktikum.ti.praktikum.coba.konversi.suhu.Classpemrosesan;

@Controller
@ResponseBody
/**
 *
 * @author USER_64
 */
public class projectController {
    
    Classpemrosesan proses = new Classpemrosesan();
    
    @RequestMapping("/suhu")
    public String suhu(){
    
        String suhu = proses.getSuhu();
                
        return suhu;
    }
}
