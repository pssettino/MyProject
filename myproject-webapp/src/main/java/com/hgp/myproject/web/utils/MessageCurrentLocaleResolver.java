package com.hgp.myproject.web.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

/**
 * Resolve MessageResource for the current Locale.
 */
@Service(value = "message")
public class MessageCurrentLocaleResolver {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    public MessageCurrentLocaleResolver() {

    }

    public String getMessage(String code) {
        return messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
    }

    public String getMessage(String code,Object... args) {
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
