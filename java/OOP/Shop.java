package OOP;

// for Lab7Task3 code
public class Shop {
    private Product[] menu;
    private Order[] orders;
    private int nextOrderIndex;

    public Shop(Product[] menu) {
        this.menu = menu;
        this.orders = new Order[20];
        nextOrderIndex = 0;
    }

    public Product[] getMenu() {
        return menu;
    }

    void printOrders() {
        for (int i = 0; i < nextOrderIndex; i++) {
            System.out.print("#" + i + " ");
            System.out.println(orders[i].toString());
        }
    }

    void placeOrder(int index, int table) {
        orders[nextOrderIndex] = new Order(table, menu[index]);
        nextOrderIndex++;
    }

    void completeOrder(int resalt) {
        orders[resalt].setComplete(true);
    }

}
