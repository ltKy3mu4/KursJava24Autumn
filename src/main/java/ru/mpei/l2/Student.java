package ru.mpei.l2;

class Student {
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
}
