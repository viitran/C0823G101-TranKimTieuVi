package case_study.furama.controller;

import case_study.furama.model.facility.Facility;
import case_study.furama.service.IFacilityService;
import case_study.furama.service.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    private final IFacilityService iFacilityService = new FacilityService();

    public Map<Facility, Integer> showList() {
        return iFacilityService.showList();
    }

    public void addFacility(Facility facility, int value) {
        iFacilityService.addNewFacility(facility, value);
    }

    public void removeFacility(String code) {
        iFacilityService.removeFacility(code);
    }

    public Boolean findByCode(String code) {
        return iFacilityService.findByCode(code);
    }
}
