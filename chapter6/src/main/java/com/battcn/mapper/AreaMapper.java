package com.battcn.mapper;

import com.battcn.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yejingang
 * @since 2020-11-05
 */
@Mapper
public interface AreaMapper {

    List<Area> queryCity(int cityNum);

    List<Area> queryAllCity();

    List<Area> queryCityByParentId(int area_id);

    List<Area> queryAllCityV2();

}
