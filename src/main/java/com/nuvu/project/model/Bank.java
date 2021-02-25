package com.nuvu.project.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "GET_BANCO")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BANCO")
    private Integer idBank;

    @Column(name = "CODIGO")
    private String code;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "ACTIVO")
    private String isActive;

}
