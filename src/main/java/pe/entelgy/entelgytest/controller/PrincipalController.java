package pe.entelgy.entelgytest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.entelgy.entelgytest.model.ReestructureResponse;
import pe.entelgy.entelgytest.service.PrincipalService;

@RestController
@RequestMapping("/reestructure")
@Slf4j
public class PrincipalController {
    @Autowired
    private PrincipalService principalService;

    @PostMapping(value = "")
    public ReestructureResponse reestructure() {
        return principalService.reestructure();

    }
}
