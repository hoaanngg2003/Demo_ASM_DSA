import java.util.LinkedList;
public class LinkedListADT {
    // Add a element in LinkedList
    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println("LinkedList : " + linkedList);
    }
    // Add a element with index
    public static void addElementWinIndex(LinkedList<String> linkedList, int index, String valueElement){
        linkedList.add(index, valueElement );
        System.out.println("Linkedlist : " + linkedList);
    }
    // Gets the element from a specified position in the LinkedList
    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("get element : " + element);
        System.out.println("Linkedlist : " + object);

    }
    // Changes the value of an element at a specified position in the LinkedList
    public static void setElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index,value);
        System.out.println("Linkedlist : " + object);
    }

    // Viet tiep cac phuong thuc : Clear, remove, contrains, indexOf, lastIndexOf
    // Viet phuong thuc duyet qua cac phan tu cua Linkedlist

    public static void scanElementLinkedlist(LinkedList<String> objects){
        for (int i = 0; i < objects.size(); i ++){
            System.out.println(" Element value : " +  objects.get(i));
        }

        for(String j : objects){
            System.out.println("Element value : " + j);

        }
    }
}
