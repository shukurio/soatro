package com.soatro.tracker.entity;

import jakarta.persistence.*;

@Entity
public class Shift extends BaseEntity{
    @ManyToOne
    @JoinColumn(name="employee_job_id")
    private EmployeeJob employeeJob;

    @Column(name="clock_in")
    private java.time.LocalDateTime clockIn;

    @Column(name="clock_out")
    private java.time.LocalDateTime clockOut;


}
