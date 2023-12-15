package org.gamehunter.creategame.interfaces.registry;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.Getter;

@Getter
public abstract class AbstractRegistrant implements Registrant {
    private byte[] id;

    @Override
    public Registrant generateId() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            this.id = md.digest(this.toString().getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

}
