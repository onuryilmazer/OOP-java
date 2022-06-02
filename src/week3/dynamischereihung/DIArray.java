package week3.dynamischereihung;

public class DIArray extends DynIntArray {
    private int[] array;
    private int elementCount;
    private int actualCapacity;

    @Override
    public int getElementCount() {
        return elementCount;
    }

    @Override
    public int getElementAt(int index) {
        if (index > elementCount-1 || index < 0) {
            return 0;
        }
        return array[index];
    }

    @Override
    public void setElementAt(int index, int value) {
        if (index > elementCount-1 || index < 0) {
            return;
        }
        array[index] = value;
    }

    private void resizeArray() {
        int[] resizedArray = new int[actualCapacity*2];
        for (int i = 0; i < actualCapacity; i++) {
            resizedArray[i] = array[i];
        }

        array = resizedArray;
        actualCapacity*=2;
    }

    public void add(int value) {
        //check if resizing is necessary
        if(elementCount+1 >= actualCapacity) {
            resizeArray();
        }

        array[elementCount] = value;
        elementCount++;
    }

    @Override
    public void print() {
        System.out.print("[");

        for (int i = 0; i<elementCount;i++) {
            System.out.print(array[i]);

            if (i != elementCount-1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public DIArray() {
        elementCount = 0;
        actualCapacity = 2;
        array = new int[actualCapacity];
    }
}
