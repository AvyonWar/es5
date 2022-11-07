package file1;

public class Professor extends CollegePerson implements TeachingPerson{
    public String teachingSubject;

    @Override
    public void teachToOtherPeople() {
        System.out.println("Now " + name + " " + surname + ", teaches " + teachingSubject);
    }

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.teachingSubject = teachingSubject;
    }

}
