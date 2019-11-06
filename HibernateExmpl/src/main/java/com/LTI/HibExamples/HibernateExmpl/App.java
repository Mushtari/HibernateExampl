package com.LTI.HibExamples.HibernateExmpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main(String[] args)
    {
        Configuration c=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(c.getProperties());
        SessionFactory sf=c.buildSessionFactory(builder.build());
        Session session=sf.openSession();
        Employ emp=new Employ();
        emp.setEmpName("MUSHTARI");
        emp.setBranch("JAVA");
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
    }
}
