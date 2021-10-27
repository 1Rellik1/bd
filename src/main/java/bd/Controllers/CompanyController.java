package bd.Controllers;


import bd.Entities.Company;
import bd.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    @ResponseBody
    public List<Company> getcompanies(){
        List<Company> ventil=companyService.getCompanies();
        return ventil;
    }
    @GetMapping("/addcompany")
    public String start(){
        return "AddCompany";
    }

    @PostMapping("/addcompany")
    @ResponseBody
    public String addcompany(@RequestBody Company company){
        companyService.addCompany(company);
        return "company is added";
    }
}
