package com.nuvu.project.repository;

import com.nuvu.project.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

    @Query("select b from Bank where b.idBank = ?1")
    List<Bank> findById(String id);

}
