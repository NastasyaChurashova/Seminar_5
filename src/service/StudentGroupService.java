package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class StudentGroupService {

    public StudentGroup formStudentGroup(Teacher teacher, List<Student> studentList){
        return new StudentGroup(teacher, studentList);
    }
}
