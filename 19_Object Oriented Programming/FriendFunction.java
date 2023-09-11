class MyClass {
    private int privateVariable;

    MyClass(int value) {
        this.privateVariable = value;
    }

    void doSomething() {
        System.out.println("Private Variable: " + privateVariable);
    }
}

public class FriendFunction {
     public static void main(String[] args) {
        MyClass myObject = new MyClass(42);
        myObject.doSomething();
    }
}


