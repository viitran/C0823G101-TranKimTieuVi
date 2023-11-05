package case_study.furama.controller;

import case_study.furama.model.facility.Facility;
import case_study.furama.service.IFacilityService;
import case_study.furama.service.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    private final IFacilityService iFacilityService = new FacilityService();

    public Map<Facility,Integer> showList(){
     return iFacilityService.showList();
    }

    public void addFacility(Facility facility,int value){
        iFacilityService.addNewFacility(facility,value);
    }

//    public Boolean removeFacility(String code){
//        return iFacilityService.removeFacility(code);
//    }
}
