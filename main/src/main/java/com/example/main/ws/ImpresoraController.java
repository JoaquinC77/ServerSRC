package com.example.main.ws;

import com.github.anastaciocintra.escpos.EscPos;
import com.github.anastaciocintra.escpos.EscPosConst;
import com.github.anastaciocintra.escpos.Style;
import com.github.anastaciocintra.output.PrinterOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.PrintService;

@RestController
public class ImpresoraController {

    @GetMapping(value = "/print")
    public boolean print(@RequestParam(name = "idServicio", defaultValue = "null") String idServicio,
                         @RequestParam(name = "nombrePasajero", defaultValue = "null") String nombrePasajero,
                         @RequestParam(name = "rutPasajero", defaultValue = "null")String rutPasajero,
                         @RequestParam(name = "fecha", defaultValue = "null") String fecha){

        try{
            Style title = new Style()
                    .setFontSize(Style.FontSize._2, Style.FontSize._2)
                    .setJustification(EscPosConst.Justification.Center);

            Style title2 = new Style()
                    .setFontSize(Style.FontSize._1, Style.FontSize._1)
                    .setJustification(EscPosConst.Justification.Left_Default)
                    .setFontName(Style.FontName.Font_B);

            PrintService printService = PrinterOutputStream.getPrintServiceByName("POS-80");
            PrinterOutputStream printerOutputStream = new PrinterOutputStream(printService);
            EscPos escpos = new EscPos(printerOutputStream);
            escpos.writeLF(title,nombrePasajero);
            escpos.writeLF("");
            escpos.writeLF(title2,"-----------------------------");
            escpos.writeLF(title2,"RUT: "+rutPasajero);
            escpos.writeLF(title2,"Servicio: "+idServicio);
            escpos.writeLF(title2,"Fecha: "+fecha);
            escpos.writeLF(title2,"-----------------------------");
            escpos.writeLF("");
            escpos.feed(5);
            escpos.cut(EscPos.CutMode.FULL);
            escpos.close();

            return true;
        }catch (Exception ex){
            return false;
        }

    }
}
