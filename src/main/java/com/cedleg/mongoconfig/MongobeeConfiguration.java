package com.cedleg.mongoconfig;

import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.Bean;

public class MongobeeConfiguration {

    @Bean
    public Mongobee mongobee(){
        Mongobee runner = new Mongobee("mongodb://localhost:27017/mongochangeset");
        //runner.setDbName("mongochangeset");         // host must be set if not set in URI
        runner.setChangeLogsScanPackage(
                "com.cedleg.mongoconfig.mongochangelog.*"); // the package to be scanned for changesets
        return runner;
    }
}
