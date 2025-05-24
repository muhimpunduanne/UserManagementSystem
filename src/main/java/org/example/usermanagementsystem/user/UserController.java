package org.example.usermanagementsystem.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name="User", description="these are users managed by routes")
public class UserController {
    private final UserService userService;

    @GetMapping
    @Operation( summary = "this endpoint returns all users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }
@PostMapping
@Operation(summary = "this is going to add users")
    public User createUser(@RequestBody UserCreationDto userCreationDto) {
        User user = new User();
        user.setFirstName(userCreationDto.getFirstName());
        user.setLastName(userCreationDto.getLastName());
        user.setPhoneNumber(userCreationDto.getPhoneNumber());
        user.setEmail(userCreationDto.getEmail());
       return  userService.createUser(user);
}
@PutMapping("/{id}")
    @Operation(summary="This is endpoint is going to update users")
    public User updateUser(@PathVariable long id, @RequestBody UserCreationDto userCreationDto ){
        User user= new User();
        user.setId(id);
        user.setFirstName(userCreationDto.getFirstName());
        user.setLastName(userCreationDto.getLastName());
        user.setPhoneNumber(userCreationDto.getPhoneNumber());
        user.setEmail(userCreationDto.getEmail());
        return userService.updateUser(id,user);

}



}
