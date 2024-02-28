module co.edu.uniquindio.pr2.fx.pr2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.pr2.fx.pr2fx to javafx.fxml;
    exports co.edu.uniquindio.pr2.fx.pr2fx;
}