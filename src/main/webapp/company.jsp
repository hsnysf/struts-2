<!DOCTYPE html>
<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
		<script type="text/javascript">
			
			var application = angular.module("application", []);
	
			application.controller("controller", 
	
				function($scope, $http){
					
					$scope.departments = new Array();
					
					$http.get("./company").then(function(result){
						
						$scope.departments = result.data;
					});
				}
			);
		
		</script>
	</head>
	<body ng-app="application" ng-controller="controller">
		<table border="1">
			<thead>
				<tr>
					<th>
						ID
					</th>
					<th>
						Name
					</th>
					<th>
						Floor
					</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="department in departments">
					<td>
						{{department.id}}
					</td>
					<td>
						{{department.name}}
					</td>
					<td>
						{{department.floor}}
					</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>