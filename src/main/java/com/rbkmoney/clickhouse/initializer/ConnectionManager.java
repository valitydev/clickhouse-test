package com.rbkmoney.clickhouse.initializer;

import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.ClickHouseContainer;
import ru.yandex.clickhouse.ClickHouseDataSource;
import ru.yandex.clickhouse.settings.ClickHouseProperties;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Slf4j
public class ConnectionManager {

    public static Connection getSystemConn(ClickHouseContainer clickHouseContainer) throws SQLException {
        ClickHouseProperties properties = new ClickHouseProperties();
        ClickHouseDataSource dataSource = new ClickHouseDataSource(clickHouseContainer.getJdbcUrl(), properties);
        return dataSource.getConnection();
    }

}
