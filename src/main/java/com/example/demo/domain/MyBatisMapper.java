package com.example.demo.domain;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * MyBatisMapper基类.所有实体用mybatis-generator生成对应的entity+xxxMapper.xml文件，dao无需生成，BaseDao已实现了<br/>
 * XxxMapper类手写，继承此类即可。如：
 *
 * <pre>
 *      //@Repository
 *       public class UserMapper extends MyBatisMapper<User, Integer> {
 *           public List<User> getByAge(Integer age) {
 *               return this.sqlSessionTemplate.selectList(super.namespace + "selectByAge", age);
 *           }
 *       }
 * </pre>
 * Created by liujun on 2017-7-14.
 */
public class MyBatisMapper<T extends Serializable, ID extends Serializable> implements BaseMapper<T, ID> {
    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;

    /**
     * 子类实现必须与其对应的xml文件同名，且在同一个包下面。不然namespace路径不正确
     */
    protected final String namespace = this.getClass().getName() + ".";

    private final String _INSERT = namespace + "insert";

    private final String _INSERTSELECTIVE = namespace + "insertSelective";

    private final String _SELECTBYPRIMARYKEY = namespace + "selectByPrimaryKey";

    private final String _UPDATEBYPRIMARYKEY = namespace + "updateByPrimaryKey";

    private final String _UPDATEBYPRIMARYKEYSELECTIVE = namespace + "updateByPrimaryKeySelective";

    private final String _DELETEBYPRIMARYKEY = namespace + "deleteByPrimaryKey";

    @Override
    public int deleteByPrimaryKey(ID id) {
        return this.sqlSessionTemplate.delete(_DELETEBYPRIMARYKEY, id);
    }

    @Override
    public int insert(T record) {
        return this.sqlSessionTemplate.insert(_INSERT, record);
    }

    @Override
    public int insertSelective(T record) {
        return this.sqlSessionTemplate.insert(_INSERTSELECTIVE, record);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return this.sqlSessionTemplate.selectOne(_SELECTBYPRIMARYKEY, id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return this.sqlSessionTemplate.update(_UPDATEBYPRIMARYKEYSELECTIVE, record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return this.sqlSessionTemplate.update(_UPDATEBYPRIMARYKEY, record);
    }
}
