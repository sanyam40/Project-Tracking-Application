<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Admin Dashboard</title>
<link rel="stylesheet" href="resources/style.css" />
<!-- Font Awesome Cdn Link -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
</head>
<body>
	<header class="header">
		<div class="logo">
			<a href="#">Jira </a>
			<div class="search_box">
				<input type="text" placeholder="Search Jira Project"> <i
					class="fa-sharp fa-solid fa-magnifying-glass"></i>
			</div>
		</div>

		<div class="header-icons">
			<i class="fas fa-bell"></i>
			<div class="account">
				<h4>Jira</h4>
			</div>
		</div>
	</header>
	<div class="container">
		<nav>
			<div class="side_navbar">
				<span>Main Menu</span> <a href="#" class="active">Dashboard</a> <a
					href="#">Profile</a> <a href="#">History</a> <a href="#">Application</a>
				<a href="#">My Account</a> <a href="#">Documnets</a>

				</div>
				</nav>

		

		<div class="main-body">
			<h2>Dashboard</h2>
			<div class="promo_card">
				<h1>Welcome to Jira</h1>
				<span>One Stop Solution For Project Managment</span>
			</div>
			<br> <br>

			<form:form action="login" method="post" modelAttribute="user">
				<label for="email">Email :</label>
				<form:input type="text" path="email" />
				<form:errors path="email" cssClass="error"/>
				<label for="password">Password :</label>
				<form:input type="password" path="password" />
				<br>
				<input type="submit" value="submit" />
			</form:form>
		</div>
		</div>
</body>
</html>