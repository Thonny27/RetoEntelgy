package pe.entelgy.entelgytest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pe.entelgy.entelgytest.controller.PrincipalController;
import pe.entelgy.entelgytest.model.ReestructureResponse;
import pe.entelgy.entelgytest.service.PrincipalService;
import pe.entelgy.entelgytest.service.impl.PrincipalServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PrincipalController.class)
@Import(PrincipalServiceImpl.class)
class EntelgytestApplicationTests {

	@MockBean
	PrincipalService principalService;

	@BeforeEach
	void setUp() {
		ReestructureResponse response = new ReestructureResponse();
		List<String> temp = new ArrayList<>();
		temp.add("1/1/Eliseo@gardner.biz");
		temp.add("1/2/Jayne_Kuhic@sydney.com");
		temp.add("1/3/Nikita@garfield.biz");
		response.setData(temp);
		when(principalService.reestructure())
				.thenReturn(response);
	}

	@Test
	public void contextLoads() throws Exception {

	}

}
