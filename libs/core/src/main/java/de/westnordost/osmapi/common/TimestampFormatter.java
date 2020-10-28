package de.westnordost.osmapi.common;

import java.text.ParseException;

public interface TimestampFormatter
{
    long parse(String source) throws ParseException;
    String format(long timestamp);
}
