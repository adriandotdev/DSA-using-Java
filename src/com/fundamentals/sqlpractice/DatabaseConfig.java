package com.fundamentals.sqlpractice;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;

public class DatabaseConfig {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/parkncharge_v3");
        config.setUsername("root");
        config.setPassword("4332wurx");
        config.setMaximumPoolSize(10); // Maximum number of connections in the pool
        config.setMinimumIdle(2); // Minimum number of idle connections in the pool
        config.setConnectionTimeout(30000); // Connection timeout in milliseconds
        config.setIdleTimeout(600000); // Idle timeout in milliseconds
        config.setMaxLifetime(1800000); // Maximum lifetime of a connection in milliseconds

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }

    public static void printPoolStats(HikariDataSource dataSource) {
        HikariPoolMXBean poolMXBean = dataSource.getHikariPoolMXBean();
        System.out.println("Total Connections: " + poolMXBean.getTotalConnections());
        System.out.println("Active Connections: " + poolMXBean.getActiveConnections());
        System.out.println("Idle Connections: " + poolMXBean.getIdleConnections());
        System.out.println("Threads Awaiting Connection: " + poolMXBean.getThreadsAwaitingConnection());
    }
}
