package cn.EdocManagement.controller;


import cn.EdocManagement.pojo.edoc_category;
import cn.EdocManagement.pojo.edoc_entry;
import cn.EdocManagement.pojo.page;
import cn.EdocManagement.service.edoc_categoryService;
import cn.EdocManagement.service.edoc_entryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/edoc")
public class edoc_categoryController {
    @Resource
    private edoc_categoryService edoc_categoryService;
    @Resource
    private edoc_entryService edoc_entryService;

    @RequestMapping("/list")
    public String queryPageedoc_category(@RequestParam(value = "categroyid",required = false) Integer categroyid,
                                         @RequestParam(value = "currPageNo",required = false) Integer currPageNo,
                                         Model model){
        if(categroyid!=null){
            model.addAttribute("categroyids",categroyid);
        }
        Integer count = edoc_entryService.queryCount(categroyid);   //总个数
        if(currPageNo ==null || currPageNo <= 0){
            currPageNo=1;
        }
        page ps = new page();
        ps.setPageSize(2);
        ps.setPageCurrent(currPageNo);
        ps.setPageCount(count);
        if(currPageNo > ps.getGetPageCurrentNo()){
            currPageNo = ps.getGetPageCurrentNo() ;
        }
        currPageNo=(currPageNo-1)*ps.getPageSize();
         List<edoc_entry> list= edoc_entryService.queryedoc_entry(categroyid,currPageNo,ps.getPageSize());
         List<edoc_category> list2=edoc_categoryService.CountEdoc_category();
        model.addAttribute("page",ps);
        model.addAttribute("list",list);
        model.addAttribute("list2",list2);
        return  "/index";
    }
    @RequestMapping("/del")
    public String del(@RequestParam(value = "id",required = false) Integer id){
        Integer sss =  edoc_entryService.deleteedoc_entry(id);
        if(sss>0){
            return "redirect:/edoc/list";
        }else {
            return "index";
        }
    }

    public  void aa(){
        System.out.print("你是猪吗？");
    }
}

