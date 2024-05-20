package HW_Seminar2;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}