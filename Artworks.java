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
public class Artworks {
    private int actistid;
    private int artworkid;
    private String image;
    private String title;

    public Artworks() {
    }

    public Artworks(int actistid, int artworkid, String image, String title) {
        this.actistid = actistid;
        this.artworkid = artworkid;
        this.image = image;
        this.title = title;
    }

    public int getActistid() {
        return actistid;
    }

    public void setActistid(int actistid) {
        this.actistid = actistid;
    }

    public int getArtworkid() {
        return artworkid;
    }

    public void setArtworkid(int artworkid) {
        this.artworkid = artworkid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
