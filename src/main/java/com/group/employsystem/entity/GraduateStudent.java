package com.group.employsystem.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ly
 * @since 2021-09-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_graduate_student")
public class GraduateStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableId(value = "username", type = IdType.ID_WORKER_STR)
    private String username;

    /**
     * 推荐id
     */
    private Integer recommentId;

    /**
     * 自荐id
     */
    private Integer selfRecommentId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 毕业院系
     */
    private String edu;

    /**
     * 专业
     */
    private String professionalId;

    /**
     * 户籍
     */
    private String nation;

    /**
     * 电话
     */
    private String phone;

    /**
     * 离校时间
     */
    private Date timeLeaveSchool;

    /**
     * 简历
     */
    private Integer resumeId;

    /**
     * 届数
     */
    private Integer graduateLevel;

    /**
     * 状态
     */
    private Integer status;


}
