package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *排行榜：(RankingList)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RankingList")
public class RankingList implements Serializable {

    //RankingList编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ranking_list_id")
    private Integer ranking_list_id;
   // 标题名称
   @Basic
    private String title_name;
   // 发布日期
   @Basic
    private Timestamp release_date;
   // 封面图片
   @Basic
    private String cover_photo_;
   // 排行详情
   @Basic
    private String ranking_details;
   // 备注信息
   @Basic
    private String remark_information;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
