-- noinspection SqlDialectInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile



INSERT INTO GSM (ID, GSM_NAME, GSM_LOGO, GSM_PICTURE, GSM_INFORMATION) VALUES
(0, 'IOS', '/img/ios_logo.png', '/img/iphone_home.jpg', 'IOS is het besturingssysteem van Apple.');
INSERT INTO GSM (ID, GSM_NAME, GSM_LOGO, GSM_PICTURE, GSM_INFORMATION) VALUES
(1, 'Android', '/img/android_logo.jpg', '/img/android_home.jpg', 'Android is het besturingssysteem van Google.');
INSERT INTO GSM (ID, GSM_NAME, GSM_LOGO, GSM_PICTURE, GSM_INFORMATION) VALUES
(2, 'Windows', '/img/windows_logo.png', '/img/windows_home.jpg', 'Windows is het besturingssysteem van Microsoft.');


INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'iPhone 12', 'X1b3C2081-Q', 0);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'iPhone 11', 'OoY7zp8GkLI', 0);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'iPhone XR', 'xsiV_-o5488', 0);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'iPhone XS', 'YAF9BWpzwvI', 0);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Samsung Galaxy S21 Ultra', 'kYPHTSEU49Y', 1);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'LG V70 ThinQ 5G', '7A5X4ZpNLxI', 1);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'OnePlus 9', 'Mm27tNiOqdg', 1);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Huawei P50 Pro Plus', 'PAAgoBfuWIc', 1);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Wileyfox Pro', 'aG35MlEzlDw', 2);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Microsoft Lumia 550', 'xj3NYoUVEZk', 2);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Microsoft Lumia 650', 'OGQDF6lJc9s', 2);

INSERT INTO GSM_VIDEO (ID, GSM_NAME_VIDEO, VIDEO_FILE_NAME, GSM_ID) VALUES
(nextval('VIDEO_SEQ'), 'Microsoft Lumia 950', '0d0nBYno75o', 2);


INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(0, 'iPhone X', 'De iPhone X (uitgesproken als iPhone 10) is een smartphone die is uitgebracht in November 2017, de opvolger van de iPhone 8.', '/img/iphoneX.png', 200, 0);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE,  MAX_PRICE_GSM, GSM_ID) VALUES
(1, 'iPhone 8', 'De iPhone 8 in September 2017, ontworpen en op de markt gebracht door Apple Inc.', '/img/iphone8.jpg', 190, 0);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(2, 'iPhone 7', 'De iPhone 7 is uitgebracht in September 2016, ontworpen en op de markt gebracht doot Apple Inc.', '/img/iphone7.jpg', 180, 0);


INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(3, 'Samsung S10', 'De Samsung S10 is uitgebracht in Maart 2019 door Samsung en draait op Android.', '/img/s10.jpg', 170, 1);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(4, 'OnePlus 9', 'De OnePlus 9 is uitgebracht in Maart 2021 en draait op Android', '/img/oneplus9.png', 160, 1);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(5, 'Sony xperia 5', 'De Sony xperia 5 is uitgebracht in September 2019 en draait op Android', '/img/sony5.jpg', 150, 1);


INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(6, 'Nokia Lumia 1020', 'De Nokia Lumia 1020 is uitgebracht in Juli 2013 en draait op windows.', '/img/lumia1020.jpg', 140, 2);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(7, 'Nokia Lumia 925', 'De Nokia Lumia 925 is uitgebracht in juni 2013 en draait op windows.', '/img/lumia925.jpg', 130, 2);

INSERT INTO GSM_INFORMATION (ID, GSM_MODEL, GSM_MODEL_INFORMATION, GSM_MODEL_PICTURE, MAX_PRICE_GSM, GSM_ID) VALUES
(8, 'Nokia Lumia 830', 'De Nokia Lumia 830 is uitgebracht in Oktober 2014 en draait op widows.', '/img/lumia830.jpg', 120, 2);


INSERT INTO GALERY (ID, RANDOM_PHONE_PICTURE_ONE, RANDOM_PHONE_PICTURE_TWO, RANDOM_PHONE_PICTURE_THREE, RANDOM_PHONE_PICTURE_FOUR) VALUES
(0, '/img/gal1.jpg', '/img/gal2.jpg', '/img/gal3.jpg', '/img/gal4.jpg');

INSERT INTO GALERY (ID, RANDOM_PHONE_PICTURE_ONE, RANDOM_PHONE_PICTURE_TWO, RANDOM_PHONE_PICTURE_THREE, RANDOM_PHONE_PICTURE_FOUR) VALUES
(1, '/img/gal5.png', '/img/gal6.jpg', '/img/gal7.jpg', '/img/gal8.jpg');

INSERT INTO GALERY (ID, RANDOM_PHONE_PICTURE_ONE, RANDOM_PHONE_PICTURE_TWO, RANDOM_PHONE_PICTURE_THREE, RANDOM_PHONE_PICTURE_FOUR) VALUES
(2, '/img/gal9.jpg', '/img/gal10.jpg', '/img/gal11.jpg', '/img/gal12.jpg');





INSERT INTO USER (ID, USERNAME, PASSWORD, ROLE) VALUES
(0, 'admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', 'ADMIN');



