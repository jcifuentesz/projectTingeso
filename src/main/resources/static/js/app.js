var app = angular.module('student',['ngRoute', 'ui.bootstrap']);

app.config(function($routeProvider){
    $routeProvider
        .when('/students',{
            templateUrl: 'js/views/student.html',
            controller: 'StudentController'
        })
        .otherwise({
            redirectTo: '/index'
        });
});

app.filter('startFrom', function(){
	return function(data, start){
		return data.slice(start);
	}
});
