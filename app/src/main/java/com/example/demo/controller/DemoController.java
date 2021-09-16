package com.example.demo.controller;

import com.example.demo.service.LoadUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

  private final LoadUseCase useCase;

  @GetMapping("/demo")
  public List<String> demo() {
    return demo("demo");
  }

  @GetMapping("/demo/{id}")
  public List<String> demo(@PathVariable("id") String id) {
    return useCase.findById(id);
  }

}
