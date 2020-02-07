# muti-mybatis-datasource
### mybatis动态切换多数据源
SpringBoot整合Mybatis，达到动态切换sql数据源的效果，同时使用自定义注解`@DateSource`做一个aop, 达到控制mybatis 的DAO的不同sql可以选择不同的数据源
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
