package apsoph;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.concordion.integration.junit3.ConcordionTestCase;

/* Run this class as a JUnit test. */

public class ApSophTest extends ConcordionTestCase {
    
    public String getTokens(String urn) {
        return ("Never looked anything up for urn " + urn);
    }
}
