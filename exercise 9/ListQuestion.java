package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ListQuestion {
    private ArrayList<question> questions = new ArrayList<>();
//    private int point;

    public void listQA() {
        Scanner sc = new Scanner(System.in);
        int point = 0;
        for (question q : questions) {
            System.out.println("Question: " + q.getQuestion());
            for (int i = 0; i < q.getAnswers().size(); i++) {
                System.out.println((i + 1) + "->" + q.getAnswers().get(i));
            }
            System.out.printf("Choose answer-> ");
            int i = Integer.parseInt(sc.nextLine());
            if (q.getCorrectAnswer().equalsIgnoreCase(q.getAnswers().get(i))) {
                point += 1;
            }
        }
        System.out.println("You have " + point + " points.!");
    }

    public void showAll(){
        for(int i=0;i<questions.size();i++){
            System.out.println((i+1)+questions.get(i).toString());
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        question q = new question();
        System.out.printf("Input your question: ");
        q.setQuestion(sc.nextLine());
        System.out.printf("Input correct answer: ");
        q.setCorrectAnswer(sc.nextLine());
        System.out.println("Input possible answer");
        while (true) {
            System.out.printf("How many your possible answer? -> ");
            int i = Integer.parseInt(sc.nextLine());
            if (i > 4 || i < 2) {
                System.out.println("You can  input min 2 & max 4 possible answer!");
            } else {
                ArrayList<String> a = new ArrayList<>();
                while (i > 0) {
                    System.out.printf("Answer 1 -> ");
                    a.add(sc.nextLine());
                    i--;
                }
                q.setAnswers(a);
                break;
            }
        }
        questions.add(q);
    }

    public void update(int index) {
        Scanner sc = new Scanner(System.in);
        question q = new question();
        System.out.printf("Input your question: ");
        questions.get(index).setQuestion(sc.nextLine());
        System.out.printf("Input correct answer: ");
        questions.get(index).setCorrectAnswer(sc.nextLine());
        System.out.println("Input possible answer");
        while (true) {
            System.out.printf("How many your possible answer? -> ");
            int i = Integer.parseInt(sc.nextLine());
            if (i > 4 || i < 2) {
                System.out.println("You can  input min 2 & max 4 possible answer!");
            } else {
                while (i > 0) {
                    System.out.printf("Answer 1 -> ");
                    questions.get(index).getAnswers().add(sc.nextLine());
                    i--;
                }
                break;
            }
        }
    }

    public void delete(int index){
        questions.remove(questions.get(index));
    }
}
