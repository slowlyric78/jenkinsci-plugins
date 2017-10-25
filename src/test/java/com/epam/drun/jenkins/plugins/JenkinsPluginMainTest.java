package com.epam.drun.jenkins.plugins;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class JenkinsPluginMainTest {

    private JenkinsPluginMain instance = null;

    @Before
    public void setUp()
    {
        instance = new JenkinsPluginMain();
    }

    @After
    public void tearDown()
    {
        instance = null;
    }

    @Test
    public void sum()
    {
        final int a = 5;
        final int b = 10;

        int result = instance.sum (a, b);

        assertEquals(15, result);
    }

    @Test
    public void failingSum()
    {
        fail("Simulated failure");
    }
}