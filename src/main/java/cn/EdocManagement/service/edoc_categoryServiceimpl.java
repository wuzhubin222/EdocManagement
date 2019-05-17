package cn.EdocManagement.service;

import cn.EdocManagement.dao.edoc_categoryMapper;
import cn.EdocManagement.pojo.edoc_category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("edoc_categoryService")
public class edoc_categoryServiceimpl implements edoc_categoryService {
    @Resource
    private edoc_categoryMapper categoryMapper;
    @Override
    public List<edoc_category> CountEdoc_category() {
        return categoryMapper.CountEdoc_category();
    }
}
