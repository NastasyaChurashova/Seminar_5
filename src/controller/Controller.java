package controller;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();

    private final StudentView view = new StudentView();

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, firstName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public void formStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroupService.formStudentGroup(teacher, studentList);
    }

}
