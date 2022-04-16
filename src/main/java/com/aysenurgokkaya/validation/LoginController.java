package com.aysenurgokkaya.validation;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Log4j2
@Controller
public class LoginController {

    //ORTAK: url-model

    //http://localhost:8080/login
    @GetMapping("login")
    public String getValidation(Model model) {
        model.addAttribute("key_validation", new LoginValidationDto());
        return "_13_login";
    }

    //http://localhost:8080/validation
    @PostMapping("login")
    public String postValidation(@Valid @ModelAttribute("key_validation") LoginValidationDto dto, BindingResult result) {
        if (result.hasErrors()) {
            log.error("Hata oluştur");
            return "_13_login";
        }

        log.info("Başarılı" + dto);
        //database gönderirsiniz
        //dosya FileReader FileWriter

        return "loginSuccess";
    }
}
