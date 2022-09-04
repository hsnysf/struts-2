<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<style>
			.success {
			    color: green;
			}
			
			.error {
			    color: red;
			}
		</style>
	</head>
	<body>
		<s:if test="hasActionMessages()">
		   <div class="success">
		      <s:actionmessage/>
		   </div>
		</s:if>
		<s:if test="hasActionErrors()">
		   <div class="error">
		      <s:actionerror/>
		   </div>
		</s:if>
		<br>
		Welcome To Second Page :: <s:property value="message"/>
	</body>
</html>