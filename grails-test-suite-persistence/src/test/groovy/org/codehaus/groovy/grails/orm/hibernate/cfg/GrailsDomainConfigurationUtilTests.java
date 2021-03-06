package org.codehaus.groovy.grails.orm.hibernate.cfg;

import junit.framework.TestCase;

import org.codehaus.groovy.grails.commons.GrailsDomainConfigurationUtil;

public class GrailsDomainConfigurationUtilTests extends TestCase {

    public void testGetMappingFileName() {
        assertEquals("org/codehaus/groovy/grails/orm/hibernate/HibernateMappedClass.hbm.xml",
                     GrailsDomainConfigurationUtil.getMappingFileName("org.codehaus.groovy.grails.orm.hibernate.HibernateMappedClass"));
    }
}
