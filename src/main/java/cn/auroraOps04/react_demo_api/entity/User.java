package cn.auroraOps04.react_demo_api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author AuroraOps04
 * @date 2021/8/30 20:27:32
 * @description 用户实体类
 */

@ApiModel(value = "用户 api", description = "存放着用户信息")
@TableName("user")
public class User extends BaseEntity {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "用户主键")
    protected Long id;
    @ApiModelProperty(value = "用户名")
    protected String name;
    @ApiModelProperty(value = "用户密码")
    protected String password;
    @ApiModelProperty(value = "用户性别(M: 男, F: 女)")
    protected Character sex;
    @ApiModelProperty(value = "用户邮箱地址")
    protected String email;
    @ApiModelProperty(value = "用户手机号码")
    protected String phone;
    @ApiModelProperty(value = "用户博客地址")
    protected String blog;
    @ApiModelProperty(value = "用户个人说明")
    protected String motto;
    @ApiModelProperty(value = "用户github地址")
    protected String github;
    @ApiModelProperty(value = "用户qq账号")
    protected String qq;
    @ApiModelProperty(value = "用户头像访问地址")
    protected String avatar;
    @ApiModelProperty(value = "用户上次登录IP")
    protected String lastLoginIp;
    @ApiModelProperty(value = "用户上次登录时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected String lastLoginTime;
    @ApiModelProperty(value = "用户状态")
    protected Integer status;

    public User() {
    }

    public User(Date createAt, Date updateAt, Long createBy, Long updateBy, Long id, String name, String password, Character sex, String email, String phone, String blog, String motto, String github, String qq, String avatar, String lastLoginIp, String lastLoginTime, Integer status) {
        super(createAt, updateAt, createBy, updateBy);
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.blog = blog;
        this.motto = motto;
        this.github = github;
        this.qq = qq;
        this.avatar = avatar;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy=" + createBy +
                ", updateBy=" + updateBy +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", blog='" + blog + '\'' +
                ", motto='" + motto + '\'' +
                ", github='" + github + '\'' +
                ", qq='" + qq + '\'' +
                ", avatar='" + avatar + '\'' +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
