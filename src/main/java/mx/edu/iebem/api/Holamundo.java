package mx.edu.iebem.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {
    @RequestMapping("/")
     public String Hola(){
        return "hola mundo !!!!!";
     }
}
