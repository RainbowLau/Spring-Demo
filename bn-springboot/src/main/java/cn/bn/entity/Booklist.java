package cn.bn.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * (Booklist)实体类
 *
 * @author makejava
 * @since 2020-08-12 16:42:27
 */

@ToString
@Entity
@Table(name = "booklist")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Booklist implements Serializable {
    private static final long serialVersionUID = -57506832465301249L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    private String name;
    
    private String author;
    
    private String serialstatus;
    
    private String serialnumber;
    
    private String category;
    
    private String nameId;
    
    private String novelurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSerialstatus() {
        return serialstatus;
    }

    public void setSerialstatus(String serialstatus) {
        this.serialstatus = serialstatus;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getNovelurl() {
        return novelurl;
    }

    public void setNovelurl(String novelurl) {
        this.novelurl = novelurl;
    }

}