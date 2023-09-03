package com.student_information.payload;

import com.student_information.entity.Education;
import com.student_information.entity.Information;
import com.student_information.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AllInformationDto {
    private Student student;
    private Information info;
    private Education edu;
}
