
package acme.features.authenticated.investorrecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.investorrecords.Investor;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedInvestorRepository extends AbstractRepository {

	@Query("select a from Investor a where a.id = ?1")
	Investor findOneById(int id);

	@Query("select a from Investor a")
	Collection<Investor> findManyAll();
}
