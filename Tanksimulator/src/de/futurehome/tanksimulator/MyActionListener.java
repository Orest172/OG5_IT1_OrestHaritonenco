package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden) {
			System.exit(0);
			f.log.info("Programm wurde geschlossen.");
		}
			
		if (obj == f.btnEinfuellen) {
			 double fuellstand = f.myTank.getFuellstand();
			 fuellstand = fuellstand + 5;
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.progressBar.setValue((int)fuellstand);
			 
			 f.log.info("5 Liter wurden eingefüllt.");
		}
		
		if (obj == f.btnVerbrauchen) {
			double fuellstand = f.myTank.getFuellstand();
			fuellstand = fuellstand - f.slider.getValue();
			f.myTank.setFuellstand(fuellstand);
			
			f.lblFuellstand.setText(""+fuellstand);
			f.progressBar.setValue((int)fuellstand);
			
			f.log.info(f.slider.getValue() + " Liter wurden verbraucht.");
			
		}
		
		if (obj == f.btnZuruecksetzen) {
			double fuellstand = f.myTank.getFuellstand();
			f.myTank.setFuellstand(0);
			f.lblFuellstand.setText("0");
			f.progressBar.setValue(0);
			
			f.log.info("Tank wurde Zurückgesetzt!");
		}
			
			
	}

}
