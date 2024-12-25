public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {  //constructor
        questions[0] = new Question(1, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[1] = new Question(2, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[2] = new Question(3, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[3] = new Question(4, "Number of members in BTS?", "5", "7", "9", "4", "7");
        questions[4] = new Question(5, "Number of members in BTS?", "5", "7", "9", "4", "7");



    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}
