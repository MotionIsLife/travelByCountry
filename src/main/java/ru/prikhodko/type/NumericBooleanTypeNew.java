package ru.prikhodko.type;

import org.hibernate.dialect.Dialect;
import org.hibernate.type.NumericBooleanType;

public class NumericBooleanTypeNew extends NumericBooleanType {

    @Override
    public Boolean stringToObject(String string) {
        return !string.equals("0");
    }
    @Override
    public String objectToSQLString(Boolean value, Dialect dialect) {
        return value ? "-1" : "0";
    }
}
