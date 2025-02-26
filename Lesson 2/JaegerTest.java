public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();

        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setBodyLanguage("Street Fighter");
        gipsyDanger.setWeapon("Plasma Cannon");
        gipsyDanger.setHight(79.25f);
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);

        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon" , "Muay Thai triplet" ,"IB22 Plasmacaster" , 250 , 1.722f , 9 );

    System.out.println("First Jaeger: " + gipsyDanger.getModelName());
    System.out.println("His body Language: " + gipsyDanger.getBodyLanguage());
    System.out.println("Specifications:");
    System.out.println("    Weapon: " + gipsyDanger.getWeapon());
    System.out.println("    Hight: " + gipsyDanger.getHight() + " meters");
    System.out.println("    Weight: " + gipsyDanger.getWeight() + " thousand tonns");
    System.out.println("    Speed: " + gipsyDanger.getSpeed());
    System.out.println("Jaeger Test: ");
    System.out.println("Drift " + gipsyDanger.drift());
    gipsyDanger.scanning();
    gipsyDanger.useWeapon();
    System.out.println("\n");

    System.out.println("Second Jaeger: " + crimsonTyphoon.getModelName());
    System.out.println("His body Language: " + crimsonTyphoon.getBodyLanguage());
    System.out.println("Specifications:");
    System.out.println("    Weapon: " + crimsonTyphoon.getWeapon());
    System.out.println("    Hight: " + crimsonTyphoon.getHight() + " meters");
    System.out.println("    Weight: " + crimsonTyphoon.getWeight() + " thousand tonns");
    System.out.println("    Speed: " + crimsonTyphoon.getSpeed());
    System.out.println("Jaeger Test: ");
    System.out.println("Drift " + crimsonTyphoon.drift());
    crimsonTyphoon.scanning();
    crimsonTyphoon.useWeapon();


    }
}