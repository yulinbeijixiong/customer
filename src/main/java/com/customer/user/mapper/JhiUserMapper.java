package com.customer.user.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.customer.user.entity.JhiUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-01-10
 */
@Mapper
public interface JhiUserMapper extends BaseMapper<JhiUser> {
}
