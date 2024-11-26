public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure bb=new BasicStructure();
        bb.planets="2";
        bb.moon="2";
        bb.stars="10";
        bb.sun="1";
        System.out.println("solar system is ready");
        FeatureSun fs=new FeatureSun();
        fs.color="yellow";
        fs.radius="141515156";
        fs.temp="1234124124151524k";

        Planet1 p1=new Planet1();
        p1.color="white";
        p1.radius="12312414miles";
        p1.size="1234141";

        Planet2 p2=new Planet2();
        p2.color="black";
        p2.size="12412414";


    }
}
