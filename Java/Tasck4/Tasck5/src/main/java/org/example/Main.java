package org.example;


import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.nio.file.Files.*;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.util.Collections.addAll;
import static java.util.Collections.copy;


/**
 * Java Core (семинары)
 * Урок 5. Тонкости работы
 * Написать функцию, создающую резервную копию всех файлов в директории
 * (без поддиректорий) во вновь созданную папку ./backup
 * Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
 * и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
 * где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать в файл 9 значений так,
 * чтобы они заняли три байта.
 * 3 (*) - В продолжение 2 дописать "разворачивание" поля игры крестики-нолики
 * из сохраненного в файле состояния (распарсить файл, в зависимости от значений (0-3) нарисовать
 * поле со значками 'х' 'о' '.')
 */

public class Main {

    static String copyDir = "/home/anatoliim/IdeaProjects/Tasck5/backup1";
    static String copyDir1 = "/home/anatoliim/GB/12";

    public static void main(String args[]) throws IOException {
        dirCope(copyDir1, copyDir);


    }


    public static void dirCope(String path, String path1) throws IOException {
        File copy1 = new File(path);
        File[] copuName = copy1.listFiles();
        File copyDir = new File(path1);
        copyDir.mkdir();
        for (File f : copuName
        ) {


            Files.copy(f.toPath(),
                    copyDir.toPath(),
                    REPLACE_EXISTING);
        }

    }
}





