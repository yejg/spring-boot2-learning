package com.battcn.entity;

/**
 * @author yejingang
 * @since 2020-11-05
 */

import java.util.List;

public class Area {

    private Integer id;
    private String name;
    private Integer areaId;
    private Integer parentId;
    private List<Area> subAreas;//子区域列表，用于关联

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Area> getSubAreas() {
        return subAreas;
    }

    public void setSubAreas(List<Area> subAreas) {
        this.subAreas = subAreas;
    }
}
