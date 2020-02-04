package src.com.javaguru.shoppinglist;

import java.math.BigDecimal;

public class ProductValidation {
    public String name;
    public BigDecimal price;
    public String category;
    public BigDecimal percent;

    public ProductValidation(String name, BigDecimal price, String category, BigDecimal percent) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.percent = percent;
    }

    public int productValidationName(String name) {
        if (name.length() < 3 | name.length() > 32) {
            int validationNumber = 1;
            return validationNumber;
        } else {
            int validationNumber = 2;
            return validationNumber;
        }
    }

    public int productValidationPrice(BigDecimal price) {
        BigDecimal bigDecimalNull = new BigDecimal("0");
        int comparisonResult=price.compareTo(bigDecimalNull);
        if (comparisonResult == -1) {
            int validationNumber = 1;
            return validationNumber;
        } else {
            int validationNumber = 2;
            return validationNumber;
        }
    }

    public int productValidationPercent(BigDecimal percent) {
        BigDecimal bigDecimalHundred = new BigDecimal("100");
        int comparisonResult=percent.compareTo(bigDecimalHundred);
        if (comparisonResult == 1 ) {
            int validationNumber = 1;
            return validationNumber;
        } else {
            int validationNumber = 2;
            return validationNumber;
        }
    }
}
