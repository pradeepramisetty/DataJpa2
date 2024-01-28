package com.spring.adrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.adrs.Addres;

public interface AddresRepo extends JpaRepository<Addres, Integer> {

}
