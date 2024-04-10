public class Box<T> {

    public static int numBoxes = 1;
    private int id;
    private T boxData;

    public Box(T item) {
        this.boxData = item;
        this.id = numBoxes;
        numBoxes++;
    }

    public void print() {
        System.out.println("Box " + this.id + ": " + this.boxData);
    }

    public T unBox() {
        T retData = this.boxData;
        this.boxData = null;
        return retData;
    }

    public boolean isEmpty() {
        return this.boxData == null;
    }

    public int getId() {
        return this.id;
    }

}