import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Humans player = new Humans();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Humans vs Goblins!!");
        System.out.println("Wanna Play? yes or no");
        String gameTime = input.nextLine();

        String x = "x";
            String[][] grid = new String[][]{
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
                    {x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            };

            for(int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[row].length; col++) {
                    System.out.print(grid[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------");



        }
}
