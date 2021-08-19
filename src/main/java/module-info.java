module br.com.dio.estrutura_dados {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio.javafx_helloworld to javafx.fxml;
    exports br.com.dio.javafx_helloworld;
}