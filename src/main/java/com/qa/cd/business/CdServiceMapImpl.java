package com.qa.cd.business;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class CdServiceMapImpl implements CdService {

    @Override
    public String getAllCds() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String createCd(String movie) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String updateCd(Long id, String movie) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteCd(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}