package patterns.creational.prototype;

import patterns.creational.prototype.student.Deanery;
import patterns.creational.prototype.student.Polyclinic;
import patterns.creational.prototype.student.Student;

import java.util.ArrayList;
import java.util.List;

import static patterns.creational.prototype.Clone.cloneAndCompare;

public class PrototypeCheck {
    public static void check() {
        List<Student> students = new ArrayList<>();
        List<Student> studentCopy = new ArrayList<>();

        Deanery deanery = new Deanery();
        deanery.setAge(20);
        deanery.setName("George");
        deanery.setProgress(56);
        students.add(deanery);

        Deanery deanery1 = (Deanery) deanery.clone();
        students.add(deanery1);

        Polyclinic polyclinic = new Polyclinic();
        polyclinic.setWeight(56.43);
        polyclinic.setHeight((float) 198.56);
        students.add(polyclinic);

        cloneAndCompare(students, studentCopy);
    }
}