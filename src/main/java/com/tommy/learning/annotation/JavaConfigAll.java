package com.tommy.learning.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JavaConfigA.class,JavaConfigB.class})
public class JavaConfigAll {
}
