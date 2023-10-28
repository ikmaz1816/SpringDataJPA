package com.springdata.Jpa.studentRepository;

import com.springdata.Jpa.onetoone.StudentMapping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentMappingOne extends CrudRepository<StudentMapping,Integer> {
    @Query(

            value="select s.*,c.* from student s inner join course c on s.cid=c.cid",
            nativeQuery = true
    )
    List<Object> getMapping();

    @Query(

            value="select s.roll,c.cid from student s inner join course c on s.cid=c.cid",
            nativeQuery = true
    )
    List<Object[]> getMappingOfParticular();

}
