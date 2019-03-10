public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("hello world");

    A a1 = new A();
    A a2 = new A();

    a1.bar(a2);
  }
}

class A {
  private String foo = "a";

  public void bar(A other) {
    System.out.println(this.foo);
    System.out.println(other.foo);
  }
}

class B {
  private String foo = "b";


  public void bar(A other) {
    System.out.println(this.foo);
    System.out.println(other.foo);
  }
}
