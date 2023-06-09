CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllBlogs`()
BEGIN
select * from blog;
END