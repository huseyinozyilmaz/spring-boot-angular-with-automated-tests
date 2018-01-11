package org.huseyin.springbootangularautomatedtests.bdd;

import org.huseyin.springbootangularautomatedtests.SpringBootAngularAutomatedTestsApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootTest(
        classes = SpringBootAngularAutomatedTestsApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public abstract class SpringIntegrationTest {
}
