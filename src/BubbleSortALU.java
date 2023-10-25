public class BubbleSortALU {
    // thuat toan sap xep noi bot
    // Doi tuong thao tac la Array
    public static void bubbleSort(int[] arr, int n){
        // arr: Mang chua cac so nghuyen ngau nhien
        // n: Kich thuoc cua mang
        int i,j,temp;
        boolean swapped; // Dau hieu nhan biet sap xep cac cap so trong mang
        for( i = 0; i < n; i++){
            swapped = false;
            for (j = 0; j < n - i -1; j ++ ){
                if(arr[j] > arr[j+1]){
                    // Swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            // Neu kh co 2 ptu tre len se roi vao vong lap vo han
            // Can kiem tra tranh dieu do xay ra
            if(swapped == false){
                break;
            }
        }

    }
    public static void printResult(int[] array){
        System.out.println("Mang sau khi duoc sap xep theo theo thuat toan Bubble Sort ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
