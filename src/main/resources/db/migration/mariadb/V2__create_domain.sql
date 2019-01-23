create table fw_domain
(
  id     bigint      not null auto_increment,
  domain varchar(60) not null,
  primary key (id),
  unique ak_domain (domain)
)
