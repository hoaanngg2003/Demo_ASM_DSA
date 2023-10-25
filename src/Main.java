// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // LinkedList
        LinkedList<String> numbers  = new LinkedList<>();
        LinkedListADT.addElement(numbers);
        LinkedListADT.addElementWinIndex( numbers, 0,"-1");
        LinkedListADT.getElementByIndex(numbers, 2);

        // Stack
        Stack<Integer>  number = new Stack<>();
        // 1- push in stack
        StackADT.stackPush(number);
        // 2- pop in stack
        StackADT.stackPop(number);
        // 3- peek in stack
        StackADT.stackPeek(number);
        // 4 - search in stack
        StackADT.stackSearch(number, 3);
        // 5 - check in empty
        StackADT.checkEmptyStack(number);




        //Queue implement LinkedList
        Queue<String> telephone = new LinkedList<>();
        QueueLinkedListADT.queueAdd(telephone);
        Queue<Integer> queueOffer = new LinkedList<>();
        QueueLinkedListADT.queueOffer(queueOffer);
        QueueLinkedListADT.queuePeek(queueOffer);
        QueueLinkedListADT.queueRemove(queueOffer);
        QueueLinkedListADT.queueSearch(queueOffer, 11);
        QueueLinkedListADT.forQueue(queueOffer);

        // Cac thuat toan sap xep
        // 1: Bubble Sort
        int[] randomNumber = { 100,3,67,8,45,44,66,66,70};
//        Arrays.sort (randomNumber);
//        String arrStr = Arrays.toString (randomNumber); // chuyển đổi mảng thành chuỗi
//        arrStr = arrStr.substring (1, arrStr.length () - 1); // loại bỏ dấu ngoặc vuông
//        System.out.println (arrStr); // in ra chuỗi
        BubbleSortALU.bubbleSort(randomNumber,randomNumber.length);
        BubbleSortALU.printResult(randomNumber);

        // 2: Insertion Sort
        int[] insertionNumber = { 100,3,67,8,45,44,66,66,70 };
        InsertionSortALU.insertionSorṭ̣̣(insertionNumber);
        InsertionSortALU.printResult(insertionNumber);

        // 3: Selection Sort
        int[]   selectionArray = {64,25,12,22,11};
        SelectionSortALU.selectionSort(selectionArray);
        SelectionSortALU.printArray(selectionArray);

        // 4: Merge Sort
        int[] mergeSort = {64,25,12,22,11};
        MergeSortALU.sort(mergeSort, 0, mergeSort.length -1);
        MergeSortALU.printResult(mergeSort);

    }
}
