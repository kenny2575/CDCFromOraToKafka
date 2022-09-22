import io.debezium.connector.oracle.OracleConnectorConfig;
import io.debezium.embedded.Connect;
import io.debezium.engine.ChangeEvent;
import io.debezium.engine.DebeziumEngine;
import io.debezium.connector.oracle.OracleConnector;
import io.debezium.config.Field;
import io.debezium.config.CommonConnectorConfig;
import io.debezium.engine.format.Json;
import io.debezium.jdbc.JdbcConfiguration;
import io.debezium.relational.RelationalDatabaseConnectorConfig;
import org.apache.kafka.common.config.Config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CDCTrying {
    public static void main(String[] args) {
        OracleConnector connector = new OracleConnector();
        Map<String, String> config = new HashMap<>();
        config.put(CommonConnectorConfig.TOPIC_PREFIX.name(), "Elvis");
        config.put(OracleConnectorConfig.HOSTNAME.name(), "d5cftm-apc005ln.corp.dev.vtb");
        config.put(OracleConnectorConfig.PORT.name(), "1521");
        config.put(OracleConnectorConfig.DATABASE_NAME.name(), "ELVIS");
        config.put(OracleConnectorConfig.USER.name(), "IBS");
        config.put(OracleConnectorConfig.PASSWORD.name(), "IBS");
        connector.start(config);

    }
}

