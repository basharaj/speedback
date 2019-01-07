<%@ page import="com.speeddating.User" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Generate Feedback Report</title>
</head>
<body>
<div id="content" style="margin: 10px;">


User to generate feedback report for:


<g:form name="generateForm" action="generateReport" id="1">
    <g:select name="users"
              from="${com.speeddating.User.list()}"
              optionKey="id" />
    <g:select name="events"
              from="${com.speeddating.Event.list()}"
              optionKey="id" />
    <g:submitButton name="generate" value="Generate" />
</g:form>

</div>
</body>
</html>
