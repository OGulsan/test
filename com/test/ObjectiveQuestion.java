package assignment10.IdeaProjects.naz0.Users.com.test;

public class ObjectiveQuestion extends Question {

    String correctAnswer;

    public ObjectiveQuestion(double points,double answerSpace, String questionText, String correctAnswer, double difficulty) {
        super(points, answerSpace, questionText, difficulty);
        this.correctAnswer = correctAnswer;
    }




    public String toStringAnswerKey(){
        return  super.toString() + " - " + correctAnswer;
    }
}
