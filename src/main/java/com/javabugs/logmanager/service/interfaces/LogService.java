package com.javabugs.logmanager.service.interfaces;

import com.javabugs.logmanager.entity.Log;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface LogService {
  
    void save(Log log);
    List<Log> findAll(Pageable pageable);
    List<Log> findByDate(String filter, Pageable pageable);
    List<Log> findByDescription(String filter, Pageable pageable);
    List<Log> findByEvent(String filter, Pageable pageable);
    List<Log> findByQuantity(Integer filter, Pageable pageable);
    List<Log> findByLevel(String filter, Pageable pageable);
    List<Log> findByOrigin(String filter, Pageable pageable);
    Optional<Log> findById(Long id);

}
