(function() {

    var GetCdController =  function(cdDal)
    {
        var vm = this;
        vm.test = "test";

        function init() {
            cdDal.getCds().then(function (results) {
                vm.cds  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cd').controller('getCdController', ['cdDal', GetCdController]);
}());