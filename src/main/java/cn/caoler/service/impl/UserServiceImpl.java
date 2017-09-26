package cn.caoler.service.impl;

import cn.caoler.dao.UserMapper;
import cn.caoler.model.User;
import cn.caoler.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author Caole
 * CreateDate: 2017/9/26
 * CreateTime: 16:21
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
