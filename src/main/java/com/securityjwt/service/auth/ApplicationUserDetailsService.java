package com.securityjwt.service.auth;

import com.securityjwt.entity.Utilisateur;
import com.securityjwt.exception.EntityNotFoundException;
import com.securityjwt.exception.ErrorCodes;
import com.securityjwt.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {
    @Autowired
    private  UtilisateurRepository utilisateurRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Utilisateur utilisateur = utilisateurRepository.findByEmail(email).orElseThrow(()->
        new EntityNotFoundException("Aucun utilisateur avec l'email fourni", ErrorCodes.UTILISATEUR_NOT_FOUND)
        );

        return new User(utilisateur.getEmail(),utilisateur.getMotDePasse(), Collections.emptyList());
    }
}