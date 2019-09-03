package com.example.demoMysql.dao;

import com.example.demoMysql.bean.ParentKind;
import com.example.demoMysql.bean.ParentKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentKindMapper {
    /**
     *  根据指定的条件获取数据库记录数,parent_kind
     *
     * @param example
     */
    long countByExample(ParentKindExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,parent_kind
     *
     * @param example
     */
    int deleteByExample(ParentKindExample example);

    /**
     *  根据主键删除数据库的记录,parent_kind
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,parent_kind
     *
     * @param record
     */
    int insert(ParentKind record);

    /**
     *  动态字段,写入数据库记录,parent_kind
     *
     * @param record
     */
    int insertSelective(ParentKind record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,parent_kind
     *
     * @param example
     */
    List<ParentKind> selectByExample(ParentKindExample example);

    /**
     *  根据指定主键获取一条数据库记录,parent_kind
     *
     * @param id
     */
    ParentKind selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,parent_kind
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ParentKind record, @Param("example") ParentKindExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,parent_kind
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ParentKind record, @Param("example") ParentKindExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,parent_kind
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ParentKind record);

    /**
     *  根据主键来更新符合条件的数据库记录,parent_kind
     *
     * @param record
     */
    int updateByPrimaryKey(ParentKind record);
}