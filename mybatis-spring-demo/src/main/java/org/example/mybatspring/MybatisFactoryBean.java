package org.example.mybatspring;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author tina
 */
public class MybatisFactoryBean implements FactoryBean {
    private Class<?> mapperClass;

    private SqlSession sqlSession;

    public MybatisFactoryBean(Class<?> mapperClass) {
        this.mapperClass = mapperClass;
    }

//    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        //sqlSessionFactory.getConfiguration().addMapper(mapperClass);
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {
        return sqlSession.getMapper(mapperClass);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperClass;
    }
}
