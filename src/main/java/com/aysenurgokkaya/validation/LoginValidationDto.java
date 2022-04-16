package com.aysenurgokkaya.validation;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

//validation anonation: @NotEmpty, @Size,@Min,Max,@Pattern,@Email
public class LoginValidationDto {



    @NotEmpty(message = "email boş geçemezsiniz")
    @Email(message="uygun formatta yazmadınız örn: xyz@example.com")
    private String loginEmailAddress;


    @NotEmpty(message = "şifre 4 karakterden küçük olamaz")
    @Size(min=4,max=100)
    private String loginPassword;

}
