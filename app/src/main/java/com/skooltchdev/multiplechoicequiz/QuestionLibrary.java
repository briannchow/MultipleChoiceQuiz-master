package com.skooltchdev.multiplechoicequiz;


public class QuestionLibrary {

    private String mQuestions [] = {
            "What is the IMDb score of Babes in Toyland",
            "What is the IMDb score of Theodore Rex",
            "What is the IMDb score of Grizzly",
            "What is the IMDb score of Titanic II",
            "What is the IMDb score of Samurai Cop",
            "What is the IMDb score of Troll 2",
            "What is the IMDb score of Manos: The Hands of Fate",
            "What is the IMDb score of Zombeavers",
            "What is the IMDb score of Santa with Muscles",
            "What is the IMDb score of Ex Machina"

    };


    private String mChoices [][] = {
            {"5.2", "6.3", "7.2", "1.5"},
            {"2.4", "5.6", "1.7", "8.6"},
            {"5.3", "2.8", "3.3", "5.8"},
            {"6.6", "7.8", "3.5", "1.6"},
            {"2.3", "8.5", "4.9", "6.1"},
            {"8.7", "9.2", "2.7", "5.2"},
            {"1.9", "1.8", "1.7", "1.6"},
            {"6.4", "4.8", "10.0", "3.3"},
            {"4.5", "6.2", "2.4", "3.3"},
            {"3.4", "5.9", "2.2", "7.7"},
    };



    private String mCorrectAnswers[] = {"6.3", "2.4", "5.3", "1.6", "4.9", "2.7", "1.9", "4.8", "2.4", "7.7"};




    public int getNumOfQuestions() {
        int TotalNumQuestions = mQuestions.length;
        return TotalNumQuestions;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
