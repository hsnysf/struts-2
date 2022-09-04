<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<body>
		<s:text name="employee.details" />
		<s:form action="saveStudent">
			<s:textfield name="cpr" label="CPR" />
			<s:textfield name="name" label="Name" />
			<s:textfield name="address.block" label="Block" />
			<s:textfield name="address.city" label="City" />
			<table border="1">
				<thead>
					<tr>
						<th>
							Certificate Title
						</th>
						<th>
							Certificate Year
						</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="certificates" status="status">
					<tr>
						<td>
							<s:textfield name="certificates[%{#status.index}].title" label="Title" theme="simple" />
						</td>
						<td>
							<s:textfield name="certificates[%{#status.index}].year" label="Year" theme="simple" />
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			<s:submit value="Save Student" />
		</s:form>
	</body>
</html>