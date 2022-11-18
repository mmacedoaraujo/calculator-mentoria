package com.mmacedoaraujo.domain;

import jdk.jfr.Timestamp;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_tb")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Timestamp birthDate;
    private String cpf;
    private String street;
    private String city;
    private String state;
    private Integer cep;
    private Integer phoneNumber;
    private String email;

}
