package implementations;

import interfaces.FirstInterface;

/**
 * Class that implements first interface
 * @see interfaces.FirstInterface
 * @see OtherFirstInterfaceImpl
 */
public class FirstInterfaceImpl implements FirstInterface {
    @Override
    public void doAction() {
        System.out.println("First interface action has done!");
    }
}
