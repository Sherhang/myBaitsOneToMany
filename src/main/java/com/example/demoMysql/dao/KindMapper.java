package com.example.demoMysql.dao;

import com.example.demoMysql.bean.Kind;
import com.example.demoMysql.bean.KindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KindMapper {
    /**
     *  根据指定的条件获取数据库记录数,kind
     *
     * @param example
     */
    long countByExample(KindExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,kind
     *
     * @param example
     */
    int deleteByExample(KindExample example);

    /**
     *  根据主键删除数据库的记录,kind
     *
     * @param kindId
     */
    int deleteByPrimaryKey(Integer kindId);

    /**
     *  新写入数据库记录,kind
     *
     * @param record
     */
    int insert(Kind record);

    /**
     *  动态字段,写入数据库记录,kind
     *
     * @param record
     */
    int insertSelective(Kind record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,kind
     *
     * @param example
     */
    List<Kind> selectByExample(KindExample example);

    /**
     *  根据指定主键获取一条数据库记录,kind
     *
     * @param kindId
     */
    Kind selectByPrimaryKey(Integer kindId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,kind
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Kind record, @Param("example") KindExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,kind
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Kind record, @Param("example") KindExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,kind
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Kind record);

    /**
     *  根据主键来更新符合条件的数据库记录,kind
     *
     * @param record
     */
    int updateByPrimaryKey(Kind record);
}