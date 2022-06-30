INSERT INTO tb_user (id,name,email,username,created_at,updated_at)
VALUES
    ('539039c8-549c-355b-9696-9e8ed67c4c2e','Brielle Scott','quam.elementum@google.ca','brielle','2022-03-21 05:32:29','2021-12-27 21:59:56'),
    ('cdd8448a-a3a2-1558-b181-a4f7ef6bd93e','Simon Bass','nibh@hotmail.com','simon','2022-11-01 16:09:09','2022-03-16 23:09:27'),
    ('691e61dc-4421-6712-97b6-a8b346340b44','Callum Richards','luctus@hotmail.ca','callum','2023-04-16 21:06:38','2022-01-17 01:46:18'),
    ('c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483','Desirae Mcclure','class@google.org','desirae','2022-07-20 05:08:28','2023-06-02 09:49:16'),
    ('528ed16b-b394-ca38-4922-232b66b10954','Malcolm Guy','dui.cras@icloud.ca','malcolm','2022-05-06 12:57:25','2022-05-31 21:32:56');

INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d06f3249-0e78-4385-4d23-f33173283c27',
        'vulputate ullamcorper magna. Sed eu eros. Nam consequat dolor vitae', '2021-11-03 22:57:55.000000', 0,
        0, 'ORIGINAL', '2022-02-15 16:43:41.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8e020cbb-beef-7e1b-9c89-21fc913d7ca9', 'montes,
        nascetur ridiculus mus. Proin vel arcu eu odio tristique pharetra. Quisque ac libero nec ligula consectetuer rhoncus.',
        '2021-10-02 17:09:01.000000', 0, 0, 'ORIGINAL', '2022-02-18 04:16:45.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('52d39193-aeb0-9c5c-addf-efb9c1699223', 'eleifend nec, malesuada ut, sem.Nulla interdum.',
        '2021-07-03 09:37:47.000000', 0, 0, 'ORIGINAL', '2022-02-15 15:43:35.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('68609328-e365-89e7-f584-b9e1c6921adb',
        'et ipsum cursus vestibulum. Mauris magna. Duis dignissim tempor arcu. Vestibulum ut eros non enim commodo hendrerit.',
        '2021-12-26 21:47:06.000000', 0, 0, 'ORIGINAL', '2022-02-17 01:08:42.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('745ae4c4-204d-10bd-84ef-e8523ce8262c',
        'urna. Ut tincidunt vehicula risus. Nulla eget metus eu erat semper rutrum. Fusce dolor quam, elementum at,
        egestas', '2021-06-25 13:01:53.000000', 0, 0, 'ORIGINAL', '2022-02-19 13:54:59.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('2d8e4465-0356-2306-ee9b-fdffc5e88d98', 'Vestibulum ut eros non enim commodo',
        '2021-09-28 03:46:32.000000', 0, 0, 'ORIGINAL', '2022-02-17 20:09:01.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('5ff59da6-52da-3066-38ab-eab44dba68a3',
        'orci. Ut sagittis lobortis mauris. Suspendisse aliquet molestie tellus. Aenean egestas hendrerit neque. In ornare',
        '2021-10-20 23:48:56.000000', 0, 0, 'ORIGINAL', '2022-02-17 22:47:17.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d6f7d2e4-b3b0-aeb1-71eb-cd5e2e59d314', 'Fusce mi lorem, vehicula et, rutrum eu, ultrices sit amet,
        risus.Donec nibh', '2021-11-11 18:14:41.000000', 0, 0, 'ORIGINAL', '2022-02-15 16:24:10.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('703b66d2-5b7d-f4e3-2973-4ace72c104ac',
        'eu arcu. Morbi sit amet massa. Quisque porttitor eros nec tellus. Nunc lectus pede, ultrices a, auctor',
        '2021-10-16 10:14:00.000000', 0, 0, 'ORIGINAL', '2022-02-19 02:03:52.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('265d2719-2188-5300-ec66-37f3197c139e', 'Nullam enim. Sed nulla ante, iaculis nec, eleifend non,
        dapibus rutrum,', '2021-09-12 10:41:57.000000', 0, 0, 'ORIGINAL', '2022-02-18 16:46:53.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('da86d104-dd41-5fcb-e3a8-094ddc644736', 'pretium et, rutrum non, hendrerit id, ante.Nunc mauris sapien,
        cursus in,', '2021-07-30 14:44:39.000000', 0, 0, 'ORIGINAL', '2022-02-15 23:57:25.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('7a80cac9-1b95-5ca4-2691-c83cdb8a1a29',
        'Donec non justo. Proin non massa non ante bibendum ullamcorper. Duis', '2021-11-08 23:04:41.000000', 0,
        0, 'ORIGINAL', '2022-02-16 03:39:21.000000', 'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('e6796e6e-b434-3b81-b971-0440cb0a9a25', 'dis parturient montes, nascetur ridiculus',
        '2021-09-29 10:18:46.000000', 0, 0, 'ORIGINAL', '2022-02-17 14:09:39.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('dc1b8545-ec10-a676-8264-2443d331b487', 'ante. Maecenas mi felis, adipiscing fringilla, porttitor vulputate,
        posuere vulputate, lacus.Cras interdum. Nunc', '2021-11-01 14:36:10.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 03:54:42.000000', 'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('245b2eee-0d54-e27b-dfd7-91d4da4be6c6', 'sociosqu ad litora torquent per conubia nostra,
        per inceptos hymenaeos. Mauris ut quam vel', '2021-10-01 22:55:20.000000', 0, 0, 'ORIGINAL',
        '2022-02-16 17:41:13.000000', 'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8dac93c7-c0a8-8689-a116-62e33d8ef41d', 'ornare, lectus ante dictum mi, ac mattis velit justo nec',
        '2021-08-11 02:37:25.000000', 0, 0, 'ORIGINAL', '2022-02-14 23:53:51.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('38d0547d-bb8a-4b11-0e7e-a27edcdcdb9f', 'feugiat metus sit amet ante. Vivamus non',
        '2021-08-25 03:18:11.000000', 0, 0, 'ORIGINAL', '2022-02-14 21:58:58.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('4a55c854-7bde-7c8c-ec6b-b73d81848afa',
        'Ut sagittis lobortis mauris. Suspendisse aliquet molestie tellus. Aenean egestas hendrerit neque. In',
        '2021-08-31 23:32:53.000000', 0, 0, 'ORIGINAL', '2022-02-17 01:07:13.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('47d07366-3b14-2665-1a08-ad94a1d8daa1',
        'tempor augue ac ipsum. Phasellus vitae mauris sit amet lorem semper auctor. Mauris vel turpis. Aliquam adipiscing lobortis risus.',
        '2021-09-23 21:29:57.000000', 0, 0, 'ORIGINAL', '2022-02-16 00:48:20.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('ce1b93c9-01c7-b518-45e3-2aa159085cde',
        'Curabitur massa. Vestibulum accumsan neque et nunc. Quisque ornare tortor at risus.',
        '2021-11-15 19:11:43.000000', 0, 0, 'ORIGINAL', '2022-02-18 03:15:30.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8bd0d71f-9a93-01b3-15e1-638562df82c9',
        'turpis nec mauris blandit mattis. Cras eget nisi dictum augue malesuada malesuada.',
        '2021-09-23 07:16:33.000000', 0, 0, 'ORIGINAL', '2022-02-18 02:14:34.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('4bc92235-e926-a1a7-2a8b-4b37de61c324', 'montes,
        nascetur ridiculus mus. Aenean eget magna. Suspendisse tristique neque venenatis lacus. Etiam bibendum fermentum metus. Aenean',
        '2021-12-08 13:04:58.000000', 0, 0, 'ORIGINAL', '2022-02-15 07:38:26.000000',
        'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('1da51059-2b81-693f-342d-e8d88beb7350', 'mauris elit, dictum eu, eleifend nec, malesuada ut,
        sem.Nulla interdum. Curabitur dictum. Phasellus in felis.', '2021-08-29 11:11:23.000000', 0, 0,
        'ORIGINAL', '2022-02-19 15:21:56.000000', 'c1a8ca27-e4c7-8d57-78d4-74f9ecd8f483', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('337e7388-32b9-15e5-0529-e532b5d71c42',
        'vehicula. Pellentesque tincidunt tempus risus. Donec egestas. Duis ac arcu. Nunc mauris. Morbi non sapien molestie orci',
        '2022-01-17 12:27:50.000000', 0, 0, 'ORIGINAL', '2022-02-17 14:54:19.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('51180648-8fc5-223d-e033-d14c9beb627e', 'feugiat non, lobortis quis, pede.',
        '2021-12-11 03:19:22.000000', 0, 0, 'ORIGINAL', '2022-02-17 20:09:42.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('c8fcd535-bfbb-74f2-0e44-2821c5f5be05',
        'primis in faucibus orci luctus et ultrices posuere cubilia Curae Donec tincidunt. Donec vitae erat vel pede blandit congue.',
        '2021-07-06 09:51:05.000000', 0, 0, 'ORIGINAL', '2022-02-19 12:27:35.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('bd76d37e-b7da-c111-08df-236629b68e5b', 'ipsum dolor sit amet, consectetuer adipiscing elit. Aliquam auctor,
        velit eget laoreet posuere, enim', '2021-07-18 02:38:19.000000', 0, 0, 'ORIGINAL',
        '2022-02-18 20:05:25.000000', '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('cfc85b09-1a7e-b390-5ed4-a23f1eab6617',
        'non enim. Mauris quis turpis vitae purus gravida sagittis. Duis gravida. Praesent eu nulla at sem molestie',
        '2022-01-22 20:25:38.000000', 0, 0, 'ORIGINAL', '2022-02-19 05:08:15.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('46c022ae-a50a-9022-c8e5-fb16e126f8e3',
        'aliquet molestie tellus. Aenean egestas hendrerit neque. In ornare sagittis felis. Donec tempor,
        est ac mattis semper, dui', '2021-07-05 01:20:11.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 19:32:53.000000', '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('80f37bd9-5383-6aa2-4318-734776c34d3d', 'Suspendisse dui. Fusce diam nunc, ullamcorper eu, euismod',
        '2021-07-21 07:30:57.000000', 0, 0, 'ORIGINAL', '2022-02-15 06:29:24.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('4415195b-f71c-3f09-a636-d1d819237164', 'iaculis aliquet diam. Sed diam lorem, auctor',
        '2022-01-14 01:46:55.000000', 0, 0, 'ORIGINAL', '2022-02-17 08:33:23.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('6d7ce6b5-31df-22a5-e894-6c9a66d2dea9', 'tellus faucibus leo, in lobortis tellus justo sit amet nulla.Donec
       ', '2021-08-01 12:31:00.000000', 0, 0, 'ORIGINAL', '2022-02-18 18:18:34.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d5b97e75-94f6-4003-4387-7b8249964765', 'vehicula et, rutrum eu, ultrices sit amet, risus.Donec nibh enim,
        gravida', '2021-07-31 20:08:53.000000', 0, 0, 'ORIGINAL', '2022-02-17 19:15:21.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('46c062d6-59b1-1869-b7d2-335c4db8bc68', 'purus. Duis elementum, dui quis accumsan convallis, ante',
        '2021-09-02 20:28:46.000000', 0, 0, 'ORIGINAL', '2022-02-17 22:00:29.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d4c802cd-f8a6-31a1-a99c-6a661eba36e8', 'natoque penatibus et magnis dis parturient montes,
        nascetur ridiculus mus. Proin vel arcu eu odio tristique', '2022-01-13 04:18:33.000000', 0, 0,
        'ORIGINAL', '2022-02-19 12:19:59.000000', '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('6308627e-69f7-cce1-52fc-8ea28cb0ee7d', 'placerat,
        augue.Sed molestie. Sed id risus quis diam luctus lobortis. Class', '2021-07-17 19:34:31.000000', 0, 0,
        'ORIGINAL', '2022-02-19 04:13:31.000000', '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('835078d8-aa9f-33ed-5764-1600c5f2b935', 'quis, pede.Suspendisse dui. Fusce diam nunc, ullamcorper eu,
        euismod', '2021-10-24 11:49:26.000000', 0, 0, 'ORIGINAL', '2022-02-18 15:40:34.000000',
        '691e61dc-4421-6712-97b6-a8b346340b44', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('fed9cbf6-50cc-3c6b-be28-417f4345623d',
        'malesuada fringilla est. Mauris eu turpis. Nulla aliquet. Proin velit. Sed malesuada augue ut lacus. Nulla',
        '2021-07-08 04:37:22.000000', 0, 0, 'ORIGINAL', '2022-02-15 05:08:17.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('f3337856-3538-c27e-2b0d-d72aed4042c1', 'massa. Mauris vestibulum, neque sed dictum eleifend,
        nunc risus varius orci, in consequat enim diam', '2022-01-11 07:58:59.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 17:37:04.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d0dbe766-5d18-c626-f051-dd0bb1b7ca2a',
        'fermentum fermentum arcu. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia',
        '2021-08-15 10:36:30.000000', 0, 0, 'ORIGINAL', '2022-02-18 04:45:38.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d422407a-58c7-7c9f-2c35-8c2b3c2d134f', 'Quisque purus sapien, gravida non, sollicitudin a,',
        '2022-01-01 04:36:41.000000', 0, 0, 'ORIGINAL', '2022-02-15 18:52:38.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('5ee174f2-99ce-81e6-413d-039bd5a3e3b7', 'et,
        magna.Praesent interdum ligula eu enim. Etiam imperdiet dictum magna. Ut tincidunt orci quis',
        '2021-09-01 10:32:24.000000', 0, 0, 'ORIGINAL', '2022-02-18 08:02:55.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('23b85c31-1268-cb48-7860-2a8827b7983a',
        'In scelerisque scelerisque dui. Suspendisse ac metus vitae velit egestas lacinia. Sed congue, elit sed',
        '2021-07-20 12:50:06.000000', 0, 0, 'ORIGINAL', '2022-02-15 01:46:40.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('373cc994-d814-3075-15c3-1382273b2cad', 'mollis. Phasellus libero mauris, aliquam eu, accumsan sed,
        facilisis vitae, orci.Phasellus dapibus quam quis diam. Pellentesque habitant',
        '2021-10-12 07:23:04.000000', 0, 0, 'ORIGINAL', '2022-02-14 23:43:30.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('0cfeb591-ddca-7aa7-b31d-c65705cc77d0',
        'sagittis placerat. Cras dictum ultricies ligula. Nullam enim. Sed nulla', '2021-10-08 08:32:07.000000',
        0, 0, 'ORIGINAL', '2022-02-15 16:59:34.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('89986d1d-7fcb-9b68-7f9e-f635c757c35c',
        'Cras vehicula aliquet libero. Integer in magna. Phasellus dolor elit, pellentesque a,',
        '2021-06-26 17:36:35.000000', 0, 0, 'ORIGINAL', '2022-02-16 16:06:40.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('dfbf35bf-ad8b-4969-afd4-552e32d69c94', 'accumsan convallis, ante lectus convallis est,
        vitae sodales nisi magna', '2021-10-09 20:51:54.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 20:48:00.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('891d584c-51e8-874e-fa28-764c3044d2a3',
        'fringilla euismod enim. Etiam gravida molestie arcu. Sed eu nibh vulputate mauris sagittis placerat. Cras dictum',
        '2021-08-23 14:09:52.000000', 0, 0, 'ORIGINAL', '2022-02-15 17:08:00.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8a374444-3749-c89a-a441-ad199a2ac417', 'Sed neque. Sed eget lacus. Mauris non dui nec urna',
        '2021-07-30 00:59:34.000000', 0, 0, 'ORIGINAL', '2022-02-16 06:56:12.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('d9ee114c-dadd-7354-89c3-d8ee6100d023', 'Quisque purus sapien, gravida non, sollicitudin a, malesuada id,
        erat.Etiam vestibulum massa rutrum magna. Cras convallis convallis dolor. Quisque',
        '2021-11-08 01:09:50.000000', 0, 0, 'ORIGINAL', '2022-02-15 02:20:40.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('3d5b8568-5795-01e7-3334-56c96dfcf019', 'ultrices posuere cubilia Curae Donec tincidunt.',
        '2021-08-12 08:14:26.000000', 0, 0, 'ORIGINAL', '2022-02-15 22:21:54.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('7485ace6-6839-01bb-d79c-44ff6b34867a', 'aliquet. Proin velit. Sed malesuada augue ut lacus. Nulla',
        '2022-01-09 00:17:21.000000', 0, 0, 'ORIGINAL', '2022-02-18 07:26:49.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('e7668dee-e741-d4f7-828a-2c80cdbf7581', 'velit. Cras lorem lorem, luctus ut, pellentesque eget,
        dictum placerat, augue.Sed molestie.', '2022-01-01 10:18:12.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 14:52:00.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('545ba6ec-55d9-a6c6-16e2-478bb54dcc74', 'a, enim.Suspendisse aliquet, sem ut cursus luctus,
        ipsum leo elementum sem, vitae aliquam eros turpis non', '2021-12-09 16:04:20.000000', 0, 0,
        'ORIGINAL', '2022-02-14 20:05:18.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('a1a496a9-6fbd-7984-59f7-633853121656', 'enim, sit amet ornare lectus', '2021-07-29 11:28:17.000000',
        0, 0, 'ORIGINAL', '2022-02-18 23:01:55.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('cc5cdaec-d6e3-acdf-6329-fdef1ebee868', 'turpis. In condimentum. Donec at arcu. Vestibulum ante',
        '2021-09-30 05:47:36.000000', 0, 0, 'ORIGINAL', '2022-02-17 01:29:26.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('b2ca637b-3037-ce1d-bae6-e404926b09e8', 'Aliquam auctor, velit eget laoreet posuere,
        enim nisl elementum purus, accumsan', '2021-11-15 03:29:10.000000', 0, 0, 'ORIGINAL',
        '2022-02-14 18:16:35.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('7a35f343-ab12-d146-7a05-47d4295a7f4a', 'amet, dapibus id, blandit at,
        nisi.Cum sociis natoque penatibus et magnis', '2021-09-20 06:57:09.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 03:48:43.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('55802a42-45ba-dc59-0052-b96a1bfbdb26', 'at, velit.Cras lorem lorem, luctus ut, pellentesque eget,
        dictum placerat, augue.Sed molestie.', '2021-12-18 21:15:29.000000', 0, 0, 'ORIGINAL',
        '2022-02-19 00:29:40.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('c1731c7b-3208-cca6-2221-78a01ac58c21', 'ultrices. Vivamus rhoncus. Donec est. Nunc',
        '2022-01-22 15:13:21.000000', 0, 0, 'ORIGINAL', '2022-02-16 03:48:31.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('76191e87-6664-4b41-6bfa-b95624e7ed82', 'ad litora torquent per conubia nostra,
        per inceptos hymenaeos. Mauris ut quam vel sapien imperdiet', '2021-08-29 14:20:35.000000', 0, 0,
        'ORIGINAL', '2022-02-17 12:45:28.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('2b253e1b-aed6-523e-41d2-c898eb88b7dc',
        'Nullam nisl. Maecenas malesuada fringilla est. Mauris eu turpis. Nulla aliquet. Proin velit. Sed malesuada augue ut lacus. Nulla',
        '2022-01-12 09:07:08.000000', 0, 0, 'ORIGINAL', '2022-02-16 08:07:38.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('19992495-4379-3b88-8562-8e4668ad4bd5', 'tempor bibendum. Donec felis orci, adipiscing non,
        luctus sit amet, faucibus ut, nulla.Cras eu tellus eu augue porttitor', '2021-06-30 13:49:09.000000', 0,
        0, 'ORIGINAL', '2022-02-18 22:48:54.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('56a99253-c4a7-e2d0-30ef-cfbe575f1eaa', 'erat, eget tincidunt dui augue eu tellus. Phasellus',
        '2021-10-15 02:12:11.000000', 0, 0, 'ORIGINAL', '2022-02-17 10:25:38.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8d04c8b5-b022-8a96-63c1-719a42e8a00f', 'mauris, rhoncus id, mollis nec, cursus a, enim.Suspendisse aliquet,
        sem', '2021-09-28 18:27:46.000000', 0, 0, 'ORIGINAL', '2022-02-15 12:14:28.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('918e8697-aba9-114d-a474-35aa3285930e',
        'neque et nunc. Quisque ornare tortor at risus. Nunc ac sem ut dolor dapibus',
        '2021-10-26 14:41:57.000000', 0, 0, 'ORIGINAL', '2022-02-17 13:42:29.000000',
        'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('b8ee2414-b2ce-d09e-1736-b61a5aae39cc', 'Proin mi. Aliquam gravida mauris ut mi. Duis risus odio,
        auctor vitae, aliquet', '2021-09-10 21:10:45.000000', 0, 0, 'ORIGINAL',
        '2022-02-16 07:25:49.000000', 'cdd8448a-a3a2-1558-b181-a4f7ef6bd93e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('f135a246-cc7a-4d8b-c2c9-0258727d8a92',
        'molestie dapibus ligula. Aliquam erat volutpat. Nulla dignissim. Maecenas ornare egestas ligula. Nullam feugiat placerat velit. Quisque varius.',
        '2021-08-11 11:13:16.000000', 0, 0, 'ORIGINAL', '2022-02-15 15:41:51.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('cdc23c27-ec97-485b-062a-80e1210797b7', 'at risus. Nunc ac sem ut dolor dapibus gravida.',
        '2021-10-01 10:36:26.000000', 0, 0, 'ORIGINAL', '2022-02-16 05:32:15.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('5c3e845d-8d87-c533-6370-0a6815eb2b50', 'elit, pellentesque a, facilisis non, bibendum sed,
        est.Nunc laoreet lectus quis massa. Mauris vestibulum, neque sed', '2021-12-22 02:15:50.000000', 0, 0,
        'ORIGINAL', '2022-02-17 11:04:43.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('021652a3-4735-ed6e-63c5-688872adb311', 'parturient montes,
        nascetur ridiculus mus. Donec dignissim magna a tortor. Nunc commodo auctor',
        '2021-10-02 06:45:19.000000', 0, 0, 'ORIGINAL', '2022-02-16 09:19:50.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('08dc8145-c99a-8cba-757a-63854e7a15c4',
        'ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae Donec tincidunt. Donec vitae erat vel pede',
        '2021-10-13 14:04:00.000000', 0, 0, 'ORIGINAL', '2022-02-19 13:28:53.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('f43be0a6-0b75-8774-abeb-d72d61184c95',
        'Morbi vehicula. Pellentesque tincidunt tempus risus. Donec egestas. Duis ac arcu. Nunc mauris. Morbi non sapien molestie orci tincidunt adipiscing.',
        '2021-11-14 17:25:28.000000', 0, 0, 'ORIGINAL', '2022-02-18 15:51:18.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('86142509-1ee7-17ab-81e6-d3a8d09624ca', 'Aliquam nec enim. Nunc ut erat. Sed nunc est,',
        '2021-11-04 12:48:26.000000', 0, 0, 'ORIGINAL', '2022-02-17 13:54:37.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('a023dca2-e378-d5a5-3ea3-3adc1884dd1d',
        'molestie sodales. Mauris blandit enim consequat purus. Maecenas libero est, congue a, aliquet vel,
        vulputate eu, odio.Phasellus at', '2021-07-25 14:54:46.000000', 0, 0, 'ORIGINAL',
        '2022-02-17 09:50:17.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('311580d2-561f-b49f-cbd2-e2daa3815765',
        'ut quam vel sapien imperdiet ornare. In faucibus. Morbi vehicula. Pellentesque tincidunt tempus risus. Donec egestas. Duis',
        '2021-10-26 18:28:40.000000', 0, 0, 'ORIGINAL', '2022-02-16 12:13:25.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('b4ff80ca-2c15-4cd5-5992-703d31f25207',
        'Pellentesque ultricies dignissim lacus. Aliquam rutrum lorem ac risus. Morbi metus. Vivamus euismod urna. Nullam lobortis quam a',
        '2021-07-02 17:40:18.000000', 0, 0, 'ORIGINAL', '2022-02-17 14:54:08.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('c16aac33-c876-2623-15a4-54087c73fd6a', 'lectus convallis est,
        vitae sodales nisi magna sed dui. Fusce aliquam, enim nec tempus scelerisque, lorem',
        '2021-09-02 20:43:26.000000', 0, 0, 'ORIGINAL', '2022-02-17 23:00:18.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('5649568a-fcec-64dd-6ad9-db6260e64891',
        'eros. Proin ultrices. Duis volutpat nunc sit amet metus. Aliquam erat volutpat. Nulla facilisis. Suspendisse',
        '2021-07-10 22:30:38.000000', 0, 0, 'ORIGINAL', '2022-02-19 15:00:39.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('0b42a802-eecc-e49a-26fa-3d78128fc963',
        'tristique neque venenatis lacus. Etiam bibendum fermentum metus. Aenean sed pede nec ante',
        '2021-09-23 04:04:14.000000', 0, 0, 'ORIGINAL', '2022-02-16 23:15:05.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('5c347eac-ca1a-44bb-148b-349e6c178ef5',
        'Nunc commodo auctor velit. Aliquam nisl. Nulla eu neque pellentesque', '2021-07-11 07:59:05.000000', 0,
        0, 'ORIGINAL', '2022-02-16 07:30:13.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('f6e9eb76-42ad-9440-af87-2a63430e9653',
        'Sed molestie. Sed id risus quis diam luctus lobortis. Class aptent taciti sociosqu ad litora torquent per conubia nostra,
        per', '2021-10-09 17:36:42.000000', 0, 0, 'ORIGINAL', '2022-02-18 11:14:04.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('391a0486-d686-6ddb-43d6-17eeb7ca554a', 'sed dolor. Fusce mi lorem, vehicula et, rutrum eu,
        ultrices sit amet, risus.Donec nibh enim, gravida', '2022-01-19 21:21:17.000000', 0, 0, 'ORIGINAL',
        '2022-02-16 19:08:36.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('06d097b9-5ec1-5d78-8aa7-30fe3506c376', 'dui lectus rutrum urna, nec luctus felis purus',
        '2021-10-24 00:03:32.000000', 0, 0, 'ORIGINAL', '2022-02-17 05:35:51.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('8e7e10ee-55c7-6eb2-914b-322bbb8b38ad', 'Fusce dolor quam, elementum at, egestas a, scelerisque sed,
        sapien.Nunc pulvinar arcu et pede. Nunc sed orci', '2021-07-23 06:27:00.000000', 0, 0, 'ORIGINAL',
        '2022-02-15 07:21:02.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('9ec8391d-ae16-89d2-4312-00b839806993',
        'sagittis. Duis gravida. Praesent eu nulla at sem molestie sodales. Mauris blandit enim consequat purus. Maecenas',
        '2021-06-26 02:22:01.000000', 0, 0, 'ORIGINAL', '2022-02-18 01:10:40.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('9cbf215f-5b72-0548-ca2e-0697e1c8d322', 'imperdiet ullamcorper. Duis at lacus. Quisque purus sapien,
        gravida non, sollicitudin a, malesuada id, erat.Etiam', '2021-09-23 19:29:57.000000', 0, 0,
        'ORIGINAL', '2022-02-19 15:50:48.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('86bcce4e-254d-dbb1-971c-ee269477a4e3',
        'fringilla. Donec feugiat metus sit amet ante. Vivamus non lorem vitae odio sagittis semper. Nam tempor diam dictum',
        '2021-08-15 09:40:49.000000', 0, 0, 'ORIGINAL', '2022-02-18 20:06:10.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('995376fa-25a0-7384-d741-326797c826fb', 'est, congue a, aliquet vel, vulputate eu,
        odio.Phasellus at augue id ante dictum cursus. Nunc mauris', '2021-07-18 03:08:56.000000', 0, 0,
        'ORIGINAL', '2022-02-17 01:36:44.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('770a11ef-531d-0385-db9e-ae5c2f47ef45', 'urna justo faucibus lectus,
        a sollicitudin orci sem eget massa. Suspendisse eleifend. Cras sed', '2021-11-24 01:05:05.000000', 0, 0,
        'ORIGINAL', '2022-02-17 11:16:54.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('ed48e277-6543-c590-2e59-0895e823da80', 'eu, ultrices sit amet, risus.Donec nibh enim, gravida sit amet,
        dapibus id,', '2021-08-10 12:21:33.000000', 0, 0, 'ORIGINAL', '2022-02-17 20:37:47.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('bdef76e8-712c-418f-6214-7729dc0ea6a9', 'sodales nisi magna sed dui. Fusce',
        '2022-01-20 08:00:46.000000', 0, 0, 'ORIGINAL', '2022-02-18 10:33:21.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('c54909cf-1bdc-61e8-d2b5-435ba9904ceb', 'egestas. Aliquam nec enim. Nunc ut erat. Sed nunc',
        '2021-11-13 10:54:07.000000', 0, 0, 'ORIGINAL', '2022-02-15 06:08:33.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('b3a9f6cb-081c-e1f3-38a7-68b799788b3a',
        'Suspendisse aliquet molestie tellus. Aenean egestas hendrerit neque. In ornare sagittis felis. Donec tempor,
       ', '2021-11-24 20:39:09.000000', 0, 0, 'ORIGINAL', '2022-02-19 07:24:09.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('492a5f5f-eb81-fa2e-00a8-b8addb239cb9',
        'Quisque varius. Nam porttitor scelerisque neque. Nullam nisl. Maecenas malesuada fringilla est. Mauris eu turpis.',
        '2021-11-13 17:05:46.000000', 0, 0, 'ORIGINAL', '2022-02-17 11:42:36.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('ed213162-5a89-e831-4c63-dcde60cc2f19', 'facilisis eget,
        ipsum.Donec sollicitudin adipiscing ligula. Aenean', '2021-11-29 19:32:35.000000', 0, 0, 'ORIGINAL',
        '2022-02-18 08:01:23.000000', '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('61e1087a-e515-6b06-b6a2-262db7bbbb8a',
        'non enim commodo hendrerit. Donec porttitor tellus non magna. Nam ligula elit,',
        '2021-07-01 03:02:23.000000', 0, 0, 'ORIGINAL', '2022-02-18 15:18:32.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('1ac48f5d-dcd1-5734-d8f0-3b59411fb99b',
        'vehicula risus. Nulla eget metus eu erat semper rutrum. Fusce dolor quam, elementum at, egestas a,',
        '2021-10-02 19:18:55.000000', 0, 0, 'ORIGINAL', '2022-02-17 15:17:42.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('40ec2188-88da-813c-8a6e-bc53cdfefb81', 'interdum. Curabitur dictum. Phasellus in felis.',
        '2022-01-12 13:58:19.000000', 0, 0, 'ORIGINAL', '2022-02-15 09:20:33.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
INSERT INTO tb_post (id, content, created_at, quote_count, repost_count, type, updated_at, user_id,
                            quoted_post_id, repost_id)
VALUES ('eaa7646c-e2d3-3b22-95c1-ab636ea27b85', 'justo nec ante. Maecenas mi felis, adipiscing',
        '2021-08-02 14:30:30.000000', 0, 0, 'ORIGINAL', '2022-02-18 15:51:33.000000',
        '539039c8-549c-355b-9696-9e8ed67c4c2e', null, null);
