public class Main {




    public static void main(String[] args) {
	// write your code here
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

        }
}
