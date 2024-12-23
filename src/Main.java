
public class Main {
    public static void main(String[] args) {


    }
}


//        human.setName("chandra");
//        human.setAge(25);
//        System.out.println(human.getName()+human.getAge());
//        System.out.println(human.getName()+human.getAge());

//        int num = 5;
//        int r1 = num++;
//        System.out.println(r1);
//        byte b = 125;
//        int a = 257;
//        b = (byte)a;
//        System.out.println(b);
//        byte b = 127;
//        int a = 12;
//        byte k = (byte) a;
//
//        float f = 5.6f;
//        int t = (int) f;
//        //System.out.println(t);
//
//        //int into double
//        int a1 = 12;
//        double r1 =  (double) a1;
//        //System.out.println(r1);
//        //char to int
//        char c1 = 'a';
//        int r2 = (int) c1;
//        //System.out.println(r2);
//        //short to long
//        short s1 = 1000;
//        long l1 = (long) s1;
//        System.out.println(s1);

//if-else
//int a = 1;
//        if (a <=5) {
//        System.out.println("a is with in range 1-5");
//        }
//                else{
//                System.out.println("a is out of range 1-5");

//for-loop
// for (int i =1;i<=5;i++){
//        System.out.println("DAY "+ i);
//            for (int j=9;j<=18;j++){
//        System.out.println(j);
//            }
//       }

//        int n1 = 9;
//        byte by = 127;
//        short sh = 558;
//        long l = 7579654L;
//        float f = 5.8f;
//        double d = 5.8;
//        char c = 'b';
//        boolean b = true;

//class and methods
//class Calc{
//    public int add(int n1,int n2){
//        return n1+n2;
//}
//}
//inside main method
// int num1 = 123;
//        int num2 = 123;
//        Calc obj = new Calc();
//        int result = obj.add(num1,num2);
//        System.out.println("The sum of the given numbers is :"+ result );

//class and obj
//class Computer{
//    public void playMusic(){
//        System.out.println("Music Playing...");
//    }
//
//    public String getmeAPen(int cost){
//        if (cost >= 10)
//            return "pen";
//
//        return "Nothing";
//    }
//}
//Computer obj = new Computer();
//        String str = obj.getmeAPen(12);
//        obj.playMusic();
//        System.out.println(str);

//
//Student s1 = new Student();
//        s1.name ="ChandraKiran";
//        s1.rollno= 1;
//        s1.marks = 99;
//
//        Student s2 = new Student();
//        s2.name = "Abc";
//        s2.marks = 96;
//        s2.rollno = 2;
//
//        Student s3 = new Student();
//        s3.rollno = 3;
//        s3.marks = 100;
//        s3.name = "Def";
//
//        Student students[] = new Student[3];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//        for (Student student : students) {
//            System.out.println(student.name + ":" + student.marks + ":" + student.rollno);
//        }
//diff b/w string buffer aqnd builder is buffer
// is thread safe builder is not
//StringBuffer sb = new StringBuffer("chandra");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        System.out.println(sb.append(" Kiran"));
//
//String str = sb.toString();
//        sb.ensureCapacity(2);
//String subbstring = sb.substring(8,13);
//        System.out.println(subbstring);
//        System.out.println(str);

//class Mobile{
//    String brand;
//    int price;
//    static String name;
//
//    static
//    {
//        name = "phone";
//    }
//
//    public Mobile(String brand,int price){
//        this.brand = brand;
//        this.price = price;
//    }
//
//    public void multiply(){
//        System.out.println(brand + " "+price + " :"+ name );
//    }
//}
//Mobile mobile = new Mobile("Iphone",200);
////mobile.brand = "Apple";
////mobile.price = 1500;
//        mobile.multiply();

    //class Mobile{
//    String brand;
//    int price;
//    static String name;
//
//    public void multiply(){
//        System.out.println(brand + " "+price + " :"+ name );
//    }
//
//    public static void show1(Mobile obj){
//        System.out.println(obj.brand+ obj.price+ name);
//    }
//}

//    Mobile obj1 = new Mobile();
//    obj1.price =1200;
//    obj1.brand ="Iphone";
//
//    Mobile obj2 = new Mobile();
//    obj2.brand ="samsung";
//    obj2.price =1500;
//
//    obj1.multiply();
//    Mobile.show1(obj2);
//class Human{
//
//    public Human(){
//        System.out.println("in constructor");
//    }
//
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
// Human human = new Human();
//
//        human.setName("a");
//        System.out.println(human.getName());
//class A{
//    public A(){
//        super();
//        System.out.println("in A");
//    }
//
//    public A(int n){
//        super();
//        System.out.println("in A int ");
//    }
//
//}
//class B extends A{
//    public B(){
//        super();
//        System.out.println("in B");
//    }
//    public B(int n){
//        this();
//        System.out.println("in B int");
//    }
//}
//B obj = new B(5);
//class A{
//
//    public A(){
//        System.out.println("object created");
//    }
//    public void multiply(){
//        System.out.println("in A multiply");
//    }
//}
//   A obj = new A();
//        obj.multiply();
//class A{
//    public void multiply(){
//        System.out.println("In A multiply");
//    }
//}
//
//class B extends A{
//    public void multiply(){
//        System.out.println("in B multiply");
//    }
//}
// A obj = new B();
//        obj.multiply();
//
//        obj = new B();
//        obj.multiply();
//class Calc{
//    public int add(int n1,int n2){
//        return n1+n2;
//    }
//    public void mul(){
//
//    }
//    public int sub(int n1, int n2){
//        return n1-n2;
//    }
//    public int div(int n1, int n2){
//        return  n1/n2;
//    }
//}
//class AdvCalc extends Calc{
//    public int modulo(int n1, int n2){
//        return n1%n2;
//    }
//}
//AdvCalc obj = new AdvCalc();
//class A{
//    public void multiply(){
//        System.out.println("In A multiply");
//    }
//    class B{
//        public void config(){
//            System.out.println("In config");
//        }
//    }
//}
// A obj = new A();
//        A.B obj1 = obj.new B();
//abstract class A{
//    public abstract void multiply();
//}
//A obj = new A() {
//
//            public void multiply() {
//                System.out.println("in new multiply");
//            }
//        };
//        obj.multiply();
//enum Laptop{
//    Macbook(2000),xps,Surface(1500),ThinkPad(1000);
//
//    private int price;
//
//    private Laptop() {
//    }
//
//    private Laptop(int price) {
//        this.price = price;
//        System.out.println("in laptop" + ": " +this.name());
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}
//        Laptop laptop = Laptop.Macbook;
//        System.out.println(laptop +" :"+laptop.getPrice());
//        for (Laptop laptop: Laptop.values()){
//            System.out.println(laptop+ " : "+  laptop.getPrice() );
//@FunctionalInterface
//interface A{
//    void multiply(int i, int j);
//}
//
//interface X {
//    int add(int i,int j);
//}
//class B implements A{
//
//
//    public void multiply() {
//        System.out.println("in B multiply");
//    }
//}
// X obj1= (i,j) -> i+j;
//        obj1.add(5,4);
//
//        A obj = (int i,int j) -> {
//            int result = i * j;
//            System.out.println(result);
//        };
//        obj.multiply(5, 4);