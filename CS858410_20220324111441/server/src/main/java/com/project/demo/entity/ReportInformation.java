package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *举报信息：(ReportInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReportInformation")
public class ReportInformation implements Serializable {

    //ReportInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_information_id")
    private Integer report_information_id;
   // 公司名称
   @Basic
    private String corporate_name;
   // 招聘职位
   @Basic
    private String recruitment_position;
   // 用户信息
   @Basic
    private Integer user_information;
   // 审核状态
   @Basic
    private String audit_status;
   // 举报内容
   @Basic
    private String report_content;
   // 举报回复
   @Basic
    private String report_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
