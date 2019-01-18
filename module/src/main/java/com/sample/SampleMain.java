package com.sample;

import com.google.common.collect.ImmutableMap;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.*;

import java.util.List;
import com.google.common.collect.Lists;
import org.joda.time.format.DateTimeFormatter;
public class SampleMain
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleMain.class);

    public static void main(String[] anArguments)
    {
        for (String message : new SampleMain().messages()) {
            LOGGER.info(message);
        }
    }

    public List<String> messages()
    {
        ImmutableMap<Long, String> messageMap
            = new ImmutableMap.Builder<Long, String>()
                .put(0L, "Started")
                .put(1L, "Running")
                .put(2L, "Stopped")
                .build();
        List<String> messages = Lists.newArrayList();
        for (String message : messageMap.values()) {
            messages.add(message);
        }

        DateTimeFormatter formatter = DateTimeFormat.fullDate();
        return messages;
    }
}
