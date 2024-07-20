-- Initial data for Profession table
INSERT INTO profession (id, name, category, status, created_by, created_date, last_modified_by, last_modified_date) VALUES
                                                                                                                        (1, 'Doctor', 'Healthcare', 'Active', 'system', NOW(), 'system', NOW()),
                                                                                                                        (2, 'Engineer', 'Engineering', 'Active', 'system', NOW(), 'system', NOW()),
                                                                                                                        (3, 'Teacher', 'Education', 'Active', 'system', NOW(), 'system', NOW());

-- Initial data for Professional table
INSERT INTO professional (entry_id, user_id, profession_id, description, reason, profile, fee, created_by, created_date, last_modified_by, last_modified_date) VALUES
                                                                                                                                                                   (1, 1, 1, 'Experienced doctor in cardiology', 'Looking for new opportunities', 'Cardiologist', 150.0, 'system', NOW(), 'system', NOW()),
                                                                                                                                                                   (2, 2, 2, 'Civil engineer with 10 years of experience', 'Seeking challenging projects', 'Civil Engineer', 200.0, 'system', NOW(), 'system', NOW()),
                                                                                                                                                                   (3, 3, 3, 'High school math teacher', 'Passionate about teaching', 'Math Teacher', 100.0, 'system', NOW(), 'system', NOW());
