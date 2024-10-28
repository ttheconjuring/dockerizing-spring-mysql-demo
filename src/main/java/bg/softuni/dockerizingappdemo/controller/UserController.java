package bg.softuni.dockerizingappdemo.controller;

import bg.softuni.dockerizingappdemo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import bg.softuni.dockerizingappdemo.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.create(user));
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<User> read(@PathVariable Long id) {
        return ResponseEntity.ok(this.userService.read(id));
    }

    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User updateUser) {
        return ResponseEntity.ok(this.userService.update(updateUser));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.ok(this.userService.delete(id));
    }

}
