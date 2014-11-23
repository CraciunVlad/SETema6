package mvc.setema6;

public class MVCMeteo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MeteoView theView = new MeteoView();
		MeteoModel theModel = new MeteoModel();

		MeteoController theController = new MeteoController(theView, theModel);

		theView.setResizable(false);
		theView.setVisible(true);
	}

}
