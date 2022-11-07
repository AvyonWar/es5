package file1;

public class Student extends CollegePerson implements LearningPerson{
    public int academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("Now " + name + " " + surname + ", study!" );
    }

    public Student(String name, String surname, int collegeId, int academicYear){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.academicYear = academicYear;
    }



}
