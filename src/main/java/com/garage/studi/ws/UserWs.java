package com.garage.studi.ws;

import com.garage.studi.pojo.dto.UserDTO;
import com.garage.studi.security.payload.repository.UserRepository;
import com.garage.studi.security.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("user")
public class UserWs {

    @Autowired
    private UserRepository userRepository;

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok(new MessageResponse("User deleted successfully!"));
    }

    @GetMapping
    public List<UserDTO> getAllEmployes() {
        return userRepository.findUserByRoles("EMPLOYE").stream()
                .map(user -> new UserDTO(user.getId(), user.getUsername()))
                .collect(Collectors.toList());
    }
}
