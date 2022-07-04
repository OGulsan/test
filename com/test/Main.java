package assignment10.IdeaProjects.naz0.Users.com.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] answers =  {"10", "15", "20", "25"};
        String[] answers2 =  {"1988", "2000", "1911", "Was never stolen"};

        //creates a list of questions
        List<Object> questions = new ArrayList<Object>();
        questions.add(new ObjectiveQuestion(100, 2, "What 10 % 2?", "0", 5));
        questions.add(new MultipleChoiceQuestion(100, 2, "Whats 5 + 5?", "10", answers, 5));
        questions.add(new FillInTheBlankQuestion(100, 2, "was the 16th US President.", "Abraham Lincoln", 5));
        questions.add(new ObjectiveQuestion(100, 2, "What is the square root of 81?", "9", 5));
        questions.add(new MultipleChoiceQuestion(100, 2, "What year was the Mona Liza stolen from the Louvre?", "1911", answers2, 5));
        questions.add(new FillInTheBlankQuestion(100, 2, "is the leading cause of death for men, women, and people of most racial and ethnic groups in the United States. ", "Heart disease", 5));

        //initializes test class with list of questions
        Test test = new Test(questions);

        //prints questions and then the questions alongside answers and the total amount of points
        System.out.println("Questions: ");
        test.printQuestions();

        System.out.println();System.out.println();

        System.out.println("Questions with answers: ");
        test.printQuestionsAndAnswers();
        System.out.println("Total points : " + test.getTotalPoints());




    }
}
