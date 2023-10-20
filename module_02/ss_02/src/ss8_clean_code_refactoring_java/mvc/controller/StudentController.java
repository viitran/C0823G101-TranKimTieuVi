package ss8_clean_code_refactoring_java.mvc.controller;


import ss8_clean_code_refactoring_java.mvc.service.IStudentService;
import ss8_clean_code_refactoring_java.mvc.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = (IStudentService) new StudentService();
    public void showList(){
        iStudentService.showList();
    }

}
