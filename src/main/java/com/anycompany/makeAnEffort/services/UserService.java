package com.anycompany.makeAnEffort.services;

import com.anycompany.makeAnEffort.dto.UserDTO;
import com.anycompany.makeAnEffort.entities.Role;
import com.anycompany.makeAnEffort.entities.User;
import com.anycompany.makeAnEffort.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;



    public void saveUser(UserDTO userDTO){

        String password = passwordEncoder.encode(userDTO.getPassword());

        User user = new User(userDTO.getName(),
                            userDTO.getLogin(),
                            password,
                            userDTO.getEmail(),
                            false,
                            Role.USER);


        if(userDTO.getPassword().equals(userDTO.getPasswordRepeat())){

            userRepository.save(user);

        }

    }
}
