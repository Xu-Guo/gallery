package com.xuguo.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_production")
public class Production {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 200)
    private String name;

    @Column(length = 500)
    private String title;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(length = 500)
    private String imageName;

    @Column
    private String type;

    private Long createTime;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
