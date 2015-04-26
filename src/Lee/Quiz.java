package Lee;

import java.io.*;
import java.util.Scanner;

public class Quiz {

    private String name;
    private int numberOfQuestions;
    private String topic;
    private String difficulty;

    public Quiz(String name, int numberOfQuestions, String topic, String difficulty) {
        this.name = name;
        this.numberOfQuestions = numberOfQuestions;
        this.topic = topic;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Difficulty: " + difficulty + ')';
    }

    public void loopThroughQuestions(Quiz quiz){
        try{
            String formattedFileName = (quiz.getName() + ".txt");
            formattedFileName = formattedFileName.replace(" ", "");
            FileReader file = new FileReader(formattedFileName);
            BufferedReader buffer = new BufferedReader(file);
            String line;
            while((line = buffer.readLine()) != null){
                System.out.println(line);
            }
            buffer.close();
        }
        catch(IOException e){
            System.out.print("An error has occurred. Unable to read file.");
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("Basic Details", 3, "General", "Easy");
        System.out.println(quiz.toString());
        quiz.loopThroughQuestions(quiz);
    }
}
