package com.movies.api;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

import java.sql.Types;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();

        // Регистрация типов столбцов
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.VARCHAR, "text");
        registerColumnType(Types.BLOB, "blob");
        registerColumnType(Types.CLOB, "text");
        registerColumnType(Types.DATE, "date");
        registerColumnType(Types.TIME, "time");
        registerColumnType(Types.TIMESTAMP, "datetime");

        // Регистрация стандартных SQL функций
        registerFunction("concat", new StandardSQLFunction("concat", StandardBasicTypes.STRING));
    }

    @Override
    public boolean supportsIdentityColumns() {
        return true; // SQLite поддерживает столбцы с автогенерацией
    }

    @Override
    public boolean supportsLimit() {
        return true; // SQLite поддерживает LIMIT
    }

    @Override
    public boolean supportsCascadeDelete() {
        return true; // Поддержка каскадного удаления
    }
}
