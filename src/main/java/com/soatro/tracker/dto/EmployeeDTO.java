package com.soatro.tracker.dto;

import com.soatro.tracker.entity.Job;
import com.soatro.tracker.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String username;
    private String email;
    private Role role;
    private List<Job> jobList;
    private String phoneNumber;
    private Boolean isActive;
    private DepartmentDTO department;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Summary fields for dashboard
    private BigDecimal totalEarningsThisMonth;
    private BigDecimal totalHoursThisMonth;
    private Integer totalShiftsThisMonth;
}
