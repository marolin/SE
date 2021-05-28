<html>
<head><title>customer send feed back</title></head>
<body>

Thank you!

<!--dispaly thank you-->
<ul>
<%

String[] langs = request.getParameterValue("service");
for (String tempLang : langs) {
	out.println("<li>" + tempLang + "</li>");

%>
</ul>
</body>
</html>