public class _3_BASIC {
    public static class Person {
        String name;
        int age;

        public Person(String name , int age ){
            this.name = name;
            this.age = age;
        };

        public void sayHello(){
            System.out.println("I am, "+ name + "age : "+ age);
        }
    }
    public static void main(String[] args) {
        Person p = new Person("Adarsh", 20);
        Person p1 = p;
        Person p2 = new Person("Adarsh", 20);
        p.sayHello();
        p1.sayHello();
        System.out.println(p1 == p);
        System.out.println(p2 == p);
        System.out.println(p2.equals(p));
    }
}
