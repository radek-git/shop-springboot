package com.radek.shopspringboot.service;

import com.radek.shopspringboot.repository.DiscountCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountCodeService {

    private DiscountCodeRepository discountCodeRepository;

    @Autowired
    public DiscountCodeService(DiscountCodeRepository discountCodeRepository) {
        this.discountCodeRepository = discountCodeRepository;
    }
}
