package demo;

import javax.swing.JComboBox;

/**
 *
 * @author duycv
 */
public class Reset {
        public void reset(JComboBox hesotichcuc, JComboBox hesotrungtinh, JComboBox hesotieucuc, String ngonngu) {
        if (ngonngu == "English") {    
            hesotichcuc.setSelectedItem("None");
            hesotrungtinh.setSelectedItem("None");
            hesotieucuc.setSelectedItem("None");
        
            hesotrungtinh.removeItem("Perfect");
            hesotrungtinh.removeItem("Very High");
            hesotrungtinh.removeItem("High");
            hesotrungtinh.removeItem("A Lightly High");
            hesotrungtinh.removeItem("Medium");
            hesotrungtinh.removeItem("A Lightly Low");
            hesotrungtinh.removeItem("Low");
            hesotrungtinh.removeItem("Very Low");
            hesotrungtinh.addItem("Very Low");
            hesotrungtinh.addItem("Low");
            hesotrungtinh.addItem("A Lightly Low");
            hesotrungtinh.addItem("Medium");
            hesotrungtinh.addItem("A Lightly High");
            hesotrungtinh.addItem("High");
            hesotrungtinh.addItem("Very High");
            hesotrungtinh.addItem("Perfect");
            
            hesotieucuc.removeItem("Perfect");
            hesotieucuc.removeItem("Very High");
            hesotieucuc.removeItem("High");
            hesotieucuc.removeItem("A Lightly High");
            hesotieucuc.removeItem("Medium");
            hesotieucuc.removeItem("A Lightly Low");
            hesotieucuc.removeItem("Low");
            hesotieucuc.removeItem("Very Low");
            hesotieucuc.addItem("Very Low");
            hesotieucuc.addItem("Low");
            hesotieucuc.addItem("A Lightly Low");
            hesotieucuc.addItem("Medium");
            hesotieucuc.addItem("A Lightly High");
            hesotieucuc.addItem("High");
            hesotieucuc.addItem("Very High");
            hesotieucuc.addItem("Perfect");
        }
        
        if (ngonngu == "Tiếng Việt") {  
            hesotichcuc.setSelectedItem("Không");
            hesotrungtinh.setSelectedItem("Không");
            hesotieucuc.setSelectedItem("Không");
        
            hesotrungtinh.removeItem("Hoàn toàn");
            hesotrungtinh.removeItem("Rất cao");
            hesotrungtinh.removeItem("Cao");
            hesotrungtinh.removeItem("Hơi cao");
            hesotrungtinh.removeItem("Trung bình");
            hesotrungtinh.removeItem("Hơi thấp");
            hesotrungtinh.removeItem("Thấp");
            hesotrungtinh.removeItem("Rất thấp");
            hesotrungtinh.addItem("Rất thấp");
            hesotrungtinh.addItem("Thấp");
            hesotrungtinh.addItem("Hơi thấp");
            hesotrungtinh.addItem("Trung bình");
            hesotrungtinh.addItem("Hơi cao");
            hesotrungtinh.addItem("Cao");
            hesotrungtinh.addItem("Rất cao");
            hesotrungtinh.addItem("Hoàn toàn");
            
            hesotieucuc.removeItem("Hoàn toàn");
            hesotieucuc.removeItem("Rất cao");
            hesotieucuc.removeItem("Cao");
            hesotieucuc.removeItem("Hơi cao");
            hesotieucuc.removeItem("Trung bình");
            hesotieucuc.removeItem("Hơi thấp");
            hesotieucuc.removeItem("Thấp");
            hesotieucuc.removeItem("Rất thấp");
            hesotieucuc.addItem("Rất thấp");
            hesotieucuc.addItem("Thấp");
            hesotieucuc.addItem("Hơi thấp");
            hesotieucuc.addItem("Trung bình");
            hesotieucuc.addItem("Hơi cao");
            hesotieucuc.addItem("Cao");
            hesotieucuc.addItem("Rất cao");
            hesotieucuc.addItem("Hoàn toàn");
        }
    }
}
