package com.ruoyi.project.emmanuel.mto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.project.emmanuel.mto.domain.MtoComment;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IMtoCommentService extends IService<MtoComment> {

    /**
     * 留言板查询导航和侧边栏
     * @param modelMap
     */
    void messageBoard(ModelMap modelMap);

    /**
     * 留言板新增留言
     * @param comment
     * @param request
     * @return
     */
    int insert(MtoComment comment, HttpServletRequest request);

    /**
     * 留言板查询留言
     * @return
     */
   List<MtoComment> selectCommentList();


}
