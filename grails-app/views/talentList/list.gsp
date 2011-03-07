
<%@ page import="dsa.held.Talent" %>
<%@ page import="dsa.held.Talentwert" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'talentList.label', default: 'Talent')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
</div>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <!-- <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>-->
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message">${flash.message}</div>
            </g:if>
            <div>
	            <g:each in="${talentList}" var="talentGruppe">
		             <h2>${fieldValue(bean: talentGruppe, field: "key")}</h2>
                     <table class="invisibleTable">
		             <g:each in="${talentGruppe.value}" status="i" var="talent">
		                  <tr>
		                  
		                      <td>${fieldValue(bean: talent, field: "ref.name")}</td>
		                      <td>${fieldValue(bean: talent, field: "wert")}</td>
		                  
		                  </tr>
		             </g:each>
                     </table>
	            </g:each>
            </div>
        </div>
    </body>
</html>
