package pe.entelgy.entelgytest.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.entelgy.entelgytest.model.InitialResponse;
import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com", name="principal-client")
public interface PrincipalClient {

    @GetMapping("/comments")
    public List<InitialResponse> principal();
}
