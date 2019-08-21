package com.SSH.dao;


import com.SSH.pojo.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//@Component
public class RoleDao {

    public List<Role> getAll(){
        List<Role> list=null;
        Configuration configuration= new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        transaction.begin();
        list = session.createSQLQuery("select * from user").list();
//        transaction.commit();
        session.close();
        return list;
    }

    public boolean addRole(Role role){
//        user.setId(UUID.randomUUID().toString());
        Configuration configuration= new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        transaction.begin();
        session.save(role);
        session.flush();
//        transaction.commit();
        session.close();
        return true;
    }

    public boolean updataRole(Role user){

        return true;
    }

    public boolean deleteRole(String roleId){

        return true;
    }

}
