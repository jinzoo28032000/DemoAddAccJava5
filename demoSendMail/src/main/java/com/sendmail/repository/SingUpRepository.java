package com.sendmail.repository;

import com.sendmail.entity.SingUpEnitity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingUpRepository extends JpaRepository<SingUpEnitity, Long> {
    SingUpEnitity findByUsername(String username);
    SingUpEnitity findByEmail(String email);
}
