package com.lordofthejars.kubernetes.oso;

import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import org.junit.Test;

public class AuthTest {

    @Test
    public void auth() {
        ConfigBuilder configBuilder = new ConfigBuilder();
        configBuilder.withMasterUrl("https://api.starter-us-east-2.openshift.com");
        // put your token
        configBuilder.withOauthToken("");
        //put your username
        configBuilder.withNamespace("");
        DefaultOpenShiftClient defaultOpenShiftClient = new DefaultOpenShiftClient(configBuilder.build());

        defaultOpenShiftClient.projects().list().getItems().forEach(System.out::println);


    }

}
