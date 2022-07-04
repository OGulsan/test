package assignment10.IdeaProjects.naz0.Users.com.test;

public class FillInTheBlankQuestion extends ObjectiveQuestion {

    public FillInTheBlankQuestion(double points, double answerSpace, String questionText, String correctAnswer, double difficulty)  {
        super(points, answerSpace, questionText, correctAnswer, difficulty);

    }

    @Override
    public String toString(){
        return "_____ " + questionText;
    }

    @Override
    public String toStringAnswerKey(){
        return correctAnswer + " " + questionText;
    }

}
