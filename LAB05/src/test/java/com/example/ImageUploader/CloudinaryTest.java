package com.example.ImageUploader;

import com.cloudinary.AuthToken;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class CloudinaryTest {

    private static final String DEFAULT_ROOT_PATH = "http://res.cloudinary.com/dwmhubjrv/";
    private static final String DEFAULT_UPLOAD_PATH = DEFAULT_ROOT_PATH + "image/upload/";

    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dwmhubjrv",
            "api_key", "598857122326358",
            "api_secret", "vpL83QpSEnr3Pi3ncqFWH-Al1KY"));

    @Test
    public void test_configuration() {
        cloudinary = new Cloudinary("cloudinary://a:b@dwmhubjrv?load_strategies=false&auth_token[key]=598857122326358&auth_token[duration]=200");
        assertEquals(cloudinary.config.authToken, new AuthToken("598857122326358").duration(200));
    }

    @Test
    public void test_cloud_name() {
        // should use cloud_name from config
        String result = cloudinary.url().generate("test");
        assertEquals(DEFAULT_UPLOAD_PATH + "test", result);
    }

    @Test
    public void test_fetch() {
        // should escape fetch urls
        String result = cloudinary.url().type("fetch").generate("http://blah.com/hello?a=b");
        assertEquals("http://res.cloudinary.com/dwmhubjrv/image/fetch/http://blah.com/hello%3Fa%3Db", result);
    }

    @Test
    public void test_creating_folders() {
        // should add version if public_id contains /
        String result = cloudinary.url().generate("folder/test");
        assertEquals(DEFAULT_UPLOAD_PATH + "v1/folder/test", result);
        result = cloudinary.url().version(123).generate("folder/test");
        assertEquals(DEFAULT_UPLOAD_PATH + "v123/folder/test", result);
    }

    @Test
    public void test_secure_distribution() {
        // should use default secure distribution if secure=TRUE
        String result = cloudinary.url().secure(true).generate("test");
        assertEquals("https://res.cloudinary.com/dwmhubjrv/image/upload/test", result);
    }

}
