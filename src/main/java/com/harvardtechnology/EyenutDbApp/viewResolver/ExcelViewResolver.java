/*
 * Copyright (c) 2016 Harvard Technology Ltd.
 * All rights reserved.
 *
 *
 *   This software is the confidential and proprietary information
 *   of Wimac Ltd. ("Confidential Information").  You shall not
 *   disclose such Confidential Information and shall use it only in
 *   accordance with the terms of the license agreement you entered
 *   with Harvard Technology Ltd.
 *  
 */
package com.harvardtechnology.EyenutDbApp.viewResolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.harvardtechnology.EyenutDbApp.view.ExcelView;

/**
 * @author cbaum
 *
 */
public class ExcelViewResolver implements ViewResolver {

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {

        return new ExcelView();
    }
}
