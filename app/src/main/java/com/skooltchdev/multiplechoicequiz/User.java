package com.skooltchdev.multiplechoicequiz;

/**
 * Created by Admin on 6/1/2017.
 */

public class User {
    private String Username;
    private String Score;
    private String ID;

    public User(int Num, String Uname, int PlayerScore) {
        ID = Integer.toString(Num);
        Username = Uname;
        Score = Integer.toString(PlayerScore);
    }

    public String getUsername() {
        return Username;
    }

    public String getID() {
        return ID;
    }

    public String getScore() {
        return Score;
    }
}
