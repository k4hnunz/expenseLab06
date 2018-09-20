import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PageIncomeController {

    @FXML
    private Label showAllIncome;
    @FXML
    protected TextField date;
    @FXML
    protected TextField amount;

    private String ddmmyy;
    private String money;


    @FXML
    public void onClickToAddExpense(ActionEvent event) {
        try {
            Path file = Paths.get("C:\\Users\\Admin\\IdeaProjects\\expenseLab06\\income.txt");
            FileWriter writer = new FileWriter(String.valueOf(file), true);
            /*BufferedWriter writer = Files.newBufferedWriter(file,
                    StandardCharsets.UTF_8);*/
            //writer.write(line);
            writer.write(System.lineSeparator() + date.getText() + " INCOME = " + amount.getText());
            writer.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

        try {
            String readerOut;
            String[] keep = new String[10];
            int last = 0;
            Path file = Paths.get("C:\\Users\\Admin\\IdeaProjects\\expenseLab06\\income.txt");
            BufferedReader reader = Files.newBufferedReader(file ,
                    StandardCharsets.UTF_8);
            while ((readerOut = reader.readLine()) != null) {
               /*keep[last] = readerOut;
               showAllExpense.setText(keep[last]);
               last++;*/
                showAllIncome.setText(readerOut);

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
