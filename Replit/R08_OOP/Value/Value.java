package R08_OOP.Value;

public class Value {
    private int val;
    private boolean modified;

    public Value() {}

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        if (val != this.val) {
            this.val = val;
            modified = true;
        }
    }

    public boolean wasModified() {
        return modified;
    }
}