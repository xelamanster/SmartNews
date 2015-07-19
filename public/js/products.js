(function(){
    var app = angular.module('products-store', []);

    app.directive('productPanels', function() {
        return {
            restrict: 'E',
            controller:  function() {
                this.tab = 1;

                this.selectTab = function(setTab) {
                    this.tab = setTab;
                }

                this.isSelected = function(checkTab) {
                    return this.tab === checkTab;
                }
            },
            controllerAs: 'panelCtrl',
            templateUrl: '../pages/product-panels.html'
        };
    });

    app.directive('productHeader', function() {
        return {
            restrict: 'E',
            template: [
                '<div class="table">',
                '<p class="cell">Product name: {{product.name}}</p>',
                '<p class="cell">price: {{product.price | currency}}</p>',
                '<button class="cell" ng-show="product.canPurchase">Add to cart</button>',
                '</div>'
            ].join('')
        };
    });

    app.controller('ReviewController', function() {
        this.review = {};

        this.addReview = function(product, reviewForm) {
            product.reviews.push(this.review);
            this.review = {};
            if (reviewForm) {
                reviewForm.$setPristine();
                reviewForm.$setUntouched();
            }
        }
    });
})();

