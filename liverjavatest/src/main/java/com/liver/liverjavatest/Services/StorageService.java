package com.liver.liverjavatest.Services;



import java.text.SimpleDateFormat;
import java.util.*;

import com.liver.liverjavatest.request.FolioJson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StorageService {
    String folio;
    public FolioJson getStorageService(String folio){
        FolioJson folio1 = new FolioJson();
        folio1.setFolio(folio + "-" + getFecha());
        log.info(folio1.getFolio());

        return folio1;
    }

    public String getFecha(){
        Date myDate = new Date();
        String myFormatDate = new SimpleDateFormat("ddMMyyHHmmss").format(myDate);
        log.info(myFormatDate);
        return myFormatDate;
    }
}
