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
package com.harvardtechnology.EyenutDbApp.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

/**
 * @author cbaum
 *
 */
public class ExcelView extends AbstractXlsView {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.document.AbstractXlsView#buildExcelDocument(java.util.Map, org.apache.poi.ss.usermodel.Workbook, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
