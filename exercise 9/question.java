package exam;

import java.util.ArrayList;

public class question {
    private String question;
    private String correctAnswer;
    private ArrayList<String> answers = new ArrayList<>();

    public question(){}
    public question(String question, String correctAnswer, ArrayList<String> answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "question{" +
                "question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", answers="+
                '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getAnswers(){
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
