<html>
	<body>
		<img src="logo.png" height="20%">
		<h1>Web Application</h1>
		<table>
			<tr><td>name</td><td>${project.name}</td></tr>
			<tr><td>version</td><td>${project.version}</td></tr>
			<tr><td>build</td><td>${build.timestamp}</td></tr>
		</table>
		<p>
			<h2>Services</h2>
			<a href="service">demo service</a>
		</p>
		<p>
			<h1>Server</h1>
			<%= application.getServerInfo() %>
		</p>
	</body>
</html>
