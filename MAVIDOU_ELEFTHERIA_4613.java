//MAVIDOU ELEFTHERIA 4613

public class Product
{
	
	List<Array> breakupString(String product) throws Exception
	{
		
		product = "GR-12AEW-433A";
		
		@Test
		List<Array> result = product(Arrays.asList(1,2));
                assertThat(result,is(Arrays.asList(1)));
		
		@Test
		List<Array> result = product(Arrays.asList(3,4,5,6,7));
		assertThat(result,is(Arrays.asList(2)));
		
		@Test
		List<Array> result = product(Arrays.asList(8,9,10,11));
		assertThat(result,is(Arrays.asList(3)));
	}

}
