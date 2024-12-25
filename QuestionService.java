import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];
    public QuestionService() {  //constructor
        questions[0] = new Question(1, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[1] = new Question(2, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[2] = new Question(3, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[3] = new Question(4, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[4] = new Question(5, "Number of members in BTS?", "5", "7", "9", "4", "7");



    }

    int i = 0;
    public void playQuiz() {
        for (Question q : questions) {
            System.out.println("Question no. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer:  ");
            selection[i] = sc.nextLine();
            i++;
            System.out.println();
        }

        System.out.println();
        
        for (String s : selection) {
            System.out.println(s);
        }
    }
}
