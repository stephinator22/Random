package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, product1, product2, product3, product4, price1, price2, price3, price4, amount1,
            amount2,
            amount3, amount4, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.cfairy.getProductStatus()) {
            product1.setText(LoginController.cfairy.getProductName());
            qty1.setText(Double.toString(LoginController.cfairy.getProductQuantity()));
            price1.setText(Double.toString(LoginController.cfairy.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.cfairy.getProductPrice() * LoginController.cfairy.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.cfairy.getProductPrice() * LoginController.cfairy.getProductQuantity();

        }

        if (LoginController.tpolo.getProductStatus()) {
            product2.setText(LoginController.tpolo.getProductName());
            qty2.setText(Double.toString(LoginController.tpolo.getProductQuantity()));
            price2.setText(Double.toString(LoginController.tpolo.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.tpolo.getProductPrice() * LoginController.tpolo.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.tpolo.getProductPrice() * LoginController.tpolo.getProductQuantity();
        }

        if (LoginController.Intothe90s.getProductStatus()) {
            product3.setText(LoginController.Intothe90s.getProductName());
            qty3.setText(Double.toString(LoginController.Intothe90s.getProductQuantity()));
            price3.setText(Double.toString(LoginController.Intothe90s.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.Intothe90s.getProductPrice() * LoginController.Intothe90s.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.Intothe90s.getProductPrice() * LoginController.Intothe90s.getProductQuantity();

        }

        if (LoginController.lv.getProductStatus()) {
            product4.setText(LoginController.lv.getProductName());
            qty4.setText(Double.toString(LoginController.lv.getProductQuantity()));
            price4.setText(Double.toString(LoginController.lv.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.lv.getProductPrice() * LoginController.lv.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.lv.getProductPrice() * LoginController.lv.getProductQuantity();

        }
         if (LoginController.chicRacer.getProductStatus()) {
            product4.setText(LoginController.chicRacer.getProductName());
            qty4.setText(Double.toString(LoginController.chicRacer.getProductQuantity()));
            price4.setText(Double.toString(LoginController.chicRacer.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity();
             
         }
        if (LoginController.vintageReverie.getProductStatus()) {
            product4.setText(LoginController.vintageReverie.getProductName());
            qty4.setText(Double.toString(LoginController.vintageReverie.getProductQuantity()));
            price4.setText(Double.toString(LoginController.vintageReverie.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity();
            
         }
        if (LoginController.styleArt.getProductStatus()) {
            product4.setText(LoginController.styleArt.getProductName());
            qty4.setText(Double.toString(LoginController.styleArt.getProductQuantity()));
            price4.setText(Double.toString(LoginController.styleArt.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity();
            
         }
        if (LoginController.pandaStar.getProductStatus()) {
            product4.setText(LoginController.pandaStar.getProductName());
            qty4.setText(Double.toString(LoginController.pandaStar.getProductQuantity()));
            price4.setText(Double.toString(LoginController.pandaStar.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity();
            
         }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount;
        total.setText(Double.toString(final_amount));

    }
}
