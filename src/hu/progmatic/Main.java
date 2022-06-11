package hu.progmatic;

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
/*
        List lines = new ArrayList();
        int match = -1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("matches_all.csv"))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                List values = Arrays.asList(line.split(";"));
                lines.add(values);
                match++;
            }
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Number of matches: " + match);


 */
        List<Matches> matches = null;
        try {
            matches = new ArrayList<>();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("matches_all.csv"))) {
                String line;

                bufferedReader.readLine();

                while ((line = bufferedReader.readLine()) != null) {
                    Matches match = new Matches(line);
                    matches.add(match);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Number of matches : " + matches.size());

        } catch (Exception e) {
            e.printStackTrace();
        }

//2. MAX GOAL DIFF

        System.out.println("Give me the Year of the Worldcup! ");
        Scanner scanner = new Scanner(System.in);
        int worldCupYear = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        assert matches != null;
        for (Matches matchess : matches) {
            int sum = 0;
            if (matchess.getYear().equalsIgnoreCase(String.valueOf(worldCupYear))) {
                sum = Math.abs(matchess.getGoalsA() - matchess.getGoalsB());
                if (sum > max)
                    max = sum;
            }



            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("year;stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");


                for (Matches result : matches) {
                    String line = result.getYear()
                            + ";" + result.getStage()
                            + ";" + result.getDate()
                            + ";" + result.getTeamA()
                            + ";" + result.getTeamB()
                            + ";" + result.getGoalsA()
                            + ";" + result.getGoalsB()
                            + ";" + result.getPenaltiesA()
                            + ";" + result.getPenaltiesB();
                    writer.println(line);
                }
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("2. Maximum goal difference: " + max);
//3. BETS

        int counter = 0;

        for (Matches matchResults : matches){
            if (matchResults.getGoalsA() > matchResults.getGoalsB()){
                if(matchResults.getYear().equalsIgnoreCase(String.valueOf(worldCupYear))){
                    counter++;
                }
            }

        }
        System.out.println("3. The player has won " + counter + " bets.");

//4. TOTAL GOALS BY STAGES (GROUP A..)

        System.out.println("4. Total goals by stage:");

Map<String,Integer> countGoalsStage = new TreeMap<>();



    }


    }


