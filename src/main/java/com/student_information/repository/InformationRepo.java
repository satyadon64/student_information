package com.student_information.repository;

import com.student_information.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepo extends JpaRepository<Information, Long> {
}
