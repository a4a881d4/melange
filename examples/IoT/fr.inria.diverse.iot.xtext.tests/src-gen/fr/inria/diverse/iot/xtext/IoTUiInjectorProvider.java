/*
 * generated by Xtext
 */
package fr.inria.diverse.iot.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class IoTUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return fr.inria.diverse.iot.xtext.ui.internal.IoTActivator.getInstance().getInjector("fr.inria.diverse.iot.xtext.IoT");
	}
	
}