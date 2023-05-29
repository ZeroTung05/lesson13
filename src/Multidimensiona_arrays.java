public class Multidimensiona_arrays {
    public static void main(String[] args) {
        int[]  number= {1,2,3};
        int[][] matrice= {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(matrice[2][2]);// 2 строка(первое число)  2 столпцы(второе чило)
        System.out.println(matrice[1][0]);


        int[] nuber1 = new int[5];

        String [][] strings = new String[2][3];
        strings[0][1]= "привет";
        System.out.println(strings[0][1]);

        int[][] matrice1= {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        for (int i = 0; i < matrice1.length; i++) { // хотит по строкам matrice1.lenght = 3
            for (int j = 0; j < matrice1[i].length; j++) { // ходит по элементам в строке
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
    }
}