
package acme.entities.companyrecords;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Companyrecord extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				name;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceo;

	@NotBlank
	private String				description;

	@URL
	@NotBlank
	private String				web;

	@NotBlank
	@Pattern(regexp = "^([+][1-9]{0,3}[\\s]{0,1})?([(][1-9]{0,4}[)][\\s]{0,1})?[0-9]{6,10}$")
	private String				phone;

	@Email
	@NotNull
	private String				email;

	@NotNull
	private Boolean				incorporated;

	@Min(0)
	@Max(5)

	private Integer				stars;


	//Derivados

	@Transient
	public String getIncorporatedName() {
		StringBuilder result;
		result = new StringBuilder();
		if (this.incorporated) {
			result.append(this.name);
			result.append(", ");
			result.append("Inc.");

		} else {

			result.append(this.name);
			result.append(", ");
			result.append("LLC");

		}

		return result.toString();
	}
}
