package de.ait.javalessons.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyProperties {

    private String name;

    private String ceo;

    private int employeeCount;
}
