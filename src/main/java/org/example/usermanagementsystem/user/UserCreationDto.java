package org.example.usermanagementsystem.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
