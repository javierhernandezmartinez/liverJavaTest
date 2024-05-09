package com.liver.liverjavatest.controller;


import com.liver.liverjavatest.Services.StorageService;
import com.liver.liverjavatest.request.FolioJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/services")
@Slf4j
public class FolioController {

    @PostMapping("post/folio/concat")
    public ResponseEntity<FolioJson> concatenate2(@RequestParam String folio){ //{folio:"xxxx"}
        System.out.println(folio);
        StorageService storageService = new StorageService();
        log.info(storageService.getStorageService(folio).toString());

        return new ResponseEntity<>(storageService.getStorageService(folio), HttpStatus.OK);
    }

}
