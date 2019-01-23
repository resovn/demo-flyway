package com.hcy308.flyway;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Simon Huang
 */
@SpringBootTest(classes = DemoFlywayApplication.class)
@WebAppConfiguration
public abstract class ApplicationTests extends BaseTests {

}

