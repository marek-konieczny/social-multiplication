package microservices.com.socialmultiplication.repository;

import org.springframework.data.repository.CrudRepository;

import microservices.com.socialmultiplication.domain.Multiplication;

/**
 * This interface allows us to save and retrieve Multiplications
 */
public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}