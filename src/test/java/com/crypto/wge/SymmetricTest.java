package com.crypto.wge;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by will on 23/03/2020.
 */
public class SymmetricTest {

    @Test
    public void encryptDecrypt() throws Exception {

        String thisIsMySecret = "This is my bloody big secret";
        String symmetricKey = "my symmetric key";

        String base64EncodedCipher = Symmetric.encyptWrapper(thisIsMySecret, symmetricKey);

        System.out.println("cipher = " + base64EncodedCipher);

        String original = Symmetric.decryptWrapper(base64EncodedCipher, symmetricKey);

        System.out.println("original = " + original);

        assertEquals(thisIsMySecret, original);

    }



}