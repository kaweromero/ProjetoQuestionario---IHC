package funcoesXML;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LerXML {

	
	public void lerXML(){
		
		
		FileReader reader = null;
		try {
			//carrega o arquivo XML para um objeto reader
			reader = new FileReader("D:/CadastroEstagiarios.xml");
		} catch (Exception e) {
			
			System.out.println("Arquivo nao encontrado");
		}
		
		//Cria o objeto xstream
		XStream xStream = new XStream(new DomDriver());
		//Desirializa o arquivo para um objeto
		//Estagiario pessoa = (Estagiario) xStream.fromXML(reader);
		
		//System.out.println(pessoa.getLogin());
	}
		

	public void gravarArquivo(Estagiario pessoa, XStream xstream){
	

	File xmlMap = new File("D:/CadastroEstagiarios.xml");
	OutputStream streamOut = null;	
	
	try{
		
		if (!(xmlMap.exists()))
			xmlMap.createNewFile();
		else {
			xmlMap.delete();
			xmlMap.createNewFile();
		}	
		
		streamOut = new FileOutputStream(xmlMap);	
		//XStream xstream = new XStream(new DomDriver());			
		xstream.toXML(pessoa, streamOut);
	
	}catch(Exception e){
		
		System.out.println("Deu ruim na gravação de arquivo");
	}
	
 }	
	
}
