package OgrNotSis;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avg;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course course1,Course course2,Course course3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.avg=avg;
        this.isPass=isPass;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>0 && note1<=100){
            this.course1.note=note1;
        }
        if (note2<=100&&note2>0) {
            this.course2.note = note2;
        }
        if(note3>0&&note3<=100){
            this.course3.note=note3;
        }

    }

    void isPass(){
        this.avg=(this.course1.note+this.course2.note+this.course3.note)/3.0;
        if(this.avg>55){
            System.out.println("Sinifi gectiniz");
            this.isPass=true;
        }else{
            System.out.println("Failed");
            this.isPass=false;
        }
        printNote();

    }

    void printNote(){
        System.out.println("=============================================");
        System.out.println(this.course1.name+" Notu : "+ this.course1.note);
        System.out.println(this.course2.name+" Notu : "+this.course2.note);
        System.out.println(this.course3.name+" Notu : "+this.course3.note);
        System.out.println("==============================================");
    }

}
