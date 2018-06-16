package config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"controller"})
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter msgConverter = new GsonHttpMessageConverter();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        msgConverter.setGson(gson);
        converters.add(msgConverter);
    }
}
