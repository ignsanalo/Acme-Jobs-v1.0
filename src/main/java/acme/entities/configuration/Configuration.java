
package acme.entities.configuration;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Configuration extends DomainEntity {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	@ElementCollection(targetClass = String.class)
	private Collection<String>	spamWords;

	private Double				spamThreshold;

}
