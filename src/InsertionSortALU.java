public class InsertionSortALU {
    public static void insertionSorṭ̣̣(int[] arrNumber){
        // So luong ptu cua trong mang
        int count = arrNumber.length;
        for(int i = 0; i < count; i++){
            int key = arrNumber[i];
            int j = i - 1;
            while (j >= 0 && arrNumber[j] > key ){
                // neu nhu ptu dung truoc cac ptu dang duoc duyet ma lon ho thi cta hoan doi cac vi tri
                arrNumber[j+1] = arrNumber[j];
                j = j -1;
            }
            // Tiep tuc doi vi tri dang duyet thanh vi tri dang sau de tiep tuc ktra
            arrNumber[j+1]= key;

        }
    }
    public static void printResult(int[] arr){
        System.out.println("Mang sau khi duoc sap xep theo thuat toan la : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
