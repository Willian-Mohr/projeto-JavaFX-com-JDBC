package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtName;

	@FXML
	private Label labelErrorName;

	@FXML
	private Button btnSave;

	@FXML
	private Button btnCancel;

	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}

	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		gui.util.Constraints.setTextFieldInteger(txtId);
		gui.util.Constraints.setTextFieldMaxLength(txtName, 30);

	}

}