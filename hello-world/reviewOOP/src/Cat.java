import reviewOOP.out.production.reviewOOP.*;

public class Cat {
    private static int sid = 0;
    private String name;
    int id;

    Cat(String name) {
        this.name = name;
        id = sid++;
    }
    public void info(){
        System.out.println
                ("My name is "+name+" No."+id);
    }
    public static void main(String arg[]){

        Cat.sid = 100;
        Person p1 = new Person();
        p1.printInfo();
        Cat mimi = new Cat("mimi");
        mimi.sid = 2000;
        Cat pipi = new Cat("pipi");
        mimi.info();
        pipi.info();
        System.out.println(sid);
    }
}