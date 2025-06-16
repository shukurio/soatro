package com.soatro.tracker.service.implementation;

import com.soatro.tracker.dto.DepartmentDTO;
import com.soatro.tracker.dto.EmployeeDTO;
import com.soatro.tracker.dto.EmployeeRequestDTO;
import com.soatro.tracker.entity.Department;
import com.soatro.tracker.entity.Employee;
import com.soatro.tracker.repository.EmployeeRepository;
import com.soatro.tracker.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final PasswordEncoder passwordEncoder;

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(PasswordEncoder passwordEncoder, EmployeeRepository employeeRepository) {
        this.passwordEncoder = passwordEncoder;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Page<EmployeeDTO> getAllEmployees(Pageable pageable) {
        return null;
    }

    @Override
    public EmployeeDTO registerEmployee(EmployeeRequestDTO dto) {
        Employee employee= Employee.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .role(dto.getRole())
                .isActive(true)
                .build();
        System.out.println(("Registered new employee: {} (ID: {})"+ employee.getUsername()+ employee.getId()));

        return mapToEmployeeDTO(employee);
    }

    private EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .username(employee.getUsername())
                .email(employee.getEmail())
                .phoneNumber(employee.getPhoneNumber())
                .role(employee.getRole())
                .isActive(employee.getIsActive())
                .department(mapDepartmentToDTO(employee.getDepartment()))
                .createdAt(employee.getCreatedAt())
                .updatedAt(employee.getUpdatedAt())
                .build();
    }

    private DepartmentDTO mapDepartmentToDTO(Department department) {
        if (department == null) {
            return null;
        }
        return DepartmentDTO.builder()
                .id(department.getId())
                .name(department.getName())
                .code(department.getCode())
                .description(department.getDescription())
                .isActive(department.getIsActive())
                .build();
    }
}
