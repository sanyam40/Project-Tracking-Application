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
				<a href="#">My Account</a> <a href="#">Documents</a>

				<div class="links">
					<a href="logout" onclick="if (!(confirm('Do you really to logout?'))) return false">Logout</a>
				</div>
			</div>
		</nav>

		<div class="main-body">
			<h2>User's Portal</h2>
			<div class="promo_card">
				<h1>Update Project Details</h1>
			</div>
			<br> <br>

			<body>
				<form action="processUpdate" method="POST" modelAttribute="user">

					<label for="id"><b>User ID</b></label> 
					<input type="text" id="id" value="${userid}"
						name="user_id" class="form-field" readonly="true"> <label
						for="name"><b>User Name</b></label> <input type="text" id="name"
						name="user_name" class="form-field" placeholder="Enter User Name">

					<label for="age"><b>User Age </b></label> <input type="text"
						id="age" name="user_age" class="form-field"
						placeholder="Enter User Age"> <label for="address"><b>User
							Address</b></label> <input type="text" id="address" name="user_address"
						class="form-field" placeholder="Enter User Address"> <label
						for="phone"><b>User Phone Number</b></label> <input type="text"
						id="type" name="user_phone" class="form-field"
						placeholder="Enter User Phone Number"> 
						<label
						for="email"><b>User Email</b></label>
						 <input type="text"
						id="email" name="email" class="form-field"
						placeholder="Enter User Email"> <label for="password"><b>User
							Password</b></label> <input type="text" id="password" name="password"
						class="form-field" placeholder="Enter User Password"> <input
						type="submit" value="Submit" class="submit-button">

					<c:if test="${not empty message}">
						<p style="color: red;">${message}</p>
					</c:if>
				</form>
			</body>
</html>