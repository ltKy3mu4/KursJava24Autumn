package ru.mpei.l7.anno;

import org.reflections.Reflections;
import ru.mpei.l7.example.Converter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class ComponentAnnotationProcessor {

    public static List<Converter> process(){
        try {
            List<Converter> l = processWithExc();
            return l;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static List<Converter> processWithExc() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Reflections r = new Reflections(Converter.class);
        Set<Class<?>> typesAnnotatedWith = r.getTypesAnnotatedWith(Component.class);

        List<Converter> converters = new ArrayList<>();
        for (Class<?> clazz : typesAnnotatedWith){
            Class<?>[] interfaces = clazz.getInterfaces();
            List<Class<?>> l = List.of(interfaces);
            if (!l.contains(Converter.class)){
                continue;
            }



            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
            Converter o = (Converter)declaredConstructor.newInstance();
            converters.add(o);
        }

        return converters;
    }

    public static Map<String, Converter> processMapWithExc() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Reflections r = new Reflections(Converter.class);
        Set<Class<?>> typesAnnotatedWith = r.getTypesAnnotatedWith(Component.class);

        Map<String, Converter> converters = new HashMap<>();
        for (Class<?> clazz : typesAnnotatedWith){
            Class<?>[] interfaces = clazz.getInterfaces();
            List<Class<?>> l = List.of(interfaces);
            if (!l.contains(Converter.class)){
                continue;
            }


            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
            Converter o = (Converter)declaredConstructor.newInstance();

            Component annotation = clazz.getAnnotation(Component.class);
            String name = annotation.name();
            converters.put(name, o);
        }

        return converters;
    }

}
