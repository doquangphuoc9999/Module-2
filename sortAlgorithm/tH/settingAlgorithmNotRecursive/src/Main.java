public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int []list = {3,4,6,8,9,12,15,16,18,24,87,8};
        System.out.println(binarySearch.binarySearch(list,6));

        System.out.println(binarySearch.binarySearch(list,43));

        System.out.println(binarySearch.binarySearch(list,7));

        System.out.println(binarySearch.binarySearch(list,88));
    }
}
