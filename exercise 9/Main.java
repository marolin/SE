package exam;

import java.util.Scanner;

public class Main {
    static ListQuestion list = new ListQuestion();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose=0;
        while(choose != 5){
            System.out.println("1. Do question\n"+
                    "2. Add question\n"+
                    "3. Update question\n"+
                    "4. Delete question\n"+
                    "5. Quit\n"
            );
            System.out.printf("Choose> ");
            choose = Integer.parseInt(sc.nextLine());
            if(choose == 1){
                list.listQA();
            }else if(choose == 2){
                list.add();
            }else if(choose == 3){
                list.showAll();
                System.out.printf("Input index question: ");
                list.update(Integer.parseInt(sc.nextLine()));
            }else if(choose == 4){
                list.showAll();
                System.out.printf("Input index question: ");
                list.delete(Integer.parseInt(sc.nextLine()));
            }else{
                System.out.println("Invalid Input!");
            }
        }
    }
}
