/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;

/**
 *
 * @author duycv
 */
public class BenhNhan {
    private String Name = "";
    // [0] => tich cuc, [1] => trung tinh, [2] => tieucuc
    private double nhietdo[] = new double[3];
    private double daudau[] = new double[3];
    private double ho[] = new double[3];
    private double daunguc[] = new double[3];
    private double daubung[] = new double[3];

    public void setDaubung(double[] daubung) {
        this.daubung = daubung;
    }

    public double[] getDaubung() {
        return daubung;
    }

    public String getName() {
        return Name;
    }

    public double[] getNhietdo() {
        return nhietdo;
    }

    public double[] getDaudau() {
        return daudau;
    }

    public double[] getHo() {
        return ho;
    }

    public double[] getDaunguc() {
        return daunguc;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNhietdo(double[] nhietdo) {
        this.nhietdo = nhietdo;
        
    }

    public void setDaudau(double[] daudau) {
        this.daudau = daudau;
    }

    public void setHo(double[] ho) {
        this.ho = ho;
    }

    public void setDaunguc(double[] daunguc) {
        this.daunguc = daunguc;
    }
    
    public void print() {
        System.out.println(Arrays.toString(nhietdo));
        System.out.println(Arrays.toString(daudau));
        System.out.println(Arrays.toString(ho));
        System.out.println(Arrays.toString(daunguc));
        System.out.println(Arrays.toString(daubung));
    }
    
}
