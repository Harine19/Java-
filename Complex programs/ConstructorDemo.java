class Addition {
int a=4,b=3;

Addition() {
    System.out.println("Constructor function is invoked");
}

Addition(int a, int b) {
    System.out.println("Parameterized constructor function is invoked");
    this.a=a;
    this.b=b;
}

void Calculate() {
    System.out.println(a+b);
}
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Addition ao = new Addition();
        Addition bo = new Addition(3,4);
        ao.Calculate();
        bo.Calculate();
    }
}