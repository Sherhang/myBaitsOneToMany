package com.example.demoMysql.dao;

import com.example.demoMysql.bean.Tag;
import com.example.demoMysql.bean.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    /**
     *  根据指定的条件获取数据库记录数,tag
     *
     * @param example
     */
    long countByExample(TagExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tag
     *
     * @param example
     */
    int deleteByExample(TagExample example);

    /**
     *  根据主键删除数据库的记录,tag
     *
     * @param tagId
     */
    int deleteByPrimaryKey(Long tagId);

    /**
     *  新写入数据库记录,tag
     *
     * @param record
     */
    int insert(Tag record);

    /**
     *  动态字段,写入数据库记录,tag
     *
     * @param record
     */
    int insertSelective(Tag record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tag
     *
     * @param example
     */
    List<Tag> selectByExample(TagExample example);

    /**
     *  根据指定主键获取一条数据库记录,tag
     *
     * @param tagId
     */
    Tag selectByPrimaryKey(Long tagId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tag
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tag
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tag
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     *  根据主键来更新符合条件的数据库记录,tag
     *
     * @param record
     */
    int updateByPrimaryKey(Tag record);
}