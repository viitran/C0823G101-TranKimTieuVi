package case_study.furama.service;

import case_study.furama.model.facility.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility, Integer> showList();

    void addNewFacility(Facility facility, int value);

    void removeFacility(String code);

    Boolean findByCode(String code);


}
