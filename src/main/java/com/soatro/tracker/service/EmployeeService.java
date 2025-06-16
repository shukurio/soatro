package com.soatro.tracker.service;

import com.soatro.tracker.dto.EmployeeDTO;
import com.soatro.tracker.dto.EmployeeRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<EmployeeDTO> getAllEmployees(Pageable pageable);
    EmployeeDTO registerEmployee(EmployeeRequestDTO request);

}
