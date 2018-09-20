import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Expense {

    private SimpleIntegerProperty rID;
    private SimpleStringProperty rName;
    private SimpleStringProperty rDate;
    private SimpleIntegerProperty rExpense;

    public Expense(int sID,String sName,String sDate,int rExpense){
        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty(sName);
        this.rDate = new SimpleStringProperty(sDate);
        this.rExpense = new SimpleIntegerProperty(rExpense);
    }

    public Integer getRID(){
        return rID.get();
    }

    public void setrID(int v){
        rID.set(v);
    }

    public String getRName(){
        return rName.get();
    }

    public void setRName(String v){
        rName.set(v);
    }

    public String getRDate(){
        return rDate.get();
    }

    public void setRDate(String v){
        rDate.set(v);
    }

    public Integer getRExpense(){
        return rExpense.get();
    }

    public void setrExpense(int v){
        rExpense.set(v);
    }
}
