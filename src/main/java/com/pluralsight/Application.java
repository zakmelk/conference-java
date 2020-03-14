package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]){
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpeakerService speakerService = new SpeakerServiceImpl();
        SpeakerService speakerService = appContext.getBean("speakerService",SpeakerService.class);
        // because this service is a singleton, we mustn't store any user's information, the bean is shared across the application
        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getSeedNum());
    }
}
