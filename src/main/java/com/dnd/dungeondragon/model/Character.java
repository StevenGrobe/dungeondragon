package com.dnd.dungeondragon.model;

public class Character {
    private int id;
    private String nom;
    private String job;


    public Character() {
    }

    public Character(int id, String nom, String job) {
        this.id = id;
        this.nom = nom;
        this.job = job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
