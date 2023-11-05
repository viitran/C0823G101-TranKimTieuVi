package case_study.furama.service.impl;

import case_study.furama.model.facility.Facility;
import case_study.furama.repository.IFacilityRepository;
import case_study.furama.repository.impl.FacilityRepository;
import case_study.furama.service.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> showList() {
        return iFacilityRepository.showList();
    }

    @Override
    public void addNewFacility(Facility facility, int value) {
        iFacilityRepository.addNewFacility(facility,value);
    }

//    @Override
//    public Boolean removeFacility(String code) {
//        return iFacilityRepository.removeFacility(code);
//    }
}
