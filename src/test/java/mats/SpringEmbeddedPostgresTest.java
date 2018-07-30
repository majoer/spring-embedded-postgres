package mats;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringEmbeddedPostgres.class)
@AutoConfigureEmbeddedDatabase
@FlywayTest
public class SpringEmbeddedPostgresTest {

    @Test
    public void should_start() {
        Assert.assertTrue(true);
    }
}
