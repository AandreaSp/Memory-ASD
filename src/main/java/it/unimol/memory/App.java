package it.unimol.memory;

import it.unimol.memory.Game;

public class App {
  public static void main(String[] args) {
    var g = new Game(java.util.List.of("A","A","B","B"));
    System.out.println("Game ready. Finished? " + g.finished());
  }
}
