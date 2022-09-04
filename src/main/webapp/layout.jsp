<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
	<body>
		<tiles:insertAttribute name = "header" />
		<h2><tiles:getAsString name="title"/></h2>
		<hr>
      	<tiles:insertAttribute name = "page" />
      	<tiles:insertAttribute name = "footer" />
	</body>
</html>