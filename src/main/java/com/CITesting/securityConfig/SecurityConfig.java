package com.CITesting.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**").permitAll()
                        .anyRequest().authenticated()
                ).httpBasic(Customizer.withDefaults());

//                .formLogin(login -> login
//                        .loginPage("/login")
//                        .permitAll()
//                );

        return http.build();
    }
}


// | Configuration                  | Meaning                                        |
// | ------------------------------ | ---------------------------------------------- |
// | `csrf().disable()`             | Needed for Postman/API testing                 |
// | `/public/**`                   | Anyone can access                              |
// | `anyRequest().authenticated()` | All other APIs require login                   |
// | `httpBasic()`                  | Use Basic Authentication (username + password) |
