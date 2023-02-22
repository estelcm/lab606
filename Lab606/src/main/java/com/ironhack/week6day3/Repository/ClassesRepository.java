package com.ironhack.week6day3.Repository;

import com.ironhack.week6day3.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes,Integer> {
}
