package case_study.furama.repository.impl;

import case_study.furama.model.facility.Facility;
import case_study.furama.model.facility.House;
import case_study.furama.model.facility.Room;
import case_study.furama.model.facility.Villa;
import case_study.furama.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        facilityIntegerMap.put(new Villa("SVVL-0123", "Villa", 20.0, 23000L, 3,
                "Holiday", "4.5 start", "5m", 3), 0);
        facilityIntegerMap.put(new House("SVHO-1234", "House", 200.0, 6500L, 5,
                "rental", "5start", 4), 0);
        facilityIntegerMap.put(new Room("SVRO-3456", "Room", 10.0, 500L, 2,
                "Christmas", "steam room"), 0);
    }

    @Override
    public Map<Facility, Integer> showList() {
        return facilityIntegerMap;
    }

    @Override
    public void addNewFacility(Facility facility, int value) {
        facilityIntegerMap.put(facility, value + 1);
    }

}
