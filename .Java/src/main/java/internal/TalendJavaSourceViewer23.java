
package internal;

import routines.DataOperation;
import routines.Mathematical;
import routines.Numeric;
import routines.Relational;
import routines.StringHandling;
import routines.TalendDataGenerator;
import routines.TalendDate;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.system.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

@SuppressWarnings("unused")

public class TalendJavaSourceViewer23 {

    // create and load default properties
	private static java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	private static class ContextProperties extends java.util.Properties {
	    
	    private static final long serialVersionUID = 1L;

	    public ContextProperties(java.util.Properties properties){
	        super(properties);
	    }
	    public ContextProperties(){
	        super();
	    }
	    
		public void synchronizeContext(){
			
			this.put("con_Postgres_Login", con_Postgres_Login);
			
			this.put("con_Postgres_Schema", con_Postgres_Schema);
			
			this.put("con_Postgres_Database", con_Postgres_Database);
			
			this.put("con_Postgres_AdditionalParams", con_Postgres_AdditionalParams);
			
			this.put("con_Postgres_Server", con_Postgres_Server);
			
			this.put("con_Postgres_Password", con_Postgres_Password);
			
			this.put("con_Postgres_Port", con_Postgres_Port);
			
		}
			          
 public  static String  con_Postgres_Login;      
 public  static String  con_Postgres_Schema;      
 public  static String  con_Postgres_Database;      
 public  static String  con_Postgres_AdditionalParams;      
 public  static String  con_Postgres_Server;      
 public  static java.lang.String  con_Postgres_Password;      
 public  static String  con_Postgres_Port;
	}	private static ContextProperties context = new ContextProperties();
	private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	private class StringHandlingStruct {
		private String LEFT(row2;
	};
	private StringHandlingStruct StringHandling= new StringHandlingStruct();
	private class row2Struct {
		private Integer Ano;
		private String Orgao_Cod_Desc;
		private java.util.Date Data_Carga_Dados;
		private String Categoria_Economica_Cod_Desc;
		private String Origem_Cod_Desc;
		private String Especie_Cod_Desc;
		private String Alinea_Cod_Desc_Desdob;
		private Integer Natureza_Receita_Cod_;
		private String Natureza_Receita;
		private Float Soma_Receita_Prevista;
		private Float Soma_Receita_Arrecadada_Liquida;
	};
	private row2Struct row2= new row2Struct();
	void TalendJavaSourceViewer23() {
		globalMap.put("NULL", null);
		//StringHandling.LEFT(row2 =  null;
		row2.Ano =  null;
		row2.Orgao_Cod_Desc =  null;
		row2.Data_Carga_Dados =  null;
		row2.Categoria_Economica_Cod_Desc =  null;
		row2.Origem_Cod_Desc =  null;
		row2.Especie_Cod_Desc =  null;
		row2.Alinea_Cod_Desc_Desdob =  null;
		row2.Natureza_Receita_Cod_ =  null;
		row2.Natureza_Receita =  null;
		row2.Soma_Receita_Prevista =  null;
		row2.Soma_Receita_Arrecadada_Liquida =  null;
	}
	public String myFunction(){
		return 
StringHandling.LEFT(row2.Orgao_Cod_Desc,6)  
;	
}
	private String LEFT(String orgao_Cod_Desc, int i) {
StringHandling.LEFT(row2.Orgao_Cod_Desc,5)l;
	}
}