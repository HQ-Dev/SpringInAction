package com.archy.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

/**
 * Created by huang on 2016/11/23.
 */
@Configuration
@ComponentScan(basePackages={"com"},
    excludeFilters = {
            @ComponentScan.Filter(type= FilterType.ANNOTATION, value = EnableWebMvc.class)
    })
public class RootConfig {

}
