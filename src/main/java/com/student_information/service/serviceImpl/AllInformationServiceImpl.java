package com.student_information.service.serviceImpl;

import com.student_information.entity.Education;
import com.student_information.entity.Information;
import com.student_information.entity.Student;
import com.student_information.payload.AllInformationDto;
import com.student_information.repository.EducationRepo;
import com.student_information.repository.InformationRepo;
import com.student_information.repository.StudentRepo;
import com.student_information.service.AllInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllInformationServiceImpl implements AllInformationService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private EducationRepo educationRepo;
    @Autowired
    private InformationRepo informationRepo;
    @Override
    public AllInformationDto getAllInformationById(long id) {
        Student student = studentRepo.findById(id).get();
        Education education = educationRepo.findById(id).get();
        Information information = informationRepo.findById(id).get();
        AllInformationDto dto = new AllInformationDto();
        dto.setStudent(student);
        dto.setInfo(information);
        dto.setEdu(education);
        return dto;
    }
}
