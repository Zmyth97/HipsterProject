package ctec.hipster.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album Label here");
		hipsterImage = new JLabel ("Harley Selfie", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster.......")));
		hipsterImage.setVerticalAlignment(SwingConstants.BOTTOM);
		albumBox = newJComboBox();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseCOntroller.getselfHipster().getHipsterAlbums()));
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setSize(1000,300);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}

	private void setupLayout()
	{
	  //baselayout stuff here
	}
	
	private void setupListeners()
	{
		
	}

}
}
