cd ..
docker run -d -p 9091:9090 -v $PWD/prometheus/prometheus-quarkus.yml:/etc/prometheus/prometheus.yml prom/prometheus

