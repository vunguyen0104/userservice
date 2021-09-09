package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.AppRole;
import io.getarrays.userservice.domain.AppUser;

import java.util.List;

/**
 * @Author: Vu Nguyen (www.cs.umb.edu/~vtnguyen)
 * @Version: 1.0
 * @Created: 9/9/2021, Thursday
 **/

public interface AppUserService {
    AppUser saveUser(AppUser user);
    AppRole saveRole(AppRole role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
