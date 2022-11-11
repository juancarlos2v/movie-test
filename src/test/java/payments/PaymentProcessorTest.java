package payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;


    /*@BeforeEach en JUnit5*/
    @Before
    public void setup(){
      paymentGateway= Mockito.mock(PaymentGateway.class);
      paymentProcessor=new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));



        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {


        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}