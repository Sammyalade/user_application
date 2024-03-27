package africa.semicolon.userapplication.repository;

import africa.semicolon.userapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
