package com.example.cookwithus.pojo.input;

public class LessonInput {
    private String name;
    private String category;

    public LessonInput() {
    }

    public LessonInput(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
