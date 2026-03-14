package mg.tpspring.restapi.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mg.tpspring.restapi.dto.LoginDTO;
import mg.tpspring.restapi.service.AuthService;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginDTO dto){
    String token = authService.login(dto.getEmail(),dto.getPassword());

    if(token == null){
        return Map.of("message","invalid login");
    }
        return Map.of("token",token);
    }  
}
