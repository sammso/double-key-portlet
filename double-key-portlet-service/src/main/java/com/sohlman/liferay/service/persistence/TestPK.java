package com.sohlman.liferay.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestPK implements Comparable<TestPK>, Serializable {
    public String testOneId;
    public String testTwoId;

    public TestPK() {
    }

    public TestPK(String testOneId, String testTwoId) {
        this.testOneId = testOneId;
        this.testTwoId = testTwoId;
    }

    public String getTestOneId() {
        return testOneId;
    }

    public void setTestOneId(String testOneId) {
        this.testOneId = testOneId;
    }

    public String getTestTwoId() {
        return testTwoId;
    }

    public void setTestTwoId(String testTwoId) {
        this.testTwoId = testTwoId;
    }

    @Override
    public int compareTo(TestPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = testOneId.compareTo(pk.testOneId);

        if (value != 0) {
            return value;
        }

        value = testTwoId.compareTo(pk.testTwoId);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TestPK)) {
            return false;
        }

        TestPK pk = (TestPK) obj;

        if ((testOneId.equals(pk.testOneId)) &&
                (testTwoId.equals(pk.testTwoId))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(testOneId) + String.valueOf(testTwoId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("testOneId");
        sb.append(StringPool.EQUAL);
        sb.append(testOneId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("testTwoId");
        sb.append(StringPool.EQUAL);
        sb.append(testTwoId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
