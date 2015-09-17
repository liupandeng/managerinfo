package com.dbke.info.dal.dao;

import cn.dbke.info.dal.dao.PeopleDAO;
import cn.dbke.info.dal.dbobject.PeopleDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/applicationContext.xml"})
public class PeopleDAOTest {
    /*@Before
    public void setUp()throws Exception{
        String resource = "config/mybatis/sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }*/

    @Resource
    private PeopleDAO peopleDAO;

    @Test
    public void testInsertDO()throws Exception{
        PeopleDO people = new PeopleDO();
        people.setName("liupandeng");
        people.setRoleId(3);
        people.setSex("男");
        peopleDAO.insert(people);
        Assert.isTrue(peopleDAO != null);
        Assert.isTrue(true);
    }

}
