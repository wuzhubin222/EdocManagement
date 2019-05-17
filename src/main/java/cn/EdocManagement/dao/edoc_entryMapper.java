package cn.EdocManagement.dao;

import cn.EdocManagement.pojo.edoc_entry;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface edoc_entryMapper {
    List<edoc_entry> queryedoc_entry(@Param("categroyid") Integer categroyid,@Param("pageNo") Integer pageNo,@Param("pagesize") Integer pagesize);

    int queryCount(@Param("categroyid") Integer categroyid);

    int deleteedoc_entry(@Param("id") Integer  id);
}
