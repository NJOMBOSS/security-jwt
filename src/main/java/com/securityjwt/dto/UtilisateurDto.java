package com.securityjwt.dto;


import com.securityjwt.entity.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String email;

    private String motDePasse;



    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }

        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .email(utilisateur.getEmail())
                .motDePasse(utilisateur.getMotDePasse())
                .build();
    }

    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if(utilisateurDto == null){
            return null;
        }

        Utilisateur u = new Utilisateur();
        u.setId(utilisateurDto.getId());
        u.setEmail(utilisateurDto.getEmail());
        u.setMotDePasse(utilisateurDto.getMotDePasse());

        return u;
    }


}
