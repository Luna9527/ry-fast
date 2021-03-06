package com.ruoyi.project.emmanuel.memorial.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.emmanuel.memorial.domain.BoardNote;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface IBoardNoteService extends IService<BoardNote> {

    /**
     * 查询随手记列表
     */
    List<BoardNote> selectBoardNoteList(BoardNote boardNote);

    /**
     * 新增保存随手记
     */
    int insertBoardNote(BoardNote boardNote);

    /**
     * 根据id查询随手记
     *
     * @param id 随手记id
     * @return
     */
    BoardNote selectBoardNoteById(Long id);

    /**
     * 修改随手记
     *
     * @param boardNote
     * @return
     */
    int updateBoardNote(BoardNote boardNote);

    /**
     * 删除随手记
     *
     * @param ids
     * @return
     */
    int deleteBoardNoteByIds(String ids);

    /**
     * 获取动态数据
     *
     * @param pageNum  当前页
     * @param pageSize 页大小
     * @param modelMap
     * @return
     */
    TableDataInfo dynamicList(Long pageNum, Long pageSize, ModelMap modelMap);
}
