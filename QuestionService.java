import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() { // constructor
        questions[0] = new Question(1, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[1] = new Question(2, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[2] = new Question(3, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[3] = new Question(4, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[4] = new Question(5, "Number of members in BTS?", "5", "7", "9", "4", "7");
    }

    int i = 0;
    String input;

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            boolean valid = false;

            while (!valid) {
                System.out.print("Enter your answer (1, 2, 3, or 4): ");
                input = sc.nextLine();
                if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")) {
                    selection[i] = switch (input) {
                        case "1" -> q.getOpt1();
                        case "2" -> q.getOpt2();
                        case "3" -> q.getOpt3();
                        case "4" -> q.getOpt4();
                        default -> ""; // This case won't be reached due to validation.
                    };
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid option (1, 2, 3, or 4).");
                }
            }
            i++;
            System.out.println();
        }

        System.out.println("Your answers:");
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (userAnswer.equals(answer)) {
                score++;
            }
        }

        System.out.println();
        System.out.println("Score: " + score);
    }
}
