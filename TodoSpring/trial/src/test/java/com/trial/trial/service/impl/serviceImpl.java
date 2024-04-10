package com.trial.trial.service.impl;

import com.trial.trial.entity.entity;
import com.trial.trial.repository.repository;
import com.trial.trial.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements service {

    @Autowired
    private repository repo;

    public serviceImpl(repository repo) {
        this.repo = repo;
    }

    @Override
    public List<entity> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public entity saveStudent(entity e1) {
        return repo.save(e1);
    }

    @Override
    public entity getStudentByID(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public entity updateStudent(entity e1) {
        return repo.save(e1);
    }

    @Override
    public void deleteStudentByID(Integer id) {
        repo.deleteById(id);
    }

}
