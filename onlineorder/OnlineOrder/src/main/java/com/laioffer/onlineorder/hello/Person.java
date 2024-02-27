package com.laioffer.onlineorder.hello;

import com.github.javafaker.Bool;

public record Person(
        String name,
        String compny,
        Address homeAddress,
        Book favoriteBook
) {
}
