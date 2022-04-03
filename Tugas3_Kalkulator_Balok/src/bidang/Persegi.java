/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author ridwa
 */
public class Persegi implements MenghitungBidang{
    private double panjang,lebar,luas,keliling;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public Persegi(){
        
    }
    
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void menghitungLuas() {
        this.luas = this.panjang*this.lebar; 
    }

    @Override
    public void menghitungKeliling() {
        this.keliling = 2*(this.panjang+this.lebar); 
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
