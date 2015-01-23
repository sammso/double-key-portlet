package com.sohlman.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sohlman.liferay.model.Test;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Test in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Test
 * @generated
 */
public class TestCacheModel implements CacheModel<Test>, Externalizable {
    public String testOneId;
    public String testTwoId;
    public String payload;
    public String modified;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{testOneId=");
        sb.append(testOneId);
        sb.append(", testTwoId=");
        sb.append(testTwoId);
        sb.append(", payload=");
        sb.append(payload);
        sb.append(", modified=");
        sb.append(modified);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Test toEntityModel() {
        TestImpl testImpl = new TestImpl();

        if (testOneId == null) {
            testImpl.setTestOneId(StringPool.BLANK);
        } else {
            testImpl.setTestOneId(testOneId);
        }

        if (testTwoId == null) {
            testImpl.setTestTwoId(StringPool.BLANK);
        } else {
            testImpl.setTestTwoId(testTwoId);
        }

        if (payload == null) {
            testImpl.setPayload(StringPool.BLANK);
        } else {
            testImpl.setPayload(payload);
        }

        if (modified == null) {
            testImpl.setModified(StringPool.BLANK);
        } else {
            testImpl.setModified(modified);
        }

        testImpl.resetOriginalValues();

        return testImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        testOneId = objectInput.readUTF();
        testTwoId = objectInput.readUTF();
        payload = objectInput.readUTF();
        modified = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (testOneId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(testOneId);
        }

        if (testTwoId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(testTwoId);
        }

        if (payload == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(payload);
        }

        if (modified == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modified);
        }
    }
}
