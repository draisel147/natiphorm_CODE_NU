package OOP;

public class A7 {
    public static void main(String[] args) {
        int[][] coordinates = getCoordinates();
        char[][] grid = createGrid(coordinates);
        drawGrid(grid);
    }

    public static int[][] getCoordinates() {
        System.out.println("Enter the coordinates, separated by commas: ");
        int[] xCoordinates = Input.intArray();
        int[] yCoordinates = Input.intArray();
        int[][] coordinates = new int[xCoordinates.length][2];
        for (int i = 0; i < xCoordinates.length; i++) {
            coordinates[i][0] = xCoordinates[i];
            coordinates[i][1] = yCoordinates[i];
        }
        return coordinates;
    }

    public static char[][] createGrid(int[][] coordinates) {
        int xMax = 0;
        int yMax = 0;
        for (int[] coordinate : coordinates) {
            int x = coordinate[0];
            int y = coordinate[1];
            if (x > xMax) {
                xMax = x;
            }
            if (y > yMax) {
                yMax = y;
            }
        }
        char[][] grid = new char[xMax][yMax];
        for (int i = 0; i < xMax; i++) {
            for (int j = 0; j < yMax; j++) {
                grid[i][j] = '.';
            }
        }
        return grid;
    }

    public static void drawGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
