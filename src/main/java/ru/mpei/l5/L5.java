package ru.mpei.l5;

import ru.mpei.l2.Student;

import java.util.HashMap;
import java.util.Map;

public class L5 {

    public static void main(String[] args) {
        Map<String, Student> studentsStorage = new HashMap<>();

        Student s = new Student("Ivan", "Ivanov", 20, true);
        Student s2 = new Student("Peter", "Petrov", 20, true);
        Student s3 = new Student("Alex", "Alexov", 20, true);
        studentsStorage.put(generateKey(s), s);
        studentsStorage.put(generateKey(s2), s2);
        studentsStorage.put(generateKey(s3), s3);

        Student student = studentsStorage.get("Ivan_Ivanov_20");
        System.out.println(student);

        Student student1 = studentsStorage.get("dasd");
        System.out.println(student1);

        Student ivanIvanov20 = studentsStorage.remove("Ivan_Ivanov_20");
        Student removed = studentsStorage.remove("dasd");
        System.out.println();

        for (Map.Entry<String, Student> entry : studentsStorage.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key+":"+value);
        }


    }

    public static String generateKey(Student s){
        return s.getName()+"_"+s.getSurname()+"_"+s.getAge();
    }

}
