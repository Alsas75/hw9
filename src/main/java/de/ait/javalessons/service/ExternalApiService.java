package de.ait.javalessons.service;

import de.ait.javalessons.properties.CompanyProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Сервис для обращения к внешнему API.
 * Использует RestTemplate и параметры, заданные в application.yml или application.properties.
 */
@Service
public class ExternalApiService {

    // Объект RestTemplate — основной инструмент для HTTP-запросов
    private final RestTemplate restTemplate;

    // Класс, содержащий свойства внешнего API (URL, таймаут и пр.)
    private final CompanyProperties companyProperties;

    /**
     * Конструктор с внедрением зависимостей.
     *
     * @param restTemplate      бин RestTemplate для выполнения HTTP-запросов
     * @param companyProperties бин, содержащий настройки внешнего API
     */
    public ExternalApiService(RestTemplate restTemplate, CompanyProperties companyProperties) {
        this.restTemplate = restTemplate;
        this.companyProperties = companyProperties;
    }

    public String callDataJson() {
        return restTemplate.getForObject(companyProperties.getName(), String.class);
    }

//    public ResponseEntity<Map<String, Object>> getCompanyInfoAsJson() {
//        Map<String, Object> response = new HashMap<>();
//        response.put("name", companyProperties.getName());
//        response.put("ceo", companyProperties.getCeo());
//        response.put("employeeCount", companyProperties.getEmployeeCount());
//
//        return ResponseEntity.ok(response);
//    }

}