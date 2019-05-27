<#import "/spring.ftl" as spring>
<html>
<body>

<h1>Hey User: ${username}</h1>
<br>

<ul>
<#list elements as element>
	<li>${element}</li>
</#list> 
</ul>
<br>

<a href="/logout">Logout</a>

</body>
</html>