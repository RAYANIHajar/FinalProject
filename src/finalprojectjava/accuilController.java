/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectjava ;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author HP
 */
public class accuilController implements Initializable {
    


    
    @FXML private ComboBox Cmb1;
    @FXML private Label labcmb1;
    
 

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Cmb1.getItems().add("Agadir");
        Cmb1.getItems().addAll("Agdez\n","Aglou\n","Agouim\n","Ahfir\n","Ain Dfali\n","Ait Melloul\n","Ait Ouafqa\n","Al Hoceima\n","Aoufouss\n","Azrou\n","Bab Berred\n","Bab Taza\n","Bejaad\n",
"Ben Hadifa\n","Beni Ensar\n","Beni Mathar\n","Beni Mellal\n","Berkane\n","Bouarfa\n","Boufakrane\n","Bouizakarne\n","Boujdour\n","Boumalne Dadès\n","Casablanca\n",
"Chefchaouen\n","Cherafate\n","Dakhla\n","Dardara\n","Driouch\n","El hajeb\n","Eljadida\n","Erfoud\n","Errachidia\n","Essaouira\n","Fes\n","Figuig\n","Fnidek\n","Goulmima\n",
"Guelmim\n","Guenfouda\n","Idaousmlal\n","Ifrane\n","Imzouren\n","Inzegane\n","Jbel Al-Aroui\n","Jorf el malha\n","Kasbat Tadla\n","Kassita\n","Kelaa Magouna\n","Kelaa Sraghna\n",
"Kenitra\n","Khemisset\n","Khenifra\n","Khouribga\n","Ksar El Kébir\n","Ktama Issaguen\n","Laayoune\n","Laayoune Port\n","Larache\n","Marrakech\n","Mechra Bel Ksiri\n","Meknes\n",
"M'Hamid El Ghizlane\n","Midar\n","Midelt\n","Mirleft\n","Mrirt\n","Nador\n","Nkob\n","Oualidia\n","Ouarzazate\n","Ouazzane\n","Oued Laabid\n","Oued Zem\n","Oujda\n","Ouled Teima\n",
"Rabat\n","Rissani\n","Safi\n","Saidia\n","Sebt Gzoula\n","Sidi Allal Tazi\n","Sidi Ifni\n","Sidi Kacem\n","Skoura\n","Smara\n","Souk Larbaa\n","Tafraout\n","Tagounite\n","Taliouine\n",
"Tamanar\n","Tamegroute\n","Tamelelt\n","Tamorot\n","Tan Tan\n","Tanger\n","Taounate\n","Taourirt\n","Targuist\n","Taroudant\n","Taza\n","Tazarine\n","Taznakht\n","Tendrara\n","Tetouan\n",
"Tiflet\n","Tighssaline\n","Tinghir\n","Tinjdad\n","Tinzouline\n","Tiznit\n","Zagora\n","Zaida\n","Zaouit Echeikh");
    }
 

}
