package com.example.Lab_rob_Ian.repositories;

import com.example.Lab_rob_Ian.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.Files;

public interface FileRepository extends JpaRepository<File, Long> {
}
