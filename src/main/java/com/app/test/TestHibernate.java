package com.app.test;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHibernate {
    public static void main(String[] args) {
        Transaction tx = null;
        try (Session ss = HibernateUtil.getSf().openSession()){
            tx = ss.beginTransaction();
            Address a1 = new Address();
            a1.setAid(101);
            a1.setLoc("MUM");
            a1.setPin(400101);

            Address a2 = new Address();
            a2.setAid(102);
            a2.setLoc("KAR");
            a2.setPin(500102);

            Address a3 = new Address();
            a3.setAid(103);
            a3.setLoc("TAL");
            a3.setPin(600102);

            Employee e = new Employee();
            e.setEid(10);
            e.setEname("AA");
            e.setEsal(12.33);
            e.getAddr().add(a1);
            e.getAddr().add(a3);

            ss.save(e);

            tx.commit();
        }catch (Exception e)
        {
            tx.rollback();
            System.out.println(e.getMessage());
        }
    }
}
