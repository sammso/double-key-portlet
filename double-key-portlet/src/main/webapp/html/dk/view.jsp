<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Dk Portlet</b> portlet in View mode.

<portlet:actionURL name="addEntity" var="addEntityLink"/>
<portlet:actionURL name="updateEntity" var="updateEntityLink"/>

<a href="<%=addEntityLink %>">Add</a><br/>
<a href="<%=updateEntityLink %>">Update</a><br/>