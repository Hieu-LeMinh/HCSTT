/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author duycv
 */
public class DaiSoGiaTu {
    public double chuyenchuthanhso(String str) {
        double tmp = 0;
        if("None".equals(str) || "Không".equals(str)) {
            tmp = 0;
        } else if("Very Low".equals(str) || "Rất thấp".equals(str)) {
            tmp = 0.125;
        } else if("Low".equals(str) || "Thấp".equals(str)) {
            tmp = 0.25;
        } else if("A Lightly Low".equals(str) || "Hơi thấp".equals(str)) {
            tmp = 0.375;
        } else if("Medium".equals(str) || "Trung bình".equals(str)) {
            tmp = 0.5;
        } else if("A Lightly High".equals(str) || "Hơi cao".equals(str)) {
            tmp = 0.625;
        } else if ("High".equals(str) || "Cao".equals(str)) {
            tmp = 0.75;
        } else if("Very High".equals(str) || "Rất cao".equals(str)) {
            tmp = 0.875;
        } else if("Perfect".equals(str) || "Hoàn toàn".equals(str)) {
            tmp = 1;
        }
        return tmp;
    }  
}
