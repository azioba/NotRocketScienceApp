package com.example.android.notrocketscienceapp;

/**
 * Created by Aziz on 06/12/2017.
 */

public class Questions {

    public String mQuestions [] = {

            "What is the radius of the earth ?",
            "Who is the first man on the moon ?",
            "Who is the first man in the space ?",
            "What is the distance between moon and earth ?",
            "How do we measure the strengh of a material ?",
            "What is the highest pic on earth ?",
            "What is the celerity of the light ?",
            "What is the velocity of the sound ?"

    };

    private String mChoices [][] = {

            {"6 371 km","12 742 km"},
            {"Lens Amstrong","Neil Amstrong"},
            {"Neil Amstrong","Youri Gagarine"},
            {"384 400 km","484 400 km"},
            {"Young Modulus","Poisson Ratio"},
            {"The Everest","The Kilimanjaro"},
            {" 299 792 458 m/s"," 299 792 458 km/h"},
            {"340,29 km / h","340,29 m / s"}

    };

    private String mAnswers [] = {

            "6 371 km",
            "Neil Amstrong",
            "Youri Gagarine",
            "384 400 km",
            "Young Modulus",
            "The Everest",
            " 299 792 458 m/s",
            "340,29 m / s"

    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getAnswer(int a){
        String answer = mAnswers[a];
        return answer;
    }
}
