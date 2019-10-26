package mypackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private Value value;
    private String type;


    public Quote() {
    }


    public Quote(Value value, String type) {
        this.value = value;
        this.type = type;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Quote value(Value value) {
        this.value = value;
        return this;
    }

    public Quote type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) o;
        return Objects.equals(value, quote.value) && Objects.equals(type, quote.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }

}