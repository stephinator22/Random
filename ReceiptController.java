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
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8,
            name1, name2, name3, name4,name5, name6, name7, name8,
            lineAmount1, lineAmount2, lineAmount3, lineAmount4, lineAmount5, lineAmount6, lineAmount7, lineAmount8,
           amount1, amount2, amount3, amount4, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.cfairy.getProductStatus()) {
            name1.setText(LoginController.cfairy.getProductName());
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
            product5.setText(LoginController.chicRacer.getProductName());
            qty5.setText(Double.toString(LoginController.chicRacer.getProductQuantity()));
            price5.setText(Double.toString(LoginController.chicRacer.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity();
             
         }
        if (LoginController.vintageReverie.getProductStatus()) {
            product6.setText(LoginController.vintageReverie.getProductName());
            qty6.setText(Double.toString(LoginController.vintageReverie.getProductQuantity()));
            price6.setText(Double.toString(LoginController.vintageReverie.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity();
            
         }
        if (LoginController.styleArt.getProductStatus()) {
            product7.setText(LoginController.styleArt.getProductName());
            qty7.setText(Double.toString(LoginController.styleArt.getProductQuantity()));
            price7.setText(Double.toString(LoginController.styleArt.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity();
            
         }
        if (LoginController.pandaStar.getProductStatus()) {
            product8.setText(LoginController.pandaStar.getProductName());
            qty8.setText(Double.toString(LoginController.pandaStar.getProductQuantity()));
            price8.setText(Double.toString(LoginController.pandaStar.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity();
            
         }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount;
        total.setText(Double.toString(final_amount));

    }
}
