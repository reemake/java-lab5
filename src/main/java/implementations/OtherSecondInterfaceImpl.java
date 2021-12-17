package implementations;

import interfaces.SecondInterface;

/**
 * Other class that implements second interface
 * @see interfaces.SecondInterface
 * @see SecondInterfaceImpl
 */
public class OtherSecondInterfaceImpl implements SecondInterface {
    @Override
    public void doAction() {
        System.out.println("Other second interface action has done!");
    }
}
