
package Activities;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;


@Provider("UserProvider")
@PactFolder("target/pacts")

public class PactProviderTest {
 @BeforeEach
public void setup(PactVerificationContext context)
 {
	 HttpTestTarget target= new HttpTestTarget("localhost", 8585);
	context.setTarget(target);    
}

@TestTemplate
@ExtendWith(PactVerificationInvocationContextProvider.class)
public void PactProviderTest(PactVerificationContext context) 
{
	  	   context.verifyInteraction();
}



@State("POST Request")
public void sampleState() {}

}
