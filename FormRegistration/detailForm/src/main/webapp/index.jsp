<%-- 
    Document   : index
    Created on : Nov 18, 2021, 11:35:29 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>  

<!DOCtype html>
    <head>
        <title>Form Registration</title>
    </head>
    <body>
        <s:form action="resultAction" namespace="/">  
            <s:textfield    name="firstName"   label="First Name"></s:textfield>  
            <s:textfield    name="lastName"    label="Last Name"></s:textfield>  
            <s:password     name="password"    label="Password"></s:password>  
            <s:password     name="rePassword"  label="Re-Password"></s:password> 
            <s:radio list="{'Male','Female'}" label="Gender"  name="yourGender"></s:radio>
            <%--<s:radio        name="yourGender"  label="Gender" list="genders" />--%>
            <s:select  name="yourCountry" label="Country" headerKey="-1" headerValue="--- Select ---" list="{'Pakistan','India','China','Iran'}"/>
            <s:checkboxlist list="{'English','Sindhi','Urdu','Other'}" name="yourLanguage"   label="Select Language" />
            <s:textarea     name="remarks"     label="Write Comments" cols="40" rows="10"/>
            
            <s:optiontransferselect label=" Fvt  Color " leftTitle="Select Color" name="leftItems"			     
		list="{'Blue','Red','Green','Other'}" headerKey="-1" headerValue="select items" rightTitle="Selected Color"
		doubleList="" doubleName="rightItems" doubleHeaderKey="-1"
		doubleHeaderValue="Select items" multiple="true" />
            
            <s:submit value="save"></s:submit>  
        </s:form>  
    </body>
</html>

