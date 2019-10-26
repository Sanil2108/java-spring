package mypackage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private int id;
    @JsonProperty("quote")
    private String quoteMessage;

    public Value() {
    }

    public Value(int id, String quoteMessage) {
        this.id = id;
        this.quoteMessage = quoteMessage;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuoteMessage() {
        return this.quoteMessage;
    }

    public void setQuoteMessage(String quoteMessage) {
        this.quoteMessage = quoteMessage;
    }
}