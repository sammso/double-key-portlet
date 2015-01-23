package com.sohlman.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sohlman.liferay.model.Test;

/**
 * The persistence interface for the test service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestPersistenceImpl
 * @see TestUtil
 * @generated
 */
public interface TestPersistence extends BasePersistence<Test> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TestUtil} to access the test persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the test in the entity cache if it is enabled.
    *
    * @param test the test
    */
    public void cacheResult(com.sohlman.liferay.model.Test test);

    /**
    * Caches the tests in the entity cache if it is enabled.
    *
    * @param tests the tests
    */
    public void cacheResult(
        java.util.List<com.sohlman.liferay.model.Test> tests);

    /**
    * Creates a new test with the primary key. Does not add the test to the database.
    *
    * @param testPK the primary key for the new test
    * @return the new test
    */
    public com.sohlman.liferay.model.Test create(TestPK testPK);

    /**
    * Removes the test with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param testPK the primary key of the test
    * @return the test that was removed
    * @throws com.sohlman.liferay.NoSuchTestException if a test with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.model.Test remove(TestPK testPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.NoSuchTestException;

    public com.sohlman.liferay.model.Test updateImpl(
        com.sohlman.liferay.model.Test test)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the test with the primary key or throws a {@link com.sohlman.liferay.NoSuchTestException} if it could not be found.
    *
    * @param testPK the primary key of the test
    * @return the test
    * @throws com.sohlman.liferay.NoSuchTestException if a test with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.model.Test findByPrimaryKey(TestPK testPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sohlman.liferay.NoSuchTestException;

    /**
    * Returns the test with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param testPK the primary key of the test
    * @return the test, or <code>null</code> if a test with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sohlman.liferay.model.Test fetchByPrimaryKey(TestPK testPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tests.
    *
    * @return the tests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.model.Test> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tests
    * @param end the upper bound of the range of tests (not inclusive)
    * @return the range of tests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.model.Test> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sohlman.liferay.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tests
    * @param end the upper bound of the range of tests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sohlman.liferay.model.Test> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tests from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tests.
    *
    * @return the number of tests
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
