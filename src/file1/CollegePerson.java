package file1;

public abstract class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    /**
     *un metodo "goToCollegeche" stampa tutti gli 'CollegePerson' attributi
     */

    public void  goToCollege(){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        System.out.println("Hello " + name + " - " + surname + " - " + collegeId);
    }

}
