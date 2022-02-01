package OgrNotSis;

public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","123456","TRH");
        Teacher t2 = new Teacher("Veli","123123","FZK");
        Teacher t3= new Teacher("Kazim","123123123","BIO");
        Course tarih = new  Course("Tarih","001","TRH");
       tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","1234","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","213","BIYO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Ahmet","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(85,75,22);

        s1.isPass();
    }
}
