package com.example.JavaShop.Controller;

import com.example.JavaShop.Entity.Company;
import com.example.JavaShop.Services.Company.ICompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyController {
    private final ICompanyService iCompanyService;

    public CompanyController(ICompanyService iCompanyService) {
        this.iCompanyService = iCompanyService;
    }

    @GetMapping("/companies")
    public List<Company> getAllCompany() {
        return iCompanyService.getAllCompany();
    }

    @GetMapping("/companies/{id}")
    public Company getGoodById(@PathVariable Long id) {
        return iCompanyService.getCompanyById(id);
    }

    @PostMapping("/companies")
    public Company createGood(@RequestBody Company company) {
        return iCompanyService.createCompany(company);
    }

    @PutMapping("/companies/{id}")
    public Company updateGood(@PathVariable Long id, @RequestBody Company company) {
        return iCompanyService.updateCompany(id, company);
    }

    @DeleteMapping("/companies/{id}")
    public void deleteGood(@PathVariable Long id) {
        iCompanyService.deleteCompany(id);
    }
}