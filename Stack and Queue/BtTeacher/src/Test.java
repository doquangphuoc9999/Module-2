public class Test {
    public static void main(String[] args) {
        Generic<Nyc> generic = new Generic<>();

        Nyc nyc = new Nyc("phuoc",18);
        Nyc nyc1 = new Nyc("phuoc1",19);

        Nyc[] nycs = {nyc,nyc1};

        for (int i = 0; i < nycs.length;i++){
            generic.push(nycs[i]);
        }

        generic.printf();
    }
}
