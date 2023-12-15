package org.gamehunter.creategame.registry;

import org.gamehunter.creategame.interfaces.singleton.Singleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegistrySingletonTest {

    @Test
    public void testSingleton() {
        Singleton rs1 = new RegistrySingleton();
        Singleton rs2 = new RegistrySingleton();
        assert rs1.getInstance().equals(rs2.getInstance());
    }
}
