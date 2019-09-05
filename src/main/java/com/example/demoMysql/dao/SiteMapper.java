package com.example.demoMysql.dao;

import com.example.demoMysql.bean.Site;
import com.example.demoMysql.bean.SiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteMapper {
    /**
     *  根据指定的条件获取数据库记录数,site
     *
     * @param example
     */
    long countByExample(SiteExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,site
     *
     * @param example
     */
    int deleteByExample(SiteExample example);

    /**
     *  根据主键删除数据库的记录,site
     *
     * @param siteId
     */
    int deleteByPrimaryKey(Integer siteId);

    /**
     *  新写入数据库记录,site
     *
     * @param record
     */
    int insert(Site record);

    /**
     *  动态字段,写入数据库记录,site
     *
     * @param record
     */
    int insertSelective(Site record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,site
     *
     * @param example
     */
    List<Site> selectByExample(SiteExample example);

    /**
     *  根据指定主键获取一条数据库记录,site
     *
     * @param siteId
     */
    Site selectByPrimaryKey(Integer siteId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,site
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,site
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Site record, @Param("example") SiteExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,site
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Site record);

    /**
     *  根据主键来更新符合条件的数据库记录,site
     *
     * @param record
     */
    int updateByPrimaryKey(Site record);
}