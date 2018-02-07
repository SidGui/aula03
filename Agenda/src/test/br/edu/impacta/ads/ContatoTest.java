package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest {

	ContatoDaoArquivo cdao;
	Contato contato;
	List<Contato> listaContato;
	
	@Before
	public void setData(){
		cdao = new ContatoDaoArquivo("contatos.txt");
		contato = new Contato("Renato2", "123");
		listaContato = new ArrayList<Contato>();
	}

	@Test
	public void testTest() {
		cdao.inserir(contato);
		assertTrue("O contato não foi adicionado.", cdao.existe(contato));
	}
	
	@Test
	public void validandoGravadao()
	{
		listaContato.add(contato);
		listaContato.add(contato);
		cdao.gravar(listaContato);
		assertTrue("Seu dado foi gravado",cdao.buscar(contato.getNome()).size() > 0);
		
	}
}
