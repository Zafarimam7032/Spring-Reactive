package com.zafar.reactor.BasicReactor.mono;

import reactor.core.publisher.Mono;

public class BasicMono {

    public Mono<String> getName(){
        return Mono.just("Zafar").log();
    }

    public static void main(String[] args) {
        BasicMono basicMono=new BasicMono();
        basicMono.getName().subscribe(System.out::println);
    }
}
