package com.springdata.Jpa.studentRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springdata.Jpa.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    Student findByNameAndAddress(String name,String address);

    Student findByNameIgnoreCase(String name);

    Student findByNameContaining(String name);

    Student findByNameEqualsIgnoreCase(String name);

    Student findByNameAndEmail(String name,String email);
}
