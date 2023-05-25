<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Admin Dashboard</title>
<link rel="stylesheet" href="resources/style.css" />
<style>
.column {
	flex: 33.33%;
	height: 400px;
	padding: 10px;
	margin: 5px;
	background-color: #fff;
	text-align: center;
}

.container {
	display: flex;
}
</style>
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
				<img src="resources/images/admin.jpg" alt="">
				<h4>Admin</h4>
			</div>
		</div>
	</header>
	<div class="container">
		<nav>
			<div class="side_navbar">
				<span>Main Menu</span> <a href="admin" class="active">Dashboard</a>
				<a href="#">Profile</a> <a href="add-task">Add Project</a> <a
					href="update-task">Update/Delete Project</a>
					<div class="links">
					<a href="logout" onclick="if (!(confirm('Do you really to logout?'))) return false">Logout</a>
				</div>

			</div>
		</nav>

		<div class="main-body">
			<h2>Dashboard</h2>
			<div class="promo_card">
				<h1>Welcome,Admin</h1>
				<span>Admin's Portal</span>
			</div>
			<br>
			<div class="container">
				<div class="column">
					<h2>TODO</h2>
					<c:forEach var="item" items="${list_todo}" varStatus="counter">
						<h4>${counter.index+1 }. ${item.name}</h4>
					</c:forEach>
				</div>
				<div class="column">
					<h2>InProgress</h2>
					<c:forEach var="item" items="${list_inprogress}" varStatus="counter">
						<h4>${counter.index+1 }. ${item.name}</h4>
					</c:forEach>
				</div>
				<div class="column">
					<h2>Completed</h2>
					<c:forEach var="item" items="${list_complete}" varStatus="counter">
						<h4>${counter.index+1 }. ${item.name}</h4>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>