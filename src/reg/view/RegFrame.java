package reg.view;

import javax.swing.JFrame;

import reg.controller.RegController;


public class RegFrame extends JFrame
{
	private RegController baseController;
	private RegPanel basePanel;
	
	public RegFrame(RegController baseController)
	{
		this.baseController = baseController;
		basePanel = new RegPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	
}
