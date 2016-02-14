package com.lisun.spring.beans;

/**
 * Created by alekseylisun.
 *
 * @since 28.01.16
 */

public class SimpleContainer {

    private  String name;
    private  int age;
    private  String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public SimpleContainer(Builder builder) {
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
    }

    public static final class Builder {
        private String name;
        private int age;
        private String sex;

        public Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withAge(int val) {
            age = val;
            return this;
        }

        public Builder withSex(String val) {
            sex = val;
            return this;
        }

        public SimpleContainer build() {
            return new SimpleContainer(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

}
