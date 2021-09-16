package com.example.plugin.repository;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SomeStaticRepository implements SomeRepository {

  @Override
  public List<String> findById(String id) {
    return Collections.singletonList("Hello " + id);
  }
}
