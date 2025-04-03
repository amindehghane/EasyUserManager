package amin.easyusermanager.Repository;

import amin.easyusermanager.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
