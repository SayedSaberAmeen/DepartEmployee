package com.testProject.demo.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Actions {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ac_id;
    private String name_action;
    @Column(name = "date_action")
    private String dataAction;
    @Column(name = "cod_action")
    private String codAction;














}
