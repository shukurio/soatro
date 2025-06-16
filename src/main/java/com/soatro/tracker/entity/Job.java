package com.soatro.tracker.entity;

import com.soatro.tracker.enums.JobTitle;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Job extends BaseEntity{

    @NotBlank(message = "Job Title should not be empty")
    @Size(min = 2, max = 50, message = "Job Title must be between 2 and 50 characters")

    @Column(name="job_title")
    @Enumerated(EnumType.STRING)
    private JobTitle jobTitle;

    @Column(name="hourly_wage")
    private double hourlyWage;
}
