<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
		  <div class="mb-3">
  			<label for="exampleFormControlInput1" class="form-label">Email address</label>
  			<s:textfield type="email" class="form-control is-valid" id="exampleFormControlInput1" placeholder="name@example.com"/>
			</div>
			<div class="mb-3">
  				<label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
  				<s:textarea class="form-control is-valid" id="exampleFormControlTextarea1" rows="3"></s:textarea>
			</div>
		</div>
	</body>
</html>