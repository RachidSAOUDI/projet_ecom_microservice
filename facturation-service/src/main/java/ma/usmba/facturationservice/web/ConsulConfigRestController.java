package ma.usmba.facturationservice.web;

import ma.usmba.facturationservice.config.MyConsulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;

    @GetMapping("/myConfig")
    public MyConsulConfig myConfig(){
        return myConsulConfig;
    }
}
