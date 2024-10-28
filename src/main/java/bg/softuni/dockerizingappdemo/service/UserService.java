package bg.softuni.dockerizingappdemo.service;

import bg.softuni.dockerizingappdemo.model.User;

public interface UserService {

    User create(User user);

    User read(Long id);

    User update(User updatedUser);

    String delete(Long id);

}
