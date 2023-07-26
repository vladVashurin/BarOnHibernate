package com.vld.utils;


import com.vld.model.Alcohol;
import com.vld.model.AlcoholType;
import com.vld.model.Bar;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private final static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(AlcoholType.class).addAnnotatedClass(Alcohol.class).addAnnotatedClass(Bar.class).buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}