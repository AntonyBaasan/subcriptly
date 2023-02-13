package com.subcriptly;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.List;

@ConfigurationProperties(prefix = "subcriptly")
@ConfigurationPropertiesScan
public class ConfigProperties {
    @Getter
    @Setter
    private List<String> cors;

}
