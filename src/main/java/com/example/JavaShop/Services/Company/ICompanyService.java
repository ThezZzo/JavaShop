package com.example.JavaShop.Services.Company;

import com.example.JavaShop.Entity.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> getAllCompany();

    Company getCompanyById(Long id);

    Company createCompany(Company company);

    Company updateCompany(Long id, Company company);

    void deleteCompany(Long id);
}