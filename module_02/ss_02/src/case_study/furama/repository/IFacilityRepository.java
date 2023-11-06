package case_study.furama.repository;

import case_study.furama.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> showList();

    void addNewFacility(Facility facility, int value);

    void removeFacility(String code);

    Boolean findByCode(String code);
}
