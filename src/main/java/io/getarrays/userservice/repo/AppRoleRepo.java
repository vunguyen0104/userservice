package io.getarrays.userservice.repo;

import io.getarrays.userservice.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Vu Nguyen (www.cs.umb.edu/~vtnguyen)
 * @Version: 1.0
 * @Created: 9/9/2021, Thursday
 **/

public interface AppRoleRepo extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
