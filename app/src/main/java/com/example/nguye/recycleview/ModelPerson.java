package com.example.nguye.recycleview;

public class ModelPerson {
    private String name,image,add;
    private int age;

    public ModelPerson(String name, String image, String add, int age) {
        this.name = name;
        this.image = image;
        this.add = add;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
