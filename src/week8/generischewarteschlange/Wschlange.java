package week8.generischewarteschlange;

public class Wschlange {
    private class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node front = null;
    private Node rear = null;

    Wschlange(Object ... a) {
        for (Object element : a) {
            enqueue(element);
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Object data) {
        if (front == null) {
            front = new Node(data, null);
            rear = front;
        }
        else {
            rear.next = new Node(data, null);
            rear = rear.next;
        }
    }

    public Object dequeue() {
        if (front == null) {
            throw new IllegalStateException("List is empty.");
        }
        Object data = front.data;
        front = front.next;

        if (front == null) {  //last element was removed.
            rear = null;
        }

        return data;
    }
}
