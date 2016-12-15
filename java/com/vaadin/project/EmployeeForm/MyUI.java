package com.vaadin.project.EmployeeForm;

import java.util.ArrayList;
import java.util.List;

import employee.Employee;
import employee.EmployeeService;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import employee.Address;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.vaadin.project.EmployeeForm.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Name:");
        final TextField surname = new TextField();
        surname.setCaption("Surname:");
        final TextField age = new TextField();
        age.setCaption("Age:");
        final TextField sex = new TextField();
        sex.setCaption("Sex:");
        final TextField role = new TextField();
        role.setCaption("Role:");
        final TextField id = new TextField();
        id.setCaption("ID:");
        final TextField streetNumber = new TextField();
        streetNumber.setCaption("Street Number:");
        final TextField streetName = new TextField();
        streetName.setCaption("Street Name:");
        final TextField postcode = new TextField();
        postcode.setCaption("Postcode:");
        
        Button button = new Button("Submit");
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
            EmployeeService employeeService = new EmployeeService();
            employeeService.printTest();
            employeeService.validateOutput(name.getValue(),surname.getValue(), age.getValue(), sex.getValue(), role.getValue(), id.getValue(), streetNumber.getValue(), streetName.getValue(), postcode.getValue());
            //System.out.println("name is " + name.getValue() + surname.getValue() + age.getValue() + sex.getValue() + role.getValue() + id.getValue() + streetNumber.getValue() + streetName.getValue() + postcode.getValue());
            employeeService.createNewEmployee(name.getValue(),surname.getValue(), age.getValue(), sex.getValue(), role.getValue(), id.getValue(), streetNumber.getValue(), streetName.getValue(), postcode.getValue());
            employeeService.clearTextFields(name, surname, age, sex, role, id, streetNumber, streetName, postcode);
            
        });
        
        layout.addComponents(name, surname, age, sex, role, id, streetNumber, streetName, postcode, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
        /*####################		testing Employee class		######################*/
       /* Address address1 = new Address(34, "Flinch Street","KT25AG");
        Employee employee1 = new Employee("John","Smith", "Male", 39, address1, "Permanent", 8765);
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(employee1);
        for(Employee currentEmployee : employee ){
        	System.out.println(employee);
        }*/
       
        /*####################		testing Employee class		######################*/
    }

    

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
