<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<body>
		<table border="1">
			<tr>
				<th>
					CPR
				</th>
				<td>
					<s:property value="student.cpr"/>
				</td>
			</tr>
			<tr>
				<th>
					Name
				</th>
				<td>
					<s:property value="student.name"/>
				</td>
			</tr>
			<tr>
				<th>
					Block
				</th>
				<td>
					<s:property value="student.address.block"/>
				</td>
			</tr>
			<tr>
				<th>
					City
				</th>
				<td>
					<s:property value="student.address.city"/>
				</td>
			</tr>
		</table>
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
				<s:iterator value="student.certificates" status="status">
				<tr>
					<td>
						<s:property value="title"/>
					</td>
					<td>
						<s:property value="year"/>
					</td>
				</tr>
				</s:iterator>
			</tbody>
		</table>
	</body>
</html>