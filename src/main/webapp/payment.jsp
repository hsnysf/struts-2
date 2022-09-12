<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<body>
		<s:form action="payment">
			<s:token />
			<s:textfield name="amount" label="Amount" />
			<s:submit />
		</s:form>
	</body>
</html>