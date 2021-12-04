package com.springbootcomplete.user.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.util.ArrayList;
import java.util.Collection;


@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ActuatorFilter> registrationBean()
    {
        Collection<String> urlList = new ArrayList<String>();
        urlList.add("/actuator/health");
        FilterRegistrationBean<ActuatorFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new ActuatorFilter());
        filterFilterRegistrationBean.setUrlPatterns(urlList);
        filterFilterRegistrationBean.setOrder(1);
        return filterFilterRegistrationBean;
    }

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        return loggingFilter;
    }

    @Bean
    public FilterRegistrationBean<CommonsRequestLoggingFilter> userFilterFilterRegistrationBean()
    {
        Collection<String> urlList = new ArrayList<String>();
        urlList.add("/users/");
        FilterRegistrationBean<CommonsRequestLoggingFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(requestLoggingFilter());
        filterFilterRegistrationBean.setUrlPatterns(urlList);
        filterFilterRegistrationBean.setOrder(2);
        return filterFilterRegistrationBean;
    }

}
