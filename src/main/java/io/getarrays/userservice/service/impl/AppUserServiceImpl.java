package io.getarrays.userservice.service.impl;


import io.getarrays.userservice.domain.AppRole;
import io.getarrays.userservice.domain.AppUser;
import io.getarrays.userservice.repo.AppRoleRepo;
import io.getarrays.userservice.repo.AppUserRepo;
import io.getarrays.userservice.service.AppUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: Vu Nguyen (www.cs.umb.edu/~vtnguyen)
 * @Version: 1.0
 * @Created: 9/9/2021, Thursday
 **/

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepo appUserRepo;
    private final AppRoleRepo appRoleRepo;

    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving new user {} to the database", user.getName());
        return appUserRepo.save(user);
    }

    @Override
    public AppRole saveRole(AppRole role) {
        log.info("Saving new role {} to the database", role.getName());
        return appRoleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding new role {} to the user {}", roleName, username);
        AppUser user = appUserRepo.findByUsername(username);
        AppRole role = appRoleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user {}", username);
        return appUserRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching all users");
        return appUserRepo.findAll();
    }
}
