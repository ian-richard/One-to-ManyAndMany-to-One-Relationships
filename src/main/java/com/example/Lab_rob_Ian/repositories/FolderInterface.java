package com.example.Lab_rob_Ian.repositories;

import com.example.Lab_rob_Ian.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderInterface extends JpaRepository<Folder, Long> {
}
