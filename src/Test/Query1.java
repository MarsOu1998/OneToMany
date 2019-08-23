package Test;

import PO.Banji;
import PO.Student;
import org.hibernate.Session;

import java.util.Iterator;
import java.util.Set;

public class Query1 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        //查询一班的所有学生
        Banji banji =(Banji)session.get(Banji.class,1);
        System.out.println(banji.getBanjiming());

        Set set=banji.getStudents();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
           Student student=(Student)iterator.next();
           System.out.println(student.getXingming());
        }
        util.HibernateSessionFactory.closeSession();
    }
}
