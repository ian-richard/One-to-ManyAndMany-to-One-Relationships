package com.example.Lab_rob_Ian.components;

import com.example.Lab_rob_Ian.models.File;
import com.example.Lab_rob_Ian.models.Folder;
import com.example.Lab_rob_Ian.models.User;
import com.example.Lab_rob_Ian.repositories.FileRepository;
import com.example.Lab_rob_Ian.repositories.FolderRepository;
import com.example.Lab_rob_Ian.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

//    public DataLoader(){}
    public void run(ApplicationArguments args){

        User user1 = new User("User1");
        userRepository.save(user1);

        Folder folder1 = new Folder("Folder1", user1);
        folderRepository.save(folder1);

        File file1 = new File("File1", "jpeg", 10, folder1);
        fileRepository.save(file1);

//        user1.addFolder(folder1);
    }
}
