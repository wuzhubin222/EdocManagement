package cn.EdocManagement.pojo;

import java.util.Date;

public class edoc_entry {
    private  Integer id;
    private  Integer categroyid;
    private  String title;
    private  String summary;
    private  String uploaduser;
    private Date cretedate;
    private  edoc_category edoc_category;

    public cn.EdocManagement.pojo.edoc_category getEdoc_category() {
        return edoc_category;
    }

    public void setEdoc_category(cn.EdocManagement.pojo.edoc_category edoc_category) {
        this.edoc_category = edoc_category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategroyid() {
        return categroyid;
    }

    public void setCategroyid(Integer categroyid) {
        this.categroyid = categroyid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUploaduser() {
        return uploaduser;
    }

    public void setUploaduser(String uploaduser) {
        this.uploaduser = uploaduser;
    }

    public Date getCretedate() {
        return cretedate;
    }

    public void setCretedate(Date cretedate) {
        this.cretedate = cretedate;
    }
}
