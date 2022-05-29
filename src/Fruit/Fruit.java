package Fruit;

public class Fruit {
        private String name;
        private int price;

        public void getDetails(String n , int p)
        {
            name = n;
            price = p;
        }

        public void  printDetails()
        {
           System.out.println("Name " + name + "\tPrice : Rs" + price);
        }
}
