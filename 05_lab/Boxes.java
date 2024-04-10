public class Boxes {

    private Box<?>[] boxes;

    public Boxes(Box<?>[] boxes) {
        this.boxes = boxes;
    }

    public int emptyBoxes() {
        int count = 0;
        for (Box<?> b : boxes) {
            if (b.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public void lookInside() {
        for (Box<?> b : boxes) {
            System.out.println("Unboxing box " + b.getId() + ": " + b.unBox());
        }
    }
}