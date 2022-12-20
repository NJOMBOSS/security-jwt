package com.securityjwt.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="datedenaissance")
    private Instant dateDenaissance;

    @Column(name="email")
    private String email;

    @Column(name = "motdepasse")
    private String moteDePasse;

}
