package trecarte;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController {

    @FXML
    private Label domanda, percentuale, risultato;
    @FXML
    private Button carta1, carta2, carta3, start_continue;
    private String valueCarta1;
    private String valueCarta2;
    private String valueCarta3;
    private int punteggioVinto = 0;
    private int punteggioPerso = 0;
    private int partiteTotali = 0;

    @FXML
    public void changeTxtButton() {
        start_continue.setText("Ritenta");
        carta1.setText("1-Carta");
        carta2.setText("2-Carta");
        carta3.setText("3-Carta");
    }

    private void setButtonDisable(boolean b) {
        carta1.setDisable(b);
        carta2.setDisable(b);
        carta3.setDisable(b);
    }

    private int calcolaPercentuale() {
        partiteTotali = punteggioVinto + punteggioPerso;
        int percentualeVittorie = (punteggioVinto * 100) / partiteTotali;
        return percentualeVittorie;
    }

    @FXML
    public void reset() {
        changeTxtButton();
        domanda.setText("Dov'è la carta A ?");
        setButtonDisable(false);
        Random random = new Random();
        int r = random.nextInt(3);
        if (r == 0) {
            valueCarta1 = "Asso";
            valueCarta2 = "Cavallo";
            valueCarta3 = "Fante";
        }
        if (r == 1) {
            valueCarta1 = "Fante";
            valueCarta2 = "Asso";
            valueCarta3 = "Cavallo";
        }
        if (r == 2) {
            valueCarta1 = "Cavallo";
            valueCarta2 = "Fante";
            valueCarta3 = "Asso";
        }
    }

    @FXML
    public void prova1() {
        if (valueCarta1.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + valueCarta1);
        }
        carta1.setText(valueCarta1);
        carta2.setText(valueCarta2);
        carta3.setText(valueCarta3);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    public void prova2() {
        if (valueCarta2.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");

        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + valueCarta2);
        }
        carta1.setText(valueCarta1);
        carta2.setText(valueCarta2);
        carta3.setText(valueCarta3);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    public void prova3() {
        if (valueCarta3.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai scelto la carta: " + valueCarta3);
        }
        carta1.setText(valueCarta1);
        carta2.setText(valueCarta2);
        carta3.setText(valueCarta3);
        percentuale.setText("Vinto: " + punteggioVinto + "Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

}
