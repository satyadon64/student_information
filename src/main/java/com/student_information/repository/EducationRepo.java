package com.student_information.repository;

import com.student_information.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education, Long> {
}
