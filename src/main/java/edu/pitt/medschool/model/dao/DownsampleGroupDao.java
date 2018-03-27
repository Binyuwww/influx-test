/**
 * 
 */
package edu.pitt.medschool.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.medschool.controller.analysis.vo.DownsampleGroupVO;
import edu.pitt.medschool.model.dto.DownsampleGroup;
import edu.pitt.medschool.model.dto.DownsampleGroupColumn;
import edu.pitt.medschool.model.dto.DownsampleGroupColumnExample;
import edu.pitt.medschool.model.dto.DownsampleGroupExample;
import edu.pitt.medschool.model.mapper.DownsampleGroupColumnMapper;
import edu.pitt.medschool.model.mapper.DownsampleGroupMapper;

/**
 * @author Isolachine
 *
 */
@Repository
public class DownsampleGroupDao {
    @Autowired
    DownsampleGroupMapper downsampleGroupMapper;
    @Autowired
    DownsampleGroupColumnMapper downsampleGroupColumnMapper;

    public int insert(DownsampleGroup group) throws Exception {
        downsampleGroupMapper.insertSelective(group);
        return group.getId();
    }

    public List<DownsampleGroupVO> selectAllDownsampleGroupVO(int queryId) {
        DownsampleGroupExample example = new DownsampleGroupExample();
        example.createCriteria().andQueryIdEqualTo(queryId);
        List<DownsampleGroup> list = downsampleGroupMapper.selectByExample(example);
        List<DownsampleGroupVO> groups = new ArrayList<>();
        for (DownsampleGroup group : list) {
            DownsampleGroupVO vo = new DownsampleGroupVO();
            vo.setGroup(group);
            vo.setQueryId(group.getId());
            DownsampleGroupColumnExample columnExample = new DownsampleGroupColumnExample();
            columnExample.createCriteria().andQueryGroupIdEqualTo(group.getId());
            List<DownsampleGroupColumn> columnList = downsampleGroupColumnMapper.selectByExample(columnExample);
            List<String> columnNames = new ArrayList<>();
            for (DownsampleGroupColumn column : columnList) {
                columnNames.add(column.getColumnName());
            }
            vo.setColumns(columnNames);
            groups.add(vo);
        }
        return groups;
    }
}
