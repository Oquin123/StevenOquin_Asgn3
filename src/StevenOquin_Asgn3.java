/**
 * Name: Steven Oquin
 * Date: 02/06/2023
 * CMIS 141/6380
 * This program calculates a gamer's total XP score with a bonus per level.
 */

import java.util.Scanner;
public class StevenOquin_Asgn3 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Variables for storing gamer information
        String gamerName;

        int level1Xp;
        int level2Xp;
        int level3Xp;
        int engagementScore;

        double finalScore;

        // Constants for XP score bonuses
        final double BONUS_LEVEL_1 = 0.20;
        final double BONUS_LEVEL_2 = 0.30;
        final double BONUS_LEVEL_3 = 0.50;
        final double BONUS_ENGAGEMENT_SCORE = 0.60;

        // Welcome message
        System.out.println("Welcome to the Total XP calculation program!");
        System.out.println();

        // Prompt for user input
        System.out.print("Do you want to enter gamer's data? (Yes/No) => ");
        String userAnswer = scanner.nextLine();
        System.out.println();

        // Check if user wants to enter gamer data
        if (!userAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Thank you for using the Total XP calculation program!");
            return;
        }

        // Loop until user decides to exit
        while (true) {
            // Read gamer name
            System.out.print("Enter gamer's name => ");
            gamerName = scanner.nextLine();

            // Read XP scores
            System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
            level1Xp = scanner.nextInt();
            level2Xp = scanner.nextInt();
            level3Xp = scanner.nextInt();
            engagementScore = scanner.nextInt();

            // Calculate final XP score
            finalScore = level1Xp + level1Xp * BONUS_LEVEL_1 + level2Xp + level2Xp * BONUS_LEVEL_2
                    + level3Xp + level3Xp * BONUS_LEVEL_3 + engagementScore + engagementScore * BONUS_ENGAGEMENT_SCORE;

            // Print gamer information and final XP score
            System.out.println("Gamer Name: " + gamerName + " L1=" + level1Xp + " L2=" + level2Xp
                    + " L3=" + level3Xp + " ES=" + engagementScore);
            System.out.println("Final XP score with bonuses=" + finalScore);
            System.out.println();

            // Prompt user for another gamer
            System.out.print("Do you want to enter another gamer's data? (Yes/No) => ");
            scanner.nextLine();
            userAnswer = scanner.nextLine();
            System.out.println();

            // Check if user wants to enter data for another gamer
            if (!userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Total XP calculation program!");
                return;
            }
        }

    }
}