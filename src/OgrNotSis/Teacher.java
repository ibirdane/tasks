package OgrNotSis;

public class Teacher {

    String name;
    String phone;
    String branch;

    Teacher(String name,String phone,String branch){
        this.name=name;
        this.phone=phone;
        this.branch=branch;
    }
    public void print() {
        System.out.println("Adi : "+this.name);
        System.out.println("Telefonu : "+this.phone);
        System.out.println("Bransi : "+this.branch);

    }
}
