// Add a configuration that explicitly registers the H2 Console servlet so /h2-console/** is handled
package com.rogerio.pedidos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
class SecurityConfig {
//    @Bean
//    SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        http.csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated())
//                .formLogin(withDefaults());
//
//        return http.build();
//    }
}
