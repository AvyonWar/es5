package file1;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    public  boolean isGoingToBeAPhD;

    @Override
    public void studyAtHome() {
        System.out.println("Now " + name + " " + surname + ", study! - " + isGoingToBeAPhD);
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println("Now " + name + " " + surname + ", teach!");
    }

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }


}
