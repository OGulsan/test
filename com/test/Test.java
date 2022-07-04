package assignment10.IdeaProjects.naz0.Users.com.test;

import java.util.List;

public class Test {
    List<Object> questions;
    private double totalPoints ;

    public Test(List<Object> questions){
        this.questions = questions;

        for(int i = 0; i < questions.size(); i++){

          Question question = (Question) questions.get(i);
          totalPoints += question.points;
        }


    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void printQuestions(){
        for(int i = 0; i < questions.size(); i++){

            System.out.println(questions.get(i).toString());
            System.out.println();
        }
    }

    public void printQuestionsAndAnswers(){
        for(int i = 0; i < questions.size(); i++){

            ObjectiveQuestion question = (ObjectiveQuestion) questions.get(i);
            System.out.println(question.toStringAnswerKey());
            System.out.println();
        }
    }
}
