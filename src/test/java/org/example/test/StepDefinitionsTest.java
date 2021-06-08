package org.example.test;

import org.example.base.BaseTest;
import org.example.page.StepDefinitions;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class StepDefinitionsTest extends BaseTest {

    StepDefinitions stepDefinitions;

    @Before
    public void before() {
        stepDefinitions = new StepDefinitions(getWebDriver());
    }

    @Test
    public void test() {
        stepDefinitions.moveToLogin().clickLogin().sendUserName().sendPassword().loginButton().searchArea().searchButton().checkSamsung().scrollDown().secondPage().thirdProduct().thirdProductFavorite().moveToLogin().favoriteButton().checkProduct().hoverProduct().selectAll().clearProduct().clearButton().emptyList();
    }

    @After
    public void after() {
        tearDown();
    }
}
