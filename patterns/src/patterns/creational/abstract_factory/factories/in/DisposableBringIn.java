package patterns.creational.abstract_factory.factories.in;

import patterns.creational.abstract_factory.IDocument;
import patterns.creational.abstract_factory.factories.IFirmFactory;
import patterns.creational.abstract_factory.order.BringInOrder;
import patterns.creational.abstract_factory.permit.DisposablePermit;

public class DisposableBringIn implements IFirmFactory {

    public IDocument createOrder() {
        return new BringInOrder();
    }

    public IDocument createPermit() {
        return new DisposablePermit();
    }
}