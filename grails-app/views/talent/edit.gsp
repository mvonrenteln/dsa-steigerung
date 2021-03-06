

<%@ page import="dsa.held.Talent" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'talent.label', default: 'Talent')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${talentInstance}">
            <div class="errors">
                <g:renderErrors bean="${talentInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${talentInstance?.id}" />
                <g:hiddenField name="version" value="${talentInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="name"><g:message code="talent.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: talentInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${talentInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="kosten"><g:message code="talent.kosten.label" default="Kosten" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: talentInstance, field: 'kosten', 'errors')}">
                                    <g:select name="kosten" from="${dsa.steigerung.SKT?.values()}" keys="${dsa.steigerung.SKT?.values()*.name()}" value="${talentInstance?.kosten?.name()}" noSelection="['': '']" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="quelle"><g:message code="talent.quelle.label" default="Quelle" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: talentInstance, field: 'quelle', 'errors')}">
                                    <g:select name="quelle" from="${dsa.Quelle?.values()}" keys="${dsa.Quelle?.values()*.name()}" value="${talentInstance?.quelle?.name()}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="talentGruppe"><g:message code="talent.talentGruppe.label" default="Talent Gruppe" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: talentInstance, field: 'talentGruppe', 'errors')}">
                                    <g:select name="talentGruppe" from="${dsa.held.TalentGruppe?.values()}" keys="${dsa.held.TalentGruppe?.values()*.name()}" value="${talentInstance?.talentGruppe?.name()}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="typ"><g:message code="talent.typ.label" default="Typ" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: talentInstance, field: 'typ', 'errors')}">
                                    <g:select name="typ" from="${dsa.held.Talent$Typ?.values()}" keys="${dsa.held.Talent$Typ?.values()*.name()}" value="${talentInstance?.typ?.name()}"  />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
