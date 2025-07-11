package App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import RegionCountry.Countr;
import RegionCountry.Regions;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        // Create region
        Regions re = new Regions();
        re.setRegion_id(102);
        re.setRegionname("Andhra Pradesh");

        // Create country 
        Countr c = new Countr();
        c.setCountry_id(201);
        c.setCountryName("India");
        c.setRegion(re);

        System.out.println(re);
        System.out.println(c);

        Session s = sessionFactory.getCurrentSession();
        Transaction t = s.beginTransaction();

        
        s.save(re);
        s.save(c);

        t.commit();
        s.close();

        System.out.println("Saved successfully: " + c);
    }
}
