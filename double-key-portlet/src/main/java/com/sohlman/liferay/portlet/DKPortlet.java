package com.sohlman.liferay.portlet;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.RandomUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sohlman.liferay.model.Test;
import com.sohlman.liferay.service.TestLocalServiceUtil;
import com.sohlman.liferay.service.persistence.TestPK;

import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class DKPortlet
 */
public class DKPortlet extends MVCPortlet {

	public void addEntity(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		Test test = TestLocalServiceUtil.createTest(
			new TestPK(
				String.valueOf(System.currentTimeMillis()), 
				String.valueOf(RandomUtil.nextInt(100))));
		
		test.setModified("terve", new Locale("fi_FI"));
		test.setModified("howdy", Locale.US);
		test.setModified("hello", Locale.UK);
		
		try {
			TestLocalServiceUtil.addTest(test);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void updateEntity(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		List<Test> list;
		try {
			list = TestLocalServiceUtil.getTests(0, 2);
			for ( Test test : list ) {
				test.setPayload(String.valueOf(RandomUtil.nextInt(100)));
				TestLocalServiceUtil.updateTest(test);
			}
							
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
	}	
}


