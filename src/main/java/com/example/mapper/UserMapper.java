package com.example.mapper;
import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.lang.Integer;

/**
 * create by Rision on 2018/7/3
 */
@Mapper
public interface UserMapper {
   /* @Results(id = "userResult", value = {
            @Result(property = "phone", column = "phone1")
    })*/
    @Select("Select * From USER WHERE USERID=#{userId}")
    public List<User> getUser(int userId);
    //如果是关键字影响了，加~ ~update~
    /*int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //这个方式我自己加的
    List<User> selectAllUser();*/
}
