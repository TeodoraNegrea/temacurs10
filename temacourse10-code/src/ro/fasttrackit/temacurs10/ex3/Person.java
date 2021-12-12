package ro.fasttrackit.temacurs10.ex3;


public class Person {
    String name;
    int age;
    String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public static void main(String[] args) {
        Person company = new Person("Mihai", 35,"manager");
        System.out.println(company);
        System.out.println(company.toString());
        System.out.println(company.getClass());
        System.out.println(company.hashCode());
       // System.out.println(company.position("welders"));
        //System.out.println(company.position("carpenters"));
        //System.out.println(company.position("plummers"));

    }
        public String position (){
        return position;
    }
}

