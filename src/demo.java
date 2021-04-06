import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class demo {
    static String[][] arr(Scanner scanner){
        int i;
        int j;
        System.out.println("Mời nhập độ dài mảng arr[][]!!");
        i = scanner.nextInt();
        String arr[][]=new String[i][];
        for (int n=0; n<i;n++){
            System.out.println("Mời nhập độ dài mảng con tại"+n);
            j = scanner.nextInt();
            arr[n]= new String[j];
        }
        for (int n=0; n<arr.length;n++){
            for (int m=0;m<arr[n].length;m++){
                System.out.println("Mời nhập phần tử lại arr["+n+"]["+m+"]:");
                arr[n][m] = new Scanner(System.in).nextLine();
            }
        }
        return arr;
    }
    static void showArray(String[][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    static String[][]swapArray(String[][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j=0;j<array[i].length;j++){
                if(array[i][j].equalsIgnoreCase(".")){
                    int count=0;
                    if(j<(array[i].length-1)) {
                        if (array[i][j + 1].equalsIgnoreCase("*")) {
                            count++;
                        }
                    }
                    if(j>0) {
                        if (array[i][j - 1].equalsIgnoreCase("*")) {
                            count++;
                        }
                    }
                    if(i>0) {
                        if (array[i - 1][j].equalsIgnoreCase("*")) {
                            count++;
                        }
                    }
                    if(i< (array.length-1)) {
                        if (array[i + 1][j].equalsIgnoreCase("*")) {
                            count++;
                        }
                    }
                    if(i>0&&j>0){
                        if (array[i-1][j-1].equalsIgnoreCase("*")){
                            count++;
                        }
                    }
                    if(i<array.length-1&&j>0){
                        if (array[i+1][j-1].equalsIgnoreCase("*")){
                            count++;
                        }
                    }
                    if(i< array.length-1&&j<array[i].length-1){
                        if (array[i+1][j+1].equalsIgnoreCase("*")){
                            count++;
                        }
                    }
                    if(i>0&&j<array[i].length-1){
                        if (array[i-1][j+1].equalsIgnoreCase("*")){
                            count++;
                        }
                    }

                    array[i][j]=String.valueOf(count);
                }
            }
        }
        return array;
    }
    static void showNewArray(String[][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array[][]=arr(scanner);
        showArray(array);
        System.out.println("--------------------------------");
        swapArray(array);
        showNewArray(array);
    }
}
