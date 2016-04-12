(function() {

	var app = angular.module('main-app', []);
	
	app.controller('AppController', function($scope, $http) {
		$http.get('http://localhost:8080/marvel-api/characters').then(function(response) {
			$scope.characters = response.data.data.results;
		});
	});
	
})();
