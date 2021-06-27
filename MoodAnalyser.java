package com.moodAnalyser;

public class MoodAnalyser {

    public String analyseMood(String message) {
        //Checking for SAD
        if(message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
