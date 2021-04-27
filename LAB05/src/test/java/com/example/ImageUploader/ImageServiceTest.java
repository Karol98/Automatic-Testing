package com.example.ImageUploader;
import java.util.List;

import com.cloudinary.Cloudinary;
import com.cloudinary.Url;
import com.cloudinary.api.ApiResponse;
import com.example.ImageUploader.service.ImageService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
public class ImageServiceTest {

    ImageService imageService = new ImageService();

    @Test
    public void should_upload_photo_and_return_path() {
        String path = "..\\example.png";
        //method returns path only when upload is succesfully
        String returnedPath = imageService.uploadFile(path);
        Assert.assertEquals(returnedPath, path);
    }

    @Test
    public void get_all_photos_links_from_my_gallery() throws Exception {
        List<String> photosList = imageService.getPhotos();
        //in my gallery is already 50 images
        Assert.assertThat(photosList, Matchers.hasSize(50));
    }
}
