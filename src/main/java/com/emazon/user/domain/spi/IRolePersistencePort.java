package com.emazon.user.domain.spi;

public interface IRolePersistencePort {
    Long getId(String roleName);
    Boolean existsById(Long roleId);
}
