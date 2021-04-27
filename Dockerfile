FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/api-transferencia.sh"]

COPY api-transferencia.sh /usr/bin/api-transferencia.sh
COPY target/api-transferencia.jar /usr/share/api-transferencia/api-transferencia.jar
