package bg.softuni.dockerizingappdemo.repository;

import bg.softuni.dockerizingappdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
