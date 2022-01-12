package com.te.springconfigurationbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.te.springconfiguration","com.te.something"})
public class ComponentConfig {

}
