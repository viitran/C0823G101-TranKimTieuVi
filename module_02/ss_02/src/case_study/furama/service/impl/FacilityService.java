package case_study.furama.service.impl;

import case_study.furama.repository.IFacilityRepository;
import case_study.furama.repository.impl.FacilityRepository;
import case_study.furama.service.IFacilityService;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository iFacilityRepository = new FacilityRepository();
}
