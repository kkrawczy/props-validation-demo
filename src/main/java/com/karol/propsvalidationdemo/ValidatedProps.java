package com.karol.propsvalidationdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Component
@ConfigurationProperties("props")
@Validated
public class ValidatedProps {
    @NotBlank
    @NotNull
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
    private String ohlala;
}
