// there are 2 buildings.
// 1st building has 3 floors, each floor has 4 cabins
// 2nd building has 4 floors, each floor has 3 cabins

package L07_Arrays;

public class L11_JaggedArray3 {

    public static void main(String[] args) {

        // jagged 3D array
        int[][][] building = new int[2][][];

        // 1st building → 3 floors
        building[0] = new int[3][];
        for (int i = 0; i < 3; i++) {
            building[0][i] = new int[4]; // 4 cabins each floor
        }

        // 2nd building → 4 floors
        building[1] = new int[4][];
        for (int i = 0; i < 4; i++) {
            building[1][i] = new int[3]; // 3 cabins each floor
        }

        // display structure
        for (int i = 0; i < building.length; i++) {
            System.out.println("Building " + (i + 1));

            for (int j = 0; j < building[i].length; j++) {
                System.out.println("  Floor " + (j + 1) +
                        " has " + building[i][j].length + " cabins");
            }
        }
    }
}