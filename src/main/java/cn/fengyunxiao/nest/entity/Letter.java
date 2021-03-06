package cn.fengyunxiao.nest.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Letter implements Serializable {
    private Integer lid;
    private Integer zan;
    private String nickname;
    private String content;
    private String ip;
    private String email;
    private Timestamp pubtime;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public Timestamp getPubtime() {
        return pubtime;
    }

    public void setPubtime(Timestamp pubtime) {
        this.pubtime = pubtime;
    }

}
