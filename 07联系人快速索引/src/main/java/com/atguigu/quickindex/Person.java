package com.atguigu.quickindex;

/**
 * 作者：杨光福 on 2016/5/18 11:25
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：姓名：阿福
 *      拼音：AFU
 */
public class Person {

    private String name;

    private String pinyin;

    public Person(String name){
        this.name = name;
        this.pinyin = PinYinUtils.getPinYin(name);
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }
}
