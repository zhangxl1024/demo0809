package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhangxlstart
 * @create 2021-07-28 17:07
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();

}
