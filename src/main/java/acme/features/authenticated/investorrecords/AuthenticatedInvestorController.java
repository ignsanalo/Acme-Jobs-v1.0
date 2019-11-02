
package acme.features.authenticated.investorrecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.investorrecords.Investor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/investorrecords/")
public class AuthenticatedInvestorController extends AbstractController<Authenticated, Investor> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedInvestorListService	listService;

	@Autowired
	private AuthenticatedInvestorShowService	showService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
