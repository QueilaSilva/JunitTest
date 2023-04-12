package validacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmaileSenhaTest {

	@Test
	public void test() {
		Validacao validacao = new Validacao();
		assertEquals("2e2queila@email.com", validacao.email());
		
		assertEquals("4577", validacao.senha());
		
	}
	

}