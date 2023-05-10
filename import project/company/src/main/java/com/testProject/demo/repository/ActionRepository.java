package com.testProject.demo.repository;


import com.testProject.demo.common.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action,Integer> {



}
