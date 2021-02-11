package pe.entelgy.entelgytest.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.entelgy.entelgytest.feignClient.PrincipalClient;
import pe.entelgy.entelgytest.model.ReestructureResponse;
import pe.entelgy.entelgytest.service.PrincipalService;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PrincipalServiceImpl implements PrincipalService {
    @Autowired
    private PrincipalClient principalClient;

    @Override
    public ReestructureResponse reestructure() {
        ReestructureResponse response = new ReestructureResponse();
        response.setData(principalClient.principal().stream().map(r -> r.getPostId()
                + "/"
                + r.getId()
                + "/"
                + r.getEmail()).collect(Collectors.toList()));
        log.info(String.valueOf(response));
        return response;
    }
}
