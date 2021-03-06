package jlppc.regimys.objects;

import jlppc.regimys.launch.Start;
import jlppc.regimys.util.text.StringKey;
import jlppc.regimys.util.text.StringKey.KeyNotFoundException;
import jlppc.utils.FormattedString;
import jlppc.utils.HashArray;

public abstract class Typedef {
	
	
	
	/**
	 * Typedef of {@linkplain Random.nextInt} of {@linkplain Start.rand}
	 */
	public int rand(int limit){
		return Start.rand.nextInt(limit);
	}
	/**
	 * Typedef of {@linkplain FormattedString.outPrintln}
	 * @param text
	 * @param args
	 *
	 */
	/**Classe qui ne représente rien. Permet d'utiliser un Null plus facilement, avec moins de NullPointerException*/
	public static class Null{
		
	}

	protected final Null NULL = new Null();
	
	public void fosout(String text, Object...args){
		FormattedString.outPrintln(text, args);
	}
	/**
	 * Typedef of {@linkplain StringKey.outStringKey}
	 * @param key
	 * @param objects
	 */
	public void keyout(StringKey key, Object...objects){
		StringKey.outStringKey(key, objects);
	}
	
	public StringKey key(String key){
		try{
			return StringKey.getStringKey(key);
		}catch(KeyNotFoundException e){
			e.printStackTrace();
			System.exit(1);
		}
		return null;
		
	}
	
	public Object getVar(String name){
		for(HashArray obj : listVar()){
			if(obj.getValue("nom").equals(name) ){
				return obj.getValue("valeur");
			}
		}
		
		return null;
	}
	
	/**
	*Liste les variables publiques de la classe dans un HashArray sous la forme suivante :<br/>
	*Soit [] le hashArray, et () un element, séparé par des virgules. Chaque element est présenté comme ceci : (case, tag, element)<br/>
	*Pour un objet HashArray, une variable. Ici on considère la variable <code>public String nom = "Asriel";</code><br/>
	*[(0,nom,"nom"),(1,type, String.class),(2,valeur, "Asriel")]<br/>
	*On considère la variable <code>public int fl = 5;</code><br/>
	*[(0,nom, "fl"),(1,type, Integer.class),(2, valeur, 5)] (Pour les types primitifs, la classe correspondante est utilisée (ex: Integer pour int, Double pour double))<br/>
	*Enfin, on considère la variable <code>public Espece espece;</code><br/>
	*[(0,nom,"espece"),(1,type,Espece.class),(2,valeur,NULL)]
	*Voila!
	*/
	public abstract HashArray[] listVar();
}
