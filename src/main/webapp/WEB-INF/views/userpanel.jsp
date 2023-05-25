<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>User Dashboard </title>
  <link rel="stylesheet" href="resources/style.css" />
  <!-- Font Awesome Cdn Link -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" />
</head>
<body>
  <header class="header">
    <div class="logo">
      <a href="#">Jira </a>
      <div class="search_box">
        <input type="text" placeholder="Search Jira Project">
        <i class="fa-sharp fa-solid fa-magnifying-glass"></i>
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
        <span>Main Menu</span>
        <a href="#" class="active">Dashboard</a>
        <a href="#">Profile</a>
        <a href="#">History</a>
        <a href="#">Application</a>
        <a href="#">My Account</a>
        <a href="#">Documnets</a>

        <div class="links">
					<a href="logout" onclick="if (!(confirm('Do you really to logout?'))) return false">Logout</a>
				</div>
      </div>
    </nav>

    <div class="main-body">
      <h2>Dashboard</h2>
      <div class="promo_card">
        <h1>Welcome,User</h1>
        <span>User's Portal</span>
      </div>
      <br>
      <br>

      <div class="button">
      <a href="userupdate?user_id=${userid}">Update Profile</a> 
      <a href="show-projects">View Project Details</a>
      </div>
    </div>
  </div>
</body>
</html>