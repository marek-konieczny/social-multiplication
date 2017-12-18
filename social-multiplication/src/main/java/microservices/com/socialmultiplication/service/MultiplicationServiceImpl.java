package microservices.com.socialmultiplication.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservices.com.socialmultiplication.domain.Multiplication;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

	private RandomGeneratorService randomGeneratorService;

	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		 this.randomGeneratorService = randomGeneratorService;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Multiplication createRandomMultiplication() {

		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		return new Multiplication(factorA,factorB);
	}

}
