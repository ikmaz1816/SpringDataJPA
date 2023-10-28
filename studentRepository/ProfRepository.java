package com.springdata.Jpa.studentRepository;

import com.springdata.Jpa.entity.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfRepository extends CrudRepository<Professor,Integer> {

}
