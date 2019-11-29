package demo;

class Car {
    private String name;
    private double jiazhi;
    private Person person;

    public Car(String name, double jiazhi) {
        this.name = name;
        this.jiazhi = jiazhi;
    }

    public double getJiazhi() {

        return jiazhi;
    }

    public void setJiazhi(double jiazhi) {
        this.jiazhi = jiazhi;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getInfo() {
        return "车牌为" + this.name + "价值为" + this.jiazhi;

    }
}

class Person {
    private String name;
    private int age;
    private Car car;
    /*private Person clidren[];*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getInfo() {
        return "姓名" + this.name + "年龄" + this.age + "他的车是" + this.car;

    }

}

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("WANGKAI", 22);
        Car car = new Car("奔驰", 250000.0);
        person.setCar(car);
        car.setPerson(person);
        System.out.println(person.getCar().getInfo());

    }
}
