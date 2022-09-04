<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<body>
		<s:text name="employee.details" />
		<s:form action="saveEmployee" enctype="multipart/form-data">
			<%-- <s:textfield name="name" label="Name" />
			<s:textfield name="age" label="Age" />
			<s:textfield name="salary" label="Salary" />
			<s:checkbox name="highPerformance" label="High Performance" />
			<s:checkboxlist name="diseases" list="{'Disease 1', 'Disease 2', 'Disease 3'}" label="Diseases" />
			<s:checkboxlist name="skills" list="skillList" label="Skills" />
			<s:radio name="gender" list="{'Male', 'Female'}" label="Gender" />
			<s:radio name="department" list="departments" label="Department" />
			<s:select name="leave" list="#{true:'Yes', false:'No'}" label="Leave" />
			<s:select name="role" list="roles" label="Role" />
			<s:select multiple="true" name="hobbies" list="{'Draw', 'Football', 'Basket ball'}" label="Hobbies" />
			<s:textarea name="profile" label="Profile" />
			<s:password name="password" label="Password" />
			<s:submit value="Save Employee"/> --%>
			<s:textfield name="name" key="employee.name" />
			<s:textfield name="age" key="employee.age" />
			<s:textfield name="salary" key="employee.salary" />
			<s:checkbox name="highPerformance" key="employee.high.performance" />
			<s:checkboxlist name="diseases" list="{getText('employee.disease1'), getText('employee.disease2'), getText('employee.disease3')}" key="employee.diseases" />
			<s:checkboxlist name="skills" list="skillList" key="employee.skills" />
			<s:radio name="gender" list="{getText('employee.male'), getText('employee.female')}" key="employee.gender" />
			<s:radio name="department" list="departments" key="employee.department" />
			<s:select name="leave" list="#{true:getText('employee.yes'), false:getText('employee.no')}" key="employee.leave" />
			<s:select name="role" list="roles" key="employee.role" />
			<s:select multiple="true" name="hobbies" list="{getText('employee.draw'), getText('employee.football'), getText('employee.basketball')}" key="employee.hobbies" />
			<s:textarea name="profile" key="employee.profile" />
			<s:password name="password" key="employee.password" />
			
			<s:file name="passport" key="Passport" />
			<s:file name="certificates" multiple="multiple" key="Certificates"/>
			
			<s:submit key="employee.save"/>
		</s:form>
	</body>
</html>