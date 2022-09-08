package com.example.githubactions;

import com.example.githubactions.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubactionsApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void hello() {
        assertEquals("Hello World", dataController.hello());
    }

}
