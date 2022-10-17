package com.eduar.misiontic.games2.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name="gameId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Computer computer;

    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Computer getGame() {
        return computer;
    }

    public void setGame(Computer computer) {
        this.computer = computer;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
}
