package io.getarrays.userservice.api;

import io.getarrays.userservice.domain.AppUser;
import io.getarrays.userservice.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Vu Nguyen (www.cs.umb.edu/~vtnguyen)
 * @Version: 1.0
 * @Created: 9/9/2021, Thursday
 **/

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AppUserResource {

    private final AppUserService appUserService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(appUserService.getUsers());
    }
}
