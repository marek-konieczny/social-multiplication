package microservices.com.socialmultiplication.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import microservices.com.socialmultiplication.domain.User;

/**
 * This interface allows us to save and retrieve Users
 */
public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByAlias(final String alias);

}