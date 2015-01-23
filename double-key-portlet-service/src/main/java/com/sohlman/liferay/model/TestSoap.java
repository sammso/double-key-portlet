package com.sohlman.liferay.model;

import com.sohlman.liferay.service.persistence.TestPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sohlman.liferay.service.http.TestServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.sohlman.liferay.service.http.TestServiceSoap
 * @generated
 */
public class TestSoap implements Serializable {
    private String _testOneId;
    private String _testTwoId;
    private String _payload;
    private String _modified;

    public TestSoap() {
    }

    public static TestSoap toSoapModel(Test model) {
        TestSoap soapModel = new TestSoap();

        soapModel.setTestOneId(model.getTestOneId());
        soapModel.setTestTwoId(model.getTestTwoId());
        soapModel.setPayload(model.getPayload());
        soapModel.setModified(model.getModified());

        return soapModel;
    }

    public static TestSoap[] toSoapModels(Test[] models) {
        TestSoap[] soapModels = new TestSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TestSoap[][] toSoapModels(Test[][] models) {
        TestSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TestSoap[models.length][models[0].length];
        } else {
            soapModels = new TestSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TestSoap[] toSoapModels(List<Test> models) {
        List<TestSoap> soapModels = new ArrayList<TestSoap>(models.size());

        for (Test model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TestSoap[soapModels.size()]);
    }

    public TestPK getPrimaryKey() {
        return new TestPK(_testOneId, _testTwoId);
    }

    public void setPrimaryKey(TestPK pk) {
        setTestOneId(pk.testOneId);
        setTestTwoId(pk.testTwoId);
    }

    public String getTestOneId() {
        return _testOneId;
    }

    public void setTestOneId(String testOneId) {
        _testOneId = testOneId;
    }

    public String getTestTwoId() {
        return _testTwoId;
    }

    public void setTestTwoId(String testTwoId) {
        _testTwoId = testTwoId;
    }

    public String getPayload() {
        return _payload;
    }

    public void setPayload(String payload) {
        _payload = payload;
    }

    public String getModified() {
        return _modified;
    }

    public void setModified(String modified) {
        _modified = modified;
    }
}
