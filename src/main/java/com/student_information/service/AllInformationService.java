package com.student_information.service;

import com.student_information.payload.AllInformationDto;

public interface AllInformationService {
    AllInformationDto getAllInformationById(long id);
}
