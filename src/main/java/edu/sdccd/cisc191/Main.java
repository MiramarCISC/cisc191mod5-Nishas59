package edu.sdccd.cisc191;

public class Main {
    public static void main(String[] args) {

        int[] matchIds = {101, 203, 305, 407, 509};
        System.out.println("=== Binary Search ===");
        System.out.println("Recursive — find 305: index " + GameAlgorithms.findMatchRecursive(matchIds, 305));
        System.out.println("Iterative — find 407: index " + GameAlgorithms.findMatchIterative(matchIds, 407));
        System.out.println("Recursive — find 999: index " + GameAlgorithms.findMatchRecursive(matchIds, 999));

        char[][] map = {
                {'.', '.', '#', '.'},
                {'.', '#', '#', '.'},
                {'.', '.', '.', '#'},
                {'#', '#', '.', '.'}
        };
        System.out.println("\n=== Connected Tiles (Recursive) ===");
        System.out.println("Count from (0,0): " + GameAlgorithms.countConnectedTilesRecursive(map, 0, 0));

        char[][] map2 = {
                {'.', '.', '#', '.'},
                {'.', '#', '#', '.'},
                {'.', '.', '.', '#'},
                {'#', '#', '.', '.'}
        };
        System.out.println("\n=== Connected Tiles (Iterative) ===");
        System.out.println("Count from (0,0): " + GameAlgorithms.countConnectedTilesIterative(map2, 0, 0));

        // Bracket tree demo
        BracketNode bracket = new BracketNode("Finals",
                new BracketNode("Semi1",
                        new BracketNode("Match1"),
                        new BracketNode("Match2")),
                new BracketNode("Semi2",
                        new BracketNode("Match3"),
                        new BracketNode("Match4")));

        System.out.println("\n=== Bracket Search ===");
        System.out.println("Contains 'Match3' (expect true):  " + GameAlgorithms.containsMatch(bracket, "Match3"));
        System.out.println("Contains 'Match9' (expect false): " + GameAlgorithms.containsMatch(bracket, "Match9"));
    }
}