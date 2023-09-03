package com.student_information.service.serviceImpl;

import com.student_information.entity.Education;
import com.student_information.entity.Information;
import com.student_information.entity.Student;
import com.student_information.payload.AllInformationDto;
import com.student_information.repository.EducationRepo;
import com.student_information.repository.InformationRepo;
import com.student_information.repository.StudentRepo;
import com.student_information.service.AllInformationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AllInformationServiceImpl implements AllInformationService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private EducationRepo educationRepo;
    @Autowired
    private InformationRepo informationRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public AllInformationDto getAllInformationById(long id) {
//        Student student = studentRepo.findById(id).get();
//        Education education = educationRepo.findById(id).get();
//        Information information = informationRepo.findById(id).get();
//        AllInformationDto dto = new AllInformationDto();
//        dto.setStudent(student);
//        dto.setInfo(information);
//        dto.setEdu(education);
        Student student = studentRepo.findById(id).get();
        AllInformationDto dto = mapToDto(student);
        return dto;
    }

    private AllInformationDto mapToDto(Student student){
        AllInformationDto dto = modelMapper.map(student, AllInformationDto.class);
        return dto;
    }
}
