package com.hgp.myproject.core.utils.json;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementation of DateFormatter to support IE and other browser formats at the same time.
 * IE does not use milliseconds but Firefox adds milliseconds while converting from Date to JSON.
 *
 * @see {http://es.wikipedia.org/wiki/ISO_8601}
 */
public class JsonDateFormatter extends SimpleDateFormat {

    private static final String ISO_8601_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String ISO_8601_LONG_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    private final SimpleDateFormat longFormat;

    public JsonDateFormatter() {
        super(ISO_8601_DATE_PATTERN);

        longFormat = new SimpleDateFormat(ISO_8601_LONG_DATE_PATTERN);
    }


    @Override
    public Date parse(String text, ParsePosition pos) {
        int savedPos = pos.getIndex();
        int errorPos = pos.getErrorIndex();

        // Try to parse in short format (IE)
        Date date = super.parse(text, pos);

        if (date == null) {
            // Could not parse, try in long format
            pos.setIndex(savedPos);
            pos.setErrorIndex(errorPos);

            date = longFormat.parse(text, pos);
        }

        return date;
    }
}
