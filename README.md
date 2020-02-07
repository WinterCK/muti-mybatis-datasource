# muti-mybatis-datasource
mybatis动态切换多数据源
使用注解来控制mybatis 的DAO的每个sql可以选择不同的数据源
如下：
```
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
```
