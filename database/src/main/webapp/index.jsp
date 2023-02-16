<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="100px" width="100px"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Dropdown </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled" href="#"
						tabindex="-1" aria-disabled="true">Disabled</a></li>
				</ul>
				
			</div>
		</div>
	</nav>
	<h1>Egg Application</h1>
	<form action="egg" method="post">
	<pre>
	Hotel Name<input type="text" name="hotelName"/>
	Egg Dish Name<select name="dishName">
	<option>Select</option>
	<option>Egg Masala</option>
	<option>Egg Biryani</option>
	<option>Egg Butter Masala</option>
	<option>Egg Toast</option>
	<option>Egg Spinach omelette</option>
	<option>Egg omelette</option>
	<option>Egg fried Rice</option>
	<option>Egg Bhurji </option>
	<option>Egg Fried Noodles</option>
	<option>Egg curry</option>
	<option>Egg paratha </option>
	<option>Egg Bonda </option>
	<option>Egg pulao</option>
	<option>omlet</option>
	
	</select>
	Egg Type<select name="type">
	<option>Select</option>
	<option>Nati</option>
	<option>farm</option>
	</select>
	Price<input type="text" name="price"/>
	Quantity<select name="quantity">
	<option>Select</option>
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>6</option>
	</select>
	Take Away yes:<input type="radio" value="true" name="takeAway"/>
	No:<input type="radio" value="false" name="takeAway"/>
	
		<input type="submit" value="save">
		</pre>
	</form>
</body>
</html>