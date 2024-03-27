package africa.semicolon.userapplication.services;

import africa.semicolon.userapplication.dtos.SignUpRequest;
import africa.semicolon.userapplication.entity.Role;
import africa.semicolon.userapplication.entity.User;
import africa.semicolon.userapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository ;
    @Override
    public String signUp(SignUpRequest signUpRequest) {
        User user = new User();
        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setRole(Role.ADMIN);
        repository.save(user);
        return "Successful Created";
    }
}
