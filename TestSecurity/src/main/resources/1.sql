
INSERT INTO object_of_builder (id, object, customer, builder, architect)
VALUES
(1, 'Лыжная база', 'Titan', 'StroyExpert', 'LENNIIProect'),
(2, 'Лыжная база2', 'Titan', 'StroyExpert', 'LENNIIProect'),
(3, 'Лыжная база3', 'Titan', 'StroyExpert', 'LENNIIProect');


INSERT INTO documentation_sections (id, name_of_section, object_of_builder_id)
VALUES
(1, 'Отопление',1),
(2, 'Вентиляция',2),
(3, 'Электроснабжение',3);




INSERT INTO act (id, object, customer, builder, architect, number_of_act, date, technical_supervision, builder_face, builder_supervision, architect_face, builder_stroy, another_face, builder_short, job, project, material, docks, date_start, date_end, docks_project, next_work, technical_supervision_name, builder_face_name, builder_supervision_name, architect_face_name, builder_stroy_name, another_face_name1,another_face_name2, documentation_sections_id)
VALUES
(1, 'Лыжная база', 'Titan', 'StroyExpert', 'LENNIIProect', 1, '12.11.2021', 'Первый технадзор', 'Лицо строителя', 'Технадзор заказчика', 'Проектировщик', 'Строитель', 'Иное лицо', 'Лыжная база', 'Работа один', 'Проект один', 'Материалы один', 'Документы один', '10.11.2021', '10.12.2021', 'Материалы раз', 'Следующая работа', 'Фамилия Технадзор 1', 'Фамилия строителя 1', ' Фамилия Технадзор заказчика 1', 'Фамилия Проектировщик 1', ' Фамилия Строитель 1', 'Фамилия Иное лицо 1 ','Фамилия Иное лицо 1.1',1),
(10, 'Лыжная база2', 'Titan', 'StroyExpert', 'LENNIIProect', 10, '12.11.2021', 'Первый технадзор', 'Лицо строителя', 'Технадзор заказчика', 'Проектировщик', 'Строитель', 'Иное лицо', 'Лыжная база', 'Работа один', 'Проект один', 'Материалы один', 'Документы один', '10.11.2021', '10.12.2021', 'Материалы раз', 'Следующая работа', 'Фамилия Технадзор 1', 'Фамилия строителя 1', ' Фамилия Технадзор заказчика 1', 'Фамилия Проектировщик 1', ' Фамилия Строитель 1', 'Фамилия Иное лицо 1 ','Фамилия Иное лицо 1.1',2),
(23, 'Лыжная база3', 'Titan', 'StroyExpert', 'LENNIIProect', 23, '12.11.2021', 'Первый технадзор', 'Лицо строителя', 'Технадзор заказчика', 'Проектировщик', 'Строитель', 'Иное лицо', 'Лыжная база', 'Работа один', 'Проект один', 'Материалы один', 'Документы один', '10.11.2021', '10.12.2021', 'Материалы раз', 'Следующая работа', 'Фамилия Технадзор 1', 'Фамилия строителя 1', ' Фамилия Технадзор заказчика 1', 'Фамилия Проектировщик 1', ' Фамилия Строитель 1', 'Фамилия Иное лицо 1 ','Фамилия Иное лицо 1.1',3);
