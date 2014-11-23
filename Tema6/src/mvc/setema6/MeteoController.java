package mvc.setema6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeteoController {

	private MeteoView theView;
	private MeteoModel theModel;

	public MeteoController(MeteoView theView, MeteoModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		this.theView.addRefreshLsitener(new RefreshListener());

	}

	class RefreshListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			theModel.generateValues();
			theView.setTemperatureTextField(theModel
					.getTemperatureRefreshValue());
			theView.setWindSpeedTextField(theModel.getWindSpeedRefreshValue());
		}
	}

}
