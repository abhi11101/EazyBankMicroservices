package org.abhi.accounts.DTO;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "vegeta")   //This will search for vegeta tag in application file
public record AccountsContactInfo(String message, Map<String,String> contactDetails, List<String> onCallSupport) {


}
