package com.atuluttam.SpringBootWithJSP1.UserRepo;

import com.atuluttam.SpringBootWithJSP1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
