<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page pageEncoding="utf-8"%>

This page is offered in :
<a href="loginI18N.form?code=en"><spring:message code="label.english" /></a>
&nbsp; &nbsp; &nbsp; &nbsp;
<a href="loginI18N.form?code=hi"><spring:message code="label.hindi" /></a>
&nbsp; &nbsp; &nbsp; &nbsp;
<a href="loginI18N.form?code=te"><spring:message code="label.telugu" /></a>


<br>
<br>
<form method="post" action="check.form" style="border: 2px solid cyan;">
	<spring:message code="label.username" />
	: <input type="text" name="username"> <br>
	<spring:message code="label.password" />
	: <input type="password" name="password"> <br> <input
		type="submit" value='<spring:message  code="label.submit"/>'>
</form>




