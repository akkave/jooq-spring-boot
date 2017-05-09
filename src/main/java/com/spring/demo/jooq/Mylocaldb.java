/**
 * This class is generated by jOOQ
 */
package com.spring.demo.jooq;


import com.spring.demo.jooq.tables.Abc;
import com.spring.demo.jooq.tables.Company;
import com.spring.demo.jooq.tables.Employee;
import com.spring.demo.jooq.tables.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Mylocaldb extends SchemaImpl {

    private static final long serialVersionUID = 488155193;

    /**
     * The reference instance of <code>mylocaldb</code>
     */
    public static final Mylocaldb MYLOCALDB = new Mylocaldb();

    /**
     * The table <code>mylocaldb.abc</code>.
     */
    public final Abc ABC = com.spring.demo.jooq.tables.Abc.ABC;

    /**
     * The table <code>mylocaldb.company</code>.
     */
    public final Company COMPANY = com.spring.demo.jooq.tables.Company.COMPANY;

    /**
     * The table <code>mylocaldb.employee</code>.
     */
    public final Employee EMPLOYEE = com.spring.demo.jooq.tables.Employee.EMPLOYEE;

    /**
     * The table <code>mylocaldb.person</code>.
     */
    public final Person PERSON = com.spring.demo.jooq.tables.Person.PERSON;

    /**
     * No further instances allowed
     */
    private Mylocaldb() {
        super("mylocaldb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Abc.ABC,
            Company.COMPANY,
            Employee.EMPLOYEE,
            Person.PERSON);
    }
}
