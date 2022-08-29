package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory factory_hunter = context.getBean("AutoFactory_hunter", AutoFactory.class);
        AutoFactory factory_patiot = context.getBean("AutoFactory_patriot", AutoFactory.class);

        factory_hunter.RunProd();
        factory_patiot.RunProd();

        System.out.println("Всего машин:" + (factory_hunter.GetBuildCnt()+factory_patiot.GetBuildCnt()));



        //Object factory = context.getBean("hunter_prodline", HunterProdLine.class);

    }
}
