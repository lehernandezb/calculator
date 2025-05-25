module ca.ucalagry.luis.hernandez1.calc {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.incubator.vector;
    requires java.sql;
    requires java.scripting;


    opens ca.ucalagry.luis.hernandez1.calc to javafx.fxml;
    exports ca.ucalagry.luis.hernandez1.calc;
}