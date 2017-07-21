"use strict";

(function () {

    angular.module("cd").service("cdDal", ["dal", CdDal]);

    function CdDal (dal) {

        this.getCds = function () {
            return dal.http.GET("rest/cd/json");
        };

        this.saveCd = function (cdToSave) {
            return dal.http.POST("rest/cd/json", cdToSave);
        };

        this.updateCd = function (cdToUpdate) {
            return dal.http.PUT("rest/cd/json/", cdToUpdate);
        };

        this.deleteCd = function (cdToDelete) {
            return dal.http.DELETE("rest/cd/json/", cdToDelete);
        };

    }
}());
