package com.yy.offline.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description="用户的实体对象")
public class User {

    /**
     *id
     */
    @ApiModelProperty(value="用户id",name="id",required=true)
    private String id;

    /**
     *名字
     */
    @ApiModelProperty(value="用户名",name="name",required=true)
    private String name;

    /**
     *年龄
     */
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
