(function(){
    var app = angular.module('store', [ 'products-store']);
    app.controller('StoreController', [ '$http', function($http) {
        var store = this;

        this.products = [];

        $http.get('/products').success(function(data) {
            store.products = data;
        });
    }]);

    app.directive('headerFein', function() {
        return {
            restrict: 'E',
            templateUrl: '../pages/header.html'
        };
    });

    app.directive('footerFein', function() {
        return {
            restrict: 'E',
            templateUrl: '../pages/footer.html'
        };
    });

    var mobilephones = [
        {
            name: 'Product1',
            price: 30,
            description: 'BLa-bla',
            specification: 'Some specs',
            canPurchase: true,
            soldOut: false,
            images: [
                {
                    path: '../images/1.jpg',
                    thumb: ''
                }
            ],
            reviews: [
                {
                    author: 'alex',
                    message: 'Awesome',
                    stars: 5
                },
                {
                    author: 'bred',
                    message: 'bad',
                    stars: 2
                },
            ]
        },
        {
            name: 'Product2',
            price: 32.95,
            description: 'BLa-bla',
            specification: 'Some specs',
            canPurchase: true,
            soldOut: false,
            images: [
                {
                    path: '../images/2.jpg',
                    thumb: ''
                }
            ],
            reviews: [
                {
                    author: 'alex',
                    message: 'good',
                    stars: 4
                },
                {
                    author: 'bred',
                    message: 'bad',
                    stars: 2
                },
            ]
        },
        {
            name: 'Product3',
            price: 20.95,
            description: 'BLa-bla',
            specification: 'Some specs',
            canPurchase: true,
            soldOut: false,
            images: [
                {
                    path: '../images/3.jpg',
                    thumb: ''
                }
            ],
            reviews: [
                {
                    author: 'alex',
                    message: 'well',
                    stars: 3
                },
                {
                    author: 'bred',
                    message: 'bad',
                    stars: 2
                },
            ]
        }
    ]
})();

