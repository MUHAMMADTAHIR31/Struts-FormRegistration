<%-- 
    Document   : submit
    Created on : Nov 18, 2021, 11:36:12 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>Custom example</h1>
        <h2>
            First Name  : <s:property value="firstName"/><br/>
            Last Name   : <s:property value="lastName"/><br/>
            Password    : <s:property value="password"/><br/>
            Re-Password : <s:property value="rePassword"/><br/>
            Gender      : <s:property value="yourGender"/><br/>
            Country     : <s:property value="yourCountry"/><br/>
            Language    : <s:property value="yourLanguage"/><br/>
            Remarks     : <s:property value="remarks"/><br/>
            Fvt Color   :<s:property value="rightItems" /><br/>
        </h2> 
      
    </body>
</html




