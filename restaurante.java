import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class restaurante extends Application{
    public static void main(String[] args) throws Exception {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    //GridPanes
    GridPane gridPanePlatos = new GridPane();
    GridPane gridPanePedido = new GridPane();
    //formulario creación de platos:
    //Labels:
    Label lnombre = new Label("Nombre:");
    Label lprecio = new Label("Precio $:");
    Label ltipodeplato = new Label("Tipo de plato:");

    //Textfields:
    TextField tfnombre = new TextField();
    TextField tfprecio = new TextField();
    //Radiobuttons:
    RadioButton rbentrada = new RadioButton("Entrada");
    RadioButton rbpfuerte = new RadioButton("Plato Fuerte");
    RadioButton rbpostre = new RadioButton("Postre");
    RadioButton rbbebida = new RadioButton("Bebida");
    //button:
    Button bcrearplato = new Button("Crear plato");
    //List view:
    ListView<String> platosExistentes = new ListView<>();
    //vinculacion al grid pane
    gridPanePlatos.add(lnombre,0,0,1,1);
    gridPanePlatos.add(lprecio,0,1,1,1);
    gridPanePlatos.add(ltipodeplato,2,0,1,1);
    gridPanePlatos.add(tfnombre,1,0,1,1);
    gridPanePlatos.add(tfprecio,1,1,1,1);
    gridPanePlatos.add(rbentrada,2,1,1,1);
    gridPanePlatos.add(rbpfuerte,3,1,1,1);
    gridPanePlatos.add(rbpostre,4,1,1,1);
    gridPanePlatos.add(rbbebida,5,1,1,1);
    gridPanePlatos.add(bcrearplato,1,2,1,1);
    gridPanePlatos.add(platosExistentes,1,3,1,1);

    //formulaio pedido
    //labels
    Label le = new Label("Entrada:");
    Label lpf = new Label("Plato fuerte:");
    Label lp = new Label("Postre:");
    Label lb = new Label("Bebida:");
    Label lc0 = new Label("Cantidad:");
    Label lc1 = new Label("Cantidad:");
    Label lc2 = new Label("Cantidad:");
    Label lc3 = new Label("Cantidad:");
    //COMBO BOX
    ComboBox<String> eComboBox = new ComboBox<>();
    eComboBox.setMaxWidth(100);
    ComboBox<String> pfComboBox = new ComboBox<>();
    pfComboBox.setMaxWidth(100);
    ComboBox<String> pComboBox = new ComboBox<>();
    pComboBox.setMaxWidth(100);
    ComboBox<String> bComboBox = new ComboBox<>();
    bComboBox.setMaxWidth(100);
    //TextField
    TextField tfc0 = new TextField();
    tfc0.setMaxWidth(50);
    TextField tfc1 = new TextField();
    tfc1.setMaxWidth(50);
    TextField tfc2 = new TextField();
    tfc2.setMaxWidth(50);
    TextField tfc3 = new TextField();
    tfc3.setMaxWidth(50);
    //CheckBox
    CheckBox fielCheckBox = new CheckBox("Cliente Fiel");
    //Boton facturar
    Button facturar = new Button("Facturar Pedido");
    //textarea-factura
    TextArea factura = new TextArea();
    //vinculacion al gridpane
    //labels
    gridPanePedido.add(le,0,0,2,1);
    gridPanePedido.add(lpf,2,0,2,1);
    gridPanePedido.add(lp,4,0,2,1);
    gridPanePedido.add(lb,6,0,2,1);
    //choiceboxs
    gridPanePedido.add(eComboBox,0,1,2,1);
    gridPanePedido.add(pfComboBox,2,1,2,1);
    gridPanePedido.add(pComboBox,4,1,2,1);
    gridPanePedido.add(bComboBox,6,1,2,1);
    //labels
    gridPanePedido.add(lc0,0,2,1,1);
    gridPanePedido.add(lc1,2,2,1,1);
    gridPanePedido.add(lc2,4,2,1,1);
    gridPanePedido.add(lc3,6,2,1,1);
    //textfields
    gridPanePedido.add(tfc0,1,2,1,1);
    gridPanePedido.add(tfc1,3,2,1,1);
    gridPanePedido.add(tfc2,5,2,1,1);
    gridPanePedido.add(tfc3,7,2,1,1);
    //checkbox
    gridPanePedido.add(fielCheckBox,0,3,2,1);
    //boton
    gridPanePedido.add(facturar,2,3,2,1);
    //textarea
    gridPanePedido.add(factura,0,4,8,4);

    
    //TabPane
    TabPane tabPaneRestaurante = new TabPane();
    Tab tab1 = new Tab("Creación de platos",gridPanePlatos);
    tab1.setId("tab-1");
    Tab tab2 = new Tab("Pedido",gridPanePedido);
    tab2.getStyleClass().add("tab-2");
    tabPaneRestaurante.getTabs().addAll(tab1,tab2);
    //--------------
    VBox vBox = new VBox(tabPaneRestaurante);
    
    Scene scene = new Scene(vBox,600,300);
    scene.getStylesheets().add(getClass().getResource("/Styles.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.setTitle("Restaurante ACME");
    primaryStage.show();
        
    }
}
