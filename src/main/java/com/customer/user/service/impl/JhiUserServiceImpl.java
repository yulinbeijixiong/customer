package com.customer.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.customer.user.entity.JhiUser;
import com.customer.user.mapper.JhiUserMapper;
import com.customer.user.service.IJhiUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-10
 */
@Service
public class JhiUserServiceImpl extends ServiceImpl<JhiUserMapper, JhiUser> implements IJhiUserService {
}
