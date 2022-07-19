package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.DownloadService;
@RestController
@RequestMapping("/v1")
public class DownloadController {

    @GetMapping("")
    String dowloadController() {
        return DownloadService.downloadFile();
    }
}
