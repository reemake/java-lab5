package implementations;

import interfaces.SecondInterface;

/**
 * Class that implements second interface
 * @see interfaces.SecondInterface
 * @see OtherSecondInterfaceImpl
 */
public class SecondInterfaceImpl implements SecondInterface {
    @Override
    public void doAction() {
        System.out.println("Second interface action has done!");
    }
}
