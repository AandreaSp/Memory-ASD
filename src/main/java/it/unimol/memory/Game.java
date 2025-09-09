package it.unimol.memory;
import java.util.*;

public class Game {
    private final List<String> board;
    private final Set<Integer> matched = new HashSet<>();

    public Game(List<String> pairs) {
        board = new ArrayList<>(pairs);
        Collections.shuffle(board);
    }

    public boolean flip(int i, int j) {
        if (i==j) return false;
        if (i<0||j<0||i>=board.size()||j>=board.size()) return false;
        if (matched.contains(i)||matched.contains(j)) return false;
        boolean ok = Objects.equals(board.get(i), board.get(j));
        if (ok) { matched.add(i); matched.add(j); }
        return ok;
    }

    public boolean finished() { return matched.size() == board.size(); }
}
