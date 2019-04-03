package ru.mtusi.labwork1.repository;

import ru.mtusi.labwork1.model.Student;

public class StudentsRepository extends AbstractRepository<Student> {
    public StudentsRepository() {
        super(Student.class);
    }
}
