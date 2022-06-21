package CoreJava;
class Parent{
    void show()
    {
        System.out.println("Prent class");
    }
    void show1()
    {
        System.out.println("parent show1");
    }

}
/*class Child extends Parent
{
    @Override
    void show()
    {
        System.out.println("this is a child class");
    }
}*/
public class Employee {
    public static void main(String[] args)
    {

        Parent p1 = new Parent();
        Employee e1 = new Employee();
        p1.show();
        p1.show1();
        e1.animal(p1);


    }
    int sum(int a,int b)
    {
        int c = a + b ;
        System.out.println(c);
        return c;
    }
    void animal(Parent p1)
    {
        System.out.println("hello");
    }

}
