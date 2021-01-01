package com.bima.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bima.springdatajpa.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}
