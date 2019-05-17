package cn.EdocManagement.service;

import cn.EdocManagement.pojo.edoc_entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface edoc_entryService {
    public   List<edoc_entry> queryedoc_entry( Integer categroyid, Integer pageNo, Integer pagesize);

    public  int queryCount(Integer categroyid);

    public int deleteedoc_entry( Integer  id);
}
