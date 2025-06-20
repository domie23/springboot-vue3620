package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *简历信息：(ResumeInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ResumeInformation")
public class ResumeInformation implements Serializable {

    //ResumeInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_information_id")
    private Integer resume_information_id;
   // 用户信息
   @Basic
    private Integer user_information;
   // 姓名
   @Basic
    private String full_name;
   // 性别
   @Basic
    private String gender;
   // 个人照片
   @Basic
    private String personal_photos;
   // 联系电话
   @Basic
    private String contact_number;
   // 求职分类
   @Basic
    private String job_classification;
   // 求职意向
   @Basic
    private String job_intention;
   // 工作经历
   @Basic
    private String work_experience;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
