package core.basesyntax.strategy.operation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalanceOperationHandlerTest {
    private static OperationHandler operationHandler;

    @BeforeClass
    public static void beforeAll() {
        operationHandler = new BalanceOperationHandler();
    }

    @Test
    public void getAmountToAdd_min_ok() {
        Integer expected = 0;
        Integer actual = operationHandler.getAmountToAdd(0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAmountToAdd_max_ok() {
        Integer expected = Integer.MAX_VALUE;
        Integer actual = operationHandler.getAmountToAdd(Integer.MAX_VALUE);
        Assert.assertEquals(expected,actual);
    }
}
