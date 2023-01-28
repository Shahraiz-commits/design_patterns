package decorator;
/**
 * A cone that extends ice cream and manages each cone's properties
 * @author Shahraiz Aziz
 */
public class Cone extends IceCream {
    private ConeType coneType;

    /**
     * Initializes an instance of a ConeType and sets the current cone type description
     * @param coneType An instance of a ConeType
     */
    public Cone(ConeType coneType) {
        this.coneType = coneType;
        if(coneType == ConeType.CHOCOLATE_DIPPED_CONE) {
            this.description = "Chocolate dipped cone";
        } else if(coneType == ConeType.PRETZEL_CONE) {
            this.description = "Pretzel cone";
        } else if(coneType == ConeType.WAFFLE_CONE) {
            this.description = "Waffle cone";  
        } else this.description = "Sugar cone";
    }

    /**
     * Uses the current cone type to determine it's cost
     * @return A double representation of a cone type's cost
     */
    public double getCost() {
        if(coneType == ConeType.CHOCOLATE_DIPPED_CONE) {
            return 1.5;
        } else if(coneType == ConeType.PRETZEL_CONE) {
            return 1.8;   
        } else if(coneType == ConeType.WAFFLE_CONE) {
            return 1.2;   
        } else return 0.75;
    }
    
}
