package com.sohlman.liferay.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sohlman.liferay.service.ClpSerializer;
import com.sohlman.liferay.service.TestLocalServiceUtil;
import com.sohlman.liferay.service.persistence.TestPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class TestClp extends BaseModelImpl<Test> implements Test {
    private String _testOneId;
    private String _testTwoId;
    private String _payload;
    private String _modified;
    private String _modifiedCurrentLanguageId;
    private BaseModel<?> _testRemoteModel;
    private Class<?> _clpSerializerClass = com.sohlman.liferay.service.ClpSerializer.class;

    public TestClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Test.class;
    }

    @Override
    public String getModelClassName() {
        return Test.class.getName();
    }

    @Override
    public TestPK getPrimaryKey() {
        return new TestPK(_testOneId, _testTwoId);
    }

    @Override
    public void setPrimaryKey(TestPK primaryKey) {
        setTestOneId(primaryKey.testOneId);
        setTestTwoId(primaryKey.testTwoId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new TestPK(_testOneId, _testTwoId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((TestPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("testOneId", getTestOneId());
        attributes.put("testTwoId", getTestTwoId());
        attributes.put("payload", getPayload());
        attributes.put("modified", getModified());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String testOneId = (String) attributes.get("testOneId");

        if (testOneId != null) {
            setTestOneId(testOneId);
        }

        String testTwoId = (String) attributes.get("testTwoId");

        if (testTwoId != null) {
            setTestTwoId(testTwoId);
        }

        String payload = (String) attributes.get("payload");

        if (payload != null) {
            setPayload(payload);
        }

        String modified = (String) attributes.get("modified");

        if (modified != null) {
            setModified(modified);
        }
    }

    @Override
    public String getTestOneId() {
        return _testOneId;
    }

    @Override
    public void setTestOneId(String testOneId) {
        _testOneId = testOneId;

        if (_testRemoteModel != null) {
            try {
                Class<?> clazz = _testRemoteModel.getClass();

                Method method = clazz.getMethod("setTestOneId", String.class);

                method.invoke(_testRemoteModel, testOneId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTestTwoId() {
        return _testTwoId;
    }

    @Override
    public void setTestTwoId(String testTwoId) {
        _testTwoId = testTwoId;

        if (_testRemoteModel != null) {
            try {
                Class<?> clazz = _testRemoteModel.getClass();

                Method method = clazz.getMethod("setTestTwoId", String.class);

                method.invoke(_testRemoteModel, testTwoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPayload() {
        return _payload;
    }

    @Override
    public void setPayload(String payload) {
        _payload = payload;

        if (_testRemoteModel != null) {
            try {
                Class<?> clazz = _testRemoteModel.getClass();

                Method method = clazz.getMethod("setPayload", String.class);

                method.invoke(_testRemoteModel, payload);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModified() {
        return _modified;
    }

    @Override
    public String getModified(Locale locale) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getModified(languageId);
    }

    @Override
    public String getModified(Locale locale, boolean useDefault) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getModified(languageId, useDefault);
    }

    @Override
    public String getModified(String languageId) {
        return LocalizationUtil.getLocalization(getModified(), languageId);
    }

    @Override
    public String getModified(String languageId, boolean useDefault) {
        return LocalizationUtil.getLocalization(getModified(), languageId,
            useDefault);
    }

    @Override
    public String getModifiedCurrentLanguageId() {
        return _modifiedCurrentLanguageId;
    }

    @Override
    public String getModifiedCurrentValue() {
        Locale locale = getLocale(_modifiedCurrentLanguageId);

        return getModified(locale);
    }

    @Override
    public Map<Locale, String> getModifiedMap() {
        return LocalizationUtil.getLocalizationMap(getModified());
    }

    @Override
    public void setModified(String modified) {
        _modified = modified;

        if (_testRemoteModel != null) {
            try {
                Class<?> clazz = _testRemoteModel.getClass();

                Method method = clazz.getMethod("setModified", String.class);

                method.invoke(_testRemoteModel, modified);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setModified(String modified, Locale locale) {
        setModified(modified, locale, LocaleUtil.getDefault());
    }

    @Override
    public void setModified(String modified, Locale locale, Locale defaultLocale) {
        String languageId = LocaleUtil.toLanguageId(locale);
        String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

        if (Validator.isNotNull(modified)) {
            setModified(LocalizationUtil.updateLocalization(getModified(),
                    "Modified", modified, languageId, defaultLanguageId));
        } else {
            setModified(LocalizationUtil.removeLocalization(getModified(),
                    "Modified", languageId));
        }
    }

    @Override
    public void setModifiedCurrentLanguageId(String languageId) {
        _modifiedCurrentLanguageId = languageId;
    }

    @Override
    public void setModifiedMap(Map<Locale, String> modifiedMap) {
        setModifiedMap(modifiedMap, LocaleUtil.getDefault());
    }

    @Override
    public void setModifiedMap(Map<Locale, String> modifiedMap,
        Locale defaultLocale) {
        if (modifiedMap == null) {
            return;
        }

        ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        try {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(portalClassLoader);
            }

            setModified(LocalizationUtil.updateLocalization(modifiedMap,
                    getModified(), "Modified",
                    LocaleUtil.toLanguageId(defaultLocale)));
        } finally {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    public BaseModel<?> getTestRemoteModel() {
        return _testRemoteModel;
    }

    public void setTestRemoteModel(BaseModel<?> testRemoteModel) {
        _testRemoteModel = testRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _testRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_testRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TestLocalServiceUtil.addTest(this);
        } else {
            TestLocalServiceUtil.updateTest(this);
        }
    }

    @Override
    public String[] getAvailableLanguageIds() {
        Set<String> availableLanguageIds = new TreeSet<String>();

        Map<Locale, String> modifiedMap = getModifiedMap();

        for (Map.Entry<Locale, String> entry : modifiedMap.entrySet()) {
            Locale locale = entry.getKey();
            String value = entry.getValue();

            if (Validator.isNotNull(value)) {
                availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
            }
        }

        return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
    }

    @Override
    public String getDefaultLanguageId() {
        String xml = getModified();

        if (xml == null) {
            return StringPool.BLANK;
        }

        Locale defaultLocale = LocaleUtil.getDefault();

        return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
    }

    @Override
    public void prepareLocalizedFieldsForImport() throws LocaleException {
        prepareLocalizedFieldsForImport(null);
    }

    @Override
    @SuppressWarnings("unused")
    public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
        throws LocaleException {
        Locale defaultLocale = LocaleUtil.getDefault();

        String modelDefaultLanguageId = getDefaultLanguageId();

        String modified = getModified(defaultLocale);

        if (Validator.isNull(modified)) {
            setModified(getModified(modelDefaultLanguageId), defaultLocale);
        } else {
            setModified(getModified(defaultLocale), defaultLocale, defaultLocale);
        }
    }

    @Override
    public Test toEscapedModel() {
        return (Test) ProxyUtil.newProxyInstance(Test.class.getClassLoader(),
            new Class[] { Test.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TestClp clone = new TestClp();

        clone.setTestOneId(getTestOneId());
        clone.setTestTwoId(getTestTwoId());
        clone.setPayload(getPayload());
        clone.setModified(getModified());

        return clone;
    }

    @Override
    public int compareTo(Test test) {
        TestPK primaryKey = test.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TestClp)) {
            return false;
        }

        TestClp test = (TestClp) obj;

        TestPK primaryKey = test.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{testOneId=");
        sb.append(getTestOneId());
        sb.append(", testTwoId=");
        sb.append(getTestTwoId());
        sb.append(", payload=");
        sb.append(getPayload());
        sb.append(", modified=");
        sb.append(getModified());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.sohlman.liferay.model.Test");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>testOneId</column-name><column-value><![CDATA[");
        sb.append(getTestOneId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>testTwoId</column-name><column-value><![CDATA[");
        sb.append(getTestTwoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>payload</column-name><column-value><![CDATA[");
        sb.append(getPayload());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modified</column-name><column-value><![CDATA[");
        sb.append(getModified());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
