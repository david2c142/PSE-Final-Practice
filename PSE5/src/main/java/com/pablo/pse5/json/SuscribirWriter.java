
package com.pablo.pse5.json;
 
import com.pablo.pse5.entities.Suscribir;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class SuscribirWriter implements MessageBodyWriter<Suscribir>{
    
    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return Suscribir.class.isAssignableFrom(type);
    }

    @Override
    public long getSize(Suscribir t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Suscribir t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        JsonGenerator gen = Json.createGenerator(entityStream);
        gen.writeStartObject()
                .write("idSuscribir", t.getIdSuscribir())
                .write("idOferta", t.getIdOferta())
                .write("emailCandidato", t.getEmailCandidato())
                .write("cartaPresentacion", t.getCartaPresentacion())
                .writeEnd();
        gen.flush();
    }

}


