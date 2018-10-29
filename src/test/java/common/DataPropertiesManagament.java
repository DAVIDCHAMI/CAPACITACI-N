package common;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constantes.ConstantesPruebas;

public class DataPropertiesManagament {
	
	
	public Properties getProperties() throws IOException {
		
		FileReader fileProperties = new FileReader(ConstantesPruebas.RUTA_PROPERTIES);
		
				Properties properties = new Properties();
				properties.load(fileProperties);
		
			
				return properties;
	}

}
