public class CategoryDrinks {
    private String categoryName;
    private int id;

    public CategoryDrinks(String CategoryName, int id) {
        this.categoryName = CategoryName;
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
