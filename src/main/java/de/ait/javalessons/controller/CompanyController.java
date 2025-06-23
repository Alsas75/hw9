package de.ait.javalessons.controller;

import de.ait.javalessons.properties.CompanyProperties;
import de.ait.javalessons.service.ExternalApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyProperties companyProperties;

    public CompanyController(CompanyProperties companyProperties) {
        this.companyProperties = companyProperties;
    }

    @GetMapping
    public CompanyProperties getCompanyInfo() {
        return companyProperties;
    }
}
