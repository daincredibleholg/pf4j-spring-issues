package com.example.shared;

import java.util.List;
import org.pf4j.ExtensionPoint;

public interface ExternalStuff extends ExtensionPoint {

  List<String> retrieveStuff(String id);
}
