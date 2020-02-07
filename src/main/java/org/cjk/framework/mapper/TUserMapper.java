package org.cjk.framework.mapper;

import org.cjk.framework.datasource.annotation.DataSource;
import org.cjk.framework.model.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TUserMapper {

    @DataSource(dataSourceName = "test-slave")
    List<TUser> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    @DataSource(dataSourceName = "test-master")
    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
