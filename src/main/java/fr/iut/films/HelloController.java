package fr.iut.films;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.*;



public class HelloController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        colRang.setCellValueFactory(new PropertyValueFactory<Film, Integer>("rang"));
        colId.setCellValueFactory(new PropertyValueFactory<Film, Integer>("id"));
        colNom.setCellValueFactory(new PropertyValueFactory<Film,String>("nom"));
        colAnnee.setCellValueFactory(new PropertyValueFactory<Film, Integer>("annee"));

        Film film = new Film();
        film.setRang(1);
        film.setId("123");
        film.setNom("Harry Poteer à l'école des sorciers");
        film.setAnnee(2001);

        ObservableList<Film> films = tab.getItems();
        films.add(film);
        tab.setItems(films);

    }

    public void ajouterFilmDansTableau(Integer rang, String id, String nom, Integer annee){
        Film film = new Film();
        film.setRang(rang);
        film.setId(id);
        film.setNom(nom);
        film.setAnnee(annee);

        ObservableList<Film> films = tab.getItems();
        films.add(film);
        tab.setItems(films);
    }

    @FXML
    private void ajouterFilm(){
        String rang = tfRang.getText();
        String id = tfId.getText();
        String nom = tfNom.getText();
        String annee = tfAnnee.getText();

        if (rang.equals("") || id.equals("") || nom.equals("") || annee.equals("")){
            erreurAjouterFilm();
        }
        else {
            ajouterFilmDansTableau(Integer.parseInt(rang), id, nom, Integer.parseInt(annee));
        }

        tfRang.clear();
        tfId.clear();
        tfNom.clear();
        tfAnnee.clear();
    }

    private void erreurAjouterFilm(){
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Un ou des données sont vides pour ajouter le film dans le tableau!", "Message d'erreur", JOptionPane.WARNING_MESSAGE);
    }

    @FXML
    private void viderTableauFilms(){
        tab.getItems().clear();
    }

    @FXML
    private TableView tab;
    @FXML
    private TableColumn colRang;
    @FXML
    private TableColumn colId;
    @FXML
    private TableColumn colNom;
    @FXML
    private TableColumn colAnnee;
    @FXML
    private TextField tfRang;
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfAnnee;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnVider;


}

