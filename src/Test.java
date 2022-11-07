import file1.Assistant;
import file1.Professor;
import file1.Student;

public class Test {
    public static void main(String...args){

        Student student = new Student("Eloys", "Alfonse", 0012215, 5);
        Professor professor =new Professor("Filippo", "Rossi", 000111, "Philosophy");
        Assistant assistant = new Assistant("Erald", "Caprio", 4452, false);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
