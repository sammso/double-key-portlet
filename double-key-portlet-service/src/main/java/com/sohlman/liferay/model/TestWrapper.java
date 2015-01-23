package com.sohlman.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Test}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Test
 * @generated
 */
public class TestWrapper implements Test, ModelWrapper<Test> {
    private Test _test;

    public TestWrapper(Test test) {
        _test = test;
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

    /**
    * Returns the primary key of this test.
    *
    * @return the primary key of this test
    */
    @Override
    public com.sohlman.liferay.service.persistence.TestPK getPrimaryKey() {
        return _test.getPrimaryKey();
    }

    /**
    * Sets the primary key of this test.
    *
    * @param primaryKey the primary key of this test
    */
    @Override
    public void setPrimaryKey(
        com.sohlman.liferay.service.persistence.TestPK primaryKey) {
        _test.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the test one ID of this test.
    *
    * @return the test one ID of this test
    */
    @Override
    public java.lang.String getTestOneId() {
        return _test.getTestOneId();
    }

    /**
    * Sets the test one ID of this test.
    *
    * @param testOneId the test one ID of this test
    */
    @Override
    public void setTestOneId(java.lang.String testOneId) {
        _test.setTestOneId(testOneId);
    }

    /**
    * Returns the test two ID of this test.
    *
    * @return the test two ID of this test
    */
    @Override
    public java.lang.String getTestTwoId() {
        return _test.getTestTwoId();
    }

    /**
    * Sets the test two ID of this test.
    *
    * @param testTwoId the test two ID of this test
    */
    @Override
    public void setTestTwoId(java.lang.String testTwoId) {
        _test.setTestTwoId(testTwoId);
    }

    /**
    * Returns the payload of this test.
    *
    * @return the payload of this test
    */
    @Override
    public java.lang.String getPayload() {
        return _test.getPayload();
    }

    /**
    * Sets the payload of this test.
    *
    * @param payload the payload of this test
    */
    @Override
    public void setPayload(java.lang.String payload) {
        _test.setPayload(payload);
    }

    /**
    * Returns the modified of this test.
    *
    * @return the modified of this test
    */
    @Override
    public java.lang.String getModified() {
        return _test.getModified();
    }

    /**
    * Returns the localized modified of this test in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized modified of this test
    */
    @Override
    public java.lang.String getModified(java.util.Locale locale) {
        return _test.getModified(locale);
    }

    /**
    * Returns the localized modified of this test in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized modified of this test. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getModified(java.util.Locale locale,
        boolean useDefault) {
        return _test.getModified(locale, useDefault);
    }

    /**
    * Returns the localized modified of this test in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized modified of this test
    */
    @Override
    public java.lang.String getModified(java.lang.String languageId) {
        return _test.getModified(languageId);
    }

    /**
    * Returns the localized modified of this test in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized modified of this test
    */
    @Override
    public java.lang.String getModified(java.lang.String languageId,
        boolean useDefault) {
        return _test.getModified(languageId, useDefault);
    }

    @Override
    public java.lang.String getModifiedCurrentLanguageId() {
        return _test.getModifiedCurrentLanguageId();
    }

    @Override
    public java.lang.String getModifiedCurrentValue() {
        return _test.getModifiedCurrentValue();
    }

    /**
    * Returns a map of the locales and localized modifieds of this test.
    *
    * @return the locales and localized modifieds of this test
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getModifiedMap() {
        return _test.getModifiedMap();
    }

    /**
    * Sets the modified of this test.
    *
    * @param modified the modified of this test
    */
    @Override
    public void setModified(java.lang.String modified) {
        _test.setModified(modified);
    }

    /**
    * Sets the localized modified of this test in the language.
    *
    * @param modified the localized modified of this test
    * @param locale the locale of the language
    */
    @Override
    public void setModified(java.lang.String modified, java.util.Locale locale) {
        _test.setModified(modified, locale);
    }

    /**
    * Sets the localized modified of this test in the language, and sets the default locale.
    *
    * @param modified the localized modified of this test
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setModified(java.lang.String modified, java.util.Locale locale,
        java.util.Locale defaultLocale) {
        _test.setModified(modified, locale, defaultLocale);
    }

    @Override
    public void setModifiedCurrentLanguageId(java.lang.String languageId) {
        _test.setModifiedCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized modifieds of this test from the map of locales and localized modifieds.
    *
    * @param modifiedMap the locales and localized modifieds of this test
    */
    @Override
    public void setModifiedMap(
        java.util.Map<java.util.Locale, java.lang.String> modifiedMap) {
        _test.setModifiedMap(modifiedMap);
    }

    /**
    * Sets the localized modifieds of this test from the map of locales and localized modifieds, and sets the default locale.
    *
    * @param modifiedMap the locales and localized modifieds of this test
    * @param defaultLocale the default locale
    */
    @Override
    public void setModifiedMap(
        java.util.Map<java.util.Locale, java.lang.String> modifiedMap,
        java.util.Locale defaultLocale) {
        _test.setModifiedMap(modifiedMap, defaultLocale);
    }

    @Override
    public boolean isNew() {
        return _test.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _test.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _test.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _test.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _test.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _test.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _test.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _test.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _test.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _test.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _test.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.String[] getAvailableLanguageIds() {
        return _test.getAvailableLanguageIds();
    }

    @Override
    public java.lang.String getDefaultLanguageId() {
        return _test.getDefaultLanguageId();
    }

    @Override
    public void prepareLocalizedFieldsForImport()
        throws com.liferay.portal.LocaleException {
        _test.prepareLocalizedFieldsForImport();
    }

    @Override
    public void prepareLocalizedFieldsForImport(
        java.util.Locale defaultImportLocale)
        throws com.liferay.portal.LocaleException {
        _test.prepareLocalizedFieldsForImport(defaultImportLocale);
    }

    @Override
    public java.lang.Object clone() {
        return new TestWrapper((Test) _test.clone());
    }

    @Override
    public int compareTo(Test test) {
        return _test.compareTo(test);
    }

    @Override
    public int hashCode() {
        return _test.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Test> toCacheModel() {
        return _test.toCacheModel();
    }

    @Override
    public Test toEscapedModel() {
        return new TestWrapper(_test.toEscapedModel());
    }

    @Override
    public Test toUnescapedModel() {
        return new TestWrapper(_test.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _test.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _test.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _test.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TestWrapper)) {
            return false;
        }

        TestWrapper testWrapper = (TestWrapper) obj;

        if (Validator.equals(_test, testWrapper._test)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Test getWrappedTest() {
        return _test;
    }

    @Override
    public Test getWrappedModel() {
        return _test;
    }

    @Override
    public void resetOriginalValues() {
        _test.resetOriginalValues();
    }
}
