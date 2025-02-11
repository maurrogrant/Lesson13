package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class simpleTestNG {

    // Простой тест
    @Test
    public void simpleTest() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        Assert.assertEquals(sum, 15, "Сумма должна быть 15");
    }

    // Параметризованный тест
    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
            {1, 2, 3},
            {2, 3, 5},
            {3, 5, 8}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void parameterizedTest(int a, int b, int expectedSum) {
        Assert.assertEquals(a + b, expectedSum, "Сумма не совпадает с ожидаемым значением");
    }
}
