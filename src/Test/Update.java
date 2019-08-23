package Test;

import PO.Banji;
import PO.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;

public class Update {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();

        Transaction transaction=session.beginTransaction();


        Student student1=new Student();
        student1.setXuehao(10);
        student1.setXingming("小李子123");
        student1.setBanjihao(4);

        Student student2=new Student();
        student2.setXuehao(11);
        student2.setXingming("小李子子");
        student2.setBanjihao(4);

        HashSet hashSet=new HashSet();
        hashSet.add(student1);
        hashSet.add(student2);


        Banji banji=new Banji();
        banji.setBanjihao(4);
        banji.setBanjiming("一年四班");
        banji.setStudents(hashSet);

        session.save(banji);
        transaction.commit();


        util.HibernateSessionFactory.closeSession();
    }
}
