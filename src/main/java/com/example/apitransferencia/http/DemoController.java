package com.example.apitransferencia.http;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface DemoController {

    @Operation(summary = "Retorna uma String com valor Hello concatenada com o valor passado por parâmetro no request")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Hello + valor passado por parâmetro"
            )
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<String> hello(@RequestParam String param);
}
