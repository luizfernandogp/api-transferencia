package com.example.apitransferencia.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoControllerImpl implements DemoController {

  @Override
  public ResponseEntity<String> hello(String param) {
    return ResponseEntity.ok("Hello " + param);
  }

}
