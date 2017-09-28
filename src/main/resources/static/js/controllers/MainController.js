app.controller('MainController', ['$scope','$http', function($scope,$http) {

    $scope.pageSize = 10;
    $scope.currentPage = 1;
    $scope.students = [];
    $scope.newStudent = {};
    $scope.resetNewStudent = function(){
        $scope.newStudent = {
        "name":"",
        "rut":"",
        "email":"",
        "career":""
        }
    }
    $scope.loadStudents = function(){
        $http.get('/students').then(function(response){
            $scope.students = response.data._embedded.students;
        });
        $scope.resetNewStudent();
    }

    $scope.send = function(){
        console.log($scope.newStudent);
        var student = {
            "name":$scope.newStudent.name,
            "rut":$scope.newStudent.rut,
            "email":$scope.newStudent.email,
            "career":$scope.newStudent.career
        };

        $http.post('/students',student).then(function(response){
            console.log(response);
            var studentUrl = response.data._links.student.href;
            $scope.loadStudents();
        });
    }
    $scope.loadStudents();

}]);
