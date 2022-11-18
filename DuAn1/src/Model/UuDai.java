/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daoqu
 */
public class UuDai {
    private String id;
    private String Ma;
    private int phanTramUuDai;

    public UuDai() {
    }

    public UuDai(String id, String Ma, int phanTramUuDai) {
        this.id = id;
        this.Ma = Ma;
        this.phanTramUuDai = phanTramUuDai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public int getPhanTramUuDai() {
        return phanTramUuDai;
    }

    public void setPhanTramUuDai(int phanTramUuDai) {
        this.phanTramUuDai = phanTramUuDai;
    }
    
}
