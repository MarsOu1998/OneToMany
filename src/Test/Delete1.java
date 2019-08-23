package Test;

import PO.Banji;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete1 {
    public static void main(String[] args) {
        Session session =util.HibernateSessionFactory.getSession();
        Banji banji=(Banji)session.get(Banji.class,1);
        Transaction transaction=session.beginTransaction();
        session.delete(banji);
        transaction.commit();

        util.HibernateSessionFactory.closeSession();
    }
}
