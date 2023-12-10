package com.example.madt_3_lab_calculator;
import static org.junit.Assert.assertEquals;
import android.widget.EditText;

import androidx.test.core.app.ActivityScenario;

import org.junit.Before;
import org.junit.Test;

public class CalculatorUnitTest {
    private MainActivity mainActivity;
    @Before
    public void setUp() {
        ActivityScenario.launch(MainActivity.class).onActivity(activity -> {
            mainActivity = activity;
            mainActivity.display = new EditText(mainActivity);
        });
    }

    @Test
    public void testZeroButton() {
        mainActivity.zeroBTN(null);
        assertEquals("0", mainActivity.display.getText().toString());
    }

    @Test
    public void testOneButton() {
        mainActivity.oneBTN(null);
        assertEquals("1", mainActivity.display.getText().toString());
    }

    @Test
    public void testTwoButton() {
        mainActivity.twoBTN(null);
        assertEquals("2", mainActivity.display.getText().toString());
    }

    @Test
    public void testThreeButton() {
        mainActivity.threeBTN(null);
        assertEquals("3", mainActivity.display.getText().toString());
    }

    @Test
    public void testFourButton() {
        mainActivity.fourBTN(null);
        assertEquals("4", mainActivity.display.getText().toString());
    }

    @Test
    public void testFiveButton() {
        mainActivity.fiveBTN(null);
        assertEquals("5", mainActivity.display.getText().toString());
    }

    @Test
    public void testSixButton() {
        mainActivity.sixBTN(null);
        assertEquals("6", mainActivity.display.getText().toString());
    }

    @Test
    public void testSevenButton() {
        mainActivity.sevenBTN(null);
        assertEquals("7", mainActivity.display.getText().toString());
    }

    @Test
    public void testEightButton() {
        mainActivity.eightBTN(null);
        assertEquals("8", mainActivity.display.getText().toString());
    }

    @Test
    public void testNineButton() {
        mainActivity.nineBTN(null);
        assertEquals("9", mainActivity.display.getText().toString());
    }

    @Test
    public void testPlusOrMinusButton() {
        mainActivity.plusOrMinusBTN(null);
        assertEquals("-", mainActivity.display.getText().toString());
    }

    @Test
    public void testClearButton() {
        mainActivity.clearBTN(null);
        assertEquals("", mainActivity.display.getText().toString());
    }

    @Test
    public void testPowerButton() {
        mainActivity.powerBTN(null);
        assertEquals("^", mainActivity.display.getText().toString());
    }

    @Test
    public void testDivideButton() {
        mainActivity.divideBTN(null);
        assertEquals("÷", mainActivity.display.getText().toString());
    }

    @Test
    public void testMultiplyButton() {
        mainActivity.multiplyBTN(null);
        assertEquals("×", mainActivity.display.getText().toString());
    }

    @Test
    public void testMinusButton() {
        mainActivity.minusBTN(null);
        assertEquals("-", mainActivity.display.getText().toString());
    }

    @Test
    public void testPlusButton() {
        mainActivity.plusBTN(null);
        assertEquals("+", mainActivity.display.getText().toString());
    }

    @Test
    public void testPointButton() {
        mainActivity.pointBTN(null);
        assertEquals(".", mainActivity.display.getText().toString());
    }

    @Test
    public void testReciprocalButton() {
        mainActivity.reciprocalBTN(null);
        assertEquals("1/", mainActivity.display.getText().toString());
    }

    @Test
    public void testSquareRootButton() {
        mainActivity.squareRootBTN(null);
        assertEquals("√", mainActivity.display.getText().toString());
    }

    @Test
    public void testPercentButton() {
        mainActivity.percentBTN(null);
        assertEquals("%", mainActivity.display.getText().toString());
    }

    @Test
    public void testComplexScenario() {
        mainActivity.display.setText("2+3*4/2-1");
        mainActivity.equalsBTN(null);

        assertEquals("7", mainActivity.display.getText().toString());
    }
}
