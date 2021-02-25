package com.nuvu.project.service;

import com.nuvu.project.model.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankService {

    List<Bank> findAll();

}
