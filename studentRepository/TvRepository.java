package com.springdata.Jpa.studentRepository;

import com.springdata.Jpa.pagination.Tv;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TvRepository extends JpaRepository<Tv,Integer> {

    @Query("select t from Tv t")
    List<Tv> findAllByPage(PageRequest pageRequest);

}

