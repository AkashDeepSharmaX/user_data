package com.example.softrelic.Repository;


import com.example.softrelic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameLike(String text);

}
