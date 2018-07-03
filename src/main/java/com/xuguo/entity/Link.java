package com.xuguo.entity;

import javax.persistence.*;

@Entity
@Table(name="t_link")
public class Link {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 500)
    private String name;

    @Column(length = 500)
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    private Integer priority;

}
