package com.archy.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.regex.Pattern;

/**
  * @ClassName: RootConfig
  * @Description:
  * @author Archy技术部-huang
  * @date 2016年12月30日 下午09:45:39
 */
@Configuration
@ComponentScan(basePackages={"com"},
    excludeFilters = {
            @ComponentScan.Filter(type= FilterType.ANNOTATION, value = EnableWebMvc.class)
    })
public class RootConfig {

}
