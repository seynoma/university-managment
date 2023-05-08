package entity.util.statics;

public enum Type {
    ADMIN("admin"),
    STUDENT("öğrenci"),
    LECTURER("akademisyen");
    //TODO type türlerinin sahip olabilecekleri düzeyler belirlenecek(enum sınıfı)
    private String type;
    Type(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
}
