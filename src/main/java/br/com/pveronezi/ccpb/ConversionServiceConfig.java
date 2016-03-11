package br.com.pveronezi.ccpb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class ConversionServiceConfig extends WebMvcConfigurerAdapter {

@Bean
public CalendarFormatter calendarFormatter() {
    return new CalendarFormatter();
}

@Override
public void addFormatters(FormatterRegistry registry) {
    registry.addFormatter(calendarFormatter());
}
}