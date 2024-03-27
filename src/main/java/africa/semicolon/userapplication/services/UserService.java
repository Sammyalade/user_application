package africa.semicolon.userapplication.services;
import africa.semicolon.userapplication.dtos.SignUpRequest;
import africa.semicolon.userapplication.entity.User;

public interface UserService {
    public String signUp(SignUpRequest signUpRequest);
}
