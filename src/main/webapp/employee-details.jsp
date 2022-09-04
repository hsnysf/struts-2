<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<body>
		<table border="1">
			<tr>
				<th>
					Name
				</th>
				<td>
					<s:property value="name"/>
				</td>
			</tr>
			<tr>
				<th>
					Age
				</th>
				<td>
					<s:property value="age"/>
				</td>
			</tr>
			<tr>
				<th>
					Salary
				</th>
				<td>
					<s:property value="salary"/>
				</td>
			</tr>
			<tr>
				<th>
					High Performance
				</th>
				<td>
					<s:property value="highPerformance ? 'Yes' : 'No'"/>
				</td>
			</tr>
			<tr>
				<th>
					Diseases:
				</th>
				<td>
					<%-- <s:property value="diseases"/> --%>
					<s:iterator value="diseases">
						<s:property/>
						<br>
					</s:iterator>
				</td>
			</tr>
			<tr>
				<th>
					Skills:
				</th>
				<td>
					<%-- <s:property value="skills"/> --%>
					<s:iterator value="skills">
						<s:property/>
						<br>
					</s:iterator>
				</td>
			</tr>
			<tr>
				<th>
					Gender:
				</th>
				<td>
					<s:property value="gender"/>
				</td>
			</tr>
			<tr>
				<th>
					Department:
				</th>
				<td>
					<s:property value="department"/>
				</td>
			</tr>
			<tr>
				<th>
					Leave:
				</th>
				<td>
					<%-- <s:property value="leave"/> --%>
					<s:if test="leave">
						Yes
					</s:if>
					<s:if test="!leave">
						No
					</s:if>
				</td>
			</tr>
			<tr>
				<th>
					Role:
				</th>
				<td>
					<s:property value="role"/>
				</td>
			</tr>
			<tr>
				<th>
					Hobbies:
				</th>
				<td>
					<%-- <s:property value="hobbies"/> --%>
					<s:iterator value="hobbies">
						<s:property/>
						<br>
					</s:iterator>
				</td>
			</tr>
			<tr>
				<th>
					Profile:
				</th>
				<td>
					<s:property value="profile"/>
				</td>
			</tr>
			<tr>
				<th>
					Password:
				</th>
				<td>
					<s:property value="password"/>
				</td>
			</tr>
			<tr>
				<th>
					Passport:
				</th>
				<td>
					File Name : <s:property value="passportFileName"/>
					<br>
					Content Type : <s:property value="passportContentType"/>
					<br>
					<img src="data:image/jpeg;base64,${passportContent}" width="200">
				</td>
			</tr>
			<tr>
				<th>
					Certificates:
				</th>
				<td>
					<s:iterator var="certificateContent" value="certificatesContent" status="status">
						File Name : <s:property value="certificatesFileName[#status.index]"/>
						<br>
						Content Type : <s:property value="certificatesContentType[#status.index]"/>
						<br>
						<img src="data:image/jpeg;base64,${certificateContent}" width="200">
						<br>
					</s:iterator>
				</td>
			</tr>
		</table>
	</body>
</html>