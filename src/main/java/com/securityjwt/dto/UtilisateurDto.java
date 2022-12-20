package com.securityjwt.dto;


import com.securityjwt.entity.Utilisateur;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String email;

    private String moteDePasse;



    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }

        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .email(utilisateur.getEmail())
                .moteDePasse(utilisateur.getMoteDePasse())
                .build();
    }

    public static Utilisateur toEntity(UtilisateurDto dto){
        if(dto == null){
            return null;
        }

        Utilisateur u = new Utilisateur();
        u.setId(dto.getId());
        u.setEmail(dto.getEmail());
        u.setMoteDePasse(dto.getMoteDePasse());

        return u;
    }


}
