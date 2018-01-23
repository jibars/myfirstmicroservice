<!-- Badger start badges -->
[![Status of the build](https://badger.spt-engprod-pro.schibsted.io/badge/travis/scmspain/myfirstproject)](https://travis.schibsted.io/scmspain/myfirstproject) 
[![Testing Coverage](https://badger.spt-engprod-pro.schibsted.io/badge/coverage/scmspain/myfirstproject)](https://reports.spt-engprod-pro.schibsted.io/#/scmspain/myfirstproject?branch=master&type=push&daterange&daterange) 
[![Style/Linting issues](https://badger.spt-engprod-pro.schibsted.io/badge/issues/scmspain/myfirstproject)](https://reports.spt-engprod-pro.schibsted.io/#/scmspain/myfirstproject?branch=master&type=push&daterange&daterange) 
[![Badger](https://badger.spt-engprod-pro.schibsted.io/badge/quality_index/scmspain/myfirstproject)](https://databulous.spt-engprod-pro.schibsted.io/quality/repo/scmspain/myfirstproject) 
[![Badger](https://badger.spt-engprod-pro.schibsted.io/badge/engprod/scmspain/myfirstproject)](https://github.schibsted.io/spt-engprod/badger)
<!-- Badger end badges -->

# myfirstproject

## Run service:
```bash
./gradlew bootRun
```

**Useful links**
- [Jenkins pipeline](http://jenkins.jibars-pro.spain.schibsted.io:8080/view/myfirstproject/view/pipeline/)
- [Asgard PRE](http://asgard.jibars-pre.spain.schibsted.io:8080/eu-west-1/cluster/list)
- [Asgard PRO](http://asgard.jibars-pro.spain.schibsted.io:8080/eu-west-1/cluster/list)
- [All Logs PRE](https://search-logstash-global-pre-pszu5ukdauwdvopmwfczw7iptm.eu-west-1.es.amazonaws.com/_plugin/kibana/#/discover?_g=\(\)&_a=\(columns:!\(_source\),index:'logstash-*',interval:auto,query:\(query_string:\(analyze_wildcard:!t,query:'beat.name:%22myfirstproject%22'\)\),sort:!\('@timestamp',desc\)\))
- [Access Logs PRE](https://search-logstash-global-pre-pszu5ukdauwdvopmwfczw7iptm.eu-west-1.es.amazonaws.com/_plugin/kibana/#/discover?_g=\(\)&_a=\(columns:!\(_source\),index:'logstash-*',interval:auto,query:\(query_string:\(analyze_wildcard:!t,query:'beat.name:%22myfirstproject%22%20AND%20fields.type:%22access%22'\)\),sort:!\('@timestamp',desc\)\))
- [All Logs PRO](https://search-logstash-global-pro-z7puthnxiyr3oq7o2ktnpemdnu.eu-west-1.es.amazonaws.com/_plugin/kibana/#/discover?_g=\(\)&_a=\(columns:!\(_source\),index:'logstash-*',interval:auto,query:\(query_string:\(analyze_wildcard:!t,query:'beat.name:%22myfirstproject%22'\)\),sort:!\('@timestamp',desc\)\))
- [Access Logs PRO](https://search-logstash-global-pro-z7puthnxiyr3oq7o2ktnpemdnu.eu-west-1.es.amazonaws.com/_plugin/kibana/#/discover?_g=\(\)&_a=\(columns:!\(_source\),index:'logstash-*',interval:auto,query:\(query_string:\(analyze_wildcard:!t,query:'beat.name:%22myfirstproject%22%20AND%20fields.type:%22access%22'\)\),sort:!\('@timestamp',desc\)\))
- [Swagger UI PRE](https://myfirstproject.global-pre.spain.schibsted.io/swagger-ui.html)
- [Swagger Schema PRE](https://myfirstproject.global-pre.spain.schibsted.io/schema)
