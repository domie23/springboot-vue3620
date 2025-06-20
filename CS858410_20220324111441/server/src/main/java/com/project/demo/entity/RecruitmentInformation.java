package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *招聘信息：(RecruitmentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RecruitmentInformation")
public class RecruitmentInformation implements Serializable {

    //RecruitmentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruitment_information_id")
    private Integer recruitment_information_id;
   // 标题名称
   @Basic
    private String title_name;
   // 公司名称
   @Basic
    private String corporate_name;
   // 招聘职位
   @Basic
    private String recruitment_position;
   // 职位分类
   @Basic
    private String job_classification;
   // 招聘分类
   @Basic
    private String recruitment_classification;
   // 招聘人数
   @Basic
    private String number_of_recruits;
   // 职位待遇
   @Basic
    private String position_treatment;
   // 招聘要求
   @Basic
    private String recruitment_requirements;
   // 工作时间
   @Basic
    private String working_hours;
   // 发布人
   @Basic
    private Integer publisher;
   // 发布日期
   @Basic
    private Timestamp release_date;
   // 封面图片
   @Basic
    private String cover_photo_;
   // 职位描述
   @Basic
    private String job_description;
   // 公司地址
   @Basic
    private String company_address;
   // 公司简介
   @Basic
    private String company_profile;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
