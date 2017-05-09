/**
 * This class is generated by jOOQ
 */
package com.spring.demo.jooq.tables;


import com.spring.demo.jooq.Keys;
import com.spring.demo.jooq.Mylocaldb;
import com.spring.demo.jooq.tables.records.EmployeeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = -2115895965;

    /**
     * The reference instance of <code>mylocaldb.employee</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>mylocaldb.employee.id</code>.
     */
    public final TableField<EmployeeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mylocaldb.employee.emp_id</code>.
     */
    public final TableField<EmployeeRecord, Integer> EMP_ID = createField("emp_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mylocaldb.employee.emp_name</code>.
     */
    public final TableField<EmployeeRecord, String> EMP_NAME = createField("emp_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>mylocaldb.employee.company_id</code>.
     */
    public final TableField<EmployeeRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>mylocaldb.employee</code> table reference
     */
    public Employee() {
        this("employee", null);
    }

    /**
     * Create an aliased <code>mylocaldb.employee</code> table reference
     */
    public Employee(String alias) {
        this(alias, EMPLOYEE);
    }

    private Employee(String alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(String alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mylocaldb.MYLOCALDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmployeeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMPLOYEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.KEY_EMPLOYEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployeeRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeeRecord>>asList(Keys.KEY_EMPLOYEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employee as(String alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    public Employee rename(String name) {
        return new Employee(name, null);
    }
}