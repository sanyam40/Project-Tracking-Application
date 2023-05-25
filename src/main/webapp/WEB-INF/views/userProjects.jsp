<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<meta charset="UTF-8" />
<title>User Dashboard</title>
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
				<img src="./pic/img.jpg" alt="">
				<h4>User</h4>
			</div>
		</div>
	</header>
	<div class="container">
		<nav>
			<div class="side_navbar">
				<span>Main Menu</span> <a href="#" class="active">Dashboard</a> <a
					href="#">Profile</a> <a href="#">History</a> <a href="#">Application</a>
				<a href="#">My Account</a> <a href="#">Documnets</a>
				<div class="links">
					<a href="logout" onclick="if (!(confirm('Do you really to logout?'))) return false">Logout</a>
				</div>

				
			</div>
		</nav>
		<div class="main-body">
			<h2>Dashboard</h2>
			<div class="promo_card">
				<h1>Assigned Projects</h1>
			</div>
			<br>
			<div align="center">

				<table border="1">
					<thead>
						<tr>
							<th>Project Name</th>
							<th>Description</th>
							<th>Status</th>
							<th>Priority</th>
							<th>Level</th>
						</tr>
					</thead>
						<c:forEach var="item" items="${projects}">
							<tr>
								<td>${item.name}</td>
								<td>${item.description }</td>
								<td>${item.status }</td>
								<td>${item.priority}</td>
								<td>${item.level}</td>
							</tr>
						</c:forEach>
				</table>
			</div>
			</div>
			</div>
</body>
</html>