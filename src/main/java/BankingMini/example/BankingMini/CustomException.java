package BankingMini.example.BankingMini;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class CustomException extends RuntimeException{

    String resourceName;
    String fieldName;

    Object fieldValue;

    public CustomException(String resourceName, String fieldName, Object fieldValue){
        super(String.format("%s not found with %s:'%s'",resourceName,fieldName,fieldValue));
        this.resourceName=resourceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;


    } public String getResourceName() {
        return resourceName;
    }
    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }


}
