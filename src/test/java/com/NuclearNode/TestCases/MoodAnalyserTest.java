package com.NuclearNode.TestCases;

import com.NuclearNode.CoffeeGrinder.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Sad message.");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void HappyMoods() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Happy message!");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
