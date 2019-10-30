// 标题:
//      反转链表

// 描述:
//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表

// 思路:

/**
 * Created by huyanshi on 191029.
 * <p>
 * 1. 迭代版本, 重点在于保存下一个以及前面一个的变量.
 * <p>
 * 2. 递归版本,

Disconnected from the target VM, address: '127.0.0.1:64827', transport: 'socket'
/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:64827,suspend=y,server=n -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/pfliu/Library/Caches/IntelliJIdea2018.3/captureAgent/debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/lib/tools.jar:/Users/pfliu/workspace/zp-search2/target/test-classes:/Users/pfliu/workspace/zp-search2/target/classes:/Users/pfliu/.m2/repository/com/zhipin/tensorflow-serve-client/0.1/tensorflow-serve-client-0.1.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-protobuf/1.20.0/grpc-protobuf-1.20.0.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-core/1.20.0/grpc-core-1.20.0.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-context/1.20.0/grpc-context-1.20.0.jar:/Users/pfliu/.m2/repository/com/google/android/annotations/4.1.1.4/annotations-4.1.1.4.jar:/Users/pfliu/.m2/repository/io/opencensus/opencensus-api/0.19.2/opencensus-api-0.19.2.jar:/Users/pfliu/.m2/repository/io/opencensus/opencensus-contrib-grpc-metrics/0.19.2/opencensus-contrib-grpc-metrics-0.19.2.jar:/Users/pfliu/.m2/repository/com/google/protobuf/protobuf-java/3.7.1/protobuf-java-3.7.1.jar:/Users/pfliu/.m2/repository/com/google/api/grpc/proto-google-common-protos/1.12.0/proto-google-common-protos-1.12.0.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-protobuf-lite/1.20.0/grpc-protobuf-lite-1.20.0.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-stub/1.20.0/grpc-stub-1.20.0.jar:/Users/pfliu/.m2/repository/io/grpc/grpc-netty-shaded/1.20.0/grpc-netty-shaded-1.20.0.jar:/Users/pfliu/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/pfliu/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/pfliu/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/pfliu/.m2/repository/com/bosszhipin/data-common/8.57/data-common-8.57.jar:/Users/pfliu/.m2/repository/com/bosszhipin/zp-client/7.57/zp-client-7.57.jar:/Users/pfliu/.m2/repository/com/techwolf/oceanus/oceanus-service-api/1.3.10.9/oceanus-service-api-1.3.10.9.jar:/Users/pfliu/.m2/repository/org/apache/thrift/libthrift/0.11.0/libthrift-0.11.0.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-data-client/1.95/zhipin-data-client-1.95.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-dubbo/1.1.779/techwolf-boss-dubbo-1.1.779.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-base-common/1.1.779/techwolf-boss-base-common-1.1.779.jar:/Users/pfliu/.m2/repository/io/dropwizard/metrics/metrics-core/3.2.5/metrics-core-3.2.5.jar:/Users/pfliu/.m2/repository/io/dropwizard/metrics/metrics-jvm/3.2.5/metrics-jvm-3.2.5.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-data-api-def/1.95/zhipin-data-api-def-1.95.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-data-model/1.95/zhipin-data-model-1.95.jar:/Users/pfliu/.m2/repository/com/github/sgroschupf/zkclient/0.1/zkclient-0.1.jar:/Users/pfliu/.m2/repository/args4j/args4j/2.0.26/args4j-2.0.26.jar:/Users/pfliu/.m2/repository/mysql/mysql-connector-java/5.1.31/mysql-connector-java-5.1.31.jar:/Users/pfliu/.m2/repository/com/bosszp/dbcp/1.05/dbcp-1.05.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-core/8.0.0/lucene-core-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-analyzers-common/8.0.0/lucene-analyzers-common-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-queries/8.0.0/lucene-queries-8.0.0.jar:/Users/pfliu/.m2/repository/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-highlighter/8.0.0/lucene-highlighter-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-memory/8.0.0/lucene-memory-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-queryparser/8.0.0/lucene-queryparser-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/lucene/lucene-sandbox/8.0.0/lucene-sandbox-8.0.0.jar:/Users/pfliu/.m2/repository/org/apache/httpcomponents/httpclient/4.3.5/httpclient-4.3.5.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-dbwolf-datasource4jade/2.1.46/techwolf-dbwolf-datasource4jade-2.1.46.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-dbwolf-client/2.1.46/techwolf-dbwolf-client-2.1.46.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-dbwolf-xml/2.1.46/techwolf-dbwolf-xml-2.1.46.jar:/Users/pfliu/.m2/repository/dom4j/dom4j/1.6.1/dom4j-1.6.1.jar:/Users/pfliu/.m2/repository/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-dbwolf-zookeeper/2.1.46/techwolf-dbwolf-zookeeper-2.1.46.jar:/Users/pfliu/.m2/repository/commons-dbcp/commons-dbcp/1.4/commons-dbcp-1.4.jar:/Users/pfliu/.m2/repository/commons-pool/commons-pool/1.5.4/commons-pool-1.5.4.jar:/Users/pfliu/.m2/repository/com/alibaba/druid/1.1.2/druid-1.1.2.jar:/Users/pfliu/.m2/repository/commons-configuration/commons-configuration/1.7/commons-configuration-1.7.jar:/Users/pfliu/.m2/repository/commons-digester/commons-digester/1.8.1/commons-digester-1.8.1.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-dbwolf-jade/2.1.46/techwolf-dbwolf-jade-2.1.46.jar:/Users/pfliu/.m2/repository/org/springframework/spring-jdbc/3.2.4.RELEASE/spring-jdbc-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-tx/3.2.4.RELEASE/spring-tx-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/commons-jexl/commons-jexl/1.1/commons-jexl-1.1.jar:/Users/pfliu/.m2/repository/commons-lang/commons-lang/2.4/commons-lang-2.4.jar:/Users/pfliu/.m2/repository/postgresql/postgresql/8.3-603.jdbc4/postgresql-8.3-603.jdbc4.jar:/Users/pfliu/.m2/repository/log4j/log4j/1.2.16/log4j-1.2.16.jar:/Users/pfliu/.m2/repository/org/springframework/spring-core/3.2.4.RELEASE/spring-core-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-test/3.2.4.RELEASE/spring-test-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-beans/3.2.4.RELEASE/spring-beans-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-context/3.2.4.RELEASE/spring-context-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-context-support/3.2.4.RELEASE/spring-context-support-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/org/springframework/spring-aop/3.2.4.RELEASE/spring-aop-3.2.4.RELEASE.jar:/Users/pfliu/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:/Users/pfliu/.m2/repository/com/github/shyiko/mysql-binlog-connector-java/0.20.0/mysql-binlog-connector-java-0.20.0.jar:/Users/pfliu/.m2/repository/com/github/jbellis/jamm/0.3.3/jamm-0.3.3.jar:/Users/pfliu/.m2/repository/com/engagor/jfasttext/1.3/jfasttext-1.3.jar:/Users/pfliu/.m2/repository/org/bytedeco/javacpp/1.3.1/javacpp-1.3.1.jar:/Users/pfliu/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:/Users/pfliu/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/pfliu/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/pfliu/.m2/repository/redis/clients/jedis/3.1.0-m1/jedis-3.1.0-m1.jar:/Users/pfliu/.m2/repository/com/github/spullara/mustache/java/compiler/0.9.5/compiler-0.9.5.jar:/Users/pfliu/.m2/repository/com/google/guava/guava/26.0-jre/guava-26.0-jre.jar:/Users/pfliu/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:/Users/pfliu/.m2/repository/org/checkerframework/checker-qual/2.5.2/checker-qual-2.5.2.jar:/Users/pfliu/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:/Users/pfliu/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:/Users/pfliu/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:/Users/pfliu/.m2/repository/cn/techwolf/tseg/1.43/tseg-1.43.jar:/Users/pfliu/.m2/repository/commons-io/commons-io/2.5/commons-io-2.5.jar:/Users/pfliu/.m2/repository/com/google/zxing/core/3.3.3/core-3.3.3.jar:/Users/pfliu/.m2/repository/com/aliyun/aliyun-java-sdk-core/3.0.7/aliyun-java-sdk-core-3.0.7.jar:/Users/pfliu/.m2/repository/com/aliyun/aliyun-java-sdk-green/3.0.0/aliyun-java-sdk-green-3.0.0.jar:/Users/pfliu/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:/Users/pfliu/.m2/repository/com/zhipin/bean/1.09/bean-1.09.jar:/Users/pfliu/.m2/repository/com/esotericsoftware/kryo/kryo/2.24.0/kryo-2.24.0.jar:/Users/pfliu/.m2/repository/com/esotericsoftware/minlog/minlog/1.2/minlog-1.2.jar:/Users/pfliu/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/pfliu/.m2/repository/org/apache/commons/commons-math3/3.6.1/commons-math3-3.6.1.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-security/1.1.779/techwolf-boss-security-1.1.779.jar:/Users/pfliu/.m2/repository/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar:/Users/pfliu/.m2/repository/commons-codec/commons-codec/1.9/commons-codec-1.9.jar:/Users/pfliu/.m2/repository/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-sms-client/1.2.3/techwolf-sms-client-1.2.3.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-sms-def/1.2.3/techwolf-sms-def-1.2.3.jar:/Users/pfliu/.m2/repository/commons-httpclient/commons-httpclient/3.1/commons-httpclient-3.1.jar:/Users/pfliu/.m2/repository/com/alibaba/fastjson/1.2.29/fastjson-1.2.29.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-utils/1.1.779/techwolf-boss-utils-1.1.779.jar:/Users/pfliu/.m2/repository/de/malkusch/whois-server-list/public-suffix-list/2.2.0/public-suffix-list-2.2.0.jar:/Users/pfliu/.m2/repository/com/sina/weibo4j/1.2/weibo4j-1.2.jar:/Users/pfliu/.m2/repository/org/codehaus/jackson/jackson-core-asl/1.9.9/jackson-core-asl-1.9.9.jar:/Users/pfliu/.m2/repository/org/codehaus/jackson/jackson-core-lgpl/1.9.12/jackson-core-lgpl-1.9.12.jar:/Users/pfliu/.m2/repository/org/codehaus/jackson/jackson-mapper-asl/1.9.12/jackson-mapper-asl-1.9.12.jar:/Users/pfliu/.m2/repository/org/apache/commons/commons-collections4/4.1/commons-collections4-4.1.jar:/Users/pfliu/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.6/jcl-over-slf4j-1.7.6.jar:/Users/pfliu/.m2/repository/org/apache/httpcomponents/httpmime/4.5.5/httpmime-4.5.5.jar:/Users/pfliu/.m2/repository/net/sf/json-lib/json-lib/2.4/json-lib-2.4-jdk15.jar:/Users/pfliu/.m2/repository/commons-beanutils/commons-beanutils/1.8.0/commons-beanutils-1.8.0.jar:/Users/pfliu/.m2/repository/net/sf/ezmorph/ezmorph/1.0.6/ezmorph-1.0.6.jar:/Users/pfliu/.m2/repository/com/alibaba/dubbo/2.5.12-ZP/dubbo-2.5.12-ZP.jar:/Users/pfliu/.m2/repository/org/springframework/spring-expression/4.3.10.RELEASE/spring-expression-4.3.10.RELEASE.jar:/Users/pfliu/.m2/repository/org/jboss/netty/netty/3.2.5.Final/netty-3.2.5.Final.jar:/Users/pfliu/.m2/repository/io/netty/netty-all/4.0.35.Final/netty-all-4.0.35.Final.jar:/Users/pfliu/.m2/repository/org/javassist/javassist/3.20.0-GA/javassist-3.20.0-GA.jar:/Users/pfliu/.m2/repository/org/springframework/spring-web/4.3.10.RELEASE/spring-web-4.3.10.RELEASE.jar:/Users/pfliu/.m2/repository/javax/mail/mail/1.4.4/mail-1.4.4.jar:/Users/pfliu/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar:/Users/pfliu/.m2/repository/com/squareup/okhttp3/okhttp/3.10.0/okhttp-3.10.0.jar:/Users/pfliu/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:/Users/pfliu/.m2/repository/com/googlecode/libphonenumber/libphonenumber/7.7.2/libphonenumber-7.7.2.jar:/Users/pfliu/.m2/repository/com/googlecode/libphonenumber/geocoder/2.55/geocoder-2.55.jar:/Users/pfliu/.m2/repository/com/googlecode/libphonenumber/prefixmapper/2.55/prefixmapper-2.55.jar:/Users/pfliu/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar:/Users/pfliu/.m2/repository/com/microsoft/ews-java-api/ews-java-api/2.0/ews-java-api-2.0.jar:/Users/pfliu/.m2/repository/joda-time/joda-time/2.8/joda-time-2.8.jar:/Users/pfliu/.m2/repository/com/google/zxing/javase/3.3.3/javase-3.3.3.jar:/Users/pfliu/.m2/repository/com/beust/jcommander/1.72/jcommander-1.72.jar:/Users/pfliu/.m2/repository/com/github/jai-imageio/jai-imageio-core/1.4.0/jai-imageio-core-1.4.0.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-kafka-client/0.20/techwolf-kafka-client-0.20.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-kafka-common-lib/0.15/techwolf-kafka-common-lib-0.15.jar:/Users/pfliu/.m2/repository/cn/techwolf/data/data-client/5.1.10/data-client-5.1.10.jar:/Users/pfliu/.m2/repository/javax/servlet/servlet-api/2.4/servlet-api-2.4.jar:/Users/pfliu/.m2/repository/com/101tec/zkclient/0.9/zkclient-0.9.jar:/Users/pfliu/.m2/repository/org/slf4j/slf4j-log4j12/1.7.21/slf4j-log4j12-1.7.21.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-api-http-client/1.1.801/techwolf-boss-api-http-client-1.1.801.jar:/Users/pfliu/.m2/repository/org/apache/kafka/kafka_2.11/0.10.1.0/kafka_2.11-0.10.1.0.jar:/Users/pfliu/.m2/repository/org/apache/kafka/kafka-clients/0.10.1.0/kafka-clients-0.10.1.0.jar:/Users/pfliu/.m2/repository/net/jpountz/lz4/lz4/1.3.0/lz4-1.3.0.jar:/Users/pfliu/.m2/repository/org/xerial/snappy/snappy-java/1.1.2.6/snappy-java-1.1.2.6.jar:/Users/pfliu/.m2/repository/net/sf/jopt-simple/jopt-simple/4.9/jopt-simple-4.9.jar:/Users/pfliu/.m2/repository/com/yammer/metrics/metrics-core/2.2.0/metrics-core-2.2.0.jar:/Users/pfliu/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar:/Users/pfliu/.m2/repository/org/apache/zookeeper/zookeeper/3.4.8/zookeeper-3.4.8.jar:/Users/pfliu/.m2/repository/jline/jline/0.9.94/jline-0.9.94.jar:/Users/pfliu/.m2/repository/io/netty/netty/3.7.0.Final/netty-3.7.0.Final.jar:/Users/pfliu/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.4/scala-parser-combinators_2.11-1.0.4.jar:/Users/pfliu/.m2/repository/org/apache/commons/commons-pool2/2.6.1/commons-pool2-2.6.1.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-chat-api-def/1.0.312/zhipin-chat-api-def-1.0.312.jar:/Users/pfliu/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.4/jackson-databind-2.9.4.jar:/Users/pfliu/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/pfliu/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.4/jackson-core-2.9.4.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-common-api-def/1.0.183/zhipin-common-api-def-1.0.183.jar:/Users/pfliu/.m2/repository/cn/techwolf/service/base/base-api/1.0.179/base-api-1.0.179.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-protocol-def/1.1.779/techwolf-boss-protocol-def-1.1.779.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-mqtt-protocol/1.1.779/techwolf-boss-mqtt-protocol-1.1.779.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-weixin-api-def/1.0.65/zhipin-weixin-api-def-1.0.65.jar:/Users/pfliu/.m2/repository/org/projectlombok/lombok/1.16.22/lombok-1.16.22.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-service-def/1.3.789/techwolf-boss-service-def-1.3.789.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-passport-api-def/1.0.214/zhipin-passport-api-def-1.0.214.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-pay-api-client/1.2.108/zhipin-pay-api-client-1.2.108.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-common-api-client/1.0.183/zhipin-common-api-client-1.0.183.jar:/Users/pfliu/.m2/repository/cn/techwolf/tracer/instrument-dubbo/1.36/instrument-dubbo-1.36.jar:/Users/pfliu/.m2/repository/cn/techwolf/tracer/trace-core/1.36/trace-core-1.36.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-relation-api-def/1.0.411/zhipin-relation-api-def-1.0.411.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-relation-constant/1.0.411/zhipin-relation-constant-1.0.411.jar:/Users/pfliu/.m2/repository/com/netflix/archaius/archaius-core/0.7.4/archaius-core-0.7.4.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-pay-api-def/1.2.108/zhipin-pay-api-def-1.2.108.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-geek-api-def/1.0.433/zhipin-geek-api-def-1.0.433.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-item-api-def/1.406/zhipin-item-api-def-1.406.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-item-common/1.406/zhipin-item-common-1.406.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-hunter-dubbo-def/1.3.33/techwolf-boss-hunter-dubbo-def-1.3.33.jar:/Users/pfliu/.m2/repository/cn/techwolf/techwolf-boss-hunter-service-client/1.3.33/techwolf-boss-hunter-service-client-1.3.33.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-user-api-def/1.0.168/zhipin-user-api-def-1.0.168.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-moment-api-def/1.0.151/zhipin-moment-api-def-1.0.151.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-moment-common/1.0.151/zhipin-moment-common-1.0.151.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-block-api-def/1.447/zhipin-block-api-def-1.447.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-block-constant/1.447/zhipin-block-constant-1.447.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-block-model/1.447/zhipin-block-model-1.447.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-block-service-def/1.447/zhipin-block-service-def-1.447.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-block-common/1.447/zhipin-block-common-1.447.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-boss-api-default-client/1.817/zhipin-boss-api-default-client-1.817.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-boss-api-def/1.817/zhipin-boss-api-def-1.817.jar:/Users/pfliu/.m2/repository/com/zhipin/zhipin-boss-constant/1.817/zhipin-boss-constant-1.817.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.zhipin.search.DictionaryTest,testSchool
Connected to the target VM, address: '127.0.0.1:64827', transport: 'socket'
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/Users/pfliu/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/Users/pfliu/.m2/repository/org/slf4j/slf4j-log4j12/1.7.21/slf4j-log4j12-1.7.21.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [ch.qos.logback.classic.util.ContextSelectorStaticBinder]

Disconnected from the target VM, address: '127.0.0.1:64827', transport: 'socket'

Process finished with exit code 0
);
        a[4] = new ListNode(5);

        a[0].next = a[1];
        a[1].next = a[2];
        a[2].next = a[3];
        a[3].next = a[4];

        System.out.println(solution.reverseList(a[0]).val);
    }


// My Code End


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseList2(ListNode head) {
            if (head == null) return null;
            ListNode pre = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;

        }

        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode listNode = reverseList(head.next);
            ListNode tmp = listNode;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            head.next = null;
            tmp.next = head;
            return listNode;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
