package java15.st2enum;

public enum PhoneHeaderEnum {
    //이넘 방식의 열거형
    
    p010("010"),
    p011("011"),
    p016("016"),
    p017("017"),
    p018("018"),
    p019("019");
    
    private final String value;
    PhoneHeaderEnum(String value) {
        System.out.println("enum");
        this.value=value;
    }
    public String getValue(){//메서그
        return value;
    }
}
