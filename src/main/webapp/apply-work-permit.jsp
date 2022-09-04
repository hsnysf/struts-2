<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<style>
			.errorMessage {
			    color: red;
			}
			.error {
			    color: red;
			}
		</style>
	</head>
	<body>
		<!-- Apply Work Permit -->
		<s:text name="work.permit.apply" />
		
		<s:if test="hasActionErrors()">
		   <div class="errors">
		      <s:actionerror/>
		   </div>
		</s:if>

		<s:form action="work-permit-details">
			<%-- <s:textfield name="workPermit.cpr" label="CPR" />
			<s:textfield name="workPermit.name" label="Name" />
			<s:textfield name="workPermit.mobile" label="Mobile" />
			<s:textfield name="workPermit.email" label="Email" />
			<s:textfield name="workPermit.age" label="Age" />
			<s:radio name="workPermit.gender" list="{'Male', 'Female'}" label="Gender" />
			<s:textfield name="workPermit.url" label="URL" />
			<s:checkboxlist name="workPermit.communications" list="{'SMS', 'Email', 'Whatsapp'}" label="Communications" />
			<s:select name="workPermit.serviceType" list="{'', 'Normal','VIP'}" label="Service Type" />
			<s:submit value="Apply Work Permit"/> --%>
			<s:textfield name="workPermit.cpr" key="work.permit.cpr" />
			<s:textfield name="workPermit.name" key="work.permit.name" />
			<s:textfield name="workPermit.mobile" key="work.permit.mobile" />
			<s:textfield name="workPermit.email" key="work.permit.email" />
			<s:textfield name="workPermit.age" key="work.permit.age" />
			<s:radio name="workPermit.gender" list="{'Male', 'Female'}" key="work.permit.gender" />
			<s:textfield name="workPermit.url" key="work.permit.url" />
			<s:checkboxlist name="workPermit.communications" list="{'SMS', 'Email', 'Whatsapp'}" key="work.permit.communications" />
			<s:select name="workPermit.serviceType" list="{'', 'Normal','VIP'}" key="work.permit.service.type" />
			<s:submit key="work.permit.apply"/>
		</s:form>
	</body>
</html>