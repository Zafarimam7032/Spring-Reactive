package com.zafar.reactor.BasicReactor.flux;

import reactor.core.publisher.Flux;

import java.util.List;

public class BasicFlux {

    public Flux<String> getNames(){
         return Flux.fromIterable(List.of("zafar","jhon","starlin")).log();
    }

    public static void main(String[] args) {
        BasicFlux basicFlux=new BasicFlux();
        basicFlux.getNames().subscribe(System.out::println);

    }
}
