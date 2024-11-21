package ru.mpei.l2;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int age = 16;
    private boolean presentInLesson;

    public Student(String name, String newSurname, int newAge, boolean newPresentInLesson) {
        this.name = name;
        surname = newSurname;
        age = newAge;
        presentInLesson = newPresentInLesson;
    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.surname = other.surname;
        this.presentInLesson = other.presentInLesson;
    }

    public Student() {
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", presentInLesson=" + presentInLesson +
                '}';
    }

//    public int hashCode(){
//        int n;
//        if (presentInLesson) {
//            n = 1;
//        } else {
//            n = 0;
//        }
//        return name.length() + surname.length() + age + n;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && presentInLesson == student.presentInLesson && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, presentInLesson);
    }

    public String printInfo(){
        String info = "Name:" + name + ", Surname:"+surname+", age = "+age+", present: "+presentInLesson;
        return info;
    }

    public boolean isAdult(){
        return age >= 18;
    }

    public void setAge(int proposedAge){
//        if (proposedAge < 0 || proposedAge > 125){
//            return;
//        }
//        age = proposedAge;
        if (proposedAge > 0 && proposedAge < 125){
            age = proposedAge;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isPresentInLesson() {
        return presentInLesson;
    }

    public void setPresentInLesson(boolean presentInLesson) {
        this.presentInLesson = presentInLesson;
    }

    public static Student createDefualtStudent(){
        Student s1 = new Student("Vanya", "Ivanov", 12, false);
        return s1;
    }
}
