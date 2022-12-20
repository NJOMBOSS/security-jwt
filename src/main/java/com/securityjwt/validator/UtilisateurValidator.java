package com.securityjwt.validator;


import com.securityjwt.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

  public static List<String> validate(UtilisateurDto dto) {
    List<String> errors = new ArrayList<>();

    if (dto == null) {
      errors.add("Veuillez renseigner l'adresse mail valide");
      errors.add("Veuillez renseigner le mot de passe d'utilisateur");

      return errors;
    }


    if (!StringUtils.hasLength(dto.getEmail())) {
      errors.add("Veuillez renseigner l'email d'utilisateur");
    }
    if (!StringUtils.hasLength(dto.getMoteDePasse())) {
      errors.add("Veuillez renseigner le mot de passe d'utilisateur");
    }

    return errors;
  }

}
