package com.alisa.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping ("/")
    public String showFirstView() {
        return "first-view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Ivanov");
//        emp.setSalary(500);

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description","- udemy instructor");
//        return "show-emp-details";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails(@RequestParam("employeeName") String empName
//            , Model model){
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee emp){

        String name = emp.getName();
        emp.setName("Mr. " + name);

        return "show-emp-details";
    }
}
