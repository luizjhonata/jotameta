package com.luizjhonata.jotameta.services;

import com.luizjhonata.jotameta.entities.Sale;
import com.luizjhonata.jotameta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }

}
