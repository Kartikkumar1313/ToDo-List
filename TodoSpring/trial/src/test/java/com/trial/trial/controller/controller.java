package com.trial.trial.controller;

import com.trial.trial.entity.entity;
import com.trial.trial.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {

    @Autowired
    private service service1;



    @RequestMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("student", service1.getAllStudent());
        return "trial";
    }

    @GetMapping
    public String verify(Model model){
        return "verify";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        entity e1 = new entity();
        model.addAttribute("student", e1);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") entity e1){
        service1.saveStudent(e1);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Integer id, Model model){
        model.addAttribute("student", service1.getStudentByID(id));
        return "update_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Integer id, @ModelAttribute("student") entity e1){

        //get student from database by id

        entity e2 = service1.getStudentByID(id);
        e2.setId(id);
        e2.setFirstName(e1.getFirstName());
        e2.setLastName(e1.getLastName());
        e2.setEmail(e1.getEmail());

        //save updated student object
        service1.updateStudent(e1);
        return "redirect:/students";
    }

    //Delete Student
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service1.deleteStudentByID(id);
        return "redirect:/students";
    }
}
