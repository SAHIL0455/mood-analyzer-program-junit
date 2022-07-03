package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
     @Test
    public void givenMessageSadThanMoodAnalyzerSad(){
         String actualMood1 = moodAnalyzer.analyseMood("I am in Sad Mood");
         Assert.assertEquals("sad",actualMood1);
     }
     @Test
     public void  givenMessageAnyMoodThenMoodAnalyzerHappy(){
         String actualMood2 = moodAnalyzer.analyseMood("I am in Any Mood");
         Assert.assertEquals("Happy",actualMood2);
     }
}
