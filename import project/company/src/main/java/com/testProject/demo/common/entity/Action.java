package com.testProject.demo.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "action")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Action {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ac_id;
    private String name_action;
    @Column(name = "date_action")
    private String data_Action;
    @Column(name = "cod_action")
    private String code_Action;




    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;












}
