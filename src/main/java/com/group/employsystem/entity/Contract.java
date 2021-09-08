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
@TableName("t_contract")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "username", type = IdType.ID_WORKER_STR)
    private Integer username;

    private Integer companyId;

    private Integer positionId;

    private Date createTime;


}
