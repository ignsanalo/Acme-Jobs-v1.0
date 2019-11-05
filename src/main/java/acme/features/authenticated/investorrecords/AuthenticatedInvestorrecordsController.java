
package acme.features.authenticated.investorrecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.investorrecords.Investorrecords;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/investorrecords/")
public class AuthenticatedInvestorrecordsController extends AbstractController<Authenticated, Investorrecords> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedInvestorrecordsrecordsListService	listService;

	@Autowired
	private AuthenticatedInvestorrecordsrecordsShowService	showService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
