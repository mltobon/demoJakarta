package com.example.demo.services;

import com.example.demo.domain.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> listar();

    Student porId(Long id);

    void guardar(Student t);

    void eliminar(Long id);
}
