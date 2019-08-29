package reviewOOP.out.production.reviewOOP;

public class Person {

    public String name;
    public int age = 20;

    public Person(){
        name = "No";
        age = 30;
    }

    public Person (String _name,int _age){
        this.name = _name;
        this.age = _age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String _name){
        name = _name;
    }

    public void setAge(int _age){
        age = _age;
    }

    public void printInfo(){
        System.out.println(name);
    }
    public void printInfo(String _name){
        setName(_name);
        System.out.println(name);
    }


}


class student{

    public static void main(String[] args){
        Person p1 = new Person();
        //p1.setName("Ray");
        System.out.println(p1.age);
        System.out.println(p1.name);
        String s = new String("Hello JAva!");
        System.out.println(s);
        Person p2 = new Person();
        p2.setAge(30);
        System.out.println(p2.age);
        Person p3 = new Person("Jack", 24);
        System.out.println(p3.name + " " + p3.age);
        p3.printInfo();
        p3.printInfo("Tom");

    }

}




