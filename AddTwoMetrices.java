/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.two.metrices;

/**
 *
 * @author HP
 */
public class AddTwoMetrices {

    public static void main(String[] args) {

        int metrice01[][] = {{1, 5, 6}, {2, 3, 4}, {6, 7, 8}};
        int metrice02[][] = {{1, 5, 6}, {2, 3, 4}, {6, 7, 8}};

        int result[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = metrice01[i][j] + metrice02[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
