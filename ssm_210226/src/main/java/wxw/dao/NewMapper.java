package wxw.dao;

import wxw.pojo.New;

public interface NewMapper {
    int deleteByPrimaryKey(String name);

    int insert(New record);

    int insertSelective(New record);

    New selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKey(New record);
}