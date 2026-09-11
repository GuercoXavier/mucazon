package com.guerco10.mucazon.repository;

import com.guerco10.mucazon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByIdcard(String idCard);

    List<User> queryByNameLike(String name);
}
