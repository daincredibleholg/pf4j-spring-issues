package com.example.demo.service;

import com.example.shared.ExternalStuff;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoadWithPlugin implements LoadUseCase {

  private final ExternalStuff plugin;

  @Override
  public List<String> findById(String id) {
    return plugin.retrieveStuff(id);
  }
}
