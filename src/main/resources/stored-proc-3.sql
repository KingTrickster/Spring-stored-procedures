CREATE PROCEDURE `getBlogsByTitle` (IN title_in VARCHAR(50))
BEGIN
select * from blog
where title like title_in;
END
