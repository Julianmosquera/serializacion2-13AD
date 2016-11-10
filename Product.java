/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author oracle
 */
public class Product implements Serializable {
    private String cod;
    private String desc;
    private int prezo;

    public Product() {
    }

    public Product(String cod, String descr, int prezo) {
        this.cod = cod;
        this.desc = descr;
        this.prezo = prezo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    

    @Override
    public String toString() {
        String nf;
        return "Cod: " + cod + "\nDescripción: " + desc + "\nPrezo: " + (nf = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(prezo));
    }

}
    

