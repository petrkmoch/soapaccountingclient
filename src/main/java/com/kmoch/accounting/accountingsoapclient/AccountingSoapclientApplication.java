package com.kmoch.accounting.accountingsoapclient;

import com.kmoch.accounting.accountingsoapclient.gen.BottomUpServiceImplService;
import com.kmoch.accounting.accountingsoapclient.gen.GlAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class AccountingSoapclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountingSoapclientApplication.class, args);
    }

    @PostConstruct
    public void postInit() {
        BottomUpServiceImplService bottomUpServiceImplService = new BottomUpServiceImplService();
        List<GlAccount> allAccounts = bottomUpServiceImplService.getBottomUpServiceImplPort().getAllAccounts();
        System.out.println("Total number " + allAccounts.size());
    }

}
