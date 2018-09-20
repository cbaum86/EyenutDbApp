package com.harvardtechnology.EyenutDbApp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import com.harvardtechnology.EyenutDbApp.viewResolver.ExcelViewResolver;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/hubs").setViewName("hubs");
        registry.addViewController("/querys").setViewName("querys");
        registry.addViewController("/test").setViewName("test");
    }
    
//    /*
//     * Configure ContentNegotiatingViewResolver
//     */
//    @Bean
//    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
//        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
//        resolver.setContentNegotiationManager(manager);
//
//        // Define all possible view resolvers
//        List<ViewResolver> resolvers = new ArrayList<>();
//
//        resolvers.add(excelViewResolver());
//
//        resolver.setViewResolvers(resolvers);
//        return resolver;
//    }
//    
//    /*
//     * Configure View resolver to provide XLS output using Apache POI library to
//     * generate XLS output for an object content
//     */
//    @Bean
//    public ViewResolver excelViewResolver() {
//        return new ExcelViewResolver();
//    }

}
