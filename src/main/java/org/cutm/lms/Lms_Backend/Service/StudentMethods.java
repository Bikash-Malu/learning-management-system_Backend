package org.cutm.lms.Lms_Backend.Service;

import org.cutm.lms.Lms_Backend.Dto.StudentDto;

import java.util.List;

public interface StudentMethods {
    StudentDto createStudent(StudentDto student);

    //get the particular Student
    StudentDto getStudent(String studentId);

    //List of Student
    List<StudentDto> getAllStudent();

    //Delete the Student
    void deleteStudent(String id);

    //update the Student
    StudentDto updateStudent(String id,StudentDto student);
}
