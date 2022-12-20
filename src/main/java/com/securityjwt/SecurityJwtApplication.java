package com.securityjwt;

import com.securityjwt.config.RsaKeyProperties;
import com.securityjwt.entity.Utilisateur;
import com.securityjwt.repository.UtilisateurRepository;
import com.securityjwt.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class SecurityJwtApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       

    }
}
