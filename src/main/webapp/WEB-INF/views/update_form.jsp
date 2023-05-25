<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<h2>Admin's Portal</h2>
			<div class="promo_card">
				<h1>Update The Project Details</h1>
			</div>
			<br> <br>
			<form:form action="updatee" method="post" modelAttribute="project">
				<label for="project_id">Project Id</label>
				<form:input  value="${id}" type="text" path="project_id" readonly="true"/>
				<label for="name">Project Name:</label>
				<form:input type="text" path="name" />
				<label for="description">Project Description</label>
				<form:input type="text" path="description" />
				<label>Project Priority</label>
				<form:select path="priority">
					<form:option value="NONE" label="none" />
					<form:option value="HIGH" label="HIGH" />
					<form:option value="LOW" label="LOW" />
				</form:select>
				<label>Project level</label>
				<form:select path="level">
					<form:option value="NONE" label="none" />
					<form:option value="EASY" label="EASY" />
					<form:option value="HARD" label="HARD" />
				</form:select>
				<label>Project Status</label>
				<form:select path="status">
					<form:option value="NONE" label="none" />
					<form:option value="TO-DO" label="TO-DO" />
					<form:option value="COMPLETE" label="COMPLETE" />
					<form:option value="INPROGRESS" label="INPROGRESS" />
				</form:select>
				<label>Assign User</label>
				<form:select path="candidate">
					<c:forEach var="item" items="${user}">
						<form:option value="${item.user_id}" label="${item.user_id}" />
					</c:forEach>
				</form:select>
				<input type="submit" value="submit" />
			</form:form>
		</div>
	</div>
</body>
</html>