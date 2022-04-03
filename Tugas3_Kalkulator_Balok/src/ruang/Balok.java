/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.Persegi;

/**
 *
 * @author ridwa
 */
public class Balok extends Persegi implements MenghitungRuang{
    private double tinggi,volume,luaspermukaan;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public Balok(double panjang, double lebar){ //overload
        super(panjang, lebar);
    }
    
    @Override
    public void menghitungVolume() {
        this.volume = this.tinggi*super.getLuas(); //luas = panjang * lebar
    }

    @Override
    public void menghitungLuasPermukaan() {
        this.luaspermukaan = 2*(super.getPanjang()*this.tinggi+super.getPanjang()*super.getLebar()+super.getLebar()*this.tinggi);
    }//rumus luas permukaan = 2*(pt+pl+lt)
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuaspermukaan() {
        return luaspermukaan;
    }
}
