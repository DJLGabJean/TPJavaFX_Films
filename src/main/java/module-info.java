module fr.iut.films {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens fr.iut.films to javafx.fxml;
    exports fr.iut.films;
}