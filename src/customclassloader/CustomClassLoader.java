/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customclassloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author sara
 */
public class CustomClassLoader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        // TODO code application logic here
        NyCustomClassLoader myloader = new NyCustomClassLoader();
        Class<?> c = myloader.findClass("customclassloader.Person");
        System.out.println(c.getClassLoader());
        //    Class ob = c.getClass();
        Object ob = c.newInstance();
        Method md = c.getMethod("print");
        md.invoke(ob);
        Object ob2 = c.newInstance();
        Method md2 = c.getMethod("print");
        md2.invoke(ob2);

Person p=new Person();
        System.out.println(Person.s);
        System.out.println(Person.class.getClassLoader());

////////////////////////
/*
Class c2=Class.forName("customclassloader.Person");
System.out.println(c2.getClassLoader());

System.out.println(Person.s);
/////////////////////////
 NyCustomClassLoader myloader2=new NyCustomClassLoader();
     Class c3 = myloader2.findClass("customclassloader.Person");
System.out.println(c3.getClassLoader());
System.out.println(Person.s);*/
    }

}
