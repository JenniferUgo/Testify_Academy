package Package1;

public class ClassA {
    private int value;

    // Constructor 1: Default constructor
    public ClassA() {
        this.value = 0;
    }
    public ClassA(int value) {
        this.value = value;
    }

    public ClassA(int value1, int value2) {
        this.value = value1 + value2;
    }

    public int getValue() {
        return value;
    }
}

