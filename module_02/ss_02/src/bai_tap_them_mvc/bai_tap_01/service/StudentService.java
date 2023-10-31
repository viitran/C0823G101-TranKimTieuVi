//package bai_tap_them_mvc.bai_tap_01.service;
//
//
//import bai_tap_them_mvc.bai_tap_01.model.Student;
//import bai_tap_them_mvc.bai_tap_01.repository.IStudentRepository;
//import bai_tap_them_mvc.bai_tap_01.repository.StudentRepository;
//
//public class StudentService implements IStudentService{
//    private IStudentRepository iStudentRepository = new StudentRepository();
//    @Override
//    public void showList() {
//        iStudentRepository.showList();
//    }
//
//    @Override
//    public void addStudent(Student student) {
//        iStudentRepository.addStudent(student);
//    }
//
//    @Override
//    public Boolean deleteStudent(int id) {
//       return iStudentRepository.deleteStudent(id);
//    }
//
//    @Override
//    public Boolean checkId(int id) {
//        return iStudentRepository.checkId(id);
//    }
//}
