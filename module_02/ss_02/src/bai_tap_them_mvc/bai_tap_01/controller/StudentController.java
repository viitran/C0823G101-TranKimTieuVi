package bai_tap_them_mvc.bai_tap_01.controller;


import bai_tap_them_mvc.bai_tap_01.service.IStudentService;
import bai_tap_them_mvc.bai_tap_01.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = (IStudentService) new StudentService();
    public void showList(){
        iStudentService.showList();
    }

}
