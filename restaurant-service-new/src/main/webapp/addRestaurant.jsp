<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<form action="addRestaurant" method="post">
	<div class="form-group">
		<label for="id">Id</label>
		<input type="text" name="id" id="id" class="form-control"/>
	</div>
	
	<div class="form-group">
		<label for="restaurantName">Restaurant Name</label>
	 	<input type="text" name="restaurantName" id="restaurantName" class="form-control" />
	</div>
	
	<div class="form-group">
		<label for="pinCode">Pin Code</label>
		<input type="text"  name="pinCode" id="pinCode" class="form-control"/>
	</div>
	
	<div class="form-group">
		<label for="cuisine">Cuisine</label>
		<input type="text" name="cuisine" id="cuisine" class="form-control"/>
	</div>
	
	<div class="form-group">
		<input type="submit" value="Add"  class="btn btn-info"/>
	</div>
</form>

</body>
</html>