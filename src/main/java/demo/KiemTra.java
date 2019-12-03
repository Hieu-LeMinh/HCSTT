package demo;

import javax.swing.JComboBox;

/**
 *
 * @author duycv
 */
public class KiemTra {
       
    public void kiemtrahesotrungtinhvatieucuc(JComboBox hesotichcuc, JComboBox hesotrungtinh, JComboBox hesotieucuc, String ngonngu) {
        DaiSoGiaTu daisogiatu = new DaiSoGiaTu();
        double tmp = daisogiatu.chuyenchuthanhso(hesotichcuc.getSelectedItem().toString());
        
        if(ngonngu == "English") {
            if (1 - tmp == 0.875) {
                hesotrungtinh.removeItem("Perfect");
            }

            if (1 - tmp == 0.75) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
            }

            if (1 - tmp == 0.625) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");

            }

            if (1 - tmp == 0.5) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");
                hesotrungtinh.removeItem("A Lightly High");
            }

            if (1 - tmp == 0.375) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");
                hesotrungtinh.removeItem("A Lightly High");
                hesotrungtinh.removeItem("Medium");
            }

            if (1 - tmp == 0.25) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");
                hesotrungtinh.removeItem("A Lightly High");
                hesotrungtinh.removeItem("Medium");
                hesotrungtinh.removeItem("A Lightly Low");
            }

            if (1 - tmp == 0.125) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");
                hesotrungtinh.removeItem("A Lightly High");
                hesotrungtinh.removeItem("Medium");
                hesotrungtinh.removeItem("A Lightly Low");
                hesotrungtinh.removeItem("Low");
            }

            if (1 - tmp == 0) {
                hesotrungtinh.removeItem("Perfect");
                hesotrungtinh.removeItem("Very High");
                hesotrungtinh.removeItem("High");
                hesotrungtinh.removeItem("A Lightly High");
                hesotrungtinh.removeItem("Medium");
                hesotrungtinh.removeItem("A Lightly Low");
                hesotrungtinh.removeItem("Low");
                hesotrungtinh.removeItem("Very Low");
            }
        }
        
        if(ngonngu == "Tiếng Việt") {
            			if (1 - tmp == 0.875) {
                hesotrungtinh.removeItem("Hoàn toàn");
            }

            if (1 - tmp == 0.75) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
            }

            if (1 - tmp == 0.625) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");

            }

            if (1 - tmp == 0.5) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");
                hesotrungtinh.removeItem("Hơi cao");
            }

            if (1 - tmp == 0.375) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");
                hesotrungtinh.removeItem("Hơi cao");
                hesotrungtinh.removeItem("Trung bình");
            }

            if (1 - tmp == 0.25) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");
                hesotrungtinh.removeItem("Hơi cao");
                hesotrungtinh.removeItem("Trung bình");
                hesotrungtinh.removeItem("Hơi thấp");
            }

            if (1 - tmp == 0.125) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");
                hesotrungtinh.removeItem("Hơi cao");
                hesotrungtinh.removeItem("Trung bình");
                hesotrungtinh.removeItem("Hơi thấp");
                hesotrungtinh.removeItem("Thấp");
            }

            if (1 - tmp == 0) {
                hesotrungtinh.removeItem("Hoàn toàn");
                hesotrungtinh.removeItem("Rất cao");
                hesotrungtinh.removeItem("Cao");
                hesotrungtinh.removeItem("Hơi cao");
                hesotrungtinh.removeItem("Trung bình");
                hesotrungtinh.removeItem("Hơi thấp");
                hesotrungtinh.removeItem("Thấp");
                hesotrungtinh.removeItem("Rất thấp");
            }
        }
        
        
        
    }
    
    public void kiemtrahesotieucuc(JComboBox hesotichcuc, JComboBox hesotrungtinh, JComboBox hesotieucuc, String ngonngu) {
            DaiSoGiaTu daisogiatu = new DaiSoGiaTu();
            double tmp = daisogiatu.chuyenchuthanhso(hesotichcuc.getSelectedItem().toString());
            double tmp1 = daisogiatu.chuyenchuthanhso(hesotrungtinh.getSelectedItem().toString());
            
            if(ngonngu == "English") {
            if (1 - tmp - tmp1 == 0.875) {
            hesotieucuc.removeItem("Perfect");
            }

            if (1 - tmp - tmp1  == 0.75) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
            }

            if (1 - tmp - tmp1  == 0.625) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");

            }

            if (1 - tmp - tmp1  == 0.5) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");
                hesotieucuc.removeItem("A Lightly High");
            }

            if (1 - tmp - tmp1  == 0.375) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");
                hesotieucuc.removeItem("A Lightly High");
                hesotieucuc.removeItem("Medium");
            }

            if (1 - tmp - tmp1  == 0.25) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");
                hesotieucuc.removeItem("A Lightly High");
                hesotieucuc.removeItem("Medium");
                hesotieucuc.removeItem("A Lightly Low");
            }

            if (1 - tmp - tmp1  == 0.125) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");
                hesotieucuc.removeItem("A Lightly High");
                hesotieucuc.removeItem("Medium");
                hesotieucuc.removeItem("A Lightly Low");
                hesotieucuc.removeItem("Low");
            }

            if (1 - tmp - tmp1  == 0) {
                hesotieucuc.removeItem("Perfect");
                hesotieucuc.removeItem("Very High");
                hesotieucuc.removeItem("High");
                hesotieucuc.removeItem("A Lightly High");
                hesotieucuc.removeItem("Medium");
                hesotieucuc.removeItem("A Lightly Low");
                hesotieucuc.removeItem("Low");
                hesotieucuc.removeItem("Very Low");
            }
            }
            
            if(ngonngu == "Tiếng Việt") {
                if (1 - tmp - tmp1 == 0.875) {
            hesotieucuc.removeItem("Hoàn toàn");
            }

            if (1 - tmp - tmp1  == 0.75) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
            }

            if (1 - tmp - tmp1  == 0.625) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");

            }

            if (1 - tmp - tmp1  == 0.5) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
            }

            if (1 - tmp - tmp1  == 0.375) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
            }

            if (1 - tmp - tmp1  == 0.25) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
            }

            if (1 - tmp - tmp1  == 0.125) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
                hesotieucuc.removeItem("Thấp");
            }

            if (1 - tmp - tmp1  == 0) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
                hesotieucuc.removeItem("Thấp");
                hesotieucuc.removeItem("Rất thấp");
            }
            }
            
            if(ngonngu == "Vietnamese") {
                if (1 - tmp - tmp1 == 0.875) {
            hesotieucuc.removeItem("Hoàn toàn");
            }

            if (1 - tmp - tmp1  == 0.75) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
            }

            if (1 - tmp - tmp1  == 0.625) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");

            }

            if (1 - tmp - tmp1  == 0.5) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
            }

            if (1 - tmp - tmp1  == 0.375) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
            }

            if (1 - tmp - tmp1  == 0.25) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
            }

            if (1 - tmp - tmp1  == 0.125) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
                hesotieucuc.removeItem("Thấp");
            }

            if (1 - tmp - tmp1  == 0) {
                hesotieucuc.removeItem("Hoàn toàn");
                hesotieucuc.removeItem("Rất cao");
                hesotieucuc.removeItem("Cao");
                hesotieucuc.removeItem("Hơi cao");
                hesotieucuc.removeItem("Trung bình");
                hesotieucuc.removeItem("Hơi thấp");
                hesotieucuc.removeItem("Thấp");
                hesotieucuc.removeItem("Rất thấp");
            }
            }
        }
}
