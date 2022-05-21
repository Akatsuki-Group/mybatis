package org.example.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author tina
 */
public interface OrderMapper {
    /**
     * 测试方法
     */
    @Select("select 'order'")
    String selectById();
}
