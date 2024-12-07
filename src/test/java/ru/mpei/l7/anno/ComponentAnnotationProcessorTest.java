package ru.mpei.l7.anno;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mpei.l7.example.Converter;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ComponentAnnotationProcessorTest {


    @Test
    public void test1(){
        List<Converter> process = ComponentAnnotationProcessor.process();
        Assertions.assertEquals(2, process.size());
    }


    @Test
    @SneakyThrows
    public void test2(){
        Map<String, Converter> res = ComponentAnnotationProcessor.processMapWithExc();
        System.out.println(res);
    }
}