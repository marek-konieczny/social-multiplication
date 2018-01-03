package microservices.com.socialmultiplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import microservices.com.socialmultiplication.domain.MultiplicationResultAttempt;

/**
 * This interface allow us to store and retrieve attempts
 */
public interface MultiplicationResultAttemptRepository extends CrudRepository<MultiplicationResultAttempt, Long> {

	/**
	 * @return the latest 5 attempts for a given user, identified by their alias.
	 */
	List<MultiplicationResultAttempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);
}