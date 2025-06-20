package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *投递记录：(DeliveryRecord)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DeliveryRecord")
public class DeliveryRecord implements Serializable {

    //DeliveryRecord编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_record_id")
    private Integer delivery_record_id;
   // 公司名称
   @Basic
    private String corporate_name;
   // 招聘职位
   @Basic
    private String recruitment_position;
   // 招聘分类
   @Basic
    private String recruitment_classification;
   // 招聘人数
   @Basic
    private String number_of_recruits;
   // 发布人
   @Basic
    private Integer publisher;
   // 用户信息
   @Basic
    private Integer user_information;
   // 联系电话
   @Basic
    private String contact_number;
   // 简历文件
   @Basic
    private String resume_file;
   // 简历状态
   @Basic
    private String resume_status;
   // 回复信息
   @Basic
    private String reply_message;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
