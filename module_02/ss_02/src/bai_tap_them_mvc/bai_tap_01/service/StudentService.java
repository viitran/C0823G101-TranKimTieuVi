package bai_tap_them_mvc.bai_tap_01.service;


import bai_tap_them_mvc.bai_tap_01.repository.IStudentRepository;
import bai_tap_them_mvc.bai_tap_01.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void showList() {
        iStudentRepository.showList();
    }
}
