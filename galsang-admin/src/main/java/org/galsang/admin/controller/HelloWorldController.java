package org.galsang.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.galsang.admin.base.dao.AuthUserMapper;
import org.galsang.admin.base.model.AuthUser;
import org.galsang.util.view.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description：Hello World
 * <br /> Author： vimx86
 */
@Slf4j
@RestController
public class HelloWorldController {


    @Autowired
    private AuthUserMapper authUserMapper;


    /**
     * 向世界问好
     *
     * @return
     */
    @ApiOperation(value = "向世界问好", notes = "你好啊，世界！")
    @GetMapping("/hello")
    public ApiResult welcome() {
        return ApiResult.success("你好啊，世界！");
    }

    /**
     * 增加用户
     *
     * @return
     */
    @ApiOperation(value = "增加用户", notes = "增加用户，测试 MyBatis 集成功能")
    @PostMapping("/user")
    public ApiResult addUser(AuthUser authUser) {

        int resultInt = authUserMapper.insertSelective(authUser);

        log.info("resultInt ==== " + resultInt);

        return ApiResult.SUCCESS;
    }

    @ApiOperation(value = "用户列表", notes = "用户列表，测试 MyBatis PageHelper 集成功能")
    @GetMapping("/user")
    public ApiResult getAllUsers() {

        PageHelper.startPage(0, 4, true);
        List<AuthUser> authUserList = authUserMapper.selectAll();

        log.info("authUserList ==== " + authUserList);

        authUserList.forEach(user->{

            log.info("user ==== " + user);

            user.setUsername("用户名称 === " + user.getUsername());

            log.info("user ==== " + user);

        });

        PageInfo pageInfo = new PageInfo(authUserList);

        log.info("pageInfo ==== " + pageInfo);

        //分页时，实际返回的结果list类型是Page<E>，如果想取出分页信息，需要强制转换为Page<E>

        log.info("pageInfo.getList() ==== " + pageInfo.getList());
        log.info("pageInfo.getTotal() ==== " + pageInfo.getTotal());

        return ApiResult.success(pageInfo);
    }


}
