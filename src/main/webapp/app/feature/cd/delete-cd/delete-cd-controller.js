(function() {

    var DeleteCdController =  function($state, cdDal) {
        var vm = this;

        vm.deleteCd = function(cdToDelete) {
            console.log("This is the index of cd to delete " + cdToDelete);
            console.log(cdToDelete);
           // var cdToJson = JSON.stringify(cdToAdd);
            //console.log(cdToJson);
            cdDal.deleteCd(cdToDelete).then(function (results) {
                vm.cDeleteMessage  = results;
                alert("The cd with index"+cdToDelete+" has been deleted!");
                $state.go('getcd');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };

    angular.module('cd').controller('deleteCdController', ['$state','cdDal',DeleteCdController]);
}());