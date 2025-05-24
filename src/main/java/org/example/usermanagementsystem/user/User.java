package org.example.usermanagementsystem.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "users_table")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String phoneNumber;
    @CreationTimestamp
    private LocalDate createdAt;
    @UpdateTimestamp
    private LocalDate updatedAt;
//    public User(String firstName, String lastName, String email, String phoneNumber, LocalDate createdAt, LocalDate updatedAt) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

}
