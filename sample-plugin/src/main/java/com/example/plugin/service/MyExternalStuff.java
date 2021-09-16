package com.example.plugin.service;

import com.example.plugin.repository.SomeRepository;
import com.example.shared.ExternalStuff;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.pf4j.Extension;
import org.springframework.stereotype.Service;

@Service
@Extension
@RequiredArgsConstructor
public class MyExternalStuff implements ExternalStuff {

  private final SomeRepository repository;

  @Override
  public List<String> retrieveStuff(String id) {
    return repository.findById(id);
  }

}
