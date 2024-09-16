package com.emazon.user.domain.UseCases;

import com.emazon.user.domain.Exception.DocumentAlreadyExitsException;
import com.emazon.user.domain.Exception.EmailAlreadyExitsException;
import com.emazon.user.domain.api.IEncryptPasswordServicePort;
import com.emazon.user.domain.api.IUserServicePort;
import com.emazon.user.domain.model.User;
import com.emazon.user.domain.spi.IUserPersitencePort;
import com.emazon.user.domain.util.UserVerification;

public class UserUseCases implements IUserServicePort {

    private IUserPersitencePort userPersitencePort;
    private IEncryptPasswordServicePort encryptPasswordServicePort;
    private UserVerification userVerification;

    public UserUseCases(IUserPersitencePort userPersitencePort, IEncryptPasswordServicePort encryptPasswordServicePort, UserVerification userVerification) {
        this.userPersitencePort = userPersitencePort;
        this.encryptPasswordServicePort = encryptPasswordServicePort;
        this.userVerification = userVerification;
    }

    @Override
    public void saveUser(User user) {
        if(userPersitencePort.existsByDocument(user.getDocument())){
            throw new DocumentAlreadyExitsException("Document already register");
        }
        if(userPersitencePort.existsByEmail(user.getEmail())){
            throw new EmailAlreadyExitsException("Email already register");
        }
        userVerification.verifyUser(user);
        user.setPassword(encryptPasswordServicePort.setEncryptedPassword(user.getPassword()));
        userPersitencePort.saveUser(user);
    }
}
