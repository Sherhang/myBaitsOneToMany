package com.example.demoMysql.dao;

import com.example.demoMysql.bean.BroadKind;
import com.example.demoMysql.bean.BroadKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BroadKindMapper {
    /**
     *  根据指定的条件获取数据库记录数,broad_kind
     *
     * @param example
     */
    long countByExample(BroadKindExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,broad_kind
     *
     * @param example
     */
    int deleteByExample(BroadKindExample example);

    /**
     *  根据主键删除数据库的记录,broad_kind
     *
     * @param broadKindId
     */
    int deleteByPrimaryKey(Integer broadKindId);

    /**
     *  新写入数据库记录,broad_kind
     *
     * @param record
     */
    int insert(BroadKind record);

    /**
     *  动态字段,写入数据库记录,broad_kind
     *
     * @param record
     */
    int insertSelective(BroadKind record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,broad_kind
     *
     * @param example
     */
    List<BroadKind> selectByExample(BroadKindExample example);

    /**
     *  根据指定主键获取一条数据库记录,broad_kind
     *
     * @param broadKindId
     */
    BroadKind selectByPrimaryKey(Integer broadKindId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,broad_kind
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") BroadKind record, @Param("example") BroadKindExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,broad_kind
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") BroadKind record, @Param("example") BroadKindExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,broad_kind
     *
     * @param record
     */
    int updateByPrimaryKeySelective(BroadKind record);

    /**
     *  根据主键来更新符合条件的数据库记录,broad_kind
     *
     * @param record
     */
    int updateByPrimaryKey(BroadKind record);
}