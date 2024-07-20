package al.utile.professional.client;

import al.utile.utile_rest_common.utile.UserDto;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/api/users/{username}")
    UserDto getUserByUsername(@PathVariable("username") String username);
}