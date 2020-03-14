package com.pluralsight;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) // in Spring, Singleton is the scope by default
    public SpeakerService getSpeakerService(){
        // here, we inject the speakerRepository using SpeakerServiceImpl instructor
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository") // this function will return always the same instance of hibernateSpeakerRepositoryImpl, it's a singleton
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/

}
