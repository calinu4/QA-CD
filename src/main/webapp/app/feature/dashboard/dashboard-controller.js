(function() {

    var DashBoardController =  function()
    {
        var vm = this;

        vm.test = "test";
    };
    angular.module('cd').controller('dashboardController', [DashBoardController]);
}());