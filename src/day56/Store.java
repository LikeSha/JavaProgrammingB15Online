package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
    List<Product> allProducts; // store has list of products


    public List<Product> getAllProductsMoreThanAveragePrice(){
        List<Product> myList = new ArrayList<>();
        double average = getAveragePrice();

        for(Product each : allProducts){
            if(each.getPrice() > average){
                myList.add(each);
            }
        }
        return myList;

    }

    /**
     *
     * A method to get most expensive Product
     * @return The product object with max price
     */

    public Product getMostExpensiveProduct() {

        // int max = allProducts.get(0).getPrice();
        //assume my max price is lowest number in integer range so it will be replaced by any price
//        int max = Integer.MIN_VALUE;
//        int maxIndex = -1; // assuming our index in integer range so it will be replaced by any price
//
//        for (int x = 0; x < allProducts.size(); x++) {
//
//            if (allProducts.get(x).getPrice() > max) {
//                max = allProducts.get(x).getPrice();
//                maxIndex = x;
//            }
//
//        }
//        System.out.println("max = " + max);
//        return allProducts.get(maxIndex);

        Product MaxProduct = null; //assume it' null before we actually find what we are looking for
        int max = Integer.MIN_VALUE;
        for (Product each : allProducts) {
            if (each.getPrice() > max) {
                max = each.getPrice();
                MaxProduct = each;// if max price found , assign maxProduct to the product with max price
            }
        }
        return MaxProduct; // eventually return the product
    }

    /**
     * A method to calculate the average price
     * @return The average Price
     */

    public double getAveragePrice(){
        //average is sum of the product s divided by product count
        return findSumOfAllProductPrice()/allProducts.size();
    }

    /**
     * calcuulate the sum of all product price
     * @return the sum of all prodcuts price
     *
     */

      public int findSumOfAllProductPrice(){
          int sum = 0;
          for(Product each : allProducts){
              sum += each.getPrice();
          }
          return sum;

      }


    /**
     * It will check whether we have the product in the list
     * @param p Product object to be checked
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product p){

        return allProducts.contains(p);
    }

    /**
     * Find out 0 base location of the product in the store
     * product object to be checked
     * @return the index of the prodcut in the list
     */
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }


    public void removeProduct(Product p){

        if(checkIfProductExists(p)==true){
            allProducts.remove(p);
        }else{
            System.out.println("we don't have " + p);
        }

    }

    /**
     * Display all products in human readable manner
     */
    public void displayProducts(){

        System.out.println(name + " Denis Stroe has below products : ");
        for( Product each:allProducts){
            System.out.println("\t each = " + each);

        }
    }



    /**
     * Counting how many products we have in the store
     * @return the size of allProducts List
     */

    public int getProductCount(){

        return allProducts.size();
    }

    /**
     * This verison of addProdcut will directly accept ready Product object
     * so it can be added to the allProducts list
     * @param p
     */

    public void addProduct(Product p){

        System.out.println("calling addProduct(Product p");
        allProducts.add(p);

    }

    /**
     * This version of addProduct will accept data that necessary to
     * create Product object so it can be eventually added to the List
     * @param productName
     * @param productPrice
     */
    public void addProduct(String productName , int productPrice){

        Product newP = new Product(productName,productPrice);
        allProducts.add(newP);

    }


    public Store(){
        this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();
    }
    // 2 Arg constructor to accept List<Product>
    // First line of constructor should call no arg constructor to reuse initialization logic
    public Store(String name, List<Product> otherList) {
        this();// calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
