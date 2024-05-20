package easy;

import java.util.*;

public class TournamentWinner {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        competitions.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
        competitions.add(new ArrayList<>(Arrays.asList("C#", "Python")));
        competitions.add(new ArrayList<>(Arrays.asList("Python", "HTML")));
        results.add(0);
        results.add(0);
        results.add(1);
        System.out.println(new TournamentWinner().tournamentWinner(competitions, results));
    }

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.

        HashMap<String, Integer> scoreMap = new HashMap<>();
        String leadingTeam = "";
        scoreMap.put(leadingTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> contest = competitions.get(i);
            String homeTeam = contest.get(0);
            String awayTeam = contest.get(1);
            int result = results.get(i);
            String winningTeam = result == 1 ? homeTeam : awayTeam;
            if (!scoreMap.containsKey(winningTeam)) {
                scoreMap.put(winningTeam, 0);
            }

            scoreMap.put(winningTeam, scoreMap.get(winningTeam) + 3);

            if (scoreMap.get(winningTeam) > scoreMap.get(leadingTeam)) {
                leadingTeam = winningTeam;
            }

        }

        return leadingTeam;
    }
}
