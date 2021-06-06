package com.company;

import java.util.List;

public class Game {

    private String gameName;
    private GameState gameState;
    private List<Player> listOfPlayers;
    private WriteTo display;

    public Game(String gameName, GameState gameState, List<Player> listOfPlayers, WriteTo display) {
        this.gameName = gameName;
        this.gameState = gameState;
        this.listOfPlayers = listOfPlayers;
        this.display = display;
    }

    public void printGameName(){
        display.print(gameName);

        gameState.printPlayersCount(5);
        gameState.printSumOfPoints(100);

        for (Player player : listOfPlayers) {
            player.printName();
        }
    }


}
