package stack;  

public class Main {  
    public static void main(String[] args) { 
        // Create a stack object
        Stack stack = new Stack();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Add elements to the stack
        stack.add("First");
        stack.add("Second");
        stack.add("Third");

        // Check if the stack is still empty after adding items
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        // Print stack values
        System.out.println("Stack values: " + stack.values());

        // Peek at the top element (last element added)
        System.out.println("Peek: " + stack.peek());  // should show "Third"

        // Remove (pop) elements from the stack, following the LIFO principle
        System.out.println("Pop: " + stack.pop()); // Expected output: "Third"
        System.out.println("Pop: " + stack.pop()); // Expected output: "Second"
        System.out.println("Pop: " + stack.pop()); // Expected output: "First"

        // Check if the stack is empty after all pops
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected output: true
    }
}
