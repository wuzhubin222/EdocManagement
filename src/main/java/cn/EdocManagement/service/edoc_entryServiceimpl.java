package cn.EdocManagement.service;

import cn.EdocManagement.dao.edoc_entryMapper;
import cn.EdocManagement.pojo.edoc_entry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("edoc_entryService")
public class edoc_entryServiceimpl implements edoc_entryService {
    @Resource
    private edoc_entryMapper edoc_entryMapper;
    @Override
    public List<edoc_entry> queryedoc_entry(Integer categroyid, Integer pageNo, Integer pagesize) {
        return edoc_entryMapper.queryedoc_entry(categroyid,pageNo,pagesize);
    }

    @Override
    public int queryCount(Integer categroyid) {
        return edoc_entryMapper.queryCount(categroyid);
    }

    @Override
    public int deleteedoc_entry(Integer id) {
        return edoc_entryMapper.deleteedoc_entry(id);
    }
}
