(function(){
    var app = angular.module('smartnews', []);
    app.controller('NewsController', [ '$http', function($http) {
        var smartnews = this;

        this.clients = [];

        $http.get('/rest/clients').success(function(data) {
            smartnews.clients = data;
        });
    }]);
})();

