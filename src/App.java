

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList myLinkedList = new LinkedList(20);
        myLinkedList.append(21);
        myLinkedList.append(22);
        myLinkedList.append(23);
        myLinkedList.append(24);
        

        System.out.println("20 -> 21 -> 22 -> 23 -> 24");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);
        
        
        myLinkedList.append(5);
        
        
        System.out.println("-------------------------------");
        System.out.println("20 -> 21 -> 22 -> 23-> 24 -> 25 -> 26");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

    }
}
