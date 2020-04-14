# Cassandra-POC
A simple spring-boot project using maven build tool showing how to query Cassandra from Host to VM Ubuntu.
Cassandra is running in Ubuntu VM.
To connect or to query cassandra running in Host using eclipse or intellij follow below steps:
  1. Change rpc.address: localhost(present in cassandra.yaml file which is present in config directory)
     to VM IPAddress (you can check it with ifconfig command in terminal of Ubuntu).
  2. While creating cluster connection given this IPAddress which you can see in CassandraConfig class.
