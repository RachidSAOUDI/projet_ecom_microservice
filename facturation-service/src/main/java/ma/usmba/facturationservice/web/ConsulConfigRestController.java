package ma.usmba.facturationservice.web;

import ma.usmba.facturationservice.config.MyConsulConfig;
import ma.usmba.facturationservice.config.MyVaultConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;
    @Autowired
    private MyVaultConfig myVaultConfig;

    @GetMapping("/myConfig")
    public MyConsulConfig myConfig(){
        return myConsulConfig;
    }

    @GetMapping("/myConfigVault")
    public Map<String,Object> myConfigVault(){
        return Map.of("consulConfig",myConsulConfig,"vaultConfig",myVaultConfig);
    }
}
