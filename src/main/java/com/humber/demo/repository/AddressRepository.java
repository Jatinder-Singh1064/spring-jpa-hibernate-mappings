package com.humber.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.humber.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
