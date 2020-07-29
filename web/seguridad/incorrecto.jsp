<!--0-->
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if test="hasActionErrors()">
    <s:actionerror cssClass="errorMessage text-center text-danger mr-5" id="error"/>
</s:if>
<s:property value="resultado" />
