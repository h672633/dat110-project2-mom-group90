package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		Client cl= new Client ("Sensor", Common.BROKERHOST, Common.BROKERPORT);

		cl.connect();

		for(int i = 0; i<COUNT; i++){
			String msg = Integer.toString(sn.read());
			cl.publish(Common.TEMPTOPIC,msg);

			try{
				Thread.sleep(2500);
			}catch(InterruptedException e){

			}
		}

		cl.disconnect();

		System.out.println("Temperature device stopping ... ");


	}
}