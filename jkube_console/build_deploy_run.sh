mvn clean install k8s:build k8s:resource k8s:apply
mvn exec:java -Dexec.mainClass="coin.stech.jkube.helloConsole.App" 
# mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.ExecExample" -Dexec.args="pod namespace sh" < test.sh
