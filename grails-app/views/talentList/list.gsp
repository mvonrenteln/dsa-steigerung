
<%@ page import="dsa.held.Talent" %>
<%@ page import="dsa.held.Talentwert" %>
<%@ page import="grails.converters.JSON" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'talentList.label', default: 'Talent')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
		 <script type="text/javascript">
        Ext.onReady(function(){
        	var talentGruppen = ${talentGruppen*.name() as JSON};
        	var talentGruppenNamen = ${talentGruppen*.toString() as JSON};
        	
        	Ext.each(talentGruppen, function(gruppe, index) {
          	  console.log(gruppe)
            new Ext.Panel({
                title: talentGruppenNamen[index],
                collapsible:true,
                renderTo: 'talentGruppe_'+gruppe,
                width:400,
                html: 'Hello World'
            });
        	  });
 
        }); //end onReady
        </script>
        
        <style type="text/css">
	    .x-panel-body p {
	        margin:10px;
	    }
	    .container {
	        padding:10px;
	    }
	    em.cfg { font-style: italic; font-weight: bold;}
	    </style>        
    </head>
    <body>
        <div id="panel-basic">
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
	            <g:each in="${talentGruppen}" var="talentGruppe">
		             <div id="talentGruppe_${talentGruppe.name()}" class="container"></div>
	            </g:each>
            </div>
        </div>
    </body>
</html>
