package lab6.part3SimplifyingConditionalExpressions.task7IntroduceNullObject;

public class NoAddress implements IAddress {
    private String street;
    private String city;

    public NoAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
