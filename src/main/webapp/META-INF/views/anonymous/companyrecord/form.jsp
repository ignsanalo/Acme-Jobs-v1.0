<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.companyrecord.form.label.name" path="name"/>
	<acme:form-textbox code="anonymous.companyrecord.form.label.sector" path="sector"/>
	<acme:form-textbox code="anonymous.companyrecord.form.label.ceo" path="ceo"/>
	<acme:form-textbox code="anonymous.companyrecord.form.label.description" path="description"/>
	<acme:form-url code="anonymous.companyrecord.form.label.web" path="web"/>
	<acme:form-textbox code="anonymous.companyrecord.form.label.phone" path="phone"/>
	<acme:form-textbox code="anonymous.companyrecord.form.label.email" path="email"/>
	<acme:form-integer code="anonymous.companyrecord.form.label.stars" path="stars"/>
	
	
	
	<acme:form-return code="anonymous.companyrecord.form.button.return"/>
</acme:form>