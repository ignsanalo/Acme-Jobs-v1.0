
package acme.entities.requests;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Requests extends DomainEntity {

	//Attributes ------------------------------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				deadline;

	@NotBlank
	private String				text;

	@NotBlank
	private String				reward;

	@Column(unique = true)
	@Pattern(regexp = "^[R]{1}[A-Z]{4}\\-[0-9]{5}$")
	@NotBlank
	private String				ticker;

	// Derived attributes -----------------------------------------------------------------

	// Relationships ----------------------------------------------------------------------

}
