package implementations;

import interfaces.FirstInterface;

/**
 * Other class that implements first interface
 * @see interfaces.FirstInterface
 * @see FirstInterfaceImpl
 */
public class OtherFirstInterfaceImpl implements FirstInterface {
    @Override
    public void doAction() {
        System.out.println("Other first interface action has done!");
    }
}
