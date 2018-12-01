package Vue_Controller;

import Modele.Modele_Commande;
import Modele.Modele_DL;
import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class SelectionItineraire {

    @FXML
    private TableView<Modele_DL> TableDemandeEnCours;

    @FXML
    private TableColumn<Modele_DL, String> DestColumn;

    @FXML
    private TableColumn<Modele_DL, Integer> NbProduitColumn;

    @FXML
    private TableColumn<Modele_DL, Integer> BenefitsColumn;

    @FXML
    private TableColumn<Modele_DL, String> ClientColumn;

    @FXML
    private TableColumn<Modele_DL, Boolean> SelectedColumn;

    @FXML
    void Valider_It(ActionEvent event) {

    }

    @FXML
    void initialize(){
        DestColumn.setCellValueFactory(cell -> cell.getValue().destinationProperty());
        NbProduitColumn.setCellValueFactory(cell -> {
            Modele_DL M = cell.getValue();
            int i = 0;
            for(Modele_Commande C : M.getCommandes_contenus()){
                i += C.getNbPlats();
            }
            return new ReadOnlyObjectWrapper<>(i);
        });

        BenefitsColumn.setCellValueFactory(cell -> {
            Modele_DL M = cell.getValue();
            int i = 0;
            for(Modele_Commande C : M.getCommandes_contenus()){
                i += C.getPrixTotal();
            }
            return new ReadOnlyObjectWrapper<>(i);
        });
        ClientColumn.setCellValueFactory(cell -> cell.getValue().getME().nomProperty());


    }

}
