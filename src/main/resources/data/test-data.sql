-- Test data for Profession table
INSERT INTO profession (id, name, category, status, created_by, created_date, last_modified_by, last_modified_date) VALUES
                                                                                                                        (1, 'Nurse', 'Healthcare', 'Active', 'system', NOW(), 'system', NOW()),
                                                                                                                        (2, 'Architect', 'Engineering', 'Active', 'system', NOW(), 'system', NOW()),
                                                                                                                        (3, 'Professor', 'Education', 'Active', 'system', NOW(), 'system', NOW());

-- Test data for Professional table
INSERT INTO professional (entry_id, user_id, profession_id, description, reason, profile, fee, created_by, created_date, last_modified_by, last_modified_date) VALUES
                                                                                                                                                                   (1, 4, 1, 'Registered nurse with 5 years of experience', 'Looking for new opportunities', 'Nurse', 120.0, 'system', NOW(), 'system', NOW()),
                                                                                                                                                                   (2, 5, 2, 'Architect with a focus on sustainable design', 'Seeking challenging projects', 'Architect', 220.0, 'system', NOW(), 'system', NOW()),
                                                                                                                                                                   (3, 6, 3, 'University professor in physics', 'Passionate about teaching', 'Physics Professor', 130.0, 'system', NOW(), 'system', NOW());
