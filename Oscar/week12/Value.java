package week12;

public class Value {
    int val;
    boolean calledMethod;
    boolean calledConstructor;

    public Value(int val) {
        this.val = val;
        calledConstructor = true;
    }

    public Value() {
    }

    public void setVal(int val) {
        this.val = val;
        this.calledMethod = true;
    }

    public int getVal() {
        return this.val;
    }

    public boolean wasModified(Value v) {
        return calledMethod;
    }

}

// bullshit

/*
    Write a class definition of a class named 'Value' with the following:
    a constructor accepting a single integer parameter
    a constructor with no parameters
    a method 'setVal' that accepts a single parameter,
    a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
    a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
    it getVal returns the last value passed to setVal. Otherwise if the "single int parameter"
    constructor was used to create the object, getVal returns the value passed to that constructor.
    Otherwise, getVal returns 0.
 */