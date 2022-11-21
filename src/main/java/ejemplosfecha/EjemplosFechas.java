/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosfecha;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


/**
 *
 * @author david
 */
public class EjemplosFechas {
    
    public static void main(String[] args) {
        
        //Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año " + fechaHoy.getYear());
        System.out.println("Mes " + fechaHoy.getMonthValue());
        
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month: " + mesActual);
        
        //Fechas concretas
        LocalDate fecha = LocalDate.of(2000, 2, 28);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 30);
        
        System.out.println("Fecha " + fecha);
        
        //Son iguales?
        if (fecha.equals(fecha2)){
            System.out.println("Son iguales");
        } else{
            System.out.println("Son distintas");
        }
        
        //Anterior y posterior
        if (fecha.isBefore(fecha2)){
            System.out.println("fecha es anterior a fecha2");
        }
        
        if (fecha.isAfter(fecha2)){
            System.out.println("fecha es posterior a fecha2");
        }
        
        //Clase para guardar mes y dia (sin el año)
        MonthDay nocheVieja = MonthDay.of(12, 31);
        
        YearMonth añoMes = YearMonth.of(2023, 2);
        
        //Operaciones con fechas
        System.out.println("Hoy " + fechaHoy);
        System.out.println("Despues de 100 dias " + fechaHoy.plusDays(100));
        System.out.println("Hoy " + fechaHoy);
        LocalDate sumarDias = fechaHoy.plusDays(100);
        System.out.println(fechaHoy.plusDays(100));
        
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Despues de 13 meses " + sumarMeses);
        
        LocalDate dosSiglosDespues = sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println(dosSiglosDespues);
        
        //Calcular cantidades entre fechas
        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println("Dias entre fechas: " + diferenciaDias);
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println("Años entre fechas: " + years);
        
        //Devuelve si el año de la fecha es bisiesto
        boolean esBisiesto = fechaHoy.isLeapYear();
        
        System.out.println("Dias del mes actual " + fechaHoy.lengthOfMonth());
        
        Locale configLocal = Locale.getDefault();
        System.out.println("Fecha hoy Dia " + fechaHoy.getDayOfWeek().
                getDisplayName(TextStyle.SHORT, configLocal));
        
        //dd dia con dos numeros
        //MM mes con dos numeros
        //yyyy año
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println("Fecha formateada " + fechaFormateada);
    }
    
}
