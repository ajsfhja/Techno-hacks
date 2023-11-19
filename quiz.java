import java.util.Scanner;
class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = 0;
        String[] ques = {
            "Which of the following mountains is called 'Five Treasures of great Show?",
            "What is the longest National Highway in India?",
            "In which of the following India Institute of Petroleum is located?"
        };
        String[] options = {
            "A) Lhotse B) Godwin Austin C) Kangchenjunga D) Dhaulagiri",
            "A) NH4  B) NH7  C) NH8  D) NH10",
            "A) Vishakapatnam B) Delhi  C) Dehradun  D) Chennai"
        };
        char[] answers = {'C', 'B', 'C'};
        for (int i = 0; i < ques.length; i++) 
		{
            System.out.println("Question " + (i + 1) + ": " + ques[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = s.next().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) 
			{
                System.out.println("Correct!\n");
                score++;
            } else 
			{
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
            }
        }
        System.out.println("Quiz completed! Your score: " + score + " out of " + ques.length);
        s.close();
    }
}