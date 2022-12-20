package com.securityjwt.exception;

/*Ici nous personnalisons nos messages d'erreurs
en donnant une plage à chaque classe*/

public enum ErrorCodes {

    UTILISATEUR_NOT_FOUND(1000),
    UTILISATEUR_NOT_VALID(1001)

    ;
    private int code;

    ErrorCodes(int code){
        this.code = code ;
    }
    public int getCode(){
        return code;
    }
}
