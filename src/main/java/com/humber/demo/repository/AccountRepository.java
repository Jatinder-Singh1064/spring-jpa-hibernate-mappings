package com.humber.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.humber.demo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
