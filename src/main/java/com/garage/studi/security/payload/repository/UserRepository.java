package com.garage.studi.security.payload.repository;

import com.garage.studi.pojo.dto.UserDTO;
import com.garage.studi.security.models.ERole;
import com.garage.studi.security.models.Role;
import com.garage.studi.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    @Query(value = "SELECT u.* FROM users u " +
            "JOIN user_roles ur ON ur.user_id = u.id " +
            "JOIN roles r ON r.id = ur.role_id " +
            "WHERE r.name = ?1",
    nativeQuery = true)
    List<User> findUserByRoles(String role);

}
