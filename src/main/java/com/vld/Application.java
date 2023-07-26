package com.vld;


import com.vld.model.Alcohol;
import com.vld.model.AlcoholType;
import com.vld.model.Bar;
import com.vld.repository.AlcoholRepository;
import com.vld.repository.AlcoholTypeRepository;
import com.vld.repository.BarRepository;
import com.vld.servlet.AlcoholServlet;
import com.vld.servlet.AlcoholTypeServlet;
import com.vld.servlet.BarServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;
import java.util.List;

public class Application {

    public static void main(String[] args) throws LifecycleException, ServletException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8082);
        tomcat.setHostname("localhost");
        String appBase = ".";
        tomcat.getHost().setAppBase(appBase);

        File docBase = new File(System.getProperty("java.io.tmpdir"));
        Context context = tomcat.addContext("", docBase.getAbsolutePath());

        Class alcoholServletClass = AlcoholServlet.class;
        Tomcat.addServlet(context, alcoholServletClass.getSimpleName(), alcoholServletClass.getName());
        context.addServletMappingDecoded("/alcohol/*", alcoholServletClass.getSimpleName());

        Class alcoholTypeServletClass = AlcoholTypeServlet.class;
        Tomcat.addServlet(context, alcoholTypeServletClass.getSimpleName(), alcoholTypeServletClass.getName());
        context.addServletMappingDecoded("/alcohol-types/*", alcoholTypeServletClass.getSimpleName());

        Class barServletClass = BarServlet.class;
        Tomcat.addServlet(context, barServletClass.getSimpleName(), barServletClass.getName());
        context.addServletMappingDecoded("/bars/*", barServletClass.getSimpleName());

        tomcat.start();
        tomcat.getServer().await();

//        AlcoholType alcoholType = new AlcoholType(10d);
//        AlcoholTypeRepository alcoholTypeRepository = new AlcoholTypeRepository();
//        alcoholTypeRepository.create(alcoholType);
//        List<AlcoholType> alcoholTypes = alcoholTypeRepository.getAll();
//        for (AlcoholType type : alcoholTypes) {
//            System.out.println(type);
//        }
//        Alcohol alcohol = new Alcohol("пивоу", alcoholType);
//        AlcoholRepository alcoholRepository = new AlcoholRepository();
//        alcoholRepository.create(alcohol);
//        List<Alcohol> list = alcoholRepository.getAll();
//        for (Alcohol alcohol1 : list) {
//            System.out.println(alcohol1);
//        }
//        Bar bar = new Bar("бобик", "ленина");
//        BarRepository barRepository = new BarRepository();
//        barRepository.create(bar);
//        List<Bar> bars = barRepository.getAll();
//        for (Bar bar1 : bars) {
//            System.out.println(bar1);
//        }
    }
}
