import javafx.scene.control.Button;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Plan extends BorderPane {

	public Plan(Stage stage, Scene scene) {
		Label complete = new Label("The number of hours completed\t"), hourComp = new Label("0");
		hourComp.setStyle("-fx-text-stroke: white; -fx-text-stroke-width: 1px;");
		HBox compBox = new HBox(10, complete, hourComp);
		complete.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		hourComp.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

		Label left = new Label("The number of hours left\t"), hourLeft = new Label("129");
		HBox leftBox = new HBox(10, left, hourLeft);
		left.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		hourLeft.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

		Label comp1310 = new Label("COMP1310");
		Label ecgc2201 = new Label("ENGC2201");
		Label math1411 = new Label("MATH1411");
		Label arab135 = new Label("ARAB135");
		Label phys111 = new Label("PHYS111");
		Label phys141 = new Label("PHYS141");
		comp1310.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		ecgc2201.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		math1411.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		arab135.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		phys111.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		phys141.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp1310CB = new CheckBox(), ecgc2201CB = new CheckBox(), math1411CB = new CheckBox(),
				arab135CB = new CheckBox(), phys111CB = new CheckBox(), phys141CB = new CheckBox();

		comp1310CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp1310CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		ecgc2201CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (ecgc2201CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 2 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 2 + "");
				}
			}
		});

		math1411CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (math1411CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 4 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 4 + "");
				}
			}
		});

		arab135CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (arab135CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		phys111CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (phys111CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 1 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 1 + "");
				}
			}
		});

		phys141CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (phys141CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 4 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 4 + "");
				}
			}
		});

		GridPane gp11 = new GridPane();
		gp11.add(comp1310, 0, 0);
		gp11.add(comp1310CB, 1, 0);
		gp11.add(ecgc2201, 0, 1);
		gp11.add(ecgc2201CB, 1, 1);
		gp11.add(math1411, 0, 2);
		gp11.add(math1411CB, 1, 2);
		gp11.add(arab135, 0, 3);
		gp11.add(arab135CB, 1, 3);
		gp11.add(phys111, 0, 4);
		gp11.add(phys111CB, 1, 4);
		gp11.add(phys141, 0, 5);
		gp11.add(phys141CB, 1, 5);

		gp11.setHgap(10);
		gp11.setVgap(10);

		gp11.setPadding(new Insets(10, 10, 10, 10));
		gp11.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label comp1331 = new Label("COMP1311");
		Label ecgc2202 = new Label("ENGC2202");
		Label math1321 = new Label("MATH1321");
		Label arab136 = new Label("ARAB136");
		Label phys112 = new Label("PHYS112");
		Label phys132 = new Label("PHYS132");
		comp1331.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		ecgc2202.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		math1321.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		arab136.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		phys112.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		phys132.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp1331CB = new CheckBox(), ecgc2202CB = new CheckBox(), math1321CB = new CheckBox(),
				arab136CB = new CheckBox(), phys112CB = new CheckBox(), phys132CB = new CheckBox();

		comp1331CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp1331CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		ecgc2202CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (ecgc2202CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 2 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 2 + "");
				}
			}
		});

		math1321CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (math1321CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		arab136CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (arab136CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		phys112CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (phys112CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 1 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 1 + "");
				}
			}
		});

		phys132CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (phys132CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp12 = new GridPane();
		gp12.add(comp1331, 0, 0);
		gp12.add(comp1331CB, 1, 0);
		gp12.add(ecgc2202, 0, 1);
		gp12.add(ecgc2202CB, 1, 1);
		gp12.add(math1321, 0, 2);
		gp12.add(math1321CB, 1, 2);
		gp12.add(arab136, 0, 3);
		gp12.add(arab136CB, 1, 3);
		gp12.add(phys112, 0, 4);
		gp12.add(phys112CB, 1, 4);
		gp12.add(phys132, 0, 5);
		gp12.add(phys132CB, 1, 5);

		gp12.setHgap(10);
		gp12.setVgap(10);

		gp12.setPadding(new Insets(10, 10, 10, 10));
		gp12.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label yearOneFS = new Label("First Semester");
		yearOneFS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		Label yearOneSS = new Label("Second Semester");
		yearOneSS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		GridPane yearOneGP = new GridPane();
		yearOneGP.add(yearOneFS, 0, 0);
		yearOneGP.add(yearOneSS, 1, 0);
		yearOneGP.add(gp11, 0, 1);
		yearOneGP.add(gp12, 1, 1);
		//
		Label select1S1Y = new Label("Select All"), select2S1Y = new Label("Select All");
		select1S1Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		select2S1Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		CheckBox check1S1Y = new CheckBox(), check2S1Y = new CheckBox();

		check1S1Y.setOnAction(e -> {
			if (check1S1Y.isSelected()) {
				comp1310CB.setSelected(true);
				ecgc2201CB.setSelected(true);
				math1411CB.setSelected(true);
				arab135CB.setSelected(true);
				phys111CB.setSelected(true);
				phys141CB.setSelected(true);
			} else {
				comp1310CB.setSelected(false);
				ecgc2201CB.setSelected(false);
				math1411CB.setSelected(false);
				arab135CB.setSelected(false);
				phys111CB.setSelected(false);
				phys141CB.setSelected(false);

			}
		});

		check2S1Y.setOnAction(e -> {
			if (check2S1Y.isSelected()) {
				comp1331CB.setSelected(true);
				arab136CB.setSelected(true);
				math1321CB.setSelected(true);
				ecgc2202CB.setSelected(true);
				phys112CB.setSelected(true);
				phys132CB.setSelected(true);
			} else {
				comp1331CB.setSelected(false);
				arab136CB.setSelected(false);
				math1321CB.setSelected(false);
				ecgc2202CB.setSelected(false);
				phys112CB.setSelected(false);
				phys132CB.setSelected(false);

			}
		});

		HBox semOne1Y = new HBox(5, select1S1Y, check1S1Y);
		HBox semTwo1Y = new HBox(5, select2S1Y, check2S1Y);
		semOne1Y.setAlignment(Pos.CENTER);
		semTwo1Y.setAlignment(Pos.CENTER);
		yearOneGP.add(semOne1Y, 0, 2);
		yearOneGP.add(semTwo1Y, 1, 2);

		//
		yearOneGP.setVgap(10);
		yearOneGP.setHgap(15);

		yearOneGP.setAlignment(Pos.CENTER);

		Label freeElective = new Label("Free Elective");
		Label comp2311 = new Label("COMP2311");
		Label comp233 = new Label("COMP233");
		Label comp311 = new Label("COMP311");
		Label engc2203 = new Label("ENGC2203");
		Label stat2311 = new Label("STAT2311");
		freeElective.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp2311.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp233.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp311.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		engc2203.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		stat2311.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox freeElectiveCB = new CheckBox(), comp2311CB = new CheckBox(), comp233CB = new CheckBox(),
				comp311CB = new CheckBox(), engc2203CB = new CheckBox(), stat2311CB = new CheckBox();

		freeElectiveCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (freeElectiveCB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		engc2203CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (engc2203CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 2 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 2 + "");
				}
			}
		});

		comp2311CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp2311CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		comp233CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp233CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		comp311CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp311CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 1 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 1 + "");
				}
			}
		});

		stat2311CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (stat2311CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp21 = new GridPane();
		gp21.add(freeElective, 0, 0);
		gp21.add(freeElectiveCB, 1, 0);
		gp21.add(comp2311, 0, 1);
		gp21.add(comp2311CB, 1, 1);
		gp21.add(comp233, 0, 2);
		gp21.add(comp233CB, 1, 2);
		gp21.add(comp311, 0, 3);
		gp21.add(comp311CB, 1, 3);
		gp21.add(engc2203, 0, 4);
		gp21.add(engc2203CB, 1, 4);
		gp21.add(stat2311, 0, 5);
		gp21.add(stat2311CB, 1, 5);

		gp21.setHgap(10);
		gp21.setVgap(10);

		gp21.setPadding(new Insets(10, 10, 10, 10));
		gp21.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label comp242 = new Label("COMP242");
		Label encs2340 = new Label("ENCS2340");
		Label engc2204 = new Label("ENGC2204");
		Label math234 = new Label("MATH234");
		Label specialElec = new Label("Special Elective");
		comp242.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		encs2340.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		engc2204.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		math234.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specialElec.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp242CB = new CheckBox(), encs2340CB = new CheckBox(), engc2204CB = new CheckBox(),
				math234CB = new CheckBox(), specialElecCB = new CheckBox();

		comp242CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp242CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 4 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 4 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 4 + "");
				}
			}
		});
		engc2204CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (engc2204CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 2 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 2 + "");
				}
			}
		});

		encs2340CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (encs2340CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		math234CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (math234CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		specialElecCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specialElecCB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp22 = new GridPane();
		gp22.add(comp242, 0, 0);
		gp22.add(comp242CB, 1, 0);
		gp22.add(encs2340, 0, 1);
		gp22.add(encs2340CB, 1, 1);
		gp22.add(engc2204, 0, 2);
		gp22.add(engc2204CB, 1, 2);
		gp22.add(math234, 0, 3);
		gp22.add(math234CB, 1, 3);
		gp22.add(specialElec, 0, 4);
		gp22.add(specialElecCB, 1, 4);

		gp22.setHgap(10);
		gp22.setVgap(10);

		gp22.setPadding(new Insets(10, 10, 10, 10));
		gp22.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label yearTwoFS = new Label("First Semester");
		yearTwoFS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		Label yearTwoSS = new Label("Second Semester");
		yearTwoSS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		GridPane yearTwoGP = new GridPane();
		yearTwoGP.add(yearTwoFS, 0, 0);
		yearTwoGP.add(yearTwoSS, 1, 0);
		yearTwoGP.add(gp21, 0, 1);
		yearTwoGP.add(gp22, 1, 1);

		//
		Label select1S2Y = new Label("Select All"), select2S2Y = new Label("Select All");
		select1S2Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		select2S2Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		CheckBox check1S2Y = new CheckBox(), check2S2Y = new CheckBox();

		check1S2Y.setOnAction(e -> {
			if (check1S2Y.isSelected()) {
				freeElectiveCB.setSelected(true);
				comp2311CB.setSelected(true);
				comp233CB.setSelected(true);
				comp311CB.setSelected(true);
				engc2203CB.setSelected(true);
				stat2311CB.setSelected(true);
			} else {
				freeElectiveCB.setSelected(false);
				comp2311CB.setSelected(false);
				comp233CB.setSelected(false);
				comp311CB.setSelected(false);
				engc2203CB.setSelected(false);
				stat2311CB.setSelected(false);

			}
		});

		check2S2Y.setOnAction(e -> {
			if (check2S2Y.isSelected()) {
				comp242CB.setSelected(true);
				encs2340CB.setSelected(true);
				engc2204CB.setSelected(true);
				math234CB.setSelected(true);
				specialElecCB.setSelected(true);
			} else {
				comp242CB.setSelected(false);
				encs2340CB.setSelected(false);
				engc2204CB.setSelected(false);
				math234CB.setSelected(false);
				specialElecCB.setSelected(false);
			}
		});

		HBox semOne2Y = new HBox(5, select1S2Y, check1S2Y);
		HBox semTwo2Y = new HBox(5, select2S2Y, check2S2Y);
		semOne2Y.setAlignment(Pos.CENTER);
		semTwo2Y.setAlignment(Pos.CENTER);
		yearTwoGP.add(semOne2Y, 0, 2);
		yearTwoGP.add(semTwo2Y, 1, 2);

		//

		yearTwoGP.setVgap(10);
		yearTwoGP.setHgap(15);

		yearTwoGP.setAlignment(Pos.CENTER);

		Label comp333 = new Label("COMP333");
		Label comp336 = new Label("COMP336");
		Label encs336 = new Label("ENCS336");
		Label specElec2 = new Label("Special Elective");
		Label culs331 = new Label("CULS331");
		comp333.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp336.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		encs336.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specElec2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		culs331.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp333CB = new CheckBox(), comp336CB = new CheckBox(), encs336CB = new CheckBox(),
				specElec2CB = new CheckBox(), culs331CB = new CheckBox();

		comp333CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp333CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		comp336CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp336CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		encs336CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (encs336CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		specElec2CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specElec2CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		culs331CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (culs331CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp31 = new GridPane();
		gp31.add(comp333, 0, 0);
		gp31.add(comp333CB, 1, 0);
		gp31.add(comp336, 0, 1);
		gp31.add(comp336CB, 1, 1);
		gp31.add(encs336, 0, 2);
		gp31.add(encs336CB, 1, 2);
		gp31.add(specElec2, 0, 3);
		gp31.add(specElec2CB, 1, 3);
		gp31.add(culs331, 0, 4);
		gp31.add(culs331CB, 1, 4);

		gp31.setHgap(10);
		gp31.setVgap(10);

		gp31.setPadding(new Insets(10, 10, 10, 10));
		gp31.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label comp3340 = new Label("COMP3340");
		Label comp338 = new Label("COMP338");
		Label comp433 = new Label("COMP433");
		Label encs2110 = new Label("ENCS2110");
		Label comp4310 = new Label("COMP4310");
		Label specElec3 = new Label("Special Elective");
		comp3340.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp338.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp433.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		encs2110.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp4310.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specElec3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp3340CB = new CheckBox(), comp338CB = new CheckBox(), comp433CB = new CheckBox(),
				encs2110CB = new CheckBox(), comp4310CB = new CheckBox(), specElec3CB = new CheckBox();

		comp3340CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp3340CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		comp338CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp338CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		comp433CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp433CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		comp4310CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp4310CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		encs2110CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (encs2110CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 1 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 1 + "");
				}
			}
		});

		specElec3CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specElec3CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp32 = new GridPane();
		gp32.add(comp3340, 0, 0);
		gp32.add(comp3340CB, 1, 0);
		gp32.add(comp338, 0, 1);
		gp32.add(comp338CB, 1, 1);
		gp32.add(comp433, 0, 2);
		gp32.add(comp433CB, 1, 2);
		gp32.add(encs2110, 0, 3);
		gp32.add(encs2110CB, 1, 3);
		gp32.add(comp4310, 0, 4);
		gp32.add(comp4310CB, 1, 4);
		gp32.add(specElec3, 0, 5);
		gp32.add(specElec3CB, 1, 5);

		gp32.setHgap(10);
		gp32.setVgap(10);

		gp32.setPadding(new Insets(10, 10, 10, 10));
		gp32.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label yearThreeFS = new Label("First Semester");
		yearThreeFS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		Label yearThreeSS = new Label("Second Semester");
		yearThreeSS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		GridPane yearThreeGP = new GridPane();
		yearThreeGP.add(yearThreeFS, 0, 0);
		yearThreeGP.add(yearThreeSS, 1, 0);
		yearThreeGP.add(gp31, 0, 1);
		yearThreeGP.add(gp32, 1, 1);

		//
		Label select1S3Y = new Label("Select All"), select2S3Y = new Label("Select All");
		select1S3Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		select2S3Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		CheckBox check1S3Y = new CheckBox(), check2S3Y = new CheckBox();

		check1S3Y.setOnAction(e -> {
			if (check1S3Y.isSelected()) {
				comp333CB.setSelected(true);
				comp336CB.setSelected(true);
				encs336CB.setSelected(true);
				specElec2CB.setSelected(true);
				culs331CB.setSelected(true);
			} else {
				comp333CB.setSelected(false);
				comp336CB.setSelected(false);
				encs336CB.setSelected(false);
				specElec2CB.setSelected(false);
				culs331CB.setSelected(false);

			}
		});

		check2S3Y.setOnAction(e -> {
			if (check2S3Y.isSelected()) {
				comp3340CB.setSelected(true);
				comp338CB.setSelected(true);
				comp433CB.setSelected(true);
				encs2110CB.setSelected(true);
				specElec3CB.setSelected(true);
				comp4310CB.setSelected(true);
			} else {
				comp3340CB.setSelected(false);
				comp338CB.setSelected(false);
				comp433CB.setSelected(false);
				encs2110CB.setSelected(false);
				specElec3CB.setSelected(false);
				comp4310CB.setSelected(false);
			}
		});

		HBox semOne3Y = new HBox(5, select1S3Y, check1S3Y);
		HBox semTwo3Y = new HBox(5, select2S3Y, check2S3Y);
		semOne3Y.setAlignment(Pos.CENTER);
		semTwo3Y.setAlignment(Pos.CENTER);
		yearThreeGP.add(semOne3Y, 0, 2);
		yearThreeGP.add(semTwo3Y, 1, 2);

		//

		yearThreeGP.setVgap(10);
		yearThreeGP.setHgap(15);

		yearThreeGP.setAlignment(Pos.CENTER);

		Label comp431 = new Label("COMP431");
		Label comp4200 = new Label("COMP4200");
		Label encs3320 = new Label("ENCS3320");
		Label culs332 = new Label("CULS332");
		Label specElec4 = new Label("Special Elective");
		Label specElec5 = new Label("Special Elective");
		comp431.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp4200.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		encs3320.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		culs332.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specElec4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specElec5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp431CB = new CheckBox(), comp4200CB = new CheckBox(), encs3320CB = new CheckBox(),
				culs332CB = new CheckBox(), specElec4CB = new CheckBox(), specElec5CB = new CheckBox();

		comp431CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp431CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		comp4200CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp4200CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 2 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 2 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 2 + "");
				}
			}
		});

		encs3320CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (encs3320CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		culs332CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (culs332CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		specElec4CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specElec4CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		specElec5CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specElec5CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp41 = new GridPane();
		gp41.add(comp431, 0, 0);
		gp41.add(comp431CB, 1, 0);
		gp41.add(comp4200, 0, 1);
		gp41.add(comp4200CB, 1, 1);
		gp41.add(encs3320, 0, 2);
		gp41.add(encs3320CB, 1, 2);
		gp41.add(culs332, 0, 3);
		gp41.add(culs332CB, 1, 3);
		gp41.add(specElec4, 0, 4);
		gp41.add(specElec4CB, 1, 4);
		gp41.add(specElec5, 0, 5);
		gp41.add(specElec5CB, 1, 5);

		gp41.setHgap(10);
		gp41.setVgap(10);

		gp41.setPadding(new Insets(10, 10, 10, 10));
		gp41.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label comp432 = new Label("COMP432");
		Label comp439 = new Label("COMP439");
		Label comp4300 = new Label("COMP4300");
		Label encs4130 = new Label("ENCS4130");
		Label freeElec = new Label("Free Elective");
		Label specElec6 = new Label("Special Elective");
		comp432.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp439.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		comp4300.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		encs4130.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		freeElec.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		specElec6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		CheckBox comp432CB = new CheckBox(), comp439CB = new CheckBox(), comp4300CB = new CheckBox(),
				encs4130CB = new CheckBox(), freeElecCB = new CheckBox(), specElec6CB = new CheckBox();

		comp432CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp432CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		comp439CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp439CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});
		comp4300CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (comp4300CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		freeElecCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (freeElecCB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		encs4130CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (encs4130CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 1 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 1 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 1 + "");
				}
			}
		});

		specElec6CB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (specElec6CB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		GridPane gp42 = new GridPane();
		gp42.add(comp432, 0, 0);
		gp42.add(comp432CB, 1, 0);
		gp42.add(comp439, 0, 1);
		gp42.add(comp439CB, 1, 1);
		gp42.add(comp4300, 0, 2);
		gp42.add(comp4300CB, 1, 2);
		gp42.add(encs4130, 0, 3);
		gp42.add(encs4130CB, 1, 3);
		gp42.add(freeElec, 0, 4);
		gp42.add(freeElecCB, 1, 4);
		gp42.add(specElec6, 0, 5);
		gp42.add(specElec6CB, 1, 5);

		gp42.setHgap(10);
		gp42.setVgap(10);

		gp42.setPadding(new Insets(10, 10, 10, 10));
		gp42.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");

		Label yearFourFS = new Label("First Semester");
		yearFourFS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		Label yearFourSS = new Label("Second Semester");
		yearFourSS.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

		GridPane yearFourGP = new GridPane();
		yearFourGP.add(yearFourFS, 0, 0);
		yearFourGP.add(yearFourSS, 1, 0);
		yearFourGP.add(gp41, 0, 1);
		yearFourGP.add(gp42, 1, 1);
		//
		Label select1S4Y = new Label("Select All"), select2S4Y = new Label("Select All");
		select1S4Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		select2S4Y.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		CheckBox check1S4Y = new CheckBox(), check2S4Y = new CheckBox();

		check1S4Y.setOnAction(e -> {
			if (check1S4Y.isSelected()) {
				comp431CB.setSelected(true);
				comp4200CB.setSelected(true);
				encs3320CB.setSelected(true);
				culs332CB.setSelected(true);
				specElec4CB.setSelected(true);
				specElec5CB.setSelected(true);
			} else {
				comp431CB.setSelected(false);
				comp4200CB.setSelected(false);
				encs3320CB.setSelected(false);
				culs332CB.setSelected(false);
				specElec4CB.setSelected(false);
				specElec5CB.setSelected(false);

			}
		});

		check2S4Y.setOnAction(e -> {
			if (check2S4Y.isSelected()) {
				comp432CB.setSelected(true);
				comp439CB.setSelected(true);
				comp4300CB.setSelected(true);
				encs4130CB.setSelected(true);
				freeElecCB.setSelected(true);
				specElec6CB.setSelected(true);
			} else {
				comp432CB.setSelected(false);
				comp439CB.setSelected(false);
				comp4300CB.setSelected(false);
				encs4130CB.setSelected(false);
				freeElecCB.setSelected(false);
				specElec6CB.setSelected(false);
			}
		});

		HBox semOne4Y = new HBox(5, select1S4Y, check1S4Y);
		HBox semTwo4Y = new HBox(5, select2S4Y, check2S4Y);
		semOne4Y.setAlignment(Pos.CENTER);
		semTwo4Y.setAlignment(Pos.CENTER);
		yearFourGP.add(semOne4Y, 0, 2);
		yearFourGP.add(semTwo4Y, 1, 2);

		//

		yearFourGP.setVgap(10);
		yearFourGP.setHgap(15);

		yearFourGP.setAlignment(Pos.CENTER);

		yearOneGP.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		yearTwoGP.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		yearThreeGP.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		yearFourGP.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");

		yearOneGP.setPadding(new Insets(5));
		yearTwoGP.setPadding(new Insets(5));
		yearThreeGP.setPadding(new Insets(5));
		yearFourGP.setPadding(new Insets(5));

		GridPane plan = new GridPane();
		plan.add(yearOneGP, 0, 0);
		plan.add(yearTwoGP, 1, 0);
		plan.add(yearThreeGP, 2, 0);
		plan.add(yearFourGP, 3, 0);
		plan.setAlignment(Pos.CENTER);
		plan.setHgap(50);

		GridPane planGP = new GridPane();
		Label firstYear = new Label("First Year"), secondYear = new Label("Second Year"),
				thirdYear = new Label("Third Year"), fourthYear = new Label("Fourth Year");
		firstYear.setStyle("-fx-text-fill: #960018;");
		secondYear.setStyle("-fx-text-fill: #960018;");
		thirdYear.setStyle("-fx-text-fill: #960018;");
		fourthYear.setStyle("-fx-text-fill: #960018;");

		firstYear.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		secondYear.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		thirdYear.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		fourthYear.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

		planGP.add(firstYear, 0, 0);
		planGP.add(yearOneGP, 0, 1);
		planGP.add(secondYear, 1, 0);
		planGP.add(yearTwoGP, 1, 1);
		planGP.add(thirdYear, 2, 0);
		planGP.add(yearThreeGP, 2, 1);
		planGP.add(fourthYear, 3, 0);
		planGP.add(yearFourGP, 3, 1);
		planGP.setAlignment(Pos.CENTER);

		Label trainLabel = new Label("Training Session (COMP3300)");
		CheckBox trainCB = new CheckBox();

		trainCB.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (trainCB.isSelected()) {
					hourComp.setText(Integer.parseInt(hourComp.getText()) + 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) - 3 + "");
				} else {
					hourComp.setText(Integer.parseInt(hourComp.getText()) - 3 + "");
					hourLeft.setText(Integer.parseInt(hourLeft.getText()) + 3 + "");
				}
			}
		});

		HBox trainHB = new HBox(10, trainLabel, trainCB);
		trainHB.setPadding(new Insets(10));
		trainHB.setStyle(
				"-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;-fx-background-color: black;");
		trainLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		trainHB.setAlignment(Pos.CENTER);
		planGP.add(trainHB, 2, 2);

		planGP.setVgap(10);
		planGP.setHgap(20);

		setCenter(planGP);

		Label planLabel = new Label("Advisory Plan for Computer Science");
		planLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));

		Button backBtn = new Button("Back");
		backBtn.setAlignment(Pos.TOP_LEFT);
		planLabel.setAlignment(Pos.CENTER);
		HBox hBox = new HBox(430, backBtn, planLabel);
		hBox.setAlignment(Pos.CENTER_LEFT);
		backBtn.setOnAction(e -> {
			stage.setScene(scene);
			stage.centerOnScreen();

		});

		setTop(hBox);
		setPadding(new Insets(15));

		hourComp.setStyle("-fx-text-fill: #960018;");
		hourLeft.setStyle("-fx-text-fill: #960018;");

		VBox show = new VBox(10, compBox, leftBox);
		show.setStyle("-fx-border-color: white; -fx-border-width: 1px;-fx-border-radius: 20px;");
		show.setAlignment(Pos.CENTER);
		compBox.setAlignment(Pos.CENTER);
		leftBox.setAlignment(Pos.CENTER);
		setBottom(show);

	}

}
