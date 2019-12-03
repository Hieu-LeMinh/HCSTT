/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JComboBox;

/**
 *
 * @author duycv
 */
public class DoiNgonNgu {
    public void doiNgonNgu(JComboBox hesotichcuc, JComboBox hesotrungtinh, JComboBox hesotieucuc, String ngonngu) {
        hesotichcuc.addItem("");
        hesotichcuc.setSelectedItem("");
        hesotrungtinh.addItem("");
        hesotrungtinh.setSelectedItem("");
        hesotieucuc.addItem("");
        hesotieucuc.setSelectedItem("");
        
        if("Tiếng Việt".equals(ngonngu)) {
            hesotichcuc.removeItem("Perfect");
            hesotichcuc.removeItem("Very High");
            hesotichcuc.removeItem("High");
            hesotichcuc.removeItem("A Lightly High");
            hesotichcuc.removeItem("Medium");
            hesotichcuc.removeItem("A Lightly Low");
            hesotichcuc.removeItem("Low");
            hesotichcuc.removeItem("Very Low");
            hesotichcuc.removeItem("None");
            
            hesotrungtinh.removeItem("Perfect");
            hesotrungtinh.removeItem("Very High");
            hesotrungtinh.removeItem("High");
            hesotrungtinh.removeItem("A Lightly High");
            hesotrungtinh.removeItem("Medium");
            hesotrungtinh.removeItem("A Lightly Low");
            hesotrungtinh.removeItem("Low");
            hesotrungtinh.removeItem("Very Low");
            hesotrungtinh.removeItem("None");
            
            hesotieucuc.removeItem("Perfect");
            hesotieucuc.removeItem("Very High");
            hesotieucuc.removeItem("High");
            hesotieucuc.removeItem("A Lightly High");
            hesotieucuc.removeItem("Medium");
            hesotieucuc.removeItem("A Lightly Low");
            hesotieucuc.removeItem("Low");
            hesotieucuc.removeItem("Very Low");
            hesotieucuc.removeItem("None");
            
            //add
            hesotichcuc.addItem("Không");
            hesotichcuc.addItem("Rất thấp");
            hesotichcuc.addItem("Thấp");
            hesotichcuc.addItem("Hơi thấp");
            hesotichcuc.addItem("Trung bình");
            hesotichcuc.addItem("Hơi cao");
            hesotichcuc.addItem("Cao");
            hesotichcuc.addItem("Rất cao");
            hesotichcuc.addItem("Hoàn toàn");
            
            hesotrungtinh.addItem("Không");
            hesotrungtinh.addItem("Rất thấp");
            hesotrungtinh.addItem("Thấp");
            hesotrungtinh.addItem("Hơi thấp");
            hesotrungtinh.addItem("Trung bình");
            hesotrungtinh.addItem("Hơi cao");
            hesotrungtinh.addItem("Cao");
            hesotrungtinh.addItem("Rất cao");
            hesotrungtinh.addItem("Hoàn toàn");
            
            hesotieucuc.addItem("Không");
            hesotieucuc.addItem("Rất thấp");
            hesotieucuc.addItem("Thấp");
            hesotieucuc.addItem("Hơi thấp");
            hesotieucuc.addItem("Trung bình");
            hesotieucuc.addItem("Hơi cao");
            hesotieucuc.addItem("Cao");
            hesotieucuc.addItem("Rất cao");
            hesotieucuc.addItem("Hoàn toàn");
            
            hesotichcuc.setSelectedItem("Không");
            hesotichcuc.removeItem("");
            
            hesotrungtinh.setSelectedItem("Không");
            hesotrungtinh.removeItem("");
            
            hesotieucuc.setSelectedItem("Không");
            hesotieucuc.removeItem("");
        }
        
        if("English".equals(ngonngu)) {
            hesotichcuc.removeItem("Hoàn toàn");
            hesotichcuc.removeItem("Rất cao");
            hesotichcuc.removeItem("Cao");
            hesotichcuc.removeItem("Hơi cao");
            hesotichcuc.removeItem("Trung bình");
            hesotichcuc.removeItem("Hơi thấp");
            hesotichcuc.removeItem("Thấp");
            hesotichcuc.removeItem("Rất thấp");
            hesotichcuc.removeItem("Không");
            
            hesotrungtinh.removeItem("Hoàn toàn");
            hesotrungtinh.removeItem("Rất cao");
            hesotrungtinh.removeItem("Cao");
            hesotrungtinh.removeItem("Hơi cao");
            hesotrungtinh.removeItem("Trung bình");
            hesotrungtinh.removeItem("Hơi thấp");
            hesotrungtinh.removeItem("Thấp");
            hesotrungtinh.removeItem("Rất thấp");
            hesotrungtinh.removeItem("Không");
            
            hesotieucuc.removeItem("Hoàn toàn");
            hesotieucuc.removeItem("Rất cao");
            hesotieucuc.removeItem("Cao");
            hesotieucuc.removeItem("Hơi cao");
            hesotieucuc.removeItem("Trung bình");
            hesotieucuc.removeItem("Hơi thấp");
            hesotieucuc.removeItem("Thấp");
            hesotieucuc.removeItem("Rất thấp");
            hesotieucuc.removeItem("Không");
            
            //add
            hesotichcuc.addItem("None");
            hesotichcuc.addItem("Very Low");
            hesotichcuc.addItem("Low");
            hesotichcuc.addItem("A Lightly Low");
            hesotichcuc.addItem("Medium");
            hesotichcuc.addItem("A Lightly High");
            hesotichcuc.addItem("High");
            hesotichcuc.addItem("Very High");
            hesotichcuc.addItem("Perfect");
            
            hesotrungtinh.addItem("None");
            hesotrungtinh.addItem("Very Low");
            hesotrungtinh.addItem("Low");
            hesotrungtinh.addItem("A Lightly Low");
            hesotrungtinh.addItem("Medium");
            hesotrungtinh.addItem("A Lightly High");
            hesotrungtinh.addItem("High");
            hesotrungtinh.addItem("Very High");
            hesotrungtinh.addItem("Perfect");
            
            hesotieucuc.addItem("None");
            hesotieucuc.addItem("Very Low");
            hesotieucuc.addItem("Low");
            hesotieucuc.addItem("A Lightly Low");
            hesotieucuc.addItem("Medium");
            hesotieucuc.addItem("A Lightly High");
            hesotieucuc.addItem("High");
            hesotieucuc.addItem("Very High");
            hesotieucuc.addItem("Perfect");
            
            hesotichcuc.setSelectedItem("None");
            hesotichcuc.removeItem("");
            
            hesotrungtinh.setSelectedItem("None");
            hesotrungtinh.removeItem("");
            
            hesotieucuc.setSelectedItem("None");
            hesotieucuc.removeItem("");
        }
    }
}
