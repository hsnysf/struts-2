<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<style>
			.success {
			    color: green;
			}
		</style>
	</head>
	<body>
		<s:if test="hasActionMessages()">
		   <div class="success">
		      <s:actionmessage/>
		   </div>
		</s:if>
		<table border="1">
			<tr>
				<th>
					CPR
				</th>
				<td>
					<s:property value="workPermit.cpr"/>
				</td>
			</tr>
			<tr>
				<th>
					Name
				</th>
				<td>
					<s:property value="workPermit.name"/>
				</td>
			</tr>
			<tr>
				<th>
					Mobile
				</th>
				<td>
					<s:property value="workPermit.mobile"/>
				</td>
			</tr>
			<tr>
				<th>
					Email
				</th>
				<td>
					<s:property value="workPermit.email"/>
				</td>
			</tr>
			<tr>
				<th>
					Age
				</th>
				<td>
					<s:property value="workPermit.age"/>
				</td>
			</tr>
			<tr>
				<th>
					Gender
				</th>
				<td>
					<s:property value="workPermit.gender"/>
				</td>
			</tr>
			<tr>
				<th>
					URL
				</th>
				<td>
					<s:property value="workPermit.url"/>
				</td>
			</tr>
			<tr>
				<th>
					Communication
				</th>
				<td>
					<s:property value="workPermit.communications"/>
				</td>
			</tr>
			<tr>
				<th>
					Service Type
				</th>
				<td>
					<s:property value="workPermit.serviceType"/>
				</td>
			</tr>
		</table>
	</body>
</html>