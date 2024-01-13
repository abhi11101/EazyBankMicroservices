package org.abhi.loans.DTO;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(value = "loans")
public record LoanContactInfo(String message, Map<String,String> contactDetails, List<String> onCallSupport) {
}
