package microservices.com.socialmultiplication.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import microservices.com.socialmultiplication.domain.Multiplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

	@MockBean
	private RandomGeneratorService randomGeneratorService;
	
	@Autowired
	private MultiplicationService multiplicationService;
	
	@Test
	public void createRandomMultiplication() {
		
		Multiplication multiplication = multiplicationService.createRandomMultiplication();
		
		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);
		}
	
	

}
