package com.sohlman.liferay.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.sohlman.liferay.service.ClpSerializer;
import com.sohlman.liferay.service.TestLocalServiceUtil;
import com.sohlman.liferay.service.TestServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            TestLocalServiceUtil.clearService();

            TestServiceUtil.clearService();
        }
    }
}
