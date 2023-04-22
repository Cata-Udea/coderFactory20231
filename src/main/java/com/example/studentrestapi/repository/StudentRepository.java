package com.example.studentrestapi.repository;

import com.example.studentrestapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


    Student findByFullNameStartingWith(String name);


    /*
    //@Query("query compleja con jpql basado en las entidades del proyecto")
    @Query("select new Student(id, fullName, document) from Student s where s.id={id}")
    Student findById(Integer id);
    */
}
