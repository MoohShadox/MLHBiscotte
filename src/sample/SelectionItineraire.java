package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.cell.CheckBoxTableCell;
import sample.Modele.Modele_Commande;
import sample.Modele.Modele_DL;
import javafx.beans.property.*;
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

    private ObservableList<Modele_DL> liste = FXCollections.emptyObservableList();

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
        SelectedColumn.setCellValueFactory(cell -> cell.getValue().selectedProperty());
        SelectedColumn.setCellFactory(CheckBoxTableCell.forTableColumn(SelectedColumn));
    }

}
