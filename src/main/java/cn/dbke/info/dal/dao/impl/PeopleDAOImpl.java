package cn.dbke.info.dal.dao.impl;

import cn.dbke.info.dal.dao.PeopleDAO;
import cn.dbke.info.dal.dbobject.PeopleDO;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;

/**
 * Created by liyangtao on 15/9/14.
 */
public class PeopleDAOImpl implements PeopleDAO,InitializingBean{

    private Logger logger = LoggerFactory.getLogger(PeopleDAOImpl.class);

    private static String NAME_SPACE = "PeopleDAO.";

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void insert(PeopleDO people) {
        sqlSessionTemplate.insert("cn.dbke.info.dal.dao.PeopleDAO.insertPeople",people);
    }

    public void afterPropertiesSet() throws Exception {
        logger.warn("init PeopleDAOImpl bean");
    }
}
