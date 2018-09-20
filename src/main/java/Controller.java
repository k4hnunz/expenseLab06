import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    protected Button btn;
    @FXML
    protected Label balance;





    @FXML
    public void handleGoExpensePage(ActionEvent e){
        Button b = (Button) e.getSource();

        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PageExpenseController.fxml"));
        try {
            stage.setScene(new Scene((Parent) loader.load(), 580, 450));
            Controller controller = (Controller) loader.getController();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    public void handleGoIncomePage(ActionEvent e){
        Button b = (Button) e.getSource();

        Stage stage = (Stage) b.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PageIncomeController.fxml"));
        try {
            stage.setScene(new Scene((Parent) loader.load(), 580, 450));
            Controller controller = (Controller) loader.getController();
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    public void setBalance(double balance){

        this.balance.setText("BALANCE : " + String.valueOf(balance));
    }
}
