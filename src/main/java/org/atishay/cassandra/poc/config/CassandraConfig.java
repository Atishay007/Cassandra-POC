package org.atishay.cassandra.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

@Configuration
public class CassandraConfig {

	@Bean
	public Cluster getCluster() {
		// The IP address is of my VM, default port of Cassandra 9042.
		//We have to make change in cassandra.yaml file for rpc.address from localhost
		//to VM IP address.
		//It is good to add more contact points, so if 1 node is down, then we can connect to other.
		//We can also put these Ip in application.properties and from there we can read.
		return Cluster.builder().addContactPoint("192.168.40.139").withoutJMXReporting().build();
	}

	@Bean
	public Session getSession() {
		return getCluster().connect();
	}
}
