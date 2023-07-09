package com.project.repository;

import com.project.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening,Integer> {
}
