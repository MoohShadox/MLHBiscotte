package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.layout.Pane;
import javafx.util.Callback;
import sample.Modele.Modele_Commande;
import sample.Modele.Modele_DL;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sample.Modele.Modele_Etudiant;
import sample.Modele.Modele_Plat;


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

    private ObservableList<Modele_DL> liste = FXCollections.observableArrayList();

    @FXML
    void Valider_It(ActionEvent event) {
        Modele_DL MDL = new Modele_DL("100",new Modele_Etudiant("Racha","Salhi","161631102659","manil"));
        Modele_Commande MC = new Modele_Commande("123","400",new Modele_Etudiant("Ramy","Khelladi","161631102322","manil"));
        MC.add_plat(new Modele_Plat("CHAWARMA","BUVETTES1",250));
        MDL.add_commande(MC);
        liste.add(MDL);
    }



    @FXML
    void initialize(){
        TableDemandeEnCours.setItems(liste);
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
        TableDemandeEnCours.setEditable(true);
        SelectedColumn.setCellFactory(CheckBoxTableCell.forTableColumn(SelectedColumn));
        /*SelectedColumn.setCellFactory(new Callback<TableColumn<Modele_DL, Boolean>, TableCell<Modele_DL, Boolean>>() {
            @Override
            public TableCell<Modele_DL, Boolean> call(TableColumn<Modele_DL, Boolean> param) {
                TableCell<Modele_DL,Boolean> C = new TableCell<>(){
                    @Override
                    protected void updateItem(Boolean item, boolean empty) {
                        Node n = null;
                        String ch = "";
                        if(!empty && item!=null){
                            System.out.print("ICI");
                            CheckBox CB = new CheckBox();
                            CB.selectedProperty().bindBidirectional(new SimpleBooleanProperty(item));
                            n = CB;
                            ch = "-fx-background-color : RED";
                        }
                        else
                        {
                            System.out.print("There 1  ");
                        }
                        setGraphic(n);
                        setStyle(ch);
                    }
                };
                return C;
            }
        });*/
    }

}
