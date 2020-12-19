package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller extends Pane implements Convert {

    @FXML
    private ComboBox comBox1;
    @FXML
    private ComboBox comBox2;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private Text text2;


    @FXML
    public void updateTextField(){
        String number = textField1.getText();
        String unit1 = (String) comBox1.getValue();
        String unit2 = (String) comBox2.getValue();

        textField2.setText(String.valueOf(temperatureCovert(unit1, unit2, number)));
        String formula;
        if (unit1.equals("Celsius") && unit2.equals("Fahrenheit")) {
            formula = "(" + number + "° C x 9/5) + 32 = " + temperatureCovert(unit1, unit2, number) + "° F";
            text2.setText(formula);
        } else if (unit1.equals("Fahrenheit") && unit2.equals("Celsius")){ //- 32) * 5 / 9
            formula = "(" + number + "°F - 32) x 5/9 = " + temperatureCovert(unit1, unit2, number) + "° C";
            text2.setText(formula);
        } else {
            text2.setText("Same unit cannot be converted");
        }
    }

    @Override
    public double temperatureCovert(String unit1, String unit2, String number) {
        double result = 0.0;
        if (unit1.equals("Celsius") && unit2.equals("Fahrenheit")){
            result = Double.valueOf(number) * 9/5 + 32;
        } else if (unit1.equals("Fahrenheit") && unit2.equals("Celsius")) {
            result = (Double.valueOf(number) - 32) * 5/9;
        } else {
            result = Double.valueOf(number);
        }
        return result;
    }
}