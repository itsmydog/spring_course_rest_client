package com.ivan.spring.rest;

import com.ivan.spring.rest.configuration.MyConfig;
import com.ivan.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Comunication comunication = context.getBean("comunication", Comunication.class);
//       List<Employee> allEmployees =  comunication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = comunication.getEmployee(2);
//        System.out.println(empById);

//        Employee employee = new Employee("Sveta", "Mainkina", "Cleaner", 32100);
//        employee.setId(13);
//        comunication.saveEmployee(employee);

        comunication.deleteEmployee(13);

    }
}
