package com.qa.cd.business;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.cd.persistence.Cd;
import com.qa.cd.util.JSONUtil;

@Stateless
@Default
public class CdServiceDBImpl implements CdService {

    @PersistenceContext(unitName = "primary")
    private EntityManager manager;

    @Inject
    private JSONUtil util;

    @Override
    public String getAllCds() {
        Query query = manager.createQuery("Select m FROM Cd m");
        Collection<Cd> cds = (Collection<Cd>) query.getResultList();
        return util.getJSONForObject(cds);
    }

    @Override
    public String createCd(String cd) {
        Cd aCd = util.getObjectForJSON(cd, Cd.class);
        manager.persist(aCd);
        return "{\"message\": \"cd sucessfully added\"}";
    }

    @Override
    public String updateCd(Long id, String cd) {
        Cd updatedCd = util.getObjectForJSON(cd, Cd.class);
        Cd cdInDB = findCd(id);
        if (cdInDB != null) {
            cdInDB = updatedCd;
            manager.merge(cdInDB);
        }
        return "{\"message\": \"cd sucessfully updated\"}";
    }

    @Override
    public String deleteCd(Long id) {
        Cd cdInDB = findCd(id);
        if (cdInDB != null) {
            manager.remove(cdInDB);
        }
        return "{\"message\": \"cd sucessfully deleted\"}";
    }

    private Cd findCd(Long id) {
        return manager.find(Cd.class, id);
    }

}