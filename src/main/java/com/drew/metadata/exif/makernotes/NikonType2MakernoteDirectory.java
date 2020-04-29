package com.drew.metadata.exif.makernotes;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Directory;
import dji.sdksharedlib.keycatalog.CameraKeys;
import java.util.HashMap;

public class NikonType2MakernoteDirectory extends Directory {
    public static final int TAG_ACTIVE_D_LIGHTING = 34;
    public static final int TAG_ADAPTER = 130;
    public static final int TAG_AE_BRACKET_COMPENSATION = 25;
    public static final int TAG_AF_FOCUS_POSITION = 136;
    public static final int TAG_AF_INFO_2 = 183;
    public static final int TAG_AF_RESPONSE = 173;
    public static final int TAG_AF_TUNE = 185;
    public static final int TAG_AF_TYPE = 7;
    public static final int TAG_AUTO_FLASH_COMPENSATION = 18;
    public static final int TAG_AUTO_FLASH_MODE = 9;
    public static final int TAG_CAMERA_COLOR_MODE = 141;
    public static final int TAG_CAMERA_HUE_ADJUSTMENT = 146;
    public static final int TAG_CAMERA_SERIAL_NUMBER = 29;
    public static final int TAG_CAMERA_SERIAL_NUMBER_2 = 160;
    public static final int TAG_CAMERA_SHARPENING = 6;
    public static final int TAG_CAMERA_TONE_COMPENSATION = 129;
    public static final int TAG_CAMERA_WHITE_BALANCE = 5;
    public static final int TAG_CAMERA_WHITE_BALANCE_FINE = 11;
    public static final int TAG_CAMERA_WHITE_BALANCE_RB_COEFF = 12;
    public static final int TAG_COLOR_BALANCE = 151;
    public static final int TAG_COLOR_MODE = 3;
    public static final int TAG_COLOR_SPACE = 30;
    public static final int TAG_CONTRAST_CURVE = 140;
    public static final int TAG_CROP_HIGH_SPEED = 27;
    public static final int TAG_DATA_DUMP = 16;
    public static final int TAG_DELETED_IMAGE_COUNT = 166;
    public static final int TAG_DIGITAL_VARI_PROGRAM = 171;
    public static final int TAG_DIGITAL_ZOOM = 134;
    public static final int TAG_EXPOSURE_DIFFERENCE = 14;
    public static final int TAG_EXPOSURE_SEQUENCE_NUMBER = 167;
    public static final int TAG_EXPOSURE_TUNING = 28;
    public static final int TAG_FILE_INFO = 184;
    public static final int TAG_FIRMWARE_VERSION = 1;
    public static final int TAG_FLASH_BRACKET_COMPENSATION = 24;
    public static final int TAG_FLASH_EXPOSURE_COMPENSATION = 23;
    public static final int TAG_FLASH_INFO = 168;
    public static final int TAG_FLASH_MODE = 26;
    public static final int TAG_FLASH_SYNC_MODE = 8;
    public static final int TAG_FLASH_USED = 135;
    public static final int TAG_HIGH_ISO_NOISE_REDUCTION = 177;
    public static final int TAG_IMAGE_ADJUSTMENT = 128;
    public static final int TAG_IMAGE_AUTHENTICATION = 32;
    public static final int TAG_IMAGE_BOUNDARY = 22;
    public static final int TAG_IMAGE_COUNT = 165;
    public static final int TAG_IMAGE_DATA_SIZE = 162;
    public static final int TAG_IMAGE_OPTIMISATION = 169;
    public static final int TAG_IMAGE_STABILISATION = 172;
    public static final int TAG_ISO_1 = 2;
    public static final int TAG_ISO_INFO = 37;
    public static final int TAG_ISO_MODE = 15;
    public static final int TAG_ISO_REQUESTED = 19;
    public static final int TAG_LENS = 132;
    public static final int TAG_LENS_DATA = 152;
    public static final int TAG_LENS_STOPS = 139;
    public static final int TAG_LENS_TYPE = 131;
    public static final int TAG_LIGHT_SOURCE = 144;
    public static final int TAG_LINEARIZATION_TABLE = 150;
    public static final int TAG_MANUAL_FOCUS_DISTANCE = 133;
    public static final int TAG_MULTI_EXPOSURE = 176;
    public static final int TAG_NEF_BIT_DEPTH = 3618;
    public static final int TAG_NEF_COMPRESSION = 147;
    public static final int TAG_NEF_THUMBNAIL_SIZE = 153;
    public static final int TAG_NIKON_CAPTURE_DATA = 3585;
    public static final int TAG_NIKON_CAPTURE_OFFSETS = 3598;
    public static final int TAG_NIKON_CAPTURE_VERSION = 3593;
    public static final int TAG_NIKON_SCAN = 3600;
    public static final int TAG_NOISE_REDUCTION = 149;
    public static final int TAG_PICTURE_CONTROL = 35;
    public static final int TAG_POWER_UP_TIME = 182;
    public static final int TAG_PREVIEW_IFD = 17;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 3584;
    public static final int TAG_PROGRAM_SHIFT = 13;
    public static final int TAG_QUALITY_AND_FILE_FORMAT = 4;
    public static final int TAG_RETOUCH_HISTORY = 158;
    public static final int TAG_SATURATION = 148;
    public static final int TAG_SATURATION_2 = 170;
    public static final int TAG_SCENE_ASSIST = 156;
    public static final int TAG_SCENE_MODE = 143;
    public static final int TAG_SENSOR_PIXEL_SIZE = 154;
    public static final int TAG_SHOOTING_MODE = 137;
    public static final int TAG_SHOT_INFO = 145;
    public static final int TAG_UNKNOWN_10 = 155;
    public static final int TAG_UNKNOWN_11 = 157;
    public static final int TAG_UNKNOWN_12 = 159;
    public static final int TAG_UNKNOWN_20 = 138;
    public static final int TAG_UNKNOWN_27 = 163;
    public static final int TAG_UNKNOWN_28 = 164;
    public static final int TAG_UNKNOWN_29 = 174;
    public static final int TAG_UNKNOWN_30 = 175;
    public static final int TAG_UNKNOWN_31 = 178;
    public static final int TAG_UNKNOWN_32 = 179;
    public static final int TAG_UNKNOWN_33 = 180;
    public static final int TAG_UNKNOWN_34 = 10;
    public static final int TAG_UNKNOWN_35 = 33;
    public static final int TAG_UNKNOWN_36 = 38;
    public static final int TAG_UNKNOWN_37 = 39;
    public static final int TAG_UNKNOWN_38 = 40;
    public static final int TAG_UNKNOWN_39 = 41;
    public static final int TAG_UNKNOWN_40 = 43;
    public static final int TAG_UNKNOWN_41 = 44;
    public static final int TAG_UNKNOWN_42 = 45;
    public static final int TAG_UNKNOWN_43 = 46;
    public static final int TAG_UNKNOWN_44 = 47;
    public static final int TAG_UNKNOWN_45 = 48;
    public static final int TAG_UNKNOWN_46 = 49;
    public static final int TAG_UNKNOWN_47 = 142;
    public static final int TAG_UNKNOWN_48 = 181;
    public static final int TAG_UNKNOWN_49 = 187;
    public static final int TAG_UNKNOWN_50 = 189;
    public static final int TAG_UNKNOWN_51 = 259;
    public static final int TAG_UNKNOWN_52 = 3589;
    public static final int TAG_UNKNOWN_53 = 3592;
    public static final int TAG_UNKNOWN_54 = 3609;
    public static final int TAG_UNKNOWN_55 = 3619;
    public static final int TAG_VIGNETTE_CONTROL = 42;
    public static final int TAG_VR_INFO = 31;
    public static final int TAG_WORLD_TIME = 36;
    @NotNull
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    static {
        _tagNameMap.put(1, "Firmware Version");
        _tagNameMap.put(2, CameraKeys.ISO);
        _tagNameMap.put(4, "Quality & File Format");
        _tagNameMap.put(5, "White Balance");
        _tagNameMap.put(6, "Sharpening");
        _tagNameMap.put(7, "AF Type");
        _tagNameMap.put(11, "White Balance Fine");
        _tagNameMap.put(12, "White Balance RB Coefficients");
        _tagNameMap.put(19, CameraKeys.ISO);
        _tagNameMap.put(15, "ISO Mode");
        _tagNameMap.put(16, "Data Dump");
        _tagNameMap.put(13, "Program Shift");
        _tagNameMap.put(14, "Exposure Difference");
        _tagNameMap.put(17, "Preview IFD");
        _tagNameMap.put(131, "Lens Type");
        _tagNameMap.put(135, "Flash Used");
        _tagNameMap.put(136, "AF Focus Position");
        _tagNameMap.put(137, "Shooting Mode");
        _tagNameMap.put(139, "Lens Stops");
        _tagNameMap.put(140, "Contrast Curve");
        _tagNameMap.put(144, "Light source");
        _tagNameMap.put(145, "Shot Info");
        _tagNameMap.put(151, "Color Balance");
        _tagNameMap.put(152, "Lens Data");
        _tagNameMap.put(153, "NEF Thumbnail Size");
        _tagNameMap.put(154, "Sensor Pixel Size");
        _tagNameMap.put(155, "Unknown 10");
        _tagNameMap.put(156, "Scene Assist");
        _tagNameMap.put(157, "Unknown 11");
        _tagNameMap.put(158, "Retouch History");
        _tagNameMap.put(159, "Unknown 12");
        _tagNameMap.put(8, "Flash Sync Mode");
        _tagNameMap.put(9, "Auto Flash Mode");
        _tagNameMap.put(18, "Auto Flash Compensation");
        _tagNameMap.put(167, "Exposure Sequence Number");
        _tagNameMap.put(3, "Color Mode");
        _tagNameMap.put(138, "Unknown 20");
        _tagNameMap.put(22, "Image Boundary");
        _tagNameMap.put(23, "Flash Exposure Compensation");
        _tagNameMap.put(24, "Flash Bracket Compensation");
        _tagNameMap.put(25, "AE Bracket Compensation");
        _tagNameMap.put(26, "Flash Mode");
        _tagNameMap.put(27, "Crop High Speed");
        _tagNameMap.put(28, "Exposure Tuning");
        _tagNameMap.put(29, "Camera Serial Number");
        _tagNameMap.put(30, "Color Space");
        _tagNameMap.put(31, "VR Info");
        _tagNameMap.put(32, "Image Authentication");
        _tagNameMap.put(33, "Unknown 35");
        _tagNameMap.put(34, "Active D-Lighting");
        _tagNameMap.put(35, "Picture Control");
        _tagNameMap.put(36, "World Time");
        _tagNameMap.put(37, "ISO Info");
        _tagNameMap.put(38, "Unknown 36");
        _tagNameMap.put(39, "Unknown 37");
        _tagNameMap.put(40, "Unknown 38");
        _tagNameMap.put(41, "Unknown 39");
        _tagNameMap.put(42, "Vignette Control");
        _tagNameMap.put(43, "Unknown 40");
        _tagNameMap.put(44, "Unknown 41");
        _tagNameMap.put(45, "Unknown 42");
        _tagNameMap.put(46, "Unknown 43");
        _tagNameMap.put(47, "Unknown 44");
        _tagNameMap.put(48, "Unknown 45");
        _tagNameMap.put(49, "Unknown 46");
        _tagNameMap.put(142, "Unknown 47");
        _tagNameMap.put(143, "Scene Mode");
        _tagNameMap.put(160, "Camera Serial Number");
        _tagNameMap.put(162, "Image Data Size");
        _tagNameMap.put(163, "Unknown 27");
        _tagNameMap.put(164, "Unknown 28");
        _tagNameMap.put(165, "Image Count");
        _tagNameMap.put(166, "Deleted Image Count");
        _tagNameMap.put(170, CameraKeys.SATURATION);
        _tagNameMap.put(171, "Digital Vari Program");
        _tagNameMap.put(172, "Image Stabilisation");
        _tagNameMap.put(173, "AF Response");
        _tagNameMap.put(174, "Unknown 29");
        _tagNameMap.put(175, "Unknown 30");
        _tagNameMap.put(176, "Multi Exposure");
        _tagNameMap.put(177, "High ISO Noise Reduction");
        _tagNameMap.put(178, "Unknown 31");
        _tagNameMap.put(179, "Unknown 32");
        _tagNameMap.put(180, "Unknown 33");
        _tagNameMap.put(181, "Unknown 48");
        _tagNameMap.put(182, "Power Up Time");
        _tagNameMap.put(183, "AF Info 2");
        _tagNameMap.put(184, "File Info");
        _tagNameMap.put(185, "AF Tune");
        _tagNameMap.put(168, "Flash Info");
        _tagNameMap.put(169, "Image Optimisation");
        _tagNameMap.put(128, "Image Adjustment");
        _tagNameMap.put(129, "Tone Compensation");
        _tagNameMap.put(Integer.valueOf((int) TAG_ADAPTER), "Adapter");
        _tagNameMap.put(132, "Lens");
        _tagNameMap.put(133, "Manual Focus Distance");
        _tagNameMap.put(134, "Digital Zoom");
        _tagNameMap.put(141, "Colour Mode");
        _tagNameMap.put(146, "Camera Hue Adjustment");
        _tagNameMap.put(147, "NEF Compression");
        _tagNameMap.put(148, CameraKeys.SATURATION);
        _tagNameMap.put(149, "Noise Reduction");
        _tagNameMap.put(150, "Linearization Table");
        _tagNameMap.put(Integer.valueOf((int) TAG_NIKON_CAPTURE_DATA), "Nikon Capture Data");
        _tagNameMap.put(187, "Unknown 49");
        _tagNameMap.put(189, "Unknown 50");
        _tagNameMap.put(259, "Unknown 51");
        _tagNameMap.put(3584, "Print IM");
        _tagNameMap.put(Integer.valueOf((int) TAG_UNKNOWN_52), "Unknown 52");
        _tagNameMap.put(Integer.valueOf((int) TAG_UNKNOWN_53), "Unknown 53");
        _tagNameMap.put(Integer.valueOf((int) TAG_NIKON_CAPTURE_VERSION), "Nikon Capture Version");
        _tagNameMap.put(Integer.valueOf((int) TAG_NIKON_CAPTURE_OFFSETS), "Nikon Capture Offsets");
        _tagNameMap.put(Integer.valueOf((int) TAG_NIKON_SCAN), "Nikon Scan");
        _tagNameMap.put(Integer.valueOf((int) TAG_UNKNOWN_54), "Unknown 54");
        _tagNameMap.put(Integer.valueOf((int) TAG_NEF_BIT_DEPTH), "NEF Bit Depth");
        _tagNameMap.put(Integer.valueOf((int) TAG_UNKNOWN_55), "Unknown 55");
    }

    public NikonType2MakernoteDirectory() {
        setDescriptor(new NikonType2MakernoteDescriptor(this));
    }

    @NotNull
    public String getName() {
        return "Nikon Makernote";
    }

    /* access modifiers changed from: protected */
    @NotNull
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
