<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="44" class="d-inline-block align-text-top">
     X-workz ODC
    </a>
    
 
  
  </div>
</nav>
<body>
<h4>Click to get the Data</h4>

	<form action="email" method="post">
		<input type="submit" value="Email"  />
		<br> <label>${email}</label>
	</form>
<br>
	<form action="mobile" method="post">
		<input type="submit" value="Mobile"  />
		<br> <label>${mobile}</label>
	</form>
	<br>
	<form action="aadhar" method="post">
		<input type="submit" value="Aadhar"  />
		<br> <label>${aadhar}</label>
	</form>
	<br>
	<form action="age" method="post">
		<input type="submit" value="Age"  /> <br>
		<label>${age}</label>
	</form>
	<br>
	<form  action="dob"
		method="post">
		<input type="submit" value="DOB with Time"
			 /> <br> <label>${dob}</label>
	</form>

<form  action="ListOfFriends"
		method="post">
		<input type="submit" value="List Of ListOfFriends"
			 /> <br>
		<ul>
			<c:forEach items="${ListOfFriends}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
<form  action="skill"
		method="post">
		<input type="submit" value="List Of Skill Set"
			 /> <br>
		<ul>
			<c:forEach items="${skill}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form  action="education" method="post">
		<input type="submit" value="EducationDTO"  />
		 <br><label>${info.qualification}</label>
		 <br><label>${info.schoolName}</label>
		 <br><label>${info.sslcPercentage}</label>
		 <br><label>${info.diplomaCollege}</label>
		 <br><label>${info.diplomaPercentage}</label>
		 <br><label>${info.deCollege}</label>
		 <br><label>${info.bePercentage}</label>
		 <br><label>${info.branch}</label>
		 <br><label>${info.trainingInstitute}</label>
		 <br><label>${info.learntJava}</label>
		 
		</form>
		<br>
		<form  action="family" method="post">
		<input type="submit" value="FamilyDTO"  />
		 <br><label>${fam.fatherName}</label>
		 <br><label>${fam.grandFather}</label>
		 <br><label>${fam.grandMother}</label>
		 <br><label>${fam.livesIn}</label>
		 <br><label>${fam.motherName}</label>
		 <br><label>${fam.siblingName}</label>
		 <br><label>${fam.familmembrs}</label>
		 <br><label>${fam.fatherqualification}</label>
		 <br><label>${fam.motherqualification}</label>
		 <br><label>${fam.noOfsibling}</label>
		 </form>
		 <br>
		 <form  action="mobiledto" method="post">
		<input type="submit" value="MobileDTO"  />
		 <br><label>${sim.company}</label>
		 <br><label>${sim.model}</label>
		 <br><label>${sim.price}</label>
		 <br><label>${sim.dualSim}</label>
		 <br><label>${sim.simname}</label>
		 </form>
		<br>
		
		 <br>
		 <form  action="chat" method="post">
		<input type="submit" value="ChatDTO"  />
		 <br><label>${chat.name}</label>
		 <br><label>${chat.price}</label>
		 <br><label>${chat.goodForHealth}</label>
		 <br><label>${chat.available}</label>
		 <br><label>${chat.shopName}</label>
		 <br><label>${chat.ownerName}</label>
		 <br><label>${chat.tastesGood}</label>
		 <br><label>${chat.location}</label>
		 <br><label>${chat.distance}</label>
		 <br><label>${chat.shopOpensAt}</label>
		 <br><label>${chat.shopClosesAt}</label>
		 </form>




</body>
</html>