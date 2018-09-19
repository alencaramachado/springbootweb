/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boot.springbootweb.model;

/**
 *
 * @author alencarmachado
 * 
 
  constructor(public id ?: number, public nome ?: string, 
                public end ?: string,public lat ?: string, 
                public lng ?: string, public foto ?: string){}

 
 */
public class Cliente {

    private int id;
    private String nome;
    private String end;
    private String lat;
    private String lng;
    private String foto;

    public Cliente(int id, String nome, String end, String lat, String lng, String foto) {
        this.id = id;
        this.nome = nome;
        this.end = end;
        this.lat = lat;
        this.lng = lng;
        this.foto = foto;
    }

    
    public Cliente(){
        
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the end
     */
    public String getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return the lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return the lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng the lng to set
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
}
