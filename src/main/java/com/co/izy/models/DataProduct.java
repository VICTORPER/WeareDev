package com.co.izy.models;

public class DataProduct {

    private String productname;

    private String quantityperunit;
    private String priceunit;
    private String unitinstock;

    private  String unitorder;
    private String reorderlevel;
    private String category;
    private  String supplier;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(String quantityperunit) {
        this.quantityperunit = quantityperunit;
    }

    public String getPriceunit() {
        return priceunit;
    }

    public void setPriceunit(String priceunit) {
        this.priceunit = priceunit;
    }

    public String getUnitinstock() {
        return unitinstock;
    }

    public String getUnitorder() {
        return unitorder;
    }

    public void setUnitorder(String unitorder) {
        this.unitorder = unitorder;
    }

    public void setUnitinstock(String unitinstock) {
        this.unitinstock = unitinstock;
    }

    public String getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(String reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
