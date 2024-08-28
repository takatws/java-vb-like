package com.takatws;

import com.takatws.model.Customer;
import com.takatws.model.SalesItem;
import com.takatws.model.SalesOrder;

import java.util.ArrayList;

import static com.takatws.utils.VBLike.with;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var order = createOrder();
        with(order,$ -> {
            with($.getSalesItems(), $$ -> {
                $$.forEach(item -> {
                    System.out.print($.getNumber() + " "); /*Number Of Order */
                    System.out.print($.getCustomer().getName() + " "); /*Customer Name*/
                    System.out.print(item.getItemNo() + " "); /*Item No*/
                    System.out.print(item.getQty() + " "); /*Item Quantity*/
                    System.out.print(item.getPrice() + " "); /*Item Price*/
                });
            });
        });
    }
    private static SalesOrder createOrder() {
        var result = new SalesOrder();
        var customer = new Customer();
        with(customer, $ -> {
            $.setId("C001");
            $.setName("Marko Subarkah");
            $.setPriority(true);
        });
        result.setNumber("SO0001");
        result.setCustomer(customer);
        var listItem = new ArrayList<SalesItem>();
        var item = new SalesItem();
        item.setId("Item001");
        item.setItemNo("PC0001");
        item.setQty(10);
        item.setPrice(250000.0);
        listItem.add(item);
        result.setSalesItems(listItem);
        return result;
    }
}
