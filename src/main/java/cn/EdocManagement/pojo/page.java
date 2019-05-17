package cn.EdocManagement.pojo;

public class page {
    private Integer pageCurrent=1;       //当前页码
    private Integer pageSize;        //每页个数
    private Integer pageCount;      // 总个数
    private Integer getPageCurrentNo;    // 总页码

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
            if(this.pageCount % this.pageSize==0){
                this.getPageCurrentNo = this.pageCount / this.pageSize;
            }else{
                this.getPageCurrentNo =  this.pageCount / this.pageSize + 1;
            }
        }

    }

    public Integer getGetPageCurrentNo() {
        return getPageCurrentNo;
    }

    public void setGetPageCurrentNo(Integer getPageCurrentNo) {
        this.getPageCurrentNo = getPageCurrentNo;
    }
}
