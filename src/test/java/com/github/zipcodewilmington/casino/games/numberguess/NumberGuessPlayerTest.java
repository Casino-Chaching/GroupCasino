package com.github.zipcodewilmington.casino.games.numberguess;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class NumberGuessPlayerTest {
//
//    @Test
//    void incrementScoreTest() {
//        //Given
//        NumberGuessPlayer player = new NumberGuessPlayer();
//        player.incrementScore();
//        player.incrementScore();
//        player.incrementScore();
//        player.incrementScore();
//        player.incrementScore();
//
//        //When
//        int expected = player.getScore();
//        int actual = 5;
//
//        //Then
//        Assert.assertEquals(expected, actual);
//
//    }
//
//    @Test
//    void getScoreTest() {
//        //Given
//        NumberGuessPlayer player = new NumberGuessPlayer();
//
//        //When
//        int expected = player.getScore();
//        int actual = 0;
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    void calcWinRateTest() {
//        //Given
//        NumberGuessPlayer player = new NumberGuessPlayer();
//        player.setPlayerScore(34);
//
//        //When
//        double expected = player.calcWinRate(100);
//        double actual = 34.00;
//
//        //Then
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    void updateGameTest() {
//        //Given
//        NumberGuessPlayer player = new NumberGuessPlayer();
//        player.incrementScore();
//        //When
////        boolean expected = player.updateGame();
//        //Then
//    }
//
//    @Test
//    void displayPlayerInfoTest() {
//        //Given
//        //When
//        //Then
//    }
//}