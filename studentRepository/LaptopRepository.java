package com.springdata.Jpa.studentRepository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springdata.Jpa.entity.Laptop;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LaptopRepository extends CrudRepository<Laptop,String> {
    @Query("select l from Laptop l where l.laptopId=?1")
    Laptop getById(String id);

    @Query("select count(l.laptopId) from Laptop l")
    int getCountOfId();

    @Query("select l from Laptop l")
    List<Laptop> getAllLaptop();

    @Query(
            value="select * from tbl_laptop",
            nativeQuery = true
    )
    List<Laptop> getAll();

    @Query(
            value="select * from tbl_laptop l where l.laptop_id=id",
            nativeQuery = true
    )
    Laptop getId(@Param("id") String id);

    @Modifying
    @Transactional
    @Query(value="insert into tbl_laptop values(?1,?2,?3)",
        nativeQuery = true
    )
    void insert(String id,int id1,String name);
}
