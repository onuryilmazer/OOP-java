package week3.dynamischereihung;

public class DIAlist extends DynIntArray {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private int elementCount;
    private Node headNode;

    @Override
    int getElementCount() {
        return elementCount;
    }

    public DIAlist() {
        elementCount = 0;
    }

    @Override
    void add(int value) {
        if (headNode == null) {
            headNode = new Node(value);
            elementCount++;
            return;
        }

        Node currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node(value);
        elementCount++;
    }

    @Override
    int getElementAt(int index) {
        if (index >= elementCount) {
            return 0;
        }

        Node currentNode = headNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    @Override
    void setElementAt(int index, int value) {
        if (index >= elementCount) {
            return;
        }

        Node currentNode = headNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.data = value;
    }

    @Override
    void print() {
        System.out.print("[");

        Node currentNode = headNode;
        for (int i = 0; i<elementCount;i++) {
            System.out.print(currentNode.data);

            currentNode = currentNode.next;

            if (i != elementCount-1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
