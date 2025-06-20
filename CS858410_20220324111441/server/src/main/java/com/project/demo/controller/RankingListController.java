package com.project.demo.controller;

import com.project.demo.entity.RankingList;
import com.project.demo.service.RankingListService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *排行榜：(RankingList)表控制层
 *
 */
@RestController
@RequestMapping("/ranking_list")
public class RankingListController extends BaseController<RankingList,RankingListService> {

    /**
     *排行榜对象
     */
    @Autowired
    public RankingListController(RankingListService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
