package Chapter6_Object;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("김민선","경기도 광주", 1804,4871);

        String str = s.info();
        System.out.println(str);
    }
}

class Student{
    String name;
    String addr;
    int home;
    int phone;

    Student (String name, String addr, int home, int phone) {
        this.name = name;
        this.addr = addr;
        this.home = home;
        this.phone = phone;

    }

    public String info(){
        return  name +","+addr +","+home +","+phone;

    }
}
