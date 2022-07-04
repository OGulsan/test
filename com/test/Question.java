package assignment10.IdeaProjects.naz0.Users.com.test;

public class Question {

    public final double MIN_DIFFICULTY = 0;

    public final double MAX_DIFFICULTY = 10;

    public double points;

    protected double difficulty;

    protected double answerSpace;

    protected String questionText;

    public Question(double points, double answerSpace, String questionText, double difficulty) {
        if(difficulty < MIN_DIFFICULTY || difficulty > MAX_DIFFICULTY){
            System.out.println("Invalid difficulty");
           System.exit(999);
        }
        this.difficulty = difficulty;
        this.points = points;
        this.answerSpace = answerSpace;
        this.questionText = questionText;

    }

    public double getPoints() {
        return points;
    }

    @Override
    public String toString(){
        return questionText;
    }
}
