package com.trial.trial.service;

import com.trial.trial.entity.entity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface service {
    List<entity> getAllStudent();

    entity saveStudent(entity e1);

    entity getStudentByID(Integer id);

    entity updateStudent(entity e1);

    void deleteStudentByID(Integer id);
}
