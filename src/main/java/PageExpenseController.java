import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;


public class PageExpenseController {


    @FXML
    private Label showAllExpense;
    @FXML
    protected TextField date;
    @FXML
    protected TextField amount;

    private String ddmmyy;
    private String money;


    @FXML
    public void onClickToAddExpense(ActionEvent event) {
        try {
            Path file = Paths.get("C:\\Users\\Admin\\IdeaProjects\\expenseLab06\\expense.txt");
            FileWriter writer = new FileWriter(String.valueOf(file), true);
            /*BufferedWriter writer = Files.newBufferedWriter(file,
                    StandardCharsets.UTF_8);*/
            //writer.write(line);
            writer.write(System.lineSeparator() + date.getText() + " EXPENSE = " + amount.getText());
            writer.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

        try {
            String readerOut;
            String[] keep = new String[10];
            int last = 0;
            Path file = Paths.get("C:\\Users\\Admin\\IdeaProjects\\expenseLab06\\expense.txt");
            BufferedReader reader = Files.newBufferedReader(file ,
                    StandardCharsets.UTF_8);
            while ((readerOut = reader.readLine()) != null) {
               /*keep[last] = readerOut;
               showAllExpense.setText(keep[last]);
               last++;*/
                showAllExpense.setText(readerOut);

                //money = readerOut;
/*                for (int j = 1 ;j <5 ;j++){
                    line = "new text"+ j;
                    System.out.println(line);
                }*/
            }
            /*showAllExpense.setText(readerOut);*/

            reader.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }


    }

}


        /*this.ddmmyy = date.getText();
        this.money = amount.getText();*/
        //File file = new File();
