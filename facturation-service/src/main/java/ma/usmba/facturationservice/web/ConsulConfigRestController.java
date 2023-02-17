package ma.usmba.facturationservice.web;

import ma.usmba.facturationservice.config.MyConsulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;
    @Value("${token.accessTokenTimeout}")
    private long accessTokenTimeout;
    @Value("${token.refreshTokenTimeout}")
    private long refreshTokenTimeout;

//    @GetMapping("/myConfig")
//    public MyConsulConfig myConfig(){
//        return myConsulConfig;
//    }
    @GetMapping("/myConfig")
    public Map<String, Object> myConfig(){
        return Map.of("accessTokenTimeout",accessTokenTimeout,"refreshTokenTimeout",refreshTokenTimeout);
    }
}
