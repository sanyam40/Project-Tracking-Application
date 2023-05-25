
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Admin Dashboard</title>
<link rel="stylesheet" href="resources/style.css" />
<style>
table {
	border-collapse: collapse;
	margin: auto;
	width: -350%;
	background-color: #FFFFFF;
	box-shadow: 0px 0px 10px #888888;
}

th, td {
	padding: 5px;
	text-align: left;
}

th {
	background-color: #000;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

a {
	color: #006699;
	text-decoration: none;
	margin-right: 5px;
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
				<h1>Projects</h1>
			</div>
			<br>
			<div align="center">

				<table border=1>
					<thead>
						<tr>
							<th>Project Name</th>
							<th>Description</th>
							<th>Status</th>
							<th>Priority</th>
							<th>Level</th>
							<th>Candidate</th>
							<th>Project Id</th>
							<th>Operation</th>
						</tr>
					</thead>

					
						<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.name}</td>
							<td>${item.description }</td>
							<td>${item.status }</td>
							<td>${item.priority}</td>
							<td>${item.level}</td>
							<td>${item.candidate}</td>
							<td>${item.project_id}</td>
							<td>
							<a href="update-form?project_id=${item.project_id}">Edit</a> <a
								href="delete?project_id=${item.project_id}"
								onclick="if (!(confirm('Do you really want to delete this employee record?'))) return false">Delete</a>
							</td>
						</tr>
						</c:forEach>
				</table>
			</div>
			</div>
			</div>
</body>
</html>