package ro.sda.advanced._5_HashMap;

// * Create a class StockItem that has a "name" which is a String and "price" which is a double
//        a "quantityInStock" which is an int and a "reserved" which is also an int
//
//        The class should contain the following methods:
//        - a constructor that takes name, price and quantityInStock as parameters and initialize the fields and (reserved is initialized with 0)
//        - getName() - getter for name
//        - getPrice() - getter for price
//        - setPrice(price) - setter for price (the price is set if and only if the new price is grater then 0.0)
//        - availableQuantity() - returns the available quantity by subtracting "reserved" from quantityInStock
//        - adjustStock(quantity) - adjust the quantityInStock (it could add or subtract also) - check if the new quantity will be greater or equal to 0
//        - reserveStock(quant) - check if quant is lower or equal to availableQuantity() and if it is then add the quant to reserved (return reserved quant)
//        - unreserveStock(quant) - check if quant is lower or equal the reserved and if it is then subtract quant from reserved (return unreserved quant)
//        - finalizeStock(quant) - check if quant is lower or equal then reserved and if it is then subtract quant from quantityInStock and also subtract it from
//         reserved (return quant)
//        - toString() - override
public class StockItem {
    private String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantityToReserved) {
        if (quantityToReserved <= availableQuantity()) {
            this.reserved += quantityToReserved;
            return quantityToReserved;
        }
        throw new UnavailableStockException("The quantity that you want is not available");
    }

    public int unReserveStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The quantity you want to unReserve is to big...");
    }

    public int finalizeStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The stock should be reserved first...");
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". reserved: " + this.reserved;
    }

}
