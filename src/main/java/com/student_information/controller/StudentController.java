package com.student_information.controller;

import com.student_information.payload.AllInformationDto;
import com.student_information.service.AllInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private AllInformationService allInformationService;

    @GetMapping("/{id}")
    public ResponseEntity<AllInformationDto> findAllInformationById(@PathVariable("id") long id){
        AllInformationDto dto = allInformationService.getAllInformationById(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
