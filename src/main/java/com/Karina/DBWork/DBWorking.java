package com.Karina.DBWork;

import com.Karina.Values.Values;

import java.sql.SQLException;
import java.util.List;

public interface DBWorking {
    public void addValues(Values values) throws SQLException;
    public List<Values> getLastValues() throws Exception;
    public boolean isConnectionValid();
    public void clearLastRequests() throws SQLException;
}
