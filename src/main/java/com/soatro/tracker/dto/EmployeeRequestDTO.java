package com.soatro.tracker.dto;



import com.soatro.tracker.enums.JobTitle;
import com.soatro.tracker.enums.Role;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Role role;
    private List<JobTitle> jobTitles;
    private String password;

}
