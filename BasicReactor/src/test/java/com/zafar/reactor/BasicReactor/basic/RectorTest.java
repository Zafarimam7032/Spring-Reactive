package com.zafar.reactor.BasicReactor.basic;

import com.zafar.reactor.BasicReactor.flux.BasicFlux;
import com.zafar.reactor.BasicReactor.mono.BasicMono;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class RectorTest {

    @Mock
    BasicFlux basicFlux;

    @Mock
    BasicMono basicMono;

    @Test
    public void testFlux(){
        Flux<String> names = basicFlux.getNames();

        StepVerifier.create(names).expectNextCount(3).expectComplete();

    }

    @Test
    public void testMono(){
        var name = basicMono.getName();
        StepVerifier.create(name).expectNext("zafar").expectComplete();
    }
}
