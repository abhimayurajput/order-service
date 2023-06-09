package www.neosoft.com.orderservice.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import www.neosoft.com.orderservice.model.User;

@FeignClient(name = "User", url = "http://localhost:8811/")
public interface UserClient {

    @GetMapping(value = "/users/{id}")
    public User getUserById(@PathVariable("id") Long id);
}
