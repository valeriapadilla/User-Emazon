package com.emazon.user.domain.api;

public interface IRoleServicePort {
    Long getId(String roleName);
    Boolean existsById(Long roleId);
}
