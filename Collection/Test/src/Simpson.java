public class Simpson implements Comparable<Simpson>{
  String name;

    public Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}
