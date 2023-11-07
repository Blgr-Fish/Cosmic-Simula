module com.cosmic.cosmicsimula {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cosmic.cosmicsimula to javafx.fxml;
    exports com.cosmic.cosmicsimula;
}