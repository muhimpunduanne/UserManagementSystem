package org.example.usermanagementsystem.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user) {
        return userRepository.save(user);

    }
    public List<User> getAll() {
        return userRepository.findAll();

    }
    public void deleteUser(Long id) {
        var user=userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        userRepository.delete(user);
    }
    public User updateUser(Long id, User updatedUser) {
        var user=userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setPhoneNumber(updatedUser.getPhoneNumber());
        return userRepository.save(user);
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }

}
