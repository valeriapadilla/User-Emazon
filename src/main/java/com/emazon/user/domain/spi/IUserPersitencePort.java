package com.emazon.user.domain.spi;
import com.emazon.user.domain.model.User;

public interface IUserPersitencePort {
    void saveUser(User user);
    Boolean existsByDocument(String document);
    Boolean existsByEmail(String email);
}
