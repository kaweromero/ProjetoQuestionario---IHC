package funcoesXML;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
	
	
	public static void main(String []args){
		
		XStream xstream = new XStream(new DomDriver());
		
		//Estagiario pessoa = new Estagiario();
		//pessoa.setNome("kawe");
		//pessoa.setLogin("kaweromero");
		//pessoa.setTelefone("83987654321");
		//pessoa.setEndereço("Rua HUE da silva");
		
		//System.out.println(xstream.toXML(pessoa));
		//String xml = xstream.toXML(pessoa);
		
		LerXML lergravar = new LerXML();
		//lergravar.gravarArquivo(pessoa, xstream);
		//lergravar.lerXML();
		
		
	}
		
	
}
