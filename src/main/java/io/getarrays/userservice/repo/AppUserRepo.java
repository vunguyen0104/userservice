package io.getarrays.userservice.repo;

import io.getarrays.userservice.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Vu Nguyen (www.cs.umb.edu/~vtnguyen)
 * @Version: 1.0
 * @Created: 9/8/2021, Wednesday
 **/

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
