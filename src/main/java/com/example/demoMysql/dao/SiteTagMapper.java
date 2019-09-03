package com.example.demoMysql.dao;

import com.example.demoMysql.bean.SiteTag;
import com.example.demoMysql.bean.SiteTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteTagMapper {
    /**
     *  根据指定的条件获取数据库记录数,site_tag
     *
     * @param example
     */
    long countByExample(SiteTagExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,site_tag
     *
     * @param example
     */
    int deleteByExample(SiteTagExample example);

    /**
     *  新写入数据库记录,site_tag
     *
     * @param record
     */
    int insert(SiteTag record);

    /**
     *  动态字段,写入数据库记录,site_tag
     *
     * @param record
     */
    int insertSelective(SiteTag record);

    /**
     * ,site_tag
     *
     * @param example
     */
    List<SiteTag> selectByExampleWithBLOBs(SiteTagExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,site_tag
     *
     * @param example
     */
    List<SiteTag> selectByExample(SiteTagExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,site_tag
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") SiteTag record, @Param("example") SiteTagExample example);

    /**
     * ,site_tag
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") SiteTag record, @Param("example") SiteTagExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,site_tag
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") SiteTag record, @Param("example") SiteTagExample example);
}