package com.example.modul_mp_8;

public class Person {
    private int photoId;
    private String name;
    private String description;

    public Person(int photoId, String name, String description) {
        this.photoId = photoId;
        this.name = name;
        this.description = description;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}