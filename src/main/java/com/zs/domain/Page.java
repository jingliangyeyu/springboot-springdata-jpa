package com.zs.domain;

import javax.persistence.*;

/**
 * @author zhouson
 * @create 2019-07-12 10:08
 */
@Entity
@Table(name="Page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id")
    private long id;
    @Column(name = "page_post")
    private String post;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_page_id",referencedColumnName = "user_id")
    private User user;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", post='" + post + '\'' +
                '}';
    }
}
