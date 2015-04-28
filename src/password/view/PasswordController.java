package password.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class PasswordController {
	@FXML
	private PasswordField password;
	@FXML
	private Button OK;
	@FXML
	private Button Help;
	@FXML
	private Label text1;
	@FXML
	private Label text2;
	
	@FXML
	private void handleOK(){
		if (password.getText()== null || password.getText()!= "bugaboo"){
			text1.setText("Invalid Password");
		}
		else{
			text1.setText("Valid Password");
		}
		password.clear();
	}
	@FXML
	private void handleHelp(){
		text2.setText("Help was clicked");
	}
}
