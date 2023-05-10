package com.testProject.demo.repository;


import com.testProject.demo.common.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles , Integer> {


}
