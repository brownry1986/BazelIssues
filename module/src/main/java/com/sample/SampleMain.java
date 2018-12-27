package com.sample;

import org.slf4j.*;

public class SampleMain
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleMain.class);

    public static void main(String[] anArguments)
    {
        LOGGER.info("Started");
        HelloWorld.hello();
    }
}
