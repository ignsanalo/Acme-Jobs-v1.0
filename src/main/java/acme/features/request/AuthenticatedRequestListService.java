/*
 * AuthenticatedRequestUpdateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.request;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedRequestListService implements AbstractListService<Authenticated, Request> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedRequestRepository repository;


	// AbstractUpdateService<Authenticated, Request> interface -----------------

	@Override
	public boolean authorise(final Request<Request> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Request> request, final Request entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "title");
	}

	@Override
	public Collection<Request> findMany(final Request<Request> request) {

		assert request != null;

		Collection<Request> result;

		result = this.repository.findManyAll();

		return result;

	}
}
