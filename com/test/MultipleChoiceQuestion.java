package assignment10.IdeaProjects.naz0.Users.com.test;

public class MultipleChoiceQuestion extends ObjectiveQuestion {
    protected String[] possibleAnswers;

    public MultipleChoiceQuestion(double points, double answerSpace, String questionText, String correctAnswer, String[] possibleAnswers, double difficulty)  {
        super(points, answerSpace, questionText, correctAnswer, difficulty);
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String toString(){
        String answer = questionText;
        for(int i = 0; i < possibleAnswers.length; i++){
            answer += "\n" + (i+1) + ". ";
            answer += possibleAnswers[i];
        }
        return answer;

    }

    @Override
    public String toStringAnswerKey(){

        int ansIndex = determineAnsIndex(correctAnswer, possibleAnswers);
        String answer = questionText;
        for(int i = 0; i < possibleAnswers.length; i++){
            answer += "\n" + (i+1) + ". ";
            if(i == ansIndex){
                answer += "****   " + possibleAnswers[i] + "   ****";
            }
            else
                answer += possibleAnswers[i];
        }
        return answer;

    }

    public int determineAnsIndex(String correctAnswer, String[] possibleAnswers){
        for(int i = 0; i < possibleAnswers.length; i++){
            if(correctAnswer.equals(possibleAnswers[i]))
                return i;
        }
        return -1;
    }

}
