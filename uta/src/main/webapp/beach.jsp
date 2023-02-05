<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
</head>
<nav class="navbar navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="80" height="44" class="d-inline-block align-text-top">
			       DElTIN
		</a> <a href="casinoindex.jsp" style="color: white;"
			class="btn btn-outline-success">Home</a>
	</div>
</nav>
<body>
	<form action="beach method="post">
		<div class="mb-3">
		<div class="p-3 mb-2 bg-info text-dark">
			<label for="exampleFormControlInput1" class="form-label">Name
				of the beach</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter the beach name"
				name="name">
		</div>
		</div>

		<div>
		<div class="p-3 mb-2 bg-warning text-dark">

			<select class="form-select" aria-label="Default select example"
				name="Game">
				<option selected>Game Type</option>
				<option value="1">Onlin</option>
				<option value="2">Offline</option>
				<option value="3">other</option>
			</select>
			</div>
		</div>


		<div>
		<div class="bg-success p-2" style="--bs-bg-opacity: .5;">
			<label for="exampleFormControlInput1" class="form-label">Location
				of the beach</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter the beach Location"
				name="Location">
				</div>
		</div>

		<div class="form-check">
		<div class="p-3 mb-2 bg-light-subtle text-emphasis-light">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
  Clean
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
    Or NOT
  </label>
  </div>
</div>

		<div>
			<button class="btn btn-primary" type="submit">Submit form</button>
		</div>

	</form>
</body>
</html>