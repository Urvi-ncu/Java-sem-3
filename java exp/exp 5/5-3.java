class Box {
    float width;
    float height;
    float depth;
}

class BoxWeight extends Box {
    float weight;
}

class Testbox {
    public static void main(String[] args) {
        System.out.println("Urvi 24csu226");
        Box box = new Box();
        box.width = 5.0f;
        box.height = 7.0f;
        box.depth = 3.0f;

        BoxWeight boxweight = new BoxWeight();
        boxweight.width = 5.0f;
        boxweight.height = 7.0f;
        boxweight.depth = 3.0f;
        boxweight.weight = 10.0f;

        System.out.println("Box dimensions: " + box.width + " x " + box.height + " x " + box.depth);
        System.out.println("BoxWeight dimensions: " + boxweight.width + " x " + boxweight.height + " x " + boxweight.depth);
        System.out.println("BoxWeight weight: " + boxweight.weight);
    }
}