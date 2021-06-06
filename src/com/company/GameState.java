package com.company;

public class GameState {

    private WriteTo display;

    public GameState(WriteTo display) {
        this.display = display;
    }

    public void printPlayersCount(int playersCount){
        display.print(Integer.toString(playersCount));
    }

    public void printSumOfPoints(int sumOfPoints){
        display.print(Integer.toString(sumOfPoints));
    }
}
