package week8.aktionsobjekte;

import javax.swing.*;

public class List {
    private Node head;

    List(Node head){
        this.head = head;
    }

    public void traverseAndApply(ActionObject actobj) {
        for (Node index = head; index != null; index = index.next) {
            actobj.action(index);
        }
    }
}
