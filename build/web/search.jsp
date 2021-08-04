<%-- 
    Document   : newjsp
    Created on : Mar 19, 2021, 5:28:37 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <font color="red">
        Welcome, <s:property value="%{#session.USERNAME}"/>
        </font>
        <h1>Search Page</h1>
    </body>
</html>
