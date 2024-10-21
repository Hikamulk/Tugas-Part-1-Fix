
package kelas;

public class Product {
    
   String product_name, product_desc;
   int product_id, product_price, product_cat_id;
   
    public int getProductId() {
        return product_id;
    }

    public void setProductId(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public String getProductDesc() {
        return product_desc;
    }

    public void setProductDesc(String product_desc) {
        this.product_desc = product_desc;
    }

    public int getProductPrice() {
        return product_price;
    }

    public void setProductPrice(int product_price) {
        this.product_price = product_price;
    }

    public int getProductCatId() {
        return product_cat_id;
    }

    public void setProductCatId(int product_cat_id) {
        this.product_cat_id = product_cat_id;
    }
}
