package com.testProject.demo.common.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Roles {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int Role_id  ;
    @Column(name = "role_name")
    private String roleName ;


    @OneToMany(mappedBy="role",cascade = CascadeType.ALL)
    private Set<Actions> actions;







}







