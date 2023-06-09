CREATE PROCEDURE `GET_TOTAL_BLOGS_BY_TITLE` (IN title_in VARCHAR(50), OUT count_out INT)
BEGIN
 SELECT COUNT(*) into count_out from blog WHERE title = title_in;
END