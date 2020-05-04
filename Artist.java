/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Harry
 */
public class Artist {
    private int    id;
    private String surname;
    private String firstname;
    private String nationality;
    private String biography;
    private String photo;
    private int    birthYear;

    public Artist() {
    }

    public Artist(int id, String surname, String firstname, String nationality, int birthYear) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.nationality = nationality;
        this.birthYear = birthYear;
    }

    public Artist(int id, String surname, String firstname, String biography, String photo) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.biography = biography;
        this.photo = photo;
    }

    

    

    
    public Artist(int id, String surname, String firstname, String nationality, String biography, String photo, int birthYear) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.nationality = nationality;
        this.biography = biography;
        this.photo = photo;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    

   
    
    

}