package ru.prikhodko.type;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NumericBooleanTypeNewUserType implements UserType {
    @Override
    public int[] sqlTypes() {
        return new int[] { StandardBasicTypes.NUMERIC_BOOLEAN.sqlType()};
    }

    @Override
    public Class<NumericBooleanTypeNew> returnedClass() {
        return NumericBooleanTypeNew.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        if (null == x || null == y)
        {
            return false;
        }
        return x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names,
                              SessionImplementor session, Object owner)
            throws HibernateException, SQLException {
        NumericBooleanTypeNew numericBooleanTypeNew = new NumericBooleanTypeNew();
        /**
         * попробовать извлечь данные из rs и занести в numericBooleanTypeNew
         */

        return numericBooleanTypeNew;
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index,
                            SessionImplementor session)
            throws HibernateException, SQLException {//прихит флаг
        //NumericBooleanTypeNew numericBooleanTypeNew = (NumericBooleanTypeNew) value;

        if(value instanceof Boolean) {
            st.setBoolean(index, (Boolean) value);
        } else {
            st.setString(index, (String) value);
        }
        /**
         * запихнуть в st данные из value (NumericBooleanTypeNew)
         * st.setTimestamp(index, createdTimestamp);
         * st.setNull(index, StandardBasicTypes.TIMESTAMP.sqlType());
         * st.setTimestamp(index + 1, modifiedTimestamp);
         * st.setNull(index + 1, StandardBasicTypes.TIMESTAMP.sqlType());
         */
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {//приходит флаг
        NumericBooleanTypeNew copy = new NumericBooleanTypeNew();
        Object o = copy.deepCopy(value, null);
        Boolean flag = (Boolean) value;
        /*if(false) {
            return copy.objectToSQLString(false, null);
        }*/
        /*AuditDate auditData = (AuditDate) value;
        AuditDate copy = new AuditDate(auditData.getCreatedDate(),
                auditData.getModifiedDate());*/
        return value;//Хотя иногда нужно передавать копию. http://internetka.in.ua/hibernate-user-type-part2/ Хотя я не знаю как.
        //return copy.objectToSQLString(flag, null);
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value)
            throws HibernateException {
        return (Serializable) this.deepCopy(value);
    }

    @Override
    public Object assemble(Serializable cached, Object owner)
            throws HibernateException {
        return this.deepCopy(cached);
    }

    @Override
    public Object replace(Object original, Object target, Object owner)
            throws HibernateException {
        return this.deepCopy(original);
    }
}
