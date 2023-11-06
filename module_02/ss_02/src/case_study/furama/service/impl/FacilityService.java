package case_study.furama.service.impl;

import case_study.furama.model.facility.Facility;
import case_study.furama.repository.IFacilityRepository;
import case_study.furama.repository.impl.FacilityRepository;
import case_study.furama.service.IFacilityService;
import ss12_java_collection_framework.exc.model.Product;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> showList() {
        return iFacilityRepository.showList();
    }

    @Override
    public void addNewFacility(Facility facility, int value) {
        iFacilityRepository.addNewFacility(facility, value);
    }

    @Override
    public void removeFacility(String code) {
        iFacilityRepository.removeFacility(code);
    }

    @Override
    public Boolean findByCode(String code) {
        return iFacilityRepository.findByCode(code);
    }

}
