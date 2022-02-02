package SalaryCalculator;

public class Employee {

    String name;
    double salary;
    int workhours;
    int hireYear;

    Employee(String name,double salary, int workhours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary<1000){
            return 0;
        }else {
            return this.salary*0.03;
        }
    }

    public int bonus(){
        if(this.workhours>40){
            return ((workhours-40)*30);
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        double zam = 0;
        if(2021-this.hireYear<10){
            zam=0.05;
        }else if(2021-this.hireYear>=10&& this.hireYear<20){
            zam=0.1;
        }else if(2021-this.hireYear>=20){
            zam=0.15;
        }
        return this.salary*zam;
    }

    void toStringInfo(){
        System.out.println("Adi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workhours);
        System.out.println("Baslangic Yili: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maas artisi: "+(raiseSalary()));
        System.out.println("Vergi veBonuslar ile birlikte maas: "+(this.salary+bonus()-tax()));
        System.out.println("Toplam Maas: "+(this.salary+bonus()-tax()+raiseSalary()));

    }

}
