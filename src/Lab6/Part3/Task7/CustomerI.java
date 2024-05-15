package lab6.part3SimplifyingConditionalExpressions.task7IntroduceNullObject;

public class CustomerI {
    private IAddress address;

    public CustomerI(Address address) {
        this.address = address;
    }

    public IAddress getAddress() {
        return address;
    }
}
