package com.example.HR.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {


        @Bean
        //OpenAPI döndüren bir bean oluşturuyoruz. Bu bean ile Swagger UI üzerinde gösterilecek bilgileri belirliyoruz.
        //Burada görüldüğü gibi title, version, description, termsOfService, license, contact gibi bilgileri belirtebiliyoruz.
        //Bu bilgiler Swagger UI üzerinde en üstte gösterilecek bilgilerdir.
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("HR System API")
                            .version("1.0")
                            .description("HR API Portal")
                            .termsOfService("http://swagger.io/terms/")
                            .license(new License()
                                    .name("Apache 2.0")
                                    .url("http://springdoc.org")
                            )
                            .contact(new Contact()
                                    .email("humanresources@gmail.com")
                                    .name("HRSystem")
                                    .url("https://humanresources.com")
                            )
                    );
        }

    }



