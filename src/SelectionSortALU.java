public class SelectionSortALU {
    public static void selectionSort(int[] arr){

        int count = arr.length;
        for (int i = 0; i < count ; i++){
            // Thuat toan nay can tim min max
            int min_idx = i;
            for(int j = i + 1; j < count; j++ ){
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                    // Tim duoc vi tri cua ptu nho nhat( Tim duocj ptu nho nhat)
                }
            }
            // Hoan doi vi tri giua cac cap so
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        System.out.println("Mang sau khi duoc sap xep: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
