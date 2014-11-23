package mvc.setema6;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MeteoView extends JFrame {

	private JButton refreshButton = new JButton("Refresh");
	private JLabel temperatureLable = new JLabel(" Temperature :");
	private JTextField temperatureTextField = new JTextField(3);
	private JLabel celciusLable = new JLabel("°C  ");
	private JLabel windSpeedLable = new JLabel(" Wind Speed :");
	private JTextField windSpeedTextField = new JTextField(3);
	private JLabel kmPerHourLable = new JLabel("Km/h  ");

	MeteoView() {
		JPanel meteoPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 75);

		meteoPanel.add(refreshButton);
		meteoPanel.add(temperatureLable);
		meteoPanel.add(temperatureTextField);
		meteoPanel.add(celciusLable);
		meteoPanel.add(windSpeedLable);
		meteoPanel.add(windSpeedTextField);
		meteoPanel.add(kmPerHourLable);

		this.add(meteoPanel);

	}

	public void setTemperatureTextField(int degrees) {
		temperatureTextField.setText(Integer.toString(degrees));
	}

	public void setWindSpeedTextField(int speed) {
		windSpeedTextField.setText(Integer.toString(speed));
	}

	void addRefreshLsitener(ActionListener listenForRefreshButton) {
		refreshButton.addActionListener(listenForRefreshButton);
	}

}
