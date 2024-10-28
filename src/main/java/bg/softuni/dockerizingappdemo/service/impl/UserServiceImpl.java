package bg.softuni.dockerizingappdemo.service.impl;

import bg.softuni.dockerizingappdemo.model.User;
import bg.softuni.dockerizingappdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import bg.softuni.dockerizingappdemo.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return this.userRepository.saveAndFlush(user);
    }

    @Override
    public User read(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public User update(User updatedUser) {
        User user = this.userRepository.findById(updatedUser.getId()).orElse(null);
        if (user != null) {
            user.setUsername(updatedUser.getUsername());
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setAge(updatedUser.getAge());
            this.userRepository.saveAndFlush(user);
        }
        return user;
    }

    @Override
    public String delete(Long id) {
        if (this.userRepository.existsById(id)) {
            this.userRepository.deleteById(id);
            return "User " + id + " deleted!";
        }
        return "User " + id + " not found!";
    }

}
