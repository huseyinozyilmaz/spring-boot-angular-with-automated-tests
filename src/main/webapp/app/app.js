angular.module('calculatorApp', [])

    .service('additionService', function($q, $http) {
        this.add = function (x, y) {
            var deferred = $q.defer();
            $http.get("/addition", {params:{"x": x, "y": y}})
                .then(function (response) {
                    deferred.resolve(response.data.result)
                });
            return deferred.promise;
        }
    })
    .controller('additionController', function($scope, additionService) {

        var addition = this;

        addition.calc = function() {
            additionService.add($scope.x, $scope.y)
                .then(function (result) {
                    $scope.result = result;
                })
        }
    });
