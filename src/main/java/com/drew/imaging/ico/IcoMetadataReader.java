package com.drew.imaging.ico;

import com.drew.lang.StreamReader;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Metadata;
import com.drew.metadata.file.FileMetadataReader;
import com.drew.metadata.ico.IcoReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IcoMetadataReader {
    /* JADX INFO: finally extract failed */
    @NotNull
    public static Metadata readMetadata(@NotNull File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        try {
            Metadata metadata = readMetadata(inputStream);
            inputStream.close();
            new FileMetadataReader().read(file, metadata);
            return metadata;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    @NotNull
    public static Metadata readMetadata(@NotNull InputStream inputStream) {
        Metadata metadata = new Metadata();
        new IcoReader().extract(new StreamReader(inputStream), metadata);
        return metadata;
    }
}
